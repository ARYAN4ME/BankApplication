import java.util.UUID;

public class SBIAcciount implements BankInterface{
    private String name;
    private String accountNumber;
    private int balance;
    private String password;
    private double rateOfInterest;

    public SBIAcciount(int balance, String password, String name) {
        this.balance = balance;
        this.password = password;
        this.name = name;
        this.rateOfInterest = 5.5;
        this.accountNumber = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {

        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "your Account has been debated: "+amount;
    }

    @Override
    public String withdrow(int amount,String enterPassword) {
        if(enterPassword.equals(this.password)){
            if(amount>balance){
                return "aukat ma rha kr enter kr:";
            }
            else{
                balance -= amount;
                return "jaa moj krr";
            }
        }
        else{
            return "to shai password ky hai";
        }
    }

    @Override
    public double calculateInterst(int time) {

        return (balance * rateOfInterest * time)/100.0;
    }
}
