package com.company;
import java.io.*;
import java.util.*;	


public class EmployeeOptions{
	
	EmployeeOptions(){
		
		
		
	}
	
    int i =1;
    int id,age;
    String name,dob,email;
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();

    public void add()
    {
    	System.out.println("Please enter some information here");
    	System.out.print("Id:");
    	id=sc.nextInt();
    	System.out.println("Name:");
    	name=sc.next();
    	sc.nextLine();
    	System.out.println("Date Of Birth:");
    	dob=sc.nextLine();
    	System.out.println("Age:");
    	age=sc.nextInt();
    	sc.nextLine();
    	System.out.println("Email:");
    	email=sc.next();
    	sc.nextLine();
    	
    	list.add(id+","+name+","+dob+","+age+","+email);
    	
    	try {
    	    PrintWriter writer = new PrintWriter(new FileWriter("employee.txt" , true));
    		for(String inform:list)
    		{
    			writer.println(inform);
    		}
    		writer.flush();
    		writer.close();
    	}
    	catch(IOException ioe)
    	{
    	  System.out.println("Please enter valid input");	
    	}
      
    }
    public void search()
    {
    	System.out.println("Please enter Id here to search");
    	long tempId = sc.nextLong();
    	
       try 
       {
    	   File file = new File("employee.txt");
    	   FileReader  fr = new FileReader(file);
    	   BufferedReader br = new BufferedReader(fr);
    	   String line;
    	   while((line = br.readLine())!=null)
    	   {
    		 if(line.contains(String.valueOf(tempId)))
    		 {
    			 System.out.println(line);
    		 }
    				
    	   }
       }
       catch(FileNotFoundException fe)
       {
    	   fe.printStackTrace();
       }
       catch(IOException ie)
       {
    	   ie.printStackTrace();
       }
    }
    public void delete()
    {
      try 
      {
    	  File file = new File("employee.txt");
    	  File tempFile = new File("temp.txt");
    	  FileWriter filewriter = new FileWriter(tempFile);
    	  PrintWriter printwriter = new PrintWriter(filewriter);
    	  FileReader filereader = new FileReader(file);
    	  BufferedReader br = new BufferedReader(filereader);
    	  
    	  System.out.println("Please enter ID to delete");
    	  long deletId = sc.nextLong();
    	  String line ;
    	  while((line=br.readLine())!=null)
    	  {
    		  if(line.contains(String.valueOf(deletId)))
    		  {
    			  continue;
    		  }
    		  else
    		  {
    			  printwriter.println(line);
    		  }
    	  }
    	  
    	  System.out.println("Successfully deleted"+ file.delete());
    	  tempFile.renameTo(file);
      }
      catch(FileNotFoundException fe)
      {
    	  ie.printStackTrace();
      }
      catch(IOException ie)
      {
    	  ie.printStackTrace();
      }
    }
	
	
	
}
