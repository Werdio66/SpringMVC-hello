package com._520.springMVC.dao;

import com._520.springMVC.domain.Employee;

import java.util.List;

public interface IEmployeeDAO {

    void save(Employee employee);

    void delete(Employee employee);

    void upDate(Employee employee);

    Employee get(Long id);

    List<Employee> listAll();
}
