package com.csi.dao;

import com.csi.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDaoImpl implements CustomerDao{

    private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

    @Override
    public void saveData(Customer customer) {

        Session session=factory.openSession();

        Transaction transaction= session.beginTransaction();

        session.save(customer);

        transaction.commit();

    }

    @Override
    public List<Customer> getAllData() {

        Session session=factory.openSession();

        List<Customer> customers = session.createQuery("from Customer").list();

        return customers;
    }
}
