package com.nytimes.ecomm.aristo.springdemo.entity;

import javax.persistence.*;

/**
 * Created by 211008 on 7/31/19.
 */
@Entity
@Table(name = "DEPARTMENT")
public class Department {

    public final static String DEPARTMENT_IDX = "DEPARTMENT_IDX";

    private long id;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "DepartmentGen")
    @SequenceGenerator(name = "DepartmentGen", sequenceName = "DEPARTMENT_GEN", allocationSize = 1)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String tab28_dept;

    public String getTab28_dept() {
        return tab28_dept;
    }

    public void setTab28_dept(String tab28_dept) {
        this.tab28_dept = tab28_dept;
    }
}
