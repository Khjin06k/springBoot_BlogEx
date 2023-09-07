package com.blogex.sprintboot_blogex.domain.dto;

import com.blogex.sprintboot_blogex.domain.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ArticleRequest { // 요청받는 객체
    private String title;
    private String content;

    public Article toEntity(){ // Article builder를 사용한 생성자 객체 생성
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
