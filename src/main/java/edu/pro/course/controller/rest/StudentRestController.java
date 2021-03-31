package edu.pro.course.controller.rest;

import edu.pro.course.model.Student;
import edu.pro.course.service.student.impls.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
  @author   george
  @project   course
  @class  
  @version  1.0.0 
  @since 03.02.2021 - 12.16
*/
@RestController
@RequestMapping("api/students")
public class StudentRestController {

    @Autowired
    StudentServiceImpl service;

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student("1", "Ivan", LocalDate.of(2000, Month.AUGUST,1)),
                    new Student("2", "Petro", LocalDate.of(2001, Month.AUGUST,1))
            )
    );

    @RequestMapping("/get/all")
    public List<Student> getStudents(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Student getById(@PathVariable("id") String id ){
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Student deleteById(@PathVariable("id") String id ){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Student create(@RequestBody Student student){
        return service.create(student);
    }

    @PostMapping("/update/")
    public Student update(@RequestBody Student student){
        return service.update(student);
    }


}
