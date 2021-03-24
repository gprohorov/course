package edu.pro.course.model;

/*
  @author   george
  @project   course
  @class  Group
  @version  1.0.0 
  @since 03.02.2021 - 12.42
*/

import java.util.Objects;

public class Groupp {
    private String id;
    private  String name;
    private String chair;

    public Groupp() {
    }

    public Groupp(String name, String chair) {
        this.name = name;
        this.chair = chair;
    }

    public Groupp(String id, String name, String chair) {
        this.id = id;
        this.name = name;
        this.chair = chair;
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

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Groupp groupp = (Groupp) o;
        return getId().equals(groupp.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Groupp{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", chair='" + chair + '\'' +
                '}';
    }
}
