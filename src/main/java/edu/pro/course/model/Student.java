package edu.pro.course.model;

/*
  @author   george
  @project   course
  @class  Student
  @version  1.0.0 
  @since 03.02.2021 - 12.27
*/

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.RequestPart;

import javax.validation.constraints.Min;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
@Schema(description = " Studenr Document? Entity ")
@Document
public class Student extends Audit{
    // !!!!
    @Id
    private String id;
    @Schema(description = " Full name ", defaultValue = " Johm")
    private String name;
    private LocalDate dateOfBirth;
    private Groupp groupp;
    private final LocalDate min = LocalDate.now();

      private String yyy;

    //!!!!!!
    public Student() {
    }

    public Student(String id, String name,           LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(String name, LocalDate dateOfBirth, Groupp groupp) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.groupp = groupp;
    }

        public Student(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Groupp getGroupp() {
        return groupp;
    }

    public void setGroupp(Groupp groupp) {
        this.groupp = groupp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getId().equals(student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
