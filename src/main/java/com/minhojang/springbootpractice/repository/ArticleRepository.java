package com.minhojang.springbootpractice.repository;

import com.minhojang.springbootpractice.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
