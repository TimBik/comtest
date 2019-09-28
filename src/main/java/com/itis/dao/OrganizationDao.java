package com.itis.dao;
import com.itis.models.Organization;
import com.itis.util.HibernateSessionFactoryUtil;

public class OrganizationDao implements DAO<Organization> {
    @Override
    public Organization findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Organization.class, id);
    }

    @Override
    public void save(Organization organization) {
        (new DaoHelper()).save(organization);
    }

    @Override
    public void update(Organization organization) {
        (new DaoHelper()).update(organization);
    }

    @Override
    public void delete(Organization organization) {
        (new DaoHelper()).delete(organization);
    }
}
