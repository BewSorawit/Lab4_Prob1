public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Jame");
        System.out.println(b1.getInfo());

        BankAccount b2 = new BankAccount("Bew", 500, new Date(1, 11, 2558));
        System.out.println(b2.getInfo());

        System.out.println();

        b1.deposit(1000);
        b2.transfer(b1, 300);
        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());

        System.out.println();

        b2.withdraw(300);
        System.out.println(b2.getInfo());

        System.out.println();
        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());
    }
}
