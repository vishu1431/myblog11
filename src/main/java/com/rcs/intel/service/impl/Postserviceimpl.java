package com.rcs.intel.service.impl;

import com.rcs.intel.entity.Post;
import com.rcs.intel.payload.PostDto;
import com.rcs.intel.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Postserviceimpl implements PostService {
    public Postserviceimpl(PostRepository postrepository) {
        this.postrepository = postrepository;
    }


private PostRepository postrepository;
    @Override
    public PostDto createPost(PostDto postDto) {

        Post post =new Post();

        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());

        Post save = postrepository.save(post);

        PostDto dto = new PostDto();
        dto.setTitle(save.getTitle());
        dto.setContent(save.getContent());
        dto.setDescription(save.getDescription());





        return dto;
    }
}
