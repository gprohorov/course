package edu.pro.course.controller.rest;

import edu.pro.course.model.Student;
import edu.pro.course.service.student.impls.StudentServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
@Tag(name="Student controller", description=" Description of student API")
@RestController
@RequestMapping("api/students")
public class StudentRestController {

    @Autowired
    StudentServiceImpl service;

    @Operation(
            summary = "Returns all the students",
            description = "Warning! A memory-consuming operation. Use only for testing!"
    )
    @RequestMapping("/get/all")
    public List<Student> getStudents(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Student getById(@PathVariable("id")
                               @Parameter(description = "Айдишник студента в базе типа  UUID" +
                                       "Не путать с IdCard!")
                                       String id ){
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
