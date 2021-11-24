package com.assignment2;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ImplementationOfSquare extends Exception{
	
	ImplementationOfSquare()
	{
		
	}
	int run =1;
	double length;
	Scanner sc = new Scanner(System.in); 
	DecimalFormat df = new DecimalFormat("0.00");
    
	public void square() {
		
		System.out.println("Hello!! Your choice is Square");
		label:
		while(run==1)
		{
		  try {	
			System.out.println("For Area select 1"+"\n"+"For Perimeter select 2"+"\n"+"For Daigonal select 3");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			   case 1:
				   System.out.println("Please enter Length of sides here");
				   length = sc.nextDouble();
				   if(length < 0)
				   {
					   throw new ImplementationOfSquare();
				   }
				   else
				   {
					   
					   System.out.println("Area of Square with Length of sides "+length+" : ");
					   System.out.println(df.format(length * length));
				   }
				   break;
			   case 2:
				   System.out.println("Please enter length of sides here");
				   length = sc.nextDouble();
				   if(length < 0)
				   {
					   throw new ImplementationOfSquare();
				   }
				   else
				   {
					   
					   System.out.println("Perimeter of square with length "+length+" : ");
					   System.out.println(df.format(4*length));
				   }
				   break;
			   case 3:
				   System.out.println("Please enter length of sides here");
				   length = sc.nextDouble();
				   if(length < 0)
				   {
					   throw new ImplementationOfSquare();
				   }
				   else
				   {
					   
					   System.out.println("Daigonal of square with radius "+length+" : ");
					   System.out.println(df.format(length * Math.sqrt(2)));
				   }
				   break;
			 default:
				 System.out.println("Please enter valid Input");
				   
			}// ending of switch
			
			System.out.println("If you want to continue then please press 1 or for exit press 0");
			   run = sc.nextInt();
			   if(run==0)
		         {
			       System.out.println("BYE!!!");
			       System.exit(0);
			       
		         }
		         else if(run > 1 || run < 0)
		         {
		        	 System.out.println("You entered wrong please check and try again");
		        	 run=sc.nextInt();
		         }
		  }// ending of try
		  catch(ImplementationOfSquare cc){
			     
		      System.out.println("Length should be positive");
		      continue label;
	        }
         catch(InputMismatchException ex) {
			  
			  System.out.println("Please check your input");
			  continue label;
			  
		  }
		  
		}// ending of while
	}
}
