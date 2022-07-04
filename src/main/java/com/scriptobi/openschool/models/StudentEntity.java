package com.scriptobi.openschool.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "students")
public class StudentEntity {
    @Id
    @Column(name = "matricule", nullable = false)
    private String matricule;
    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }

    private String firstname;
    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) {this.firstname = firstname;}
    private String lastname;
    public String getLastname() { return lastname;  }
    public void setLastname(String lastname) { this.lastname = lastname; }

    private Timestamp birthdate;
    public Timestamp getBirthdate() { return birthdate; }
    public void setBirthdate(Timestamp birthdate) { this.birthdate = birthdate; }

    private String city;
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public StudentEntity() {}

    public StudentEntity(String matricule, String firstname, String lastname, Timestamp birthdate, String city) {
        this.matricule = matricule;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.city = city;
    }
}
