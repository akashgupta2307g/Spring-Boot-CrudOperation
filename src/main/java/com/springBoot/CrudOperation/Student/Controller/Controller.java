package com.springBoot.CrudOperation.Student.Controller;


import com.springBoot.CrudOperation.Student.Entity.Students;
import com.springBoot.CrudOperation.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class Controller {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Students save(@RequestBody Students students){
        return studentService.save(students);
    }
    @GetMapping("/{email}")
    public Students findByEmail(@PathVariable("email") String email){
        return studentService.findByEmail(email);
    }
    @GetMapping
    public List<Students> findAllStudents(){
        return studentService.findAllStudents();

    }
    @PutMapping
    public Students updateStudents(@RequestBody Students students){
        return studentService.update(students);
    }
    @DeleteMapping("/{email}")
    public void delete (@PathVariable String email){

         studentService.delete(email);
    }
}
