package com.blogex.sprintboot_blogex.domain.service;

import com.blogex.sprintboot_blogex.domain.dto.ArticleRequest;
import com.blogex.sprintboot_blogex.domain.entity.Article;
import com.blogex.sprintboot_blogex.domain.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(ArticleRequest articleRequest){
        return blogRepository.save(articleRequest.toEntity());
    }
}
