package com.controller;

import com.dao.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class ApiController {
    private final OrdersRepository repository;

    @Autowired
    public ApiController(OrdersRepository repository){
        this.repository = repository;
    }

    @GetMapping("/has-ordered")
    public Boolean checkHasOrders(long id){
       if( Objects.isNull(repository.getOrders(id))){
           return false;
       } else {
           return true;
       }
    }
}
