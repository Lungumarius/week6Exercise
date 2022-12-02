package com.example.week6exercise.service;

import com.example.week6exercise.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class PostService {
    String[] bannedWords = {"faggot","retarded","fuck","racist"};
    Post[] posts ={
            new Post(1L, "random title"),
            new Post(2L, "random title2"),
            new Post(3L, "random title3"),
            new Post(4L, "random title4"),
    };

    public Boolean checkForBannedWords(String postBody){
        AtomicReference<Boolean> acceptedPost = new AtomicReference<>(true);
        Arrays.stream(bannedWords).toList().forEach(word ->{
            if(postBody.contains(word)) {
                acceptedPost.set(false);
            }
        });
        return acceptedPost.get();
    }
    public Boolean checkForTitle(String title){
        AtomicReference<Boolean> checkTitle = new AtomicReference<>(true);
        Arrays.stream(posts).toList().forEach(
                post -> {
                    if(title.equals(post.getPostTitle()))
                        checkTitle.set(false);
                }
        );
        return checkTitle.get();
    }
}
