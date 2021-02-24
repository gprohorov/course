package edu.pro.course.dao;

import edu.pro.course.model.Student;

import java.util.List;

/*
  @author   george
  @project   course
  @class  IGenericDAO
  @version  1.0.0 
  @since 18.02.2021 - 13.41
*/
public interface IGenericDAO<E> {
    E getById(String id);
    E create(E item);
    E update(E item);
    E delete(String id);
    List<E> getAll();

}
