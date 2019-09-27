package com.itis.services;

import com.itis.dao.EventDao;
import com.itis.models.Event;

public class EventService {


    private EventDao eventsDao = new EventDao();

    public EventService(){

    }

    public Event findEvent(int id) {
        return eventsDao.findById(id);
    }

    public void saveEvent(Event event) {
        eventsDao.save(event);
    }

    public void deleteEvent(Event event) {
        eventsDao.delete(event);
    }

    public void updateEvent(Event event) {
        eventsDao.update(event);
    }
}
