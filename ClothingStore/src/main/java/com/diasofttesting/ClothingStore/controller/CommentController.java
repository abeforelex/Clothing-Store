package com.diasofttesting.ClothingStore.controller;

import com.diasofttesting.ClothingStore.entity.Comment;
import com.diasofttesting.ClothingStore.entity.Product;
import com.diasofttesting.ClothingStore.service.CommentService;
import com.diasofttesting.ClothingStore.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Alexey Dolzhenko
 * 11/15/2021
 */

@RestController
@RequestMapping("/api")
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService) {
        super();
        this.commentService = commentService;
    }

    // This method is used to add a comment to our database
    @PostMapping("/saveComment")
    public ResponseEntity<Comment> saveComment(@RequestBody Comment comment) {
        return new ResponseEntity<Comment>(commentService.saveComment(comment), HttpStatus.CREATED);
    }

    // This method is used to get all comments from our database
    @GetMapping("/getAllComments")
    public List<Comment> getAllComment() {
        return commentService.getAllComments();
    }

    // This method is used to get a comment based on username
    // Example: http://localhost:8080/api/getCommentByName/Alexey
    @GetMapping("/getCommentByName/{userName}")
    public ResponseEntity<Comment> getCommentByName(@PathVariable("userName") String userName) {
        return new ResponseEntity<Comment>(commentService.getCommentByUsername(userName), HttpStatus.OK);
    }
}
