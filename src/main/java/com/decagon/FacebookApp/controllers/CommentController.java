package com.decagon.FacebookApp.controllers;
import com.decagon.FacebookApp.pojos.CommentDto;
import com.decagon.FacebookApp.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
@RequiredArgsConstructor
@Controller
@RequestMapping("/facebook")
public class CommentController {
    private  final CommentService commentService;
   @PostMapping("/comment")
    public String newComment(@ModelAttribute CommentDto commentDto, HttpSession session) {

       commentService.createComment(commentDto);

       Long postID= (Long) session.getAttribute("postID");

       if((session.getAttribute("homepage")).equals(false))
           return "redirect:/facebook/single_post_page?postID="+postID;
       return "redirect:/facebook/index";
   }
}
