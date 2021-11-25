package com.assignment2;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ImplementationOfSphere extends Exception{

	ImplementationOfSphere()
	{
		
	}
	
	int run =1;
	double radius;
	Scanner sc = new Scanner(System.in); 
	DecimalFormat df = new DecimalFormat("0.00");
	
	public void sphere()
	{
		System.out.println("Hello!! Your choice is circle");
		label:
		while(run==1)
		{
		  try {	
			System.out.println("For Volume select 1"+"\n"+"For Surface area select 2"+"\n"+"For Diameter select 3");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			   case 1:
				   System.out.println("Please enter radius here");
				   radius = sc.nextDouble();
				   if(radius < 0)
				   {
					   throw new ImplementationOfSphere();
				   }
				   else
				   {
					   
					   System.out.println("Volume of Sphere with radius "+radius+" : ");
					   System.out.println(df.format((4/3) * Math.PI * radius * radius));
				   }
				   break;
			   case 2:
				   System.out.println("Please enter radius here");
				   radius = sc.nextDouble();
				   if(radius < 0)
				   {
					   throw new ImplementationOfSphere();
				   }
				   else
				   {
					   
					   System.out.println("Surface area of Sphere with radius "+radius+" : ");
					   System.out.println(df.format(4*Math.PI*radius*radius));
				   }
				   break;
			   case 3:
				   System.out.println("Please enter radius here");
				   radius = sc.nextDouble();
				   if(radius < 0)
				   {
					   throw new ImplementationOfSphere();
				   }
				   else
				   {
					   
					   System.out.println("Diameter of Sphere with radius "+radius+" : ");
					   System.out.println(df.format(2 * radius));
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
		  catch(ImplementationOfSphere cc){
			     
		      System.out.println("Radius should be positive");
		      continue label;
	        }
         catch(InputMismatchException ex) {
			  
			  System.out.println("Please check your input");
			  continue label;
			  
		  }
		  
		}// ending of while
	}	
}
