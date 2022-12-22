package com.decagon.FacebookApp.pojos;

import com.decagon.FacebookApp.entities.Post;
import lombok.Data;

@Data
public class CommentDto {
    private  Long userId;
    private Post post;
    private  String comment;

}
