package com.example.demo;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.io.Serializable;

@Entity
@Table(name = "person")
public class Person implements Serializable {

    @Id
    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Type(type="java.lang.Long")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personSeq")
    @SequenceGenerator(name="personSeq", initialValue = 1000, sequenceName="person_seq", allocationSize=1)
    private long id;

    @Column
    private String firstName;

    private String lastName;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
