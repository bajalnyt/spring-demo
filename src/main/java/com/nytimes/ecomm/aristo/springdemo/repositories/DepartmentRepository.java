package com.nytimes.ecomm.aristo.springdemo.repositories;

import com.nytimes.ecomm.aristo.springdemo.entity.Department;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 211008 on 7/31/19.
 */
public interface DepartmentRepository extends CrudRepository<Department, String> {

}
