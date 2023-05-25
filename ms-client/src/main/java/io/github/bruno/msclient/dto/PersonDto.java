package io.github.bruno.msclient.dto;

import io.github.bruno.msclient.enums.GenderEnum;

public class PersonDto {
    private String firstname;
    private String lastname;
    private GenderEnum gender;

    public PersonDto() {
    }

    public PersonDto(String firstname, String lastname, GenderEnum gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }
}

