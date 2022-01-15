package com.example.awsproject.web.dto;

import com.example.awsproject.domain.posts.Posts;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public static PostsResponseDto from(Posts posts) {
        return PostsResponseDto.builder()
                .id(posts.getId())
                .title(posts.getTitle())
                .content(posts.getContent())
                .author(posts.getAuthor())
                .build();
    }
}
