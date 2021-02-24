package edu.pro.course.data;

/*
  @author   george
  @project   course
  @class  FakeData
  @version  1.0.0 
  @since 10.02.2021 - 12.42

*/


import edu.pro.course.model.Student;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public class FakeData {

    private List<Student> students = new ArrayList<>(

            Arrays.asList(

                    new Student("1", "John Lennon", LocalDate.of(1970,1,1)),
                    new Student("2", "Freddie Mercury", LocalDate.of(1960,3,1)),
                    new Student("3", "Ozzy Osborne", LocalDate.of(1953,12,4)),
                    new Student("4", "Britney Spears", LocalDate.of(1980,12,4))
            )
    );

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
