package com.scriptobi.openschool.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matricule", nullable = false)
    private Integer matricule;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birthdate")
    private Date birthdate;

    @ManyToOne
    @JoinColumn(name = "fk_city", referencedColumnName = "cpl")
    private CityEntity city;

    public StudentEntity() {}

    public StudentEntity(String firstname, String lastname, Date birthdate, CityEntity city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.city = city;
    }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public Integer getMatricule() { return matricule; }
    public void setMatricule(Integer matricule) { this.matricule = matricule; }
    public String getLastname() { return lastname;  }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public Date getBirthdate() { return birthdate; }
    public void setBirthdate(Date birthdate) { this.birthdate = birthdate; }
    public CityEntity getCity() { return city; }
    public void setCity(CityEntity city) { this.city = city; }

}
