package com._520.springMVC.dao.impl;

import com._520.springMVC.dao.IEmployeeDAO;
import com._520.springMVC.domain.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl implements IEmployeeDAO {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void save(Employee employee) {
        jdbcTemplate.update("INSERT INTO employee (name,age) VALUES (?,?)",
                employee.getName(),employee.getAge());
    }

    public void delete(Employee employee) {
        jdbcTemplate.update("DELETE FROM employee WHERE id = ?",employee.getId());
    }

    public void upDate(Employee employee) {
        jdbcTemplate.update("UPDATE employee SET name = ?, age = ? WHERE id = ?"
                ,employee.getName(),employee.getAge(),employee.getId());
    }

    public Employee get(Long id) {
        List<Employee> list = jdbcTemplate.query("SELECT id,name,age FROM employee WHERE id = ?",
                new Object[]{id}, new RowMapper<Employee>() {
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setId(resultSet.getLong("id"));
                employee.setAge(resultSet.getInt("age"));
                employee.setName(resultSet.getString("name"));
                return employee;
            }
        });
        return list.size() == 1 ? list.get(0) : null;
    }

    public List<Employee> listAll() {
        return jdbcTemplate.query("SELECT id,name,age FROM employee", new Object[]{}, new RowMapper<Employee>() {
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setId(resultSet.getLong("id"));
                employee.setAge(resultSet.getInt("age"));
                employee.setName(resultSet.getString("name"));
                return employee;
            }
        });
    }
}
