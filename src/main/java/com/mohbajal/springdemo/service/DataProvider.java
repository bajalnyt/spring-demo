package com.mohbajal.springdemo.service;

import com.mohbajal.springdemo.dto.SelectDataInput;
import com.mohbajal.springdemo.entity.Department;
import com.mohbajal.springdemo.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 211008 on 7/31/19.
 */
@Service
public class DataProvider {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DepartmentRepository departmentRepository;

    public String getData() {

        /* Running query using repository class */
        Iterable<Department> data = departmentRepository.findAll();

        StringBuilder s = new StringBuilder();
        for (Department d : data) {
            s.append(d.getTab28_dept()).append(" , ");
        }
        return s.toString();
    }

    public String getData(SelectDataInput input) {
        StringBuilder s = new StringBuilder();
        String sql = "SELECT " + input.getColumnsList() + " FROM " + input.getTableName() + " where rownum <=20";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);


        s.append("<tr>");
        rows.get(0).keySet().forEach(key->s.append("<th>").append(key).append("</th>"));
        s.append("</tr>");

        // Loop through each data record
        for(Map<String, Object> row: rows) {
            s.append("</tr>");
            row.entrySet().forEach(val->s.append("<td>").append(val.getValue()).append("</td>"));
            s.append("</tr>");
        }

        //rows.forEach(System.out::println);

        return s.toString();

    }
}
