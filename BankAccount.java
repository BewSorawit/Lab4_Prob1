public class BankAccount {
    private String name;
    private double amount;
    private Date date;

    public BankAccount(String name) {
        this.name = name;
        this.amount = 0;
        this.date = new Date(20, 7, 2566);
    }

    public BankAccount(String name, double amount, Date date) {
        this.name = name;
        this.amount = amount;
        this.date = date;
    }

    public void deposit(double amount) {
        this.amount += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= this.amount) {
            this.amount -= amount;
            return true;
        }
        return false;
    }

    public void transfer(BankAccount other, double amount) {
        if (withdraw(amount)) {
            other.deposit(amount);
        }
    }

    public double property() {
        return this.amount;
    }

    public String getInfo() {
        return "BankAccount [name=" + name + ", amount=" + amount + ", date=" + date + "]";
    }
}
