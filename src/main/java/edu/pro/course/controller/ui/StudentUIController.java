package edu.pro.course.controller.ui;

import edu.pro.course.dao.groupp.impls.GrouppDAOImpl;
import edu.pro.course.data.FakeData;
import edu.pro.course.form.StudentForm;
import edu.pro.course.model.Groupp;
import edu.pro.course.model.Student;
import edu.pro.course.service.student.impls.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    @Autowired
    GrouppDAOImpl grouppDAO;

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

    @GetMapping("/create")
    public String create(Model model){
        StudentForm studentForm = new StudentForm();
        studentForm.setName(" ");
        model.addAttribute("studentForm", studentForm);
        List<String> groupps = grouppDAO.getAll().stream().map(Groupp::getName)
                .collect(Collectors.toList());
        Map<String, String> mavs = grouppDAO.getAll().stream()
                .collect(Collectors.toMap(Groupp::getId, Groupp::getName));

        model.addAttribute("mavs", mavs);
        model.addAttribute("groups", groupps);
        return "student/student-create";
    }
    @PostMapping("/create")
    public String create(Model model,
                         @ModelAttribute("studentForm") StudentForm studentForm){
         Student student = new Student();
                 student.setName(studentForm.getName());
                 student.setDateOfBirth(LocalDate.parse(studentForm.getDateOfBirth()));
                 String grouppName = studentForm.getGroupp();
        //Groupp groupp = grouppDAO.getByName(studentForm.getGroupp());
        Groupp groupp = grouppDAO.getById(studentForm.getGroupp());
        student.setGroupp(groupp);
        service.create(student);
        System.out.println(student);
        return "redirect:/ui/students/get/all";
    }


}
