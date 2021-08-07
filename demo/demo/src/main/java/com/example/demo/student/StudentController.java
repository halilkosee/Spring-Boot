package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
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
