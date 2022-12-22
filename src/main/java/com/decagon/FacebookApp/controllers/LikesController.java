package com.decagon.FacebookApp.controllers;

import com.decagon.FacebookApp.entities.Post;
import com.decagon.FacebookApp.pojos.LikeDto;
import com.decagon.FacebookApp.services.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@RequestMapping("/facebook")
public class LikesController {
    private final LikeService likeService;

    @GetMapping("/like")
    public String likePost(HttpServletRequest request, HttpSession session){
        LikeDto likeDto=new LikeDto();
        Post post=new Post();

        Long userID= Long.valueOf(request.getParameter("userID"));
        Long postID= Long.valueOf(request.getParameter("postID"));
        likeDto.setUserId(userID);

        post.setId(postID);
        likeDto.setPost(post);
        likeService.likePost(likeDto);

        if((session.getAttribute("homepage")).equals(false))
            return "redirect:/facebook/single_post_page?postID="+postID;
        return "redirect:/facebook/index";

    }

    @GetMapping("/unlike")
    public  String unlikePost(HttpServletRequest request, HttpSession session){
        Long id= Long.valueOf(request.getParameter("likeID"));
        likeService.unlikePost(id);
        Long postID= (Long) session.getAttribute("postID");
        if((session.getAttribute("homepage")).equals(false))
            return "redirect:/facebook/single_post_page?postID="+postID;
        return "redirect:/facebook/index";
    }
}
