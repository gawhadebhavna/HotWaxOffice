package com.assignment2;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ImplementationOfRectangle {

	ImplementationOfRectangle(){
		
	}
	
	int run =1;
	double length;
	double breadth;
	Scanner sc = new Scanner(System.in); 
	DecimalFormat df = new DecimalFormat("0.00");
	
	public void tringle() {
		
		System.out.println("Hello!! Your choice is Rectangle");
		label:
		while(run==1)
		{
		  try {	
			System.out.println("For Area select 1"+"\n"+"For Perimeter select 2"+"\n"+"For Daigonal select 3");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			   case 1:
				   System.out.println("Please enter Length and Breadth here");
				   length = sc.nextDouble();
				   breadth = sc.nextDouble();
				   if(length  < 0 || breadth <0)
				   {
					   throw new ImplementationOfCircle();
				   }
				   else
				   {
					   
					   System.out.println("Area of Rectangle with Length "+length+"and Height "+breadth+" : ");
					   System.out.println(df.format( length * breadth));
				   }
				   break;
			   case 2:
				   System.out.println("Please enter Length and Breadth here");
				   length = sc.nextDouble();
				   breadth = sc.nextDouble();
				   if(length  < 0 || breadth <0)
				   {
					   throw new ImplementationOfCircle();
				   }
				   else
				   {
					   
					   System.out.println("Perimeter of Rectangle with Length "+length+" and Height "+breadth+" : ");
					   System.out.println(df.format(2*(length + breadth)));
				   }
				   break;
			   case 3:
				   System.out.println("Please enter Length and Breadth here");
				   length = sc.nextDouble();
				   breadth = sc.nextDouble();
				   if(length < 0 || breadth <0)
				   {
					   throw new ImplementationOfCircle();
				   }
				   else
				   {
					   
					   System.out.println("Daigonal of Rectangle with Length "+length+" and Height  "+breadth+" : ");
					   System.out.println(df.format(Math.sqrt((length*length)*(breadth*breadth))));
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
		         else if(run==1)
		         {
		        	 continue label;
		         }
		         else
		         {
		        	 throw new InputMismatchException();
		         }
		  }// ending of try
		  catch(ImplementationOfCircle cc){
			     
		      System.out.println("Radius should be positive");
		      continue label;
	        }
          catch(InputMismatchException ex) {
			  
			  System.out.println("Please check your input");
			 
			  break;
			  
		  }
		   
		  
		}// ending of while
		
	}
}
