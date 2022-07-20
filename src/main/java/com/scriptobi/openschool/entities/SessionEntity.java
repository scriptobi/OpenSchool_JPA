package com.scriptobi.openschool.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class SessionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idf_ses")
    private Integer id;

    @Column(name = "nme_ses")
    private String name;

    @Column(name = "prm_ses")
    private int promotion;

    @OneToMany
    List<StudentEntity> students;

    public SessionEntity() {}
    public SessionEntity(String name, int promo) {
        this.name = name;
        this.promotion = promo;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getPromotion() { return promotion; }
    public void setPromotion(int promo) { this.promotion = promo; }
}
