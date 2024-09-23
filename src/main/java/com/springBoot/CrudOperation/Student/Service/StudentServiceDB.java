package com.springBoot.CrudOperation.Student.Service;

import com.springBoot.CrudOperation.Student.Entity.Students;
import com.springBoot.CrudOperation.Student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Primary
@Service
public class StudentServiceDB implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Students save(Students students) {
        return studentRepository.save(students);
    }

    @Override
    public List<Students> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Students findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public Students update(Students students) {
        return studentRepository.save(students);
    }

    @Override
    public void delete(String email) {
     studentRepository.deleteByEmail(email);
    }
}
