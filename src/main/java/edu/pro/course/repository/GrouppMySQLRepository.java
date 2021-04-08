package edu.pro.course.repository;

import edu.pro.course.model.Groupp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
  @author   george
  @project   course
  @class  GrouppMySQLRepository
  @version  1.0.0 
  @since 07.04.2021 - 09.39
*/
//@Repository
public interface GrouppMySQLRepository extends JpaRepository<Groupp, String> {
}
