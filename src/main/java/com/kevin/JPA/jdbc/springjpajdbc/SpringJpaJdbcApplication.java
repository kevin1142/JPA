package com.kevin.JPA.jdbc.springjpajdbc;

import com.kevin.JPA.jdbc.springjpajdbc.Dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaJdbcApplication.class, args);
	}

	Logger logger= LoggerFactory.getLogger(SpringJpaJdbcApplication.class);
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void run(String... args) throws Exception {

		/*logger.info("\n find all employee {[] }"+employeeDao.findAll());

		logger.info("\n find by id []"+employeeDao.findByID(2));

		logger.info("\n find By name : "+employeeDao.findbyName("kevin"));

		logger.info("\n removing Employee from Table : "+employeeDao.removeEmployee(1));*/

	//	logger.info(""+employeeDao.findEmployeesByName("bhaumik"));
	}
}
