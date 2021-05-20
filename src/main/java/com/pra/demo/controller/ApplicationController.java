package com.pra.demo.controller;


import com.pra.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class ApplicationController {

    @Autowired
    Student student;
   // @PostMapping("/students" )
@RequestMapping(value = "/students" , method = RequestMethod.POST )
    public Student addStudents(@RequestBody Student student){

    // If no @RequestBody added to method signature,
    // all values will print null, since application cannot convert
    // request json object to java object on its own
        System.out.println("Student Name :::"+student.getName());
        System.out.println("Student age :::"+student.getAge());
        System.out.println("Student std :::"+student.getStd());
        this.student.setName(student.getName());

        return student;
    }
}
