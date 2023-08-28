package com.myblog.blogapp.service.impl;


import com.myblog.blogapp.dto.PostDto;
import com.myblog.blogapp.entities.Post;
import com.myblog.blogapp.repository.PostRepo;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepo postRepo;

    public PostServiceImpl(PostRepo postRepo){

        this.postRepo =postRepo;
    }


    @Override
    public PostDto createPost(PostDto postDto) {

        Post post = mapToEntity(postDto);
        Post newPost = postRepo.save(post);

        PostDto postResponse = mapToDTO(newPost);
        return  postResponse;

    }

    private PostDto mapToDTO(Post post){
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setDescription(post.getDescription());
        postDto.setContent(post.getContent());
        return postDto;
    }




    private Post mapToEntity(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        return post;

    }
}
