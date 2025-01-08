package day2.q3;
public class q3_tester
{
    public static void main(String[] args)
    {
        // savings account
        Account account1= new SavingsAccount("Koerber", "1234512345", 50000, 1000);
        double balance= ((SavingsAccount) account1).getBalance();
        System.out.println("balance: "+balance);
        // withdraw out of limit
        ((SavingsAccount) account1).withdraw(50000);
        //withdraw within the limit
        ((SavingsAccount) account1).withdraw(30000);


        //current account
        Account account2= new CurrentAccount("Koerberban", "1234512345", 50000, "abcd" ,1000);
        double balance_current= ((CurrentAccount) account2).getBalance();
        System.out.println("balance: "+balance_current);
        // withdraw out of limit
        ((CurrentAccount) account2).withdraw(60000);
        //withdraw within the limit
        ((CurrentAccount) account2).withdraw(50500);




    }
}
