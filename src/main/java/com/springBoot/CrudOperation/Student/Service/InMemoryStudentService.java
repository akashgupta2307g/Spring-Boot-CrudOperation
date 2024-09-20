package com.springBoot.CrudOperation.Student.Service;

import com.springBoot.CrudOperation.Student.Entity.Students;
import com.springBoot.CrudOperation.Student.Repository.InMemoryStudentsDao;
import com.springBoot.CrudOperation.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {
    @Autowired
    private  InMemoryStudentsDao inMemoryStudentsDao;
    @Override
    public Students save(Students students) {
        return this.inMemoryStudentsDao.save(students);
    }

    public List<Students> findAllStudents() {
        return inMemoryStudentsDao.findAllStudents();
    }

    @Override
    public Students findByEmail(String email) {
        return inMemoryStudentsDao.findByEmail(email);
    }

    @Override
    public Students update(Students students) {
        return inMemoryStudentsDao.update(students);
    }

    @Override
    public void delete(String email) {
       inMemoryStudentsDao.delete(email);
    }
}
