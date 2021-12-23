package company;

import java.util.Scanner;
public class AccountOverdrawDemo extends Thread{
	
	  Account account = new Account("Bhavna",1000);
	  public  void run() {
	        account.withdraw(1000);
	    }
}

class Main
{
    public static void main(String []arg) {
        Scanner sc=new Scanner(System.in);
        AccountOverdrawDemo AC = new AccountOverdrawDemo();
        Thread t1 = new Thread(AC, "Bhavna");
        Thread t2 = new Thread(AC, "Tamanna");
        SynchronizeDemo AC1 = new SynchronizeDemo();
        Thread user1 = new Thread(AC1, "Ravina");
        Thread user2 = new Thread(AC1, "Yachna");
        int i=1;
        while (i==1)
        {
            System.out.println("Please enter your choice here");
            System.out.println("1 Overlapping problem:");
            System.out.println("2 After resolving overlapping problem:");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    t1.start();
                    t2.start();
                    break;
                case 2:
                	user1.start();
                    user2.start();
                    break;
                default:
                    System.out.println("Invalid choice:");
                    break;

            }
            System.out.println("If you want to continue please enter 1 and for exit press any key");
            i=sc.nextInt();

        }
        
    }
    
}
     
