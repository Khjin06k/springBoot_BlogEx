package com.blogex.sprintboot_blogex.domain.repository;

import com.blogex.sprintboot_blogex.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Article, Long>{
}

