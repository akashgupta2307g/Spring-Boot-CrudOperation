package com.springBoot.CrudOperation.Student.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Students {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;

    public Students() {
    }

    public Students(String firstName, String lstName, String mobNumber, String email) {
        this.firstName = firstName;
        this.lstName = lstName;
        this.mobNumber = mobNumber;
        this.email = email;
    }

    private String lstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLstName() {
        return lstName;
    }

    public void setLstName(String lstName) {
        this.lstName = lstName;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String mobNumber;
    @Column(unique = true)
    private String email;

}
