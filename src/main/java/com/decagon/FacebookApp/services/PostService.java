package com.decagon.FacebookApp.services;

import com.decagon.FacebookApp.entities.Like;
import com.decagon.FacebookApp.entities.Post;
import com.decagon.FacebookApp.entities.User;
import com.decagon.FacebookApp.pojos.PostDto;

import javax.xml.stream.events.Comment;
import java.util.List;

public interface PostService {
    Post createPost(PostDto postDto);

    List<Post> getAllPost();
    Post getPostById(Long postId);
}
