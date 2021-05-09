//Captain-Price-TF-141

package project;

//Java program for to handle employee certification and license records                                                     

//import packeges and necessary classs 
import java.lang.*;

import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;    
import java.text.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class EmployeeInfo 
{
     // class variables
     String name;
     
     String type;
     
     String description;
     
     String issued;
     
     String renewed;
     
     String expired;

     // set employee information
     public EmployeeInfo(String name, String type, String description, String issued, String renewed, String expired) 
     {
             this.name = name;
             
             this.type = type;
             
             this.description = description;
             
             this.issued = issued;
             
             this.renewed = renewed;
             
             this.expired = expired;
     }
}




/* Java class */
public class EmplolyeeRecords
{
     
     
     // this method checks if a date is already passed or not
     static String isExpired(String date)
     {
             try
             {
                     SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
                     
                     Date dt = sdf.parse(date);
                     
                     long millis = dt.getTime();
                     
                     if (System.currentTimeMillis() - millis >= 0) 
                     {
                             return "Valid";
                     }
                     else
                     {
                             return "Expired";
                     }
             }
             catch(Exception e)
             {
            	 
             }
             return "";
     }
     /* Driver method */
     public static void main(String[] args)
     
     {
    	 
    	 
    	 	
             /* declare object(s) */
             ArrayList<EmployeeInfo> Info = new ArrayList<>();
             
             Scanner sc = new Scanner(System.in);
             
             /* declare variables */
             int choice;
             
             String name, description, issued, renewed, expired;
             
             String type;
             
             int found = 0;
             
             // declare variables
             int count = 0, i, j, id, hours;
             
             String temp = "", fname, mname, lname, major;
             
             double gpa;
             
             //read employee data from file
             //fetch all data
             try 
             {
                     // declare object
                     File obj = new File("employee_license_database.txt");
                     
                     Scanner read = new Scanner(obj);
                     
                     while (read.hasNextLine()) 
                     {
                             String data = read.nextLine();
                             // initialize
                             i = 0;
                             temp = "";
                             //fetch name
                             while((int)data.charAt(i) != 32) temp += data.charAt(i++);
                             
                             name = temp;
                             
                             i = i+1;
                             temp = "";
                             //get type
                             while((int)data.charAt(i) != 32) temp += data.charAt(i++);
                             
                             type = temp;
                             
                             i = i+1;
                             temp = "";
                             //get description
                             while((int)data.charAt(i) != 32) temp += data.charAt(i++);
                             
                             description = temp;
                             
                             i = i+1;
                             temp = "";
                             //get issued
                             while((int)data.charAt(i) != 32) temp += data.charAt(i++);
                             
                             issued = temp;
                             
                             i = i+1;
                             temp = "";
                             //get renewed
                             while((int)data.charAt(i) != 32) temp += data.charAt(i++);
                             
                             renewed = temp;
                             
                             i = i+1;
                             temp = "";
                             //get expired
                             while(i < data.length())
                                     temp += data.charAt(i++);
                             
                             expired = temp;
                             
                             // add to array list
                             Info.add(new EmployeeInfo(name, type, description, issued, renewed, expired)); 
                             
                             // increment counter
                             count++;
                     }
                     //close object
                     read.close();
             } 
             catch (Exception err) 
             {
                     System.out.println("ERROR!! While reading file!");
             }
             
             
             do
             {
                     // choices
                     System.out.println("1. Show all information");
                     
                     System.out.println("2. Show licenses");
                     
                     System.out.println("3. Show certificates");
                     
                     System.out.println("4. Search");
                     
                     System.out.println("5. Exit");
                     
                     System.out.print("Please enter your choice: ");
                     
                     choice = sc.nextInt();
                     
                     //studentinput.txt
                     switch(choice)
                     {
                             case 1:
                                     for(i = 0; i < Info.size(); i++)
                                     {
                                             System.out.print("Name: " + Info.get(i).name + "\nType: " + Info.get(i).type + "\nDescription: " + Info.get(i).description +
                                             "\nIssued: " + Info.get(i).issued + "\nRenewed: " + Info.get(i).renewed + "\nExpired: "+Info.get(i).expired + "\nStatus: " + isExpired(Info.get(i).expired) + "\n\n");
                                     }
                             break;
                             case 2:
                                     for(i = 0; i < Info.size(); i++)
                                     {
                                             if(Info.get(i).type.equals("License"))
                                             {
                                                     System.out.print("Name: " + Info.get(i).name + "\nType: " + Info.get(i).type + "\nDescription: " + Info.get(i).description +
                                                     "\nIssued: " + Info.get(i).issued + "\nRenewed: " + Info.get(i).renewed + "\nExpired: " + Info.get(i).expired + "\nStatus: " + isExpired(Info.get(i).expired) + "\n\n");
                                             }
                                     }
                             break;
                             
                             case 3:
                                     for(i = 0; i < Info.size(); i++)
                                     {
                                             if(Info.get(i).type.equals("Certificate"))
                                             {
                                                     System.out.print("Name: " + Info.get(i).name+"\nType: "+ Info.get(i).type+"\nDescription: " + Info.get(i).description +
                                                     "\nIssued: " + Info.get(i).issued + "\nRenewed: " + Info.get(i).renewed + "\nExpired: " + Info.get(i).expired + "\nStatus: " + isExpired(Info.get(i).expired) + "\n\n");
                                             }
                                     }
                             break;
                             case 4:
                                     sc.nextLine();
                                     
                                     // take input
                                     System.out.print("\nEnter the name: ");
                                     
                                     name = sc.nextLine();
                                     
                                     for(i = 0; i < Info.size(); i++)
                                     {
                                             if(Info.get(i).name.equals(name))
                                             {
                                                     System.out.print("Name: " + Info.get(i).name + "\nType: " + Info.get(i).type + "\nDescription: " + Info.get(i).description +
                                                     "\nIssued: " + Info.get(i).issued + "\nRenewed: " + Info.get(i).renewed + "\nExpired: " + Info.get(i).expired + "\nStatus: " + isExpired(Info.get(i).expired) + "\n\n");
                                             }
                                     }
                             break;
                             case 5:
                            	 
                             break;
                             default:
                                     System.out.print("\nWrong choice!");
                     }
                     //new line
                     System.out.print("\n\n");
                     
             }
             while(choice!=5);
     }
}
