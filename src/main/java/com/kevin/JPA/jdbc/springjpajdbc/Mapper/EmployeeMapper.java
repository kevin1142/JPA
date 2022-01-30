package com.kevin.JPA.jdbc.springjpajdbc.Mapper;

import com.kevin.JPA.jdbc.springjpajdbc.Entitty.Employee;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmployeeMapper implements RowMapper<Employee> {


    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee emp = new Employee();
        emp.setEmp_id(rs.getInt("emp_id"));
        emp.setEmp_name(rs.getString("emp_name"));
        emp.setEmp_city(rs.getString("emp_city"));
        emp.setEmp_birthDate(rs.getDate("emp_birthDate").toLocalDate());
        return emp;
    }

    }


