package com.edge.student.app.service;

import com.edge.student.app.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    Student save(Student student);
    Student update(Student student);
    Student delete(Integer id);
    Student getById(Integer id);
    List<Student> getAll();
}
