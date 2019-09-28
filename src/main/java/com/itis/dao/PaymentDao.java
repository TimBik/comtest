package com.itis.dao;

import com.itis.models.Payment;
import com.itis.util.HibernateSessionFactoryUtil;

public class PaymentDao implements DAO<Payment>{

    @Override
    public Payment findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Payment.class, id);
    }

    @Override
    public void save(Payment payment) {
        (new DaoHelper()).save(payment);
    }

    @Override
    public void update(Payment payment) {
        (new DaoHelper()).update(payment);
    }

    @Override
    public void delete(Payment payment) {
        (new DaoHelper()).delete(payment);
    }
}
