package com.kelaniya.uni.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;


    @GetMapping("/student")
    public String getStudent(){
        return "Nimal,17,Colombo";
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student studentData){
       studentRepository.save(studentData);
    }

}
