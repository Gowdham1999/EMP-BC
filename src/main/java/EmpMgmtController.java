import com.rest.webservices.EmployeeManagementBC.EMP_webservices.EmpMgmtService;
import com.rest.webservices.EmployeeManagementBC.EMP_webservices.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin
public class EmpMgmtController {

    @Autowired
    private EmpMgmtService employeeService;

    @GetMapping("/home/{userName}/employees")
    public List<Employee> getAllEmployees(@PathVariable String userName) {
        return employeeService.findAll();
    }


    @GetMapping("/home/{userName}/employees/{id}")
    public Employee getEmployeeById(@PathVariable String userName, @PathVariable int id) {
        return employeeService.findById(id);
    }

    @DeleteMapping("/home/{userName}/employees/{id}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable String userName, @PathVariable int id){
        Employee employee = employeeService.deleteEmployeeById(id);

        if(employee != null){
            return ResponseEntity.noContent().build();
        }
        return  ResponseEntity.notFound().build();
    }

    @PutMapping("/home/{userName}/employees/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable String userName, @PathVariable int id, @RequestBody Employee employee){

        Employee updatedEmployee = employeeService.save(employee);

        return new ResponseEntity<Employee>(employee, HttpStatus.OK);

    }

    @PostMapping("/home/{userName}/employees")
    public ResponseEntity<Void> addNewEmployee(@PathVariable String userName, @RequestBody Employee employee){

        Employee newEmployee = employeeService.save(employee);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newEmployee.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

}
