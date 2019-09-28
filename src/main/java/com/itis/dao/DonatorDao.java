package com.itis.dao;

import com.itis.models.Donator;
import com.itis.util.HibernateSessionFactoryUtil;

public class DonatorDao implements DAO<Donator> {
    @Override
    public Donator findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Donator.class, id);
    }

    @Override
    public void save(Donator donator) {
        (new DaoHelper()).save(donator);
    }

    @Override
    public void update(Donator donator) {
        (new DaoHelper()).update(donator);
    }

    @Override
    public void delete(Donator donator) {
        (new DaoHelper()).delete(donator);
    }
}
