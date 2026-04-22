package com.student.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public List<Student> getAllStudents() { return repo.findAll(); }
    public Student addStudent(Student s) { return repo.save(s); }
    public void deleteStudent(int id) { repo.deleteById(id); }
    public Student updateStudent(Student s) { return repo.save(s); }
}