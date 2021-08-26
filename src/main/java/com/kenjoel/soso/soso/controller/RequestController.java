package com.kenjoel.soso.soso.controller;

import com.kenjoel.soso.soso.dto.RequestJoin;
import com.kenjoel.soso.soso.dto.RequestReceiver;
import com.kenjoel.soso.soso.models.Customer;
import com.kenjoel.soso.soso.repository.CustomerRepo;
import com.kenjoel.soso.soso.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequestController {
    @Autowired
    private CustomerRepo mCustomerRepo;

    @Autowired
    private ProductRepo mProductRepo;


    @PostMapping("/add")
    public Customer create_customer_object(@RequestBody RequestReceiver receiver){
        return mCustomerRepo.save(receiver.getCustomer());
    }

    @GetMapping("/get'em")
    public List<Customer> getCustomer(){
        return mCustomerRepo.findAll();
    }


    @GetMapping("/getspecs")
    public List<RequestJoin> get_join_info(){
        return mCustomerRepo.getJoinInformation();
    }
}
