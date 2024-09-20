package com.springBoot.CrudOperation.Student.Repository;

import com.springBoot.CrudOperation.Student.Entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
@Repository

public class InMemoryStudentsDao {

    private final List<Students> STUDENTS = new ArrayList<>();

    public Students save(Students students) {
        STUDENTS.add(students);
        return students;
    }

    public List<Students> findAllStudents() {

        return STUDENTS;
    }


    public Students findByEmail(String email) {
        return STUDENTS.stream().filter(students -> email.equals(students.getEmailName())).findFirst().orElse(null);
    }


    public Students update(Students students) {
        var studentIndex = IntStream.range(0,STUDENTS.size())
                .filter(index-> STUDENTS.get(index).getEmailName().equals(students.getEmailName()))
                .findFirst().orElse(-1);
        if(studentIndex>-1){
            STUDENTS.set(studentIndex,students);
            return students;
        }
        return null;
    }


    public void delete(String email) {
        var student =findByEmail(email);
        if(student!=null){
            STUDENTS.remove(student);
        }
    }
}
