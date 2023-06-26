package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/getById/{id}")
    public Student getStudentbyId(@PathVariable String id) {
        return studentService.getStudentbyId(id);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/studentsByName/{name}")
    public List<Student> studentsByName(@PathVariable String name) {
        return studentService.getStudentsByName(name);
    }

    @GetMapping("/studentsByNameAndMail")
    public List<Student> studentsByNameAndMail(@RequestParam String name, @RequestParam String email) {
        return studentService.studentsByNameAndMail(name, email);
    }

    @GetMapping("/studentsByNameOrMail")
    public List<Student> studentsByNameOrMail(@RequestParam String name, @RequestParam String email) {
        return studentService.studentsByNameOrMail(name, email);
    }

    @GetMapping("/allWithPagination")
    public List<Student> getAllWithPagination(@RequestParam int pageNo, @RequestParam int pageSize) {
        return studentService.getAllWithPagination(pageNo, pageSize);
    }

    @GetMapping("/allWithSorting")
    public List<Student> allWithSorting() {
        return studentService.allWithSorting();
    }

    @GetMapping("/bySubjectName")
    public List<Student> bySubjectName(@RequestParam String subName) {
        return studentService.bySubjectName(subName);
    }

    @GetMapping("/emailLike")
    public List<Student> emailLike(@RequestParam String email) {
        return studentService.emailLike(email);
    }

    @GetMapping("/nameStartsWith")
    public List<Student> nameStartsWith(@RequestParam String name) {
        return studentService.nameStartsWith(name);
    }

    @GetMapping("/byDepartmentName")
    public List<Student> byDepartmentName(@RequestParam String deptName) {
        return studentService.byDepartmentName(deptName);
    }
}
