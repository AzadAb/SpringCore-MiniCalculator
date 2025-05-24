package com.azad.Calculator.Operation;

public class CalculatorOperation {

    public  int addition(int a, int b){
        return  a+b;
    }
    public  int subtraction(int a, int b){
        return  a>b?a-b:0;

    }
    public int multiplication(int a , int b){
        return  a*b;
    }
    public int divsion(int a,int b){
        return b!=0?a/b:0;
    }




}
