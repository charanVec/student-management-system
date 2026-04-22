package com.student.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping
    public List<Student> getAll() { return service.getAllStudents(); }

    @PostMapping
    public Student add(@RequestBody Student s) { return service.addStudent(s); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) { service.deleteStudent(id); }

    @PutMapping("/{id}")
    public Student update(@PathVariable int id, @RequestBody Student s) {
        s.setId(id);
        return service.updateStudent(s);
    }
}