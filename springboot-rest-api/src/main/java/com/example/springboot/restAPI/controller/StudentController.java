package com.example.springboot.restAPI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.restAPI.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> studentList = new ArrayList<>();

    // GET - Fetch All Students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentList;
    }

    // GET by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentList.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // POST - Add Student
    @PostMapping
    public String addStudent(@RequestBody Student student) {
        studentList.add(student);
        return "Student Added Successfully";
    }

    // PUT - Update Student
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id,
                                @RequestBody Student updatedStudent) {

        for (Student student : studentList) {
            if (student.getId() == id) {
                student.setName(updatedStudent.getName());
                student.setDepartment(updatedStudent.getDepartment());
                return "Student Updated Successfully";
            }
        }
        return "Student Not Found";
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentList.removeIf(student -> student.getId() == id);
        return "Student Deleted Successfully";
    }
}
