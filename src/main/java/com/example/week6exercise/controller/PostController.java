package com.example.week6exercise.controller;

import com.example.week6exercise.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;
    @PostMapping("/checktitle")
    public Boolean checkPostTitle(@RequestBody String title)  {
        return postService.checkForTitle(title);
    }
    @PostMapping("/checkwords")
    public Boolean checkBannedWords(@RequestBody String body)  {
        return postService.checkForBannedWords(body);
    }


}