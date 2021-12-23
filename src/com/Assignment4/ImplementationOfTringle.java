package com.assignment2;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.InputMismatchException;


public class ImplementationOfTringle extends Exception{
	
	ImplementationOfTringle(){
		
	}
	int run =1;
	double base;
	double height;
	Scanner sc = new Scanner(System.in); 
	DecimalFormat df = new DecimalFormat("0.00");
	
	public void tringle() {
		
		System.out.println("Hello!! Your choice is Tringle");
		label:
		while(run==1)
		{
		  try {	
			System.out.println("For Area press 1"+"\n"+"If you want to know some more intresting about Tringle then press 2");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			   case 1:
				   System.out.println("Please enter Base here");
				   base = sc.nextDouble();
				   
				   height = sc.nextDouble(); 
				   if(base < 0 || height <0)
				   {
					   throw new ImplementationOfTringle();
				   }
				   else
				   {
					   double area = 0.5*(base * height );
					   System.out.println("Area of Tringle with Base and Height "+base+"\t"+height+" : "+ df.format(area));
					  
				   }
				   break;
			   case 2:
				   System.out.println("Properties of triangles:");
				   System.out.println("* If two triangles are similar"+"\n"+"ratios of sides = ratio of heights = ratio of medians "
				   		            + "= ratio of angle bisectors = ratio of inradii = ratio of circum radii");
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
		  catch(ImplementationOfTringle cc){
			     
		      if(base <=0)
		      {
		    	  System.out.println("Base should be integer");
		    	  continue label;
		      }
		      else if(height <=0)
		      {
		    	  System.out.println("Height should be integer");
		    	  continue label;
		      }
		      else if(run==1)
		         {
		        	 continue label;
		         }
		         else
		         {
		        	 throw new InputMismatchException();
		         }
		       
	        }
		  catch(InputMismatchException ex) {
			  
			  System.out.println("Please check your input");
			  break;
			  
		  }
		   
		  
		}// ending of while
		
	}

}
