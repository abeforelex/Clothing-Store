package com.diasofttesting.ClothingStore.service;

import com.diasofttesting.ClothingStore.entity.Comment;

import java.util.List;

/**
 * @author Alexey Dolzhenko
 * 11/15/2021
 */

public interface CommentService {
    Comment saveComment(Comment comment);
    List<Comment> getAllComments();
    Comment getCommentByUsername(String userName);
}
