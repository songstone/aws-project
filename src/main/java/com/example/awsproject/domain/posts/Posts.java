package com.example.awsproject.domain.posts;

import com.example.awsproject.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
