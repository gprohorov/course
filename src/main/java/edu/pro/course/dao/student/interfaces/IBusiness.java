package edu.pro.course.dao.student.interfaces;

import edu.pro.course.model.Student;

import java.util.List;

/*
  @author   george
  @project   course
  @class  IBusiness
  @version  1.0.0 
  @since 18.02.2021 - 13.39
*/
public interface IBusiness {
    List<Student> studentsAgeFromTo(int from, int to);
}
