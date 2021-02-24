package edu.pro.course.dao.student.impls;

import edu.pro.course.dao.student.interfaces.IBusiness;
import edu.pro.course.dao.student.interfaces.IStudentDAO;
import edu.pro.course.data.FakeData;
import edu.pro.course.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
  @author   george
  @project   course
  @class  StudentDAOImpl
  @version  1.0.0 
  @since 10.02.2021 - 12.41
*/

@Repository
public class StudentDAOImpl implements IStudentDAO, IBusiness {

    @Autowired
    FakeData fakeData;

    @Override
    public Student getById(String id) {
        return this.getAll().stream()
                .filter(student -> student.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public Student create(Student student) {

        String id = String.valueOf(this.getAll().stream()
                .mapToInt(el->Integer.parseInt(el.getId())).max().orElse(0) + 1);
        student.setId(id);
        this.getAll().add(student);
        return student;
    }

    @Override
    public Student update(Student student) {
        this.delete(student.getId());
        this.getAll().add(student);
        return student;
    }

    @Override
    public Student delete(String id) {
        Student student = this.getById(id);
        this.getAll().remove(student);
        return student;
    }

    @Override
    public List<Student> getAll() {
        return fakeData.getStudents();
    }


    @Override
    public List<Student> studentsAgeFromTo(int from, int to) {
        return null;
    }
}
