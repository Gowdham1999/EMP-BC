package com.rest.webservices.EmployeeManagementBC.EMP_webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin
public class EmpMgmtJpaController {

    @Autowired
    private EmpMgmtJpaService employeeJpaService;

    @GetMapping("/home/{userName}/employees")
    public List<Employee> getAllEmployees(@PathVariable String userName) {
        return employeeJpaService.findAll();
    }


    @GetMapping("/home/{userName}/employees/{id}")
    public Employee getEmployeeById(@PathVariable String userName, @PathVariable Long id) {
        return employeeJpaService.findById(id).get();
    }

    @DeleteMapping("/home/{userName}/employees/{id}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable String userName, @PathVariable Long id) {
        employeeJpaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/home/{userName}/employees/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable String userName, @PathVariable int id, @RequestBody Employee employee){

        Employee updatedEmployee = employeeJpaService.save(employee);

        return new ResponseEntity<Employee>(employee, HttpStatus.OK);

    }

    @PostMapping("/home/{userName}/employees")
    public ResponseEntity<Void> addNewEmployee(@PathVariable String userName, @RequestBody Employee employee){

        Employee newEmployee = employeeJpaService.save(employee);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newEmployee.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}
