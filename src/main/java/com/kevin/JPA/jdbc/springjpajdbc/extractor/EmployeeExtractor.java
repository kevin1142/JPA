package com.kevin.JPA.jdbc.springjpajdbc.extractor;

import com.kevin.JPA.jdbc.springjpajdbc.Entitty.Employee;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class EmployeeExtractor implements ResultSetExtractor<Employee> {
    @Override
    public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {

        Employee result=null;

        if (rs.next()){
            result =new Employee(rs.getInt("emp_id"),rs.getString("emp_name"),rs.getString("emp_city"),rs.getDate("emp_birthDate").toLocalDate());
            return  result;

        }
        return  result;

    }
}
