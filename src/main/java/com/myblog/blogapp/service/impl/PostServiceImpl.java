package com.myblog.blogapp.service.impl;


import com.myblog.blogapp.dto.PostDto;
import com.myblog.blogapp.entities.Post;
import com.myblog.blogapp.repository.PostRepo;
import com.myblog.blogapp.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {


    private PostRepo postRepo;


    public PostServiceImpl(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post  = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post postEntity = postRepo.save(post);

        PostDto dto = new PostDto();
        dto.setTitle(postEntity.getTitle());
        dto.setDescription(postEntity.getDescription());
        dto.setContent(postEntity.getContent());

        return dto;
    }
}
