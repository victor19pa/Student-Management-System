package com.javaguide;

import com.javaguide.entity.Student;
import com.javaguide.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        /**
        Student student1 = new Student("Ramesh", "Fadatare", "Ramesh@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student("Sanjay","Jadhay","sanjay@gmail.com");
        studentRepository.save(student2);

        Student student3 = new Student("tony","Stark","stark@gmail.com");
        studentRepository.save(student3);
         **/
    }
}
