package com.springBoot.CrudOperation.Student.Service;

import com.springBoot.CrudOperation.Student.Entity.Students;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
     Students save(Students students);
     List<Students> findAllStudents();

    Students findByEmail(String email);
    Students update(Students students);

    void delete(String email);

}
