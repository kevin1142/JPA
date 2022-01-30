package com.kevin.JPA.jdbc.springjpajdbc.Entitty;


import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

@Embeddable
public class StudentAppLike implements Serializable {


    private int studentId;
    private int applikeId;

}
