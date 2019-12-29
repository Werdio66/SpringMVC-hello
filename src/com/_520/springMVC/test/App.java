package com._520.springMVC.test;


import com._520.springMVC.dao.IEmployeeDAO;
import com._520.springMVC.domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class App {

    @Autowired
    private IEmployeeDAO dao;


    public static void main(String[] args) {
        new App().testListAll();
    }
    private void testListAll(){
        List<Employee> list = dao.listAll();
        for (Employee e:list
             ) {
            System.out.println(e);
        }
    }
}
