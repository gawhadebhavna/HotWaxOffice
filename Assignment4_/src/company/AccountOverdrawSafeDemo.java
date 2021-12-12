package company;

public class AccountOverdrawSafeDemo {
	
    int balance;
    AccountOverdrawSafeDemo(int balance)
    {
        this.balance =balance;
    }


    public int getBalance() {
        return balance;
    }

    synchronized void withdraw1 (int withdraw){
        Thread t=Thread.currentThread();
        if(getBalance()>= withdraw){
            System.out.println("Before Withdraw Account balance of "+t.getName()+" is "+getBalance());
            balance=getBalance()-withdraw;
            System.out.println(withdraw+"Amount debited by "+t.getName()+" and current amount is "+getBalance());

        }else{
            System.out.println("Not enough balance for "+t.getName());
        }
    }

}

class SynchronizeDemo extends Thread {
AccountOverdrawSafeDemo a1 = new AccountOverdrawSafeDemo(1000);
public void run() {
    a1.withdraw1(500);
}
}