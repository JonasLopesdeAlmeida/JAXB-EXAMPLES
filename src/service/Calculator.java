package service;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculator {


    public Calculator(){}


    @WebMethod
    public int add( int a , int b){
        return a + b;
    }

    @WebMethod
    public int subtract( int a , int b){
        return a - b;
    }

    @WebMethod
    public int multiply( int a , int b){
        return a * b;
    }

    @WebMethod
    public int divide( int a , int b){
        return a / b;
    }



}
