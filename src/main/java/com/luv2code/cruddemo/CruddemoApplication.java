package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRuner(StudentDAO studentDAO){
		return runner->{
			createStudent(studentDAO);
		};
	}
	private void createStudent(StudentDAO studentDAO){

		//create the student object
		System.out.println("Creating new student object..");
		Student tempStudent = new Student("Paul","Doe","paul@luv2code.com");

		//save the student object
		System.out.println("saving the student..");
		studentDAO.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved student.Generated");
		Student tempStudent = new Student("Paul","Doe","paul@luv2code.com");

	}

}