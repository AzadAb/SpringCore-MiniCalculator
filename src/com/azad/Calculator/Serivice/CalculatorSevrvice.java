package com.azad.Calculator.Serivice;

import com.azad.Calculator.Operation.CalculatorOperation;

import java.util.Scanner;

public class CalculatorSevrvice {

    CalculatorOperation operation;


//   Constructor injection
    public CalculatorSevrvice(CalculatorOperation operation){
        this.operation = operation;
    }


//    setter injection
//    public void setOperation(CalculatorOperation operation) {
//        this.operation = operation;
//    }


    public void  Calculate(){


        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first number:");
        int a = sc.nextInt();
        System.out.print("enter the second number:");
        int b = sc.nextInt();

        System.out.println("Addition of two number is:"+operation.addition(a,b));
        System.out.println("Subraction of (a-b)  is:"+operation.subtraction(a,b));
        System.out.println("MUlltiplication of two number is:"+operation.multiplication(a,b));
        System.out.println("Division of (a/b)  is:"+operation.divsion(a,b));



    }



}
