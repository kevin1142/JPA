package com.kevin.JPA.jdbc.springjpajdbc.Dao;

import com.kevin.JPA.jdbc.springjpajdbc.Entitty.Employee;
import com.kevin.JPA.jdbc.springjpajdbc.Mapper.EmployeeMapper;
import com.kevin.JPA.jdbc.springjpajdbc.QuerySet.Query;
import com.kevin.JPA.jdbc.springjpajdbc.extractor.EmployeeExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class EmployeeDao {

    EmployeeMapper employeeMapper;
    JdbcTemplate jdbcTemplate;
    EmployeeExtractor employeeExtractor;
    Query query;

    @Autowired
    public EmployeeDao(EmployeeMapper employeeMapper, JdbcTemplate jdbcTemplate,EmployeeExtractor employeeExtractor) {
        this.employeeMapper = employeeMapper;
        this.jdbcTemplate = jdbcTemplate;
        this.employeeExtractor=employeeExtractor;
    }
    // using been property that direct connect our employee bean to data base and all the name of entity must match to table coloum name in database;
    public List<Employee> findAll(){
        return jdbcTemplate.query(query.FIND_ALL, new BeanPropertyRowMapper<>(Employee.class));
    }
    //using mapper class
     /*    public List<Employee> findAll(){
        return jdbcTemplate.query(query.FIND_ALL,employeeMapper);
    }*/
    public Employee findByID(int id){

        return jdbcTemplate.queryForObject(query.FIND_BY_ID,employeeMapper,id);

    }
    public Employee findbyName(String name){

        return jdbcTemplate.query(query.FIND_BY_NAME,employeeExtractor,name);
    }

    public int removeEmployee(int id){

        return jdbcTemplate.update(query.REMOVE_EMPLOYEE,id);
    }

    public Employee findEmployeesByName(String name){
        return jdbcTemplate.queryForObject("select * from employee where emp_name ilike ?",Employee.class,name);
    }

}
