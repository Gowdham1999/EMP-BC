package com.rest.webservices.EmployeeManagementBC.EMP_webservices;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String empID;
    private String empName;
    private String companyName;
    private String empEmail;

    public Employee(Long id, String empID, String empName, String companyName, String empEmail) {
        this.id = id;
        this.empID = empID;
        this.empName = empName;
        this.companyName = companyName;
        this.empEmail = empEmail;
    }

    public Employee() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", empID='" + empID + '\'' +
               ", empName='" + empName + '\'' +
               ", companyName='" + companyName + '\'' +
               ", empEmail='" + empEmail + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
