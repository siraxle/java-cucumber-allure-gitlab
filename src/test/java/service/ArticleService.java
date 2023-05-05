package service;

import api.Article;

import java.util.List;

public interface ArticleService {

    List<Article> getArticleList(String URL);

}
