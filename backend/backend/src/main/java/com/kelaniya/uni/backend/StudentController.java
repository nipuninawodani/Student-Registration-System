package com.kelaniya.uni.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@RestController
public class StudentController {

    private StudentRepository studentRepository;

   @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentRepository.findById(id).get();
    }

    @GetMapping("/student")
    public List<Student> getStudents(){

        return studentRepository.findAll();
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student studentData) {
        studentRepository.save(studentData);
    }

}
