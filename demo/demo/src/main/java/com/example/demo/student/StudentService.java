package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class StudentService {

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
