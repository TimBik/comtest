package com.itis.dao;

public interface DAO <T>{
    public T findById(int id);
    public void save(T t);
    public void update(T t);
    public void delete(T t);
}
