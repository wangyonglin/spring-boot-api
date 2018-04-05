package com.wangyonglin.service;

import com.wangyonglin.domain.Customer;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CustomerService {
    public  List<Object> fetchAll();
   public Object AddCustomer(String name, String phome, String address, String remarks, String enabled);
}
