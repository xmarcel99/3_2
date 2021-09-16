package com.kodilla.kodillaconverter.controller;

import com.kodilla.kodillaconverter.domain.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom/")
public class CustomController {

    @PostMapping(path = "add")
    public String acceptCustomTextType(@RequestBody Student student) {
        return student.showStudentData();
    }

}
