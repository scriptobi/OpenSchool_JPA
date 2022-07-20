package com.scriptobi.openschool.entities;

import javax.persistence.*;

@Entity
public class CityEntity {
    @Id
    @Column(name = "cpl")
    private Integer cpl;

    @Column(name = "name")
    private String name;

    public CityEntity() {}
    public CityEntity(int cpl, String name) {
        this.cpl = cpl;
        this.name = name;
    }

    public int getCpl() { return cpl; }
    public void setCpl(Integer cpl) { this.cpl = cpl; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
