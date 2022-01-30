package com.kevin.JPA.jdbc.springjpajdbc.Entitty;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ApplicationLike {

    @EmbeddedId
    private StudentAppLike studentAppLike;

    private String appName;

    @ManyToOne
    @MapsId("studentId")
    private Students students;


}
