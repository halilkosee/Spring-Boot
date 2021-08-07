package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student halil = new Student(
                    "halil",
                    "halilkosee5@gmail.com",
                    LocalDate.of(1995, Month.FEBRUARY,20)
            );
            Student yusuf = new Student(
                    "yusuf",
                    "yusufkocer@gmail.com",
                    LocalDate.of(1996, Month.OCTOBER,10)
            );
            repository.saveAll(
                    List.of(halil, yusuf)
            );
        };
    }
}
