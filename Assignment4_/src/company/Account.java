package company;

public class Account{
		
		 long balance;
		 String name;
		
		Account(String name,long balance)
		{
			this.name=name;
			this.balance=balance;
			
		}
		public String getName()
		{
			return name;
		}
		
		public long getBalance()
		{
			return balance;
		}
		
		 public void withdraw(long withdrawAmt){
		        Thread t=Thread.currentThread();
		        if(getBalance()>= withdrawAmt){
		            System.out.println("Before Withdraw Account balance of "+t.getName()+" is "+getBalance());
		            balance=getBalance()-withdrawAmt;
		            System.out.println(withdrawAmt+"Amount debited by "+t.getName()+" and current amount is "+getBalance());

		        }else{
		            System.out.println("Not enough balance for "+t.getName());
		        }

	}
	}

