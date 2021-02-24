package edu.pro.course.controller.ui;

import edu.pro.course.model.Student;
import edu.pro.course.service.student.impls.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*
  @author   george
  @project   course
  @class  
  @version  1.0.0 
  @since 03.02.2021 - 12.16
*/
@RequestMapping("/ui/students")
@Controller
public class StudentUIController {

    @Autowired
    StudentServiceImpl service;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Student> students = service.getAll();
        model.addAttribute("students", students);
     //   model.addAttribute("items", service.getAll());
        return "student/students-page";
    }
    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        service.delete(id);
        return "redirect:/ui/students/get/all";
    }


}
