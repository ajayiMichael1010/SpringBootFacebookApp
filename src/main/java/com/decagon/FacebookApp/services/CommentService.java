package com.decagon.FacebookApp.services;

import com.decagon.FacebookApp.entities.Comment;
import com.decagon.FacebookApp.pojos.CommentDto;

public interface CommentService {
    Comment createComment(CommentDto commentDto);
}
