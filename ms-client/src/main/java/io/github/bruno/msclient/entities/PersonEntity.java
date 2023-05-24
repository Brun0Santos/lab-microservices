package io.github.bruno.msclient.entities;

public class PersonEntity {

    private Integer id;
    private String firstname;
    private String lastname;
    private String address;
    private String gender;

    public PersonEntity() {
    }

    public PersonEntity(Integer id, String firstname, String lastname, String address, String gender) {
        this.id = id;
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
