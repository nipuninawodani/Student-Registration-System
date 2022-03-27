package com.kelaniya.uni.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

    Operation operation; //DEPENDENCY

    @Autowired
    public AddController(Operation o) {
        this.operation = o;
    }

    @GetMapping("/add/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b){
        return operation.execute(a,b);
    }

}
