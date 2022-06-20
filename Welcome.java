package com.day4.start;

public class Welcome {
    static int WagePerHour=20;
    static int FullDayHour=8;
    static int Wage=0;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int isPresent=(int)Math.floor(Math.random()*10)%2;
        if(isPresent==1)
        {
            System.out.println("Employee is present");
            Wage= WagePerHour*FullDayHour;
            System.out.println("Daily employee wage: "+Wage);
        }
       else{
            System.out.println("Employe is absent");
        }
    }
}
