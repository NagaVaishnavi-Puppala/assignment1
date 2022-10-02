/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author puppalanagavaishnavi
 */
public class EmployeeHistory {
    private ArrayList<Employee> employeHistory;

    public EmployeeHistory() {
        this.employeHistory = new ArrayList<Employee>() ;
    }

    public ArrayList<Employee> getEmployeHistory() {
        return employeHistory;
    }

    public void setEmployeHistory(ArrayList<Employee> employeHistory) {
        this.employeHistory = employeHistory;
    }

    public Employee addNewEmployee(){
        Employee emp = new Employee();
        employeHistory.add(emp);
        return emp;
    }
    
     public void deleteEmployee(Employee delete) {
        employeHistory.remove(delete);
    }
    
}
