package com.assignment2;
import java.util.Scanner;




public class CalculationOfDifferentShapes extends Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ImplementationOfCircle cc = new ImplementationOfCircle();
		ImplementationOfTringle it = new  ImplementationOfTringle();
		ImplementationOfRectangle ir = new  ImplementationOfRectangle();
		ImplementationOfSquare  is  =  new ImplementationOfSquare();
		ImplementationOfSphere  iss = new  ImplementationOfSphere();
		int run=1;
		label:
		while(run==1) {
	    
		       try {
	      	
		 		System.out.println("Please Make Your Choice Here For The Shape On Which You Want to Perform Different Methods");
				System.out.println("For Circle Press 1"+"\n"+"For Tringle Press 2"+"\n"+
				                   "For Square Press 3"+"\n"+"For Rectangle Press 4"+
						           "\n"+"For Cube Press 5"+"\n"+"For Sphere Press 5");
			   int choice = sc.nextInt();
		       switch(choice){
			       	
		       case 1:
		    	     cc.circle();
		    	   break;
		    	   
		       case 2:
		    	    it.tringle();
		    	   break;
		    	   
		       case 3:
		    	    is.square();
		    	   break;
		    	   
		       case 4:
		    	   ir.rectangle();
		    	   break;
		    	   
		       case 5:
		    	   //
		    	   break;
		       case 6:
		    	    iss.sphere();
		    	   break;
		       default:
		    	    System.out.println("Please enter valid choice");
		    	    break;
		    		   
		    	   
		          } // ending of switch
		       
		       System.out.println("If you want to exit press 0 Or press 1");
		       run = sc.nextInt();
		         if(run==0)
		         {
			       System.out.println("BYE!!!");
			       System.exit(0);
			       
		         }
		         else if(run > 1 || run < 0)
		         {
		        	 throw new CalculationOfDifferentShapes();
		         }
		  
		     } 
	    
	    catch(CalculationOfDifferentShapes cs) {
	    	
	    	System.out.println("Please check your input and try again");
	    	run = sc.nextInt();
	    	continue label;
	    	
	        }
	     }// ending of while
		 sc.close();	

	}
   
}
