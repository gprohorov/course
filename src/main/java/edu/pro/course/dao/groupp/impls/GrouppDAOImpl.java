package edu.pro.course.dao.groupp.impls;

import edu.pro.course.dao.groupp.interfaces.IGrouppDAO;
import edu.pro.course.data.FakeData;
import edu.pro.course.model.Groupp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
  @author   george
  @project   course
  @class  GrouppDAOImpl
  @version  1.0.0 
  @since 18.02.2021 - 13.48
*/
@Repository
public class GrouppDAOImpl implements IGrouppDAO {

    @Autowired
    FakeData fakeData;

    @Override
    public Groupp getById(String id) {
        return this.getAll().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }


    public Groupp getByName(String name) {
        return this.getAll().stream().filter(item -> item.getName().equals(name))
                .findFirst().orElse(null);
    }

    @Override
    public Groupp create(Groupp item) {
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
        return fakeData.getGroupps();
    }
}
