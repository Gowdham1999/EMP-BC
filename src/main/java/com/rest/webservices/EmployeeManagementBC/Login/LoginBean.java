package com.rest.webservices.EmployeeManagementBC.Login;

public class LoginBean {

    private String message;

    public LoginBean(String message) {
        this.message = message;
    }

    public LoginBean() {}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
               "message='" + message + '\'' +
               '}';
    }
}
