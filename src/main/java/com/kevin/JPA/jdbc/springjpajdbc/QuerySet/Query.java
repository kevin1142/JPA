package com.kevin.JPA.jdbc.springjpajdbc.QuerySet;

import org.springframework.stereotype.Component;

@Component
public class Query {

    public final static  String FIND_ALL="select * from employee ";
    public final static  String FIND_BY_ID="select * from employee where emp_id = ?";
    public final static  String REMOVE_EMPLOYEE="delete from employee where emp_id = ?";
    public final static  String FIND_BY_NAME="select * from employee where emp_name ilike ?";

}
