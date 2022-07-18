package com.company;
import java.util.*;
import java.io.*;
class EmployDetail
{
    String employee_name;
    int yearOfExp;
    String designation;
    String employ_id;
    public void getInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee's name --------: ");
        employee_name=sc.nextLine();
        System.out.print("Enter Employee's ID ----------: ");
        employ_id=sc.nextLine();
        System.out.print("Enter Employee's experience--------: ");
        yearOfExp=sc.nextInt();
        System.out.print("Enter Employee's Position ----: ");
        designation=sc.next();
    }
}
