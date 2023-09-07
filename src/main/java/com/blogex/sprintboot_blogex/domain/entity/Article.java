package com.blogex.sprintboot_blogex.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false)
    private Long id; // FK

    @Column(name="title", nullable = false)
    private String title; // 게시물 제목

    @Column(name="content", nullable = false)
    private String content; // 게시물 내용

    @Builder
    public Article(String title, String content){
        this.title = title;
        this.content = content;
    }
}
