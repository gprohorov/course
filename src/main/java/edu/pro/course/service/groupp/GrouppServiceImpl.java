package edu.pro.course.service.groupp;

import edu.pro.course.data.FakeData;
import edu.pro.course.model.Groupp;
import edu.pro.course.repository.groupp.GrouppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/*
  @author   george
  @project   course
  @class  GrouppServiceImpl
  @version  1.0.0 
  @since 25.02.2021 - 13.56
*/
@Service
public class GrouppServiceImpl {

    @Autowired
    FakeData data;

    @Autowired
    GrouppRepository repository;

   // private List<Groupp> groupps = new ArrayList<>();

    @PostConstruct
    void init(){
     //   groupps = data.getGroupps();
        repository.deleteAll();
        repository.saveAll(data.getGroupps());
    }

    public List<Groupp> getAll(){
        return repository.findAll();
    }
}
