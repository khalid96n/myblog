package com.myblog.blogapp.service;


import com.myblog.blogapp.dto.PostDto;
import java.util.List;

public interface PostService {

    PostDto PostDto createPost(PostDto postDto);
}
