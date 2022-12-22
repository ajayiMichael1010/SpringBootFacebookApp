package com.decagon.FacebookApp.pojos;

import com.decagon.FacebookApp.entities.Post;
import lombok.Data;

@Data
public class LikeDto {
    private Long userId;
    private Post post;
}
