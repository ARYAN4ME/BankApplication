public interface BankInterface {
    int getBalance();
    String depositMoney(int amount);
    String withdrow(int amount,String password);
    double calculateInterst(int time);
}
