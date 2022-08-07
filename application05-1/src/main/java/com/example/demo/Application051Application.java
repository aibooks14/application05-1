package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import com.example.demo.entity.Student;
//import com.example.demo.repository.StudentRepository;

@SpringBootApplication
//public class Application051Application implements CommandLineRunner {
	public class Application051Application {
	public static void main(String[] args) {
		SpringApplication.run(Application051Application.class, args);
	}
	
//	@Autowired
//	private StudentRepository studentRepository ;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		Student student1 = new Student("Ramesh" , "Kumar", "ramesh@gmail.com") ;
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Mahesh" , "Kumar", "m-kumar@gmail.com") ;
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Tarun" , "Kumar", "Tarun-k@gmail.com") ;
//		studentRepository.save(student3);
//		
//		Student student4 = new Student("Taro" , "Kumar", "Taro-k@gmail.com") ;
//		studentRepository.save(student4);
//	}

}
