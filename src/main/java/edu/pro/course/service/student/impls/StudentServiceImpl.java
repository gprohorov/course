package edu.pro.course.service.student.impls;

import edu.pro.course.dao.student.impls.StudentDAOImpl;
import edu.pro.course.data.FakeData;
import edu.pro.course.model.Groupp;
import edu.pro.course.model.Student;
import edu.pro.course.repository.groupp.GrouppRepository;
import edu.pro.course.repository.student.StudentRepository;
import edu.pro.course.service.student.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
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

/*
    @Autowired
    StudentDAOImpl dao;
*/
    @Autowired
    StudentRepository repository;

    @Autowired
    FakeData data;

    @Autowired
    GrouppRepository grouppRepository;

    private List<Student> students = new ArrayList<>();

    @PostConstruct
    void init(){
       // repository.deleteAll();
      //  students = data.getStudents();
      //  repository.saveAll(students);
        Student freddie = repository.findById("2").orElse(null);
        Groupp groupp = grouppRepository.findAll().get(0);
        freddie.setGroupp(groupp);
                repository.save(freddie);

    }

    @Override
    public Student getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Student create(Student student) {
        return repository.save(student);
    }

    @Override
    public Student update(Student student) {
        return repository.save(student);
    }

    @Override
    public Student delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }

    public List<Student> recruits(){
        LocalDate date = LocalDate.now().minusYears(18);
        return repository.findAllByDateOfBirthAfter(date);
    }
}
