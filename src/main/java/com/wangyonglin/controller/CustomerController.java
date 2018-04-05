package com.wangyonglin.controller;

import com.wangyonglin.configuration.ResponseData;
import com.wangyonglin.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController extends BaseControllerImpl{

    @Autowired
    CustomerService service;
    @GetMapping(value = "/all")
    public List<Object> fetchAll(){
        return service.fetchAll();
    }
    @PostMapping(value = "/addcustomer")
    public Object AddCustomer(@RequestParam("name")String name,@RequestParam("phome")String phome,@RequestParam("address")String address,@RequestParam("remarks")String remarks,@RequestParam("enabled")String enabled) {
        return service.AddCustomer(name, phome, address, remarks, enabled);
    }

    @GetMapping(value = "/alls")
    public ResponseEntity<ResponseData> fetchAlls(){
        return loadResponsefetchAll(service.fetchAll());
    }

}
