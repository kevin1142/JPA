package com.kevin.JPA.jdbc.springjpajdbc.Entitty;

import java.time.LocalDate;

public class Employee {

  private   int emp_id;
   private String emp_name;
    private String emp_city;
    private LocalDate emp_birthDate;

    public Employee() {
    }

    public Employee(int emp_id, String emp_name, String emp_city, LocalDate emp_birthDate) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_city = emp_city;
        this.emp_birthDate = emp_birthDate;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_city() {
        return emp_city;
    }

    public void setEmp_city(String emp_city) {
        this.emp_city = emp_city;
    }

    public LocalDate getEmp_birthDate() {
        return emp_birthDate;
    }

    public void setEmp_birthDate(LocalDate emp_birthDate) {
        this.emp_birthDate = emp_birthDate;
    }

    @Override
    public String toString() {
        return "\n Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_city='" + emp_city + '\'' +
                ", emp_birthDate=" + emp_birthDate +
                '}';
    }
}
