package com.springBoot.CrudOperation.Student.Service;

import com.springBoot.CrudOperation.Student.Entity.Students;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public List<Students> findAllStudents() {
        return List.of(
                new Students(
                        "Akash",
                        "Gupta",
                        "9616556876",
                        "akash@gmail.com"
                ),
                new Students(
                        "Vibhav",
                        "Gupta",
                        "9616556876",
                        "akash@gmail.com"
                )
        );
    }
}
