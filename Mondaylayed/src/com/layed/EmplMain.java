package com.layed;
import java.util.*;
public class EmplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0,select=0;
		Scanner scan= new Scanner(System.in);
		
		     do{
		    	 System.out.println("1.CREATE AN EMPLOYEE \n2.DISPALY ALL EMPLOYEES \n3.DISPLAY EMPLOYEE BY DESIGNATION \n4.RAISE THE SALARIES OF ALL EMPLOYEES \n5.RAISE SALARY BY ID \n6.DELETE EMPLOYEE BY ID \n7.EXIT \nENTER YOUR CHOICE");
		       choice=scan.nextInt();
		       if(choice==7) break;
		       switch(choice){
		       case 1: do { System.out.println("YOU WOULD YOU LIKE TO CREATE  \n1.MANAGER \n2.CLERK \n3.PROGRAMMER \n4.QUIT");
		               select=scan.nextInt();
		              if(select==4) break;
		              System.out.println("ENTER NAME: ");
		              String name=scan.next();
		              System.out.println("ENTER AGE: ");
		              int age=scan.nextInt();
		              switch(select) {
		              case 1 :   Empl m=new Manager(name,age);
		                         m.create();
		                         break;
		              case 2:    Empl c= new Clerk(name,age);
		                         c.create();
		                         break;
		              case 3 :    Empl p= new Programmer(name,age);
		                         p.create();
		                         break;
		              default:   System.out.println("INVALID SELECTION...");
		              }
		            }while(select!=4);
		             break;
		     case 2:     new EmplConnection().display();
		                  break;
		     case 3:     new EmplConnection().displayByDesignation();
		    	         break;
		     case 4:    (new Clerk()).raiseSalary();
		                 System.out.println("SALARY RAISED...\n");
		                  break;
		     case 5:    new EmplConnection().raiseById();
		                System.out.println("SALARY RAISED......!");
		                 break;
		     case 6:    new EmplConnection().deleteEmployee();
		          
		                System.out.println("EMPLOYEE DETAILS DELETED PERMANENTLY.......");
		                break;
		      default: System.out.println("INVALID CHOICE....!");
		     }                    
	   }while(choice!=7);
	
  }

}