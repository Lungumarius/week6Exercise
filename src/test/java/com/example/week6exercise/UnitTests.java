package com.example.week6exercise;

import com.example.week6exercise.model.Post;
import com.example.week6exercise.service.PostService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UnitTests {
    @Autowired
    PostService postService;

    @Test
    public void checkForBannedWordsTest(){
        Assert.assertEquals(postService.checkForBannedWords("A racist man walks into a bar"),false);
        Assert.assertEquals(postService.checkForBannedWords("A man walks into a bar"),true);
    }
    @Test
    public void checkTitleTest(){
        Assert.assertEquals(postService.checkForTitle("random title"),false);
        Assert.assertEquals(postService.checkForBannedWords("randomtitleee"),true);
    }
}
