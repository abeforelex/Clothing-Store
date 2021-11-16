package com.diasofttesting.ClothingStore.service.impl;

import com.diasofttesting.ClothingStore.entity.Comment;
import com.diasofttesting.ClothingStore.exception.ResourceNotFoundException;
import com.diasofttesting.ClothingStore.repository.CommentRepository;
import com.diasofttesting.ClothingStore.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Alexey Dolzhenko
 * 11/15/2021
 */
@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        super();
        this.commentRepository = commentRepository;
    }

    // Saving a comment
    @Override
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    // Getting all comments
    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    // Getting all comments of a unique user
    @Override
    public Comment getCommentByUsername(String userName) {
        if (userName.isEmpty()) {
            throw new ResourceNotFoundException("Comment", "userName", userName);
        } else {
            return commentRepository.findByUserName(userName);
        }
    }
}

