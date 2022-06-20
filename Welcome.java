package com.day4.start;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int isPresent=(int)Math.floor(Math.random()*10)%2;
        if(isPresent==1)
        {
            System.out.println("Employee is present");
        }
       else{
            System.out.println("Employe is absent");
        }
    }
}
