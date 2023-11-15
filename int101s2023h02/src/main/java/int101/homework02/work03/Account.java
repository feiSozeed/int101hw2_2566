package int101.homework02.work03;

import int101.homework02.work01.Utilitor;
import int101.homework02.work02.Person;

public class Account {
    // 3.2 - 3.5 field
    private static long nextNo = 100_000_000;
    private final long no;
    private Person owner;
    private double balance;

    // 3.6 Constructor
    public Account(Person owner){
        if (owner == null){
            throw new NullPointerException();
        }
        this.owner = owner;
        this.balance = 0.0;
        
        var result = Utilitor.computeIsbn10(nextNo);
        while (result == 10) {
            nextNo++;
            result = Utilitor.computeIsbn10(nextNo);
        }
        this.no = 10 * Account.nextNo + result;
        nextNo++;
    }
    // 3.7 getter
    public long getNo(){
        return no;
    }
    public Person getOwner(){
        return this.owner;
    }
    public double getBalance(){
        return balance;
    }
    // 3.8 deposit
    public double deposit(double amount){
        Utilitor.testPositive(amount);
        this.balance += amount;
        return this.balance;
    }
    // 3.9 withdraw
    public double withdraw(double amount){
        Utilitor.testPositive(this.balance - amount);
        this.balance -= Utilitor.testPositive(amount);;
        return this.balance;
    }
    // 3.10 tranfer
    public void tranfer(double amount, Account account){
        if (account == null || this.equals(account)) throw new IllegalArgumentException();
        this.withdraw(amount);
        account.deposit(amount);
    }
    // 3.11 toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Account(");
        sb.append(no).append(",");
        sb.append(balance).append(")");
        return sb.toString();
    }
     //3.12 equals
    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
}