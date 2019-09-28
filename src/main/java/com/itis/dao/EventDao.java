package com.itis.dao;
import com.itis.models.Event;
import com.itis.util.HibernateSessionFactoryUtil;

public class EventDao implements DAO<Event> {
    @Override
    public Event findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Event.class, id);
    }

    @Override
    public void save(Event event) {
        (new DaoHelper()).save(event);
    }

    @Override
    public void update(Event event) {
        (new DaoHelper()).update(event);
    }

    @Override
    public void delete(Event event) {
        (new DaoHelper()).delete(event);
    }
}
