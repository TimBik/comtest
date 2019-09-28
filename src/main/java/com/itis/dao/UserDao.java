package com.itis.dao;

import com.itis.models.User;
import com.itis.util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao implements DAO<User> {

    @Override
    public User findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }

    @Override
    public void save(User user) {
        (new DaoHelper()).save(user);
    }

    @Override
    public void update(User user) {
        (new DaoHelper()).update(user);
    }

    @Override
    public void delete(User user) {
        (new DaoHelper()).delete(user);
    }
}
