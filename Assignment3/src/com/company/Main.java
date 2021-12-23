package com.company;


import java.util.Scanner;

public class Main extends Exception{

    public static void main(String[] args){
    
    	EmployeeOptions eo = new EmployeeOptions();
    	Scanner sc = new Scanner(System.in);
    	int i=1;
    	label:
    	while(i==1)
    	{
           try
           {
       		System.out.println("Please enter your choice here");
       		System.out.println("For Add press 1"+"\n"+"For search press 2"+"\n"+"For delete press 3");
       		int choice = sc.nextInt();
       		switch(choice)
       		{
       		case 1:
       			eo.add();
       			break;
       		case 2:
       			eo.search();
       			break;
       		case 3:
       			eo.delete();
       			break;
       		default:
       			System.out.println("Please check your input");
       				
       		}
       		System.out.println("If you want to continue please press 1 or press 0");
       		i = sc.nextInt();
       		if(i==1)
       		{
       			continue label;
       		}
       		else if(i==0)
       		{
       			System.out.println("Bye!!");
       			System.exit(0);
       		}
       		else if(i>1 && i<0)
       		{
       			throw new Main();
       		}
        	   
           }
           catch(Main mn)
           {
        	   System.out.println("Please check your input and try again");
        	   i = sc.nextInt();
   	    	   continue label;
        	   
           }
    		
    	}
    	
    	
    	
    	
    	
    }

}
