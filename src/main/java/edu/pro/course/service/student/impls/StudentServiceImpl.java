package edu.pro.course.service.student.impls;

import edu.pro.course.dao.student.impls.StudentDAOImpl;
import edu.pro.course.model.Student;
import edu.pro.course.service.student.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
  @author   george
  @project   course
  @class  StudentServiceImpl
  @version  1.0.0 
  @since 10.02.2021 - 12.29
*/


@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    StudentDAOImpl dao;


    @Override
    public Student getById(String id) {
        return dao.getById(id);
    }

    @Override
    public Student create(Student student) {
        return dao.create(student);
    }

    @Override
    public Student update(Student student) {
        return dao.update(student);
    }

    @Override
    public Student delete(String id) {
        return dao.delete(id);
    }

    @Override
    public List<Student> getAll() {
        return dao.getAll();
    }
}
