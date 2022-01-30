package com.kevin.JPA.jdbc.springjpajdbc.Entitty;

import javax.persistence.*;

@Entity
public class Movies {

    @EmbeddedId
    private StudentMovie studentMovie;

    @Column(name = "movieName")
    private String movieName;

    @ManyToOne
    @MapsId("studentId")
    private Students students;


}
