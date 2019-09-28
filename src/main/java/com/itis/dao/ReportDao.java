package com.itis.dao;

import com.itis.models.Report;
import com.itis.util.HibernateSessionFactoryUtil;

public class ReportDao implements DAO<Report>{

    @Override
    public Report findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Report.class, id);
    }

    @Override
    public void save(Report report) {
        (new DaoHelper()).save(report);
    }

    @Override
    public void update(Report report) {
        (new DaoHelper()).update(report);
    }

    @Override
    public void delete(Report report) {
        (new DaoHelper()).delete(report);
    }
}
