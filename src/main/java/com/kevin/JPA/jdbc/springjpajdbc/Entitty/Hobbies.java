package com.kevin.JPA.jdbc.springjpajdbc.Entitty;

import javax.persistence.*;

@Entity
public class Hobbies {



    @EmbeddedId
    private StudentHobby studentHobby;
    private String hobbie;

    @ManyToOne
    @MapsId("studentId")
    private Students students;
}
