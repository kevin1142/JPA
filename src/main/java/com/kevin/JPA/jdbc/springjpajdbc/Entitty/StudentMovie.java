package com.kevin.JPA.jdbc.springjpajdbc.Entitty;


import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class StudentMovie implements Serializable {

    private int studentId;
    private int movieId;
}
