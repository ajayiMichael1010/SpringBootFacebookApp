package com.decagon.FacebookApp.controllers;

import com.decagon.FacebookApp.entities.Post;
import com.decagon.FacebookApp.entities.User;
import com.decagon.FacebookApp.pojos.PostDto;
import com.decagon.FacebookApp.services.PostService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@RequiredArgsConstructor
@Data
@Service
@Controller
class HomeControllerTest {

    private  final PostService postService;
    private Post post;
    private PostDto postDto;

    @BeforeEach
    void setUp() {
//        User user=new User();
//        postDto= new PostDto();
//        user.setId(5L);
//        postDto.setPost("New life");
//        postDto.setUser(user);

    }

    @Test
    void createPost() {
//        post= postService.createPost(postDto);
//        assertEquals(7, post.getId());

    }

    @Test
    void getPostPage() {
    }

    @Test
    void addNewPost() {
    }

    @Test
    void getSinglePost() {
    }
}