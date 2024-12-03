package com.edge.student.app.controller;

import com.edge.student.app.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WelcomeController {


    @GetMapping("")
    public String hello() {
        return "Your api up and running............";
    }

}
