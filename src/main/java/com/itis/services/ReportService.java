package com.itis.services;

import com.itis.dao.ReportDao;
import com.itis.models.Report;

public class ReportService {

    private ReportDao reportDao = new ReportDao();

    public ReportService(){

    }

    public Report findReport(int id) {
        return reportDao.findById(id);
    }

    public void saveReport(Report report) {
        reportDao.save(report);
    }

    public void deleteReport(Report report) {
        reportDao.delete(report);
    }

    public void updateReport(Report report) {
        reportDao.update(report);
    }
}
