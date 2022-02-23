package com.example.awsproject.web.dto;

import com.example.awsproject.domain.posts.Posts;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedAt;

    public static PostListResponseDto from(Posts posts) {
        return PostListResponseDto.builder()
                .id(posts.getId())
                .title(posts.getTitle())
                .author(posts.getAuthor())
                .modifiedAt(posts.getModifiedAt())
                .build();
    }

}
