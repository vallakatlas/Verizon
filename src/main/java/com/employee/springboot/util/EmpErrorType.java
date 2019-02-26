package com.employee.springboot.util;


public class EmpErrorType {

    private String errorMessage;

    public EmpErrorType(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
