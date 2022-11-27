package com.rest.webservices.EmployeeManagementBC.Login;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class LoginController {

    @GetMapping("/auth")
    public LoginBean authenticateUser(){
        return new LoginBean("Authenticated");
    }

}
