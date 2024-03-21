package com.rcs.intel.controller;

import com.rcs.intel.payload.PostDto;
import com.rcs.intel.service.impl.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/posts")
public class PostController {

    private PostService post;

    public PostController(PostService post) {
        this.post = post;
    }

    @PostMapping
    public ResponseEntity<?> createPost(@RequestBody PostDto postdto){

        PostDto post1 = post.createPost(postdto);


        return new ResponseEntity<>(post1, HttpStatus.CREATED);
    }


}
