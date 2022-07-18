import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.mysql.cj.Query;
import com.mysql.cj.xdevapi.PreparableStatement;

public class App {
    public static void insertquery() 
    {
        String employee_name;
        int yearOfExp;
        String designation;
        String employ_id;
        Date date = new Date();
String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Employee's name --------: ");
        employee_name=sc.nextLine();
        System.out.print("Enter Employee's ID ----------: ");
        employ_id=sc.nextLine();
        System.out.print("Enter Employee's experience--------: ");
        yearOfExp=sc.nextInt();
        System.out.print("Enter Employee's Position ----: ");
        designation=sc.next();   
        String query="INSERT INTO employees (EmpID,EmpName,EmpDateOfjoin,EmpYearOfExp,EmpDesignation)  VALUES  ("+employ_id+","+"\""+employee_name+"\""+","+"\""+modifiedDate+"\""+","+yearOfExp+","+"\""+designation+"\""+");";
        executedQuery(query,1);
    }
    public static void executedQuery(String query,int flag) 
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakshidb3", "root", "Sakshi@2000");
            
            // System.out.println(rs);
            if(flag==1)
            {
                Statement stmt=con.createStatement();
                stmt.executeUpdate(query);       
            }
            if(flag==0)
            {
                Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                System.out.println(rs.getString(2));
            }
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void getAllEmp()
    {
        String query="SELECT * FROM employees;";
        executedQuery(query,0);
    }
    // public static void main(String[] args) throws Exception 
    // {
    //     String query="SELECT * FROM employees;";
    //     try
    //     {
    //         Class.forName("com.mysql.cj.jdbc.Driver");
    //         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakshidb3", "root", "Sakshi@2000");
    //         Statement st=con.createStatement();
    //         ResultSet rs=st.executeQuery(query);
    //         while(rs.next())
    //         {
    //             System.out.println(rs.getString(2));
    //         }
    //         con.close();
    //     }
    //     catch(Exception e)
    //     {
    //         System.out.println(e);
    //     }
    // }
}
class Driver{
    public static void main(String[] args) {
        App a=new App();
    a.insertquery();
     //a.getAllEmp();
    }
}
