package edu.pro.course.repository.groupp;

import edu.pro.course.model.Groupp;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
  @author   george
  @project   course
  @class  GrouppRepository
  @version  1.0.0 
  @since 25.02.2021 - 13.55
*/
@Repository
public interface GrouppRepository extends MongoRepository<Groupp, String> {
}
