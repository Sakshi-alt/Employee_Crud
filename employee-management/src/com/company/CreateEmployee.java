package com.company;
import java.util.*;
import java.io.*;
public class CreateEmployee {
        public void createFile()
        {
            Scanner sc=new Scanner(System.in);

            EmployDetail emp=new EmployDetail();
            emp.getInfo();
            try{
                File f1=new File("file"+emp.employ_id+".txt");
                    if(f1.createNewFile()){
                        FileWriter myWriter = new FileWriter("file"+emp.employ_id+".txt");
                        myWriter.write("Employee ID:"+emp.employ_id+"\n"+"Employee Name     :"+emp.employee_name+"\n"+
                                "Employee experience :"+emp.yearOfExp+"\n"+"Employee position :"+emp.designation);
                        myWriter.close();
                        System.out.println("\nEmployee has been Added :)\n");

                        System.out.print("\nPress Enter to Continue...");
                        sc.nextLine();
                }
                else {
                    System.out.println("\nEmployee already exists :(");
                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                }
            }
            catch(Exception e){System.out.println(e);}
        }
    }
