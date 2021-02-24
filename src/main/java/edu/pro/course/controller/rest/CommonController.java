package edu.pro.course.controller.rest;

import edu.pro.course.model.Student;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

/*
  @author   george
  @project   course
  @class  
  @version  1.0.0 
  @since 03.02.2021 - 12.16
*/
@RestController
public class CommonController {

    @RequestMapping(value = "/titulka")
    public String showTitulka(){
        String str = "<h1 align='center'>Hello TITULKA</h1>";
        return str;
    }

    @RequestMapping("/student")
    public Student getStudent(){
        Student student = new Student("ytdfyttdf", "John", LocalDate.of(2000,1,11));
        return student;
    }
}
