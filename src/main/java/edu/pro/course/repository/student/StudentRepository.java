package edu.pro.course.repository.student;

import edu.pro.course.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/*
  @author   george
  @project   course
  @class  StudentRepository
  @version  1.0.0 
  @since 25.02.2021 - 13.05
*/
@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findAllByDateOfBirthAfterAndNameContains(LocalDate date, String str);
}
