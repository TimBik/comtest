package com.itis.services;


import com.itis.dao.PaymentDao;
import com.itis.models.Payment;

public class PaymentService {

    private PaymentDao paymentDao = new PaymentDao();

    public PaymentService(){

    }

    public Payment findPayment(int id) {
        return paymentDao.findById(id);
    }

    public void savePayment(Payment payment) {
        paymentDao.save(payment);
    }

    public void deletePayment(Payment payment) {
        paymentDao.delete(payment);
    }

    public void updatePayment(Payment payment) {
        paymentDao.update(payment);
    }
}
