package com.decagon.FacebookApp.services;


import com.decagon.FacebookApp.entities.Like;
import com.decagon.FacebookApp.entities.Post;
import com.decagon.FacebookApp.pojos.LikeDto;
import com.decagon.FacebookApp.repositories.LikeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class LikeService {
    private final LikeRepository likeRepository;

    public Like likePost(LikeDto likeDto){
        Like like= new Like();
        Long userId=likeDto.getUserId();
        Post post=likeDto.getPost();
        like.setUserId(userId);
        like.setPost(post);
        return likeRepository.save(like);

    }

    public void unlikePost(Long id){
        likeRepository.deleteById(id);
    }
}
