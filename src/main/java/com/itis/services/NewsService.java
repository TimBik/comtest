package com.itis.services;

import com.itis.dao.NewsDao;
import com.itis.models.News;

public class NewsService {

    private NewsDao newsDao = new NewsDao();

    public NewsService(){

    }

    public News findNews(int id) {
        return newsDao.findById(id);
    }

    public void saveNews(News news) {
        newsDao.save(news);
    }

    public void deleteNews(News news) {
        newsDao.delete(news);
    }

    public void updateNews(News news) {
        newsDao.update(news);
    }

}
