package edu.pro.course.dao.groupp.interfaces;
/*
  @author   george
  @project   course
  @class  IGrouppDAOMySQLImpl
  @version  1.0.0 
  @since 07.04.2021 - 09.32
*/

import edu.pro.course.data.FakeData;
import edu.pro.course.model.Groupp;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IGrouppDAOMySQLImpl implements IGrouppDAO {

    @Autowired
    FakeData defaults;


    private void saveDefaults(){

    }
    @Override
    public Groupp getById(String id) {
        return null;
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
        return null;
    }
}
