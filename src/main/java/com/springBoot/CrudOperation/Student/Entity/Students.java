package com.springBoot.CrudOperation.Student.Entity;

public class Students {

    private String firstName;

    public Students(String firstName, String lstName, String mobNumber, String emailName) {
        this.firstName = firstName;
        this.lstName = lstName;
        this.mobNumber = mobNumber;
        this.emailName = emailName;
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

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    private String mobNumber;
    private String emailName;

}
