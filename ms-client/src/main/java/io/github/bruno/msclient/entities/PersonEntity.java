package io.github.bruno.msclient.entities;

import io.github.bruno.msclient.enums.GenderEnum;
import jakarta.persistence.*;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "tb_person")
public class PersonEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name", nullable = false)
    private String firstname;
    @Column(name = "last_name", nullable = false)
    private String lastname;
    private String address;
    @Enumerated(EnumType.STRING)
    private GenderEnum gender;


    public PersonEntity() {
    }

    public PersonEntity(String firstname, String lastname, String address, GenderEnum gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.gender = gender;

    }

    public Integer getId() {
        return id;
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

    public GenderEnum getGender() {
        return gender;
    }

}
