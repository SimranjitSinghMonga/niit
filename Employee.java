/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

/**
 *
 * @author Simran
 */
class Employee {

    private int empId;
    private String empName;
    private String ssn;
    private double salary;

    public Employee(int empId, String empName, String ssn, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public String getSsn() {
        return ssn;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void raiseSalary(double increase) {
    }
}

class Manager extends Employee {

    private String empDept;
    public Manager(int empID,String empName,String ssn,double salary,String empDept)
    {
        
        
    }

    public String getEmpDept() {
        return empDept;
    }
    
}
