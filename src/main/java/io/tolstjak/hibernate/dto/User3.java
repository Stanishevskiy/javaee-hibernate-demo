package io.tolstjak.hibernate.dto;

import javax.persistence.*;

@Entity
@Table(name = "USER3")
public class User3 {

    private int id;
    private String name;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "USER")
    public String getName() {
        return name + " is a superhero";
    }

    public void setName(String name) {
        this.name = name;
    }
}
