package com.wangyonglin.service;

import com.wangyonglin.domain.Customer;
import com.wangyonglin.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Object> fetchAll() {
        List<Object> list = new ArrayList<>(customerRepository.findAll());
        return list;
    }

    @Override
    public Object AddCustomer(String name, String phome,String address,String remarks,String enabled) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setPhome(phome);
        customer.setAddress(address);
        customer.setRemarks(remarks);
        customer.setDatatime(new Date().toString());
        customer.setEnabled(enabled);
        return customerRepository.save(customer);
    }
}
