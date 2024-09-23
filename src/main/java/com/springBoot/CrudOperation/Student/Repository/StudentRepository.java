package com.springBoot.CrudOperation.Student.Repository;

import com.springBoot.CrudOperation.Student.Entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students ,Integer> {
    Students findByEmail(String email);
    void deleteByEmail(String email);

}
