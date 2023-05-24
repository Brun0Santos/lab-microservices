package io.github.bruno.msclient.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_person")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name", nullable = false)
    private String firstname;
    @Column(name = "last_name", nullable = false)
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

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
