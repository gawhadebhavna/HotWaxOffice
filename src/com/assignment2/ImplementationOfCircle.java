package com.assignment2;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ImplementationOfCircle extends Exception{
	
	ImplementationOfCircle(){
		
		
	}
	int run =1;
	double radius;
	Scanner sc = new Scanner(System.in); 
	DecimalFormat df = new DecimalFormat("0.00");
	
	public void circle()
	{
		System.out.println("Hello!! Your choice is circle");
		label:
		while(run==1)
		{
		  try {	
			System.out.println("For Area select 1"+"\n"+"For Circumference select 2"+"\n"+"For Diameter select 3");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			   case 1:
				   System.out.println("Please enter radius here");
				   radius = sc.nextDouble();
				   if(radius < 0)
				   {
					   throw new ImplementationOfCircle();
				   }
				   else
				   {
					   
					   System.out.println("Area of circle with radius "+radius+" : ");
					   System.out.println(df.format(Math.PI * radius * radius));
				   }
				   break;
			   case 2:
				   System.out.println("Please enter radius here");
				   radius = sc.nextDouble();
				   if(radius < 0)
				   {
					   throw new ImplementationOfCircle();
				   }
				   else
				   {
					   
					   System.out.println("Circumference of circle with radius "+radius+" : ");
					   System.out.println(df.format(2*Math.PI * radius));
				   }
				   break;
			   case 3:
				   System.out.println("Please enter radius here");
				   radius = sc.nextDouble();
				   if(radius < 0)
				   {
					   throw new ImplementationOfCircle();
				   }
				   else
				   {
					   
					   System.out.println("Diameter of circle with radius "+radius+" : ");
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
		  catch(ImplementationOfCircle cc){
			     
		      System.out.println("Radius should be positive");
		      continue label;
	        }
		   
		  
		}// ending of while
	}
}
