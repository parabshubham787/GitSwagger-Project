package com.csi.service;

import com.csi.dao.CustomerDao;
import com.csi.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerDao customerDao;
    @Override
    public void saveData(Customer customer) {
        customerDao.saveData(customer);
    }

    @Override
    public List<Customer> getAllData() {
        return customerDao.getAllData();
    }
}
