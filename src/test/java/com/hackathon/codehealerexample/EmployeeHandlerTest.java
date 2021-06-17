package com.hackathon.codehealerexample;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;


public class EmployeeHandlerTest {

    @Test
    public void test_GetEmployeeByManagerName(){
        Employee employee = new Employee(1,"Tom", "Cruize", "Harry");
        Employee employee2 = new Employee(2,"Suzi", "Menon", null);
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(employee);employeeArrayList.add(employee2);
        EmployeeHandler employeeHandler = new EmployeeHandler();
        employeeHandler.addEmployeeList(employeeArrayList);

        Assert.assertNull(employeeHandler.getFirstEmployeeByManagerName(null));
    }

}