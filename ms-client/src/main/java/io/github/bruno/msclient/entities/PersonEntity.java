package io.github.bruno.msclient.entities;

import java.io.Serializable;

public class PersonEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String firstname;
    private String lastname;
    private String address;
    private String gender;

    public PersonEntity() {
    }

    public PersonEntity(String firstname, String lastname, String address, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }
}
