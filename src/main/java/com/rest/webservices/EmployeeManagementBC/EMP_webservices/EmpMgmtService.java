package com.rest.webservices.EmployeeManagementBC.EMP_webservices;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpMgmtService {

    private static final List<Employee> employees = new ArrayList<>();

    private static long idCounter = 0;

    static {
        employees.add(new Employee(++idCounter, "Emp-I000"+idCounter, "Gowdham S", "TCS" ,"gowdhamsg@pec.edu"));
        employees.add(new Employee(++idCounter, "Emp-I000"+idCounter, "Raghul S", "MMC","raghuls@pec.edu"));
        employees.add(new Employee(++idCounter, "Emp-I000"+idCounter, "Geetha S", "NA","geethas@pec.edu"));
        employees.add(new Employee(++idCounter, "Emp-I000"+idCounter, "Raghul S", "MMC","raghuls@pec.edu"));
        employees.add(new Employee(++idCounter, "Emp-I000"+idCounter, "Raghul S", "MMC","raghuls@pec.edu"));
        employees.add(new Employee(++idCounter, "Emp-I000"+idCounter, "Raghul S", "MMC","raghuls@pec.edu"));
        employees.add(new Employee(++idCounter, "Emp-I000"+idCounter, "Raghul S", "MMC","raghuls@pec.edu"));
        employees.add(new Employee(++idCounter, "Emp-I000"+idCounter, "Raghul S", "MMC","raghuls@pec.edu"));
        employees.add(new Employee(++idCounter, "Emp-I000"+idCounter, "Raghul S", "MMC","raghuls@pec.edu"));
        employees.add(new Employee(++idCounter, "Emp-I000"+idCounter, "Raghul S", "MMC","raghuls@pec.edu"));
        employees.add(new Employee(++idCounter, "Emp-I000"+idCounter, "Raghul S", "MMC","raghuls@pec.edu"));
    }

    public List<Employee> findAll(){
        return employees;
    }

    public Employee deleteEmployeeById(long id){
        Employee employee = findById(id);

        if(employee == null) return null;

        if(employees.remove(employee)){
           return  employee;
        }
        return null;
    }

    public Employee findById(long id){
        for(Employee employee:employees){
            if(employee.getId() == id ){
                return employee;
            }
        }
        return null;
    }

    public Employee save(Employee employee){
        if(employee.getId() == -1 || employee.getId() == 0){
            employee.setId(++idCounter);
            employees.add(employee);
        }
        else{
            deleteEmployeeById(employee.getId());
            employees.add(employee);
        }
        return employee;
    }

}
