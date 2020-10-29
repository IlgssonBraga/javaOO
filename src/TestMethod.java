public class TestMethod {
    public static void main(String[] args) {
        Account account1 = new Account();

        account1.deposit(50);

        account1.withdraw(24);

        System.out.println(account1.getBalance());

        Account account2 = new Account();

        account1.deposit(1000);

        account1.transfer(300, account2);

        System.out.println("Account 1 balance: " + account1.getBalance());

        System.out.println("Account 2 balance: " + account2.getBalance());
    }
}
