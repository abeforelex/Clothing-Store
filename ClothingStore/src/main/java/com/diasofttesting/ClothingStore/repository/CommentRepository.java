package com.diasofttesting.ClothingStore.repository;

import com.diasofttesting.ClothingStore.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Alexey Dolzhenko
 * 11/15/2021
 */

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Comment findByUserName(String userName);
}
