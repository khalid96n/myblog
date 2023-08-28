package com.myblog.blogapp.repository;

import com.myblog.blogapp.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {
}
