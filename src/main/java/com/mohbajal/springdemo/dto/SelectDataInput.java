package com.mohbajal.springdemo.dto;

/**
 * Created by 211008 on 8/1/19.
 */
public class SelectDataInput {

    private String columnsList;
    private String tableName;

    public String getColumnsList() {
        return columnsList;
    }

    public void setColumnsList(String columnsList) {
        this.columnsList = columnsList;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
