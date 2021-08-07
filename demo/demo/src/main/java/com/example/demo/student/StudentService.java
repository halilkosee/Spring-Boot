package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) throws IllegalAccessException {
        Optional<Student> studentOptional = studentRepository
                .findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()){
            throw new IllegalAccessException("email taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) throws IllegalAccessException {
                boolean exist = studentRepository.existsById(studentId);
                if (!exist){
                    throw new IllegalAccessException("student with id {" + studentId + "} does not exist");
                }
                studentRepository.deleteById(studentId);
    }
}
