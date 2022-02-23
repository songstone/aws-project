package com.example.awsproject.domain.posts;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;
    
    @AfterEach
    public void cleanUp(){
        postsRepository.deleteAll();
    }

    @DisplayName("게시글 저장, 불러오기 테스트")
    @Test
    public void getPosts(){
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("song@naver.com")
                .build()
        );
        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertEquals(posts.getTitle(),title);
        assertEquals(posts.getContent(),content);
    }

    @DisplayName("날짜 테스트")
    @Test
    public void DateTimeTest(){
        //given
        LocalDateTime now = LocalDateTime.of(2019,6,4,0,0,0);

        postsRepository.save(Posts.builder()
                .title("title")
                .content("content")
                .author("song@naver.com")
                .build()
        );
        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);

        System.out.println("createdAt : " + posts.getCreatedAt());
        System.out.println("modifiedAt : " + posts.getModifiedAt());
        assertThat(posts.getCreatedAt()).isAfter(now);
        assertThat(posts.getModifiedAt()).isAfter(now);
    }


}