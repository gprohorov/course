package edu.pro.course.service.groupp;

import edu.pro.course.data.FakeData;
import edu.pro.course.model.Groupp;
import edu.pro.course.model.Student;
import edu.pro.course.repository.groupp.GrouppRepository;
import edu.pro.course.service.student.impls.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    @Autowired
    StudentServiceImpl studentService;

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

    public Map<Groupp, Double> getGroupsSortedByAverageMark(){

        Map<Groupp, Double> sorted = new LinkedHashMap<>();
        Map<Groupp, Double> map = studentService.getAll().stream()
                .collect(Collectors.groupingBy(Student::getGroupp,
                Collectors.averagingDouble(Student::getMark)
                ));
        map.entrySet().stream()
                .sorted(Map.Entry.<Groupp,Double>comparingByValue().reversed())
                .forEachOrdered(entry -> sorted.put(entry.getKey(), entry.getValue()));

        return sorted;
    }
}
