package com.springBoot.CrudOperation.Student.Controller;


import com.springBoot.CrudOperation.Student.Entity.Students;
import com.springBoot.CrudOperation.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class Controller {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Students> findAllStudents(){
        return studentService.findAllStudents();


    }

}
