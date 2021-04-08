package edu.pro.course.service.groupp.impls;
/*
  @author   george
  @project   course
  @class  GrouppServiceImpl
  @version  1.0.0 
  @since 07.04.2021 - 09.51
*/

import edu.pro.course.data.FakeData;
import edu.pro.course.model.Groupp;
import edu.pro.course.repository.GrouppMySQLRepository;
import edu.pro.course.service.groupp.interfaces.IBusiness;
import edu.pro.course.service.groupp.interfaces.IGrouppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class GrouppServiceImpl implements IGrouppService, IBusiness {
    private List<Groupp> list = new ArrayList<>();

    @Autowired
    FakeData data;

    @Autowired
    GrouppMySQLRepository repository;

    @PostConstruct
    private void  init(){
        list = data.getGroupps();
        repository.saveAll(list);
    }

    @Override
    public Groupp getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Groupp create(Groupp item) {
        item.setId(UUID.randomUUID().toString());
        return null;
    }

    @Override
    public Groupp update(Groupp item) {
        return null;
    }

    @Override
    public Groupp delete(String id) {
        return null;
    }

    @Override
    public List<Groupp> getAll() {
        return null;
    }
}
