package com.nytimes.ecomm.aristo.springdemo.controllers;

import com.nytimes.ecomm.aristo.springdemo.dto.SelectDataInput;
import com.nytimes.ecomm.aristo.springdemo.service.DataProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 211008 on 7/31/19.
 */
@RestController
@CrossOrigin
public class MainController {

    @Autowired
    DataProvider dataProvider;

    @GetMapping(value = "hello")
    public String getHello(){
        return dataProvider.getData();
    }

    @PostMapping(value = "data")
    public String getData(@RequestBody SelectDataInput input){

        if(input.getTableName()==null)
            return null;
        return dataProvider.getData(input);
    }

}
