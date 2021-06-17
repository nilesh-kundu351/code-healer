package com.hackathon.codehealerexample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHandler {

    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployeeList(List<Employee> empList){
        this.employeeList = empList;
    }
    public Employee  getFirstEmployeeByManagerName(String managerName){
       for(Employee employee : employeeList){
           if (managerName == null) {
               if( new String().equals(employee.getMgrName())){
                   return employee;
               }
           } else {
               if(managerName.equals(employee.getMgrName())){
                   return employee;
               }
           }
       }
       return null;
    }
}
