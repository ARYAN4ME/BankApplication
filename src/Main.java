import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name , password , InitialBalance");
        String name = sc.nextLine();
        String password = sc.next();
        int balance = sc.nextInt();
        SBIAcciount MohitAcc = new SBIAcciount(balance,password,name);
        System.out.println("your Account has been Created & your Acc No:  "+MohitAcc.getAccountNumber());
        //Balance check:
        System.out.println("your current balance is: "+MohitAcc.getBalance());
        //Deposit Balance:
        System.out.println("Enter your dopositAmount: ");
        int deposit = sc.nextInt();
        System.out.println(MohitAcc.depositMoney(deposit));
        System.out.println("New Balance is: "+MohitAcc.getBalance());
        //Withdraw Balane:
        System.out.println("Enter the amount to Withdrawn:  ");
        int amount = sc.nextInt();
        System.out.println("Enter the Pasword:  ");
        String enterPassword = sc.next();
        System.out.println(MohitAcc.withdrow(amount,enterPassword));
        System.out.println("current Balance is: "+MohitAcc.getBalance());
        //Rate of Interst:

        int currBalance = MohitAcc.getBalance();
        double instBalance = MohitAcc.calculateInterst(5);
        double totleBalance = currBalance+instBalance;
        System.out.println("Interst for 5 years"+currBalance +" is "+instBalance);
        System.out.println("With Interest your Balance is: "+ totleBalance);



    }
}