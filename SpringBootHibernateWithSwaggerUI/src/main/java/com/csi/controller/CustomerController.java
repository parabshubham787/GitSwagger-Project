package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/savedata")
    public String saveData(@RequestBody Customer customer)
    {
        customerService.saveData(customer);
        return "Customer Data Saved Successfully";
    }

    @GetMapping("/getalldata")
    public List<Customer> getAllData()
    {
        return customerService.getAllData();
    }
}
