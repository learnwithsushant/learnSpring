package com.crudsample.UdemyCrudWorks;

import com.crudsample.UdemyCrudWorks.entity.Student;
import com.crudsample.UdemyCrudWorks.entity.dao.StudentDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UdemyCrudWorksApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyCrudWorksApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return commandLineRunner -> {
			createStudent(studentDao);
		};
	}

	private void createStudent(StudentDao studentDao){

		// create a student object
		System.out.println("Creating a new Student obj");
		Student astudent = new Student("Ved","Wadjikar","ved.wadjikar@gmail.com");
		// save the student object
		System.out.println("Saving a new Student obj");
		studentDao.save(astudent);
		// display the student's id that got generated
		System.out.println("Getting the students id: "+astudent.getId());
	}

}
