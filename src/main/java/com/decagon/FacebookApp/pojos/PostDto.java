package com.decagon.FacebookApp.pojos;

import com.decagon.FacebookApp.entities.User;
import lombok.Data;

@Data
public class PostDto {
    private User user;
    private  String post;
}
