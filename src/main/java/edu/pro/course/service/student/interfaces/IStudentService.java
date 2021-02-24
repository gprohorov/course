package edu.pro.course.service.student.interfaces;

/*
  @author   george
  @project   course
  @class  IStudentService
  @version  1.0.0 
  @since 10.02.2021 - 12.18
*/

import edu.pro.course.model.Student;

import java.util.List;

public interface IStudentService {

    Student getById(String id);
    Student create(Student student);
    Student update(Student student);
    Student delete(String id);
    List<Student> getAll();


}
