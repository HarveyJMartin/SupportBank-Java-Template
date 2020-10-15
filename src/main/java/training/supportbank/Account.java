package training.supportbank;


public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

	public void setBalance(double newBalance) {
        //balance = newBalance;
        balance = Math.round(newBalance *100.0) / 100.0 ;
	}

}