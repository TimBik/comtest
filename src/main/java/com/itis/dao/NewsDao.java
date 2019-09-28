package com.itis.dao;


import com.itis.models.News;
import com.itis.util.HibernateSessionFactoryUtil;

public class NewsDao implements DAO<News>{

    @Override
    public News findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(News.class, id);
    }

    @Override
    public void save(News news) {
        (new DaoHelper()).save(news);
    }

    @Override
    public void update(News news) {
        (new DaoHelper()).update(news);
    }

    @Override
    public void delete(News news) {
        (new DaoHelper()).delete(news);
    }
}
