package com.kevin.JPA.jdbc.springjpajdbc.Entitty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Students {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String sports;
    @Column(name = "futureGoal")
    private String futureGoal;
    private String cuisine;
    @Column(name = "dateOfAcceptanceIntoProgram")
    private String dateOfAcceptanceIntoProgram;
    private String team;
    @Column(name = "dreamCity")
    private String dreamCity;
    @Column(name = "appsYouHate")
    private String appsYouHate;

    @OneToMany(mappedBy ="students" )
    private List<Hobbies> hobbiesList=new ArrayList<>();

    @OneToMany(mappedBy = "students")
    private List<Movies> movies=new ArrayList<>();

    @OneToMany(mappedBy = "students")
    private List<ApplicationLike> applicationLikes=new ArrayList<>();

}
