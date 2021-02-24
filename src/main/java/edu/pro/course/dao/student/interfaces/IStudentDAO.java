package edu.pro.course.dao.student.interfaces;

import edu.pro.course.model.Student;

import java.util.List;

/*
  @author   george
  @project   course
  @class  IStudentDAO
  @version  1.0.0 
  @since 10.02.2021 - 12.40
*/public interface IStudentDAO {

    // CRUD
    Student getById(String id);
    Student create(Student student);
    Student update(Student student);
    Student delete(String id);
    List<Student> getAll();



}
