package com.layed;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
public class EmplConnection {
	static Scanner scan=new Scanner(System.in);
	Connection con;
	Statement st;
   EmplConnection(){
	try{ 
	Class.forName("com.mysql.cj.jdbc.Driver"); 
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/iprimed","root","Navya@123");
     st=con.createStatement();
	   
}catch(Exception e) {e.printStackTrace();}
   }
   EmplConnection(String name ,int age,String job, int salary){
	   this();
	   try{st.executeUpdate("insert into employee(name, age, designation, salary) values('"+name+"',"+age+",'"+job+"',"+salary+");");
   }catch(Exception e) {e.printStackTrace();}
}
   EmplConnection(int salary){
	   this();
	   new Services(con,st);
   }
   public void display() {
	   new EmplConnection();
	   new Services().display(con,st);
   }
   public void displayByDesignation() {
	  new EmplConnection();
	  System.out.println("Select the Designation \n1MANAGER \n2.PROGRAMMER \n3.CLERK");
	  int desig=scan.nextInt();
	  new Services().displayByDesignation(con,st,desig);
	  
   }
public void raiseById() {
       new EmplConnection();
       System.out.println("ENTER ID TO RAISE SALARY :");
       int id=scan.nextInt();
       new Services().raiseByID(id,st,con);
	
}
public void deleteEmployee() {
	    new EmplConnection();
	    System.out.println("ENTER THE ID TO DELETE RECORD OF EMPOLOYEE:");
	    int id= scan.nextInt();
	    new Services().deleteById(st,con,id);
	
}
}