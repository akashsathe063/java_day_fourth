package com.day4.start;

public class Welcome {
   //static int isFullTime=1;
  //  static int isPartTime=2;
    static int WagePerHour=20;

    static int FullDayHour=8;
    static int PartTimeHours=4;
    static int Wage=0;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int CheckRandom=(int)Math.floor(Math.random()*10)%3;
        switch(CheckRandom){
        case 1:
            System.out.println("Employee is present");
            Wage= WagePerHour*FullDayHour;
            System.out.println("Daily employee wage: "+Wage);
        break;
            case 2:
                System.out.println("Employee is partime");
                Wage=WagePerHour*PartTimeHours;
                System.out.println("part time Employee Wage: "+Wage);
                break;
            default :
                System.out.println("Employee is absent");
                

        }
    }
}
