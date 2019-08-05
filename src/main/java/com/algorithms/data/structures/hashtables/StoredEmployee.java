package com.algorithms.data.structures.hashtables;

import com.algorithms.data.structures.model.Employee;

public class StoredEmployee {

    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "{" +
                "key='" + key + '\'' +
                ", employee=" + employee +
                '}';
    }
}
