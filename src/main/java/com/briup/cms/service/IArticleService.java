package com.briup.cms.service;

import com.briup.cms.bean.Article;
import com.briup.cms.exception.CustomerException;

import java.util.List;

public interface IArticleService {
    void addArticle(Article article) throws CustomerException;
    void deleteArticleById(int id) throws CustomerException;
    Article queryById(int id) throws CustomerException;
    List<Article> getAllLink() throws CustomerException;
}
