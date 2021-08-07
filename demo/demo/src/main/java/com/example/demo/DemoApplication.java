package com.example.demo;


import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("halil");
	}
	@GetMapping
	public List<Student> hello(){
		return (List<Student>) List.of(
				new Student(
						1L,
						"erdem",
						"erdem@gmail.com",
						 LocalDate.of(2007,8,9),
						14
				)
		);
	}
}
