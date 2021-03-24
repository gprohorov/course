package edu.pro.course.form;
/*
  @author   george
  @project   course
  @class  StudentForm
  @version  1.0.0 
  @since 03.03.2021 - 12.35
*/

import edu.pro.course.model.Groupp;

import java.time.LocalDate;

public class StudentForm {
    private String name;
    private String dateOfBirth;
    private String groupp;

    public StudentForm(String name, String dateOfBirth, String groupp) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.groupp = groupp;
    }

    public StudentForm() {
        this.name = " ";
        this.dateOfBirth = " ";
        this.groupp = " ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGroupp() {
        return groupp;
    }

    public void setGroupp(String groupp) {
        this.groupp = groupp;
    }
}
