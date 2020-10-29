public class TestValues {
    public static void main(String[] args) {
        Account account = new Account(1264, 223751);
        account.setAgency(-2);
        account.setNumber(-2);
        Account account2 = new Account(1264, 223751);
        Account account3 = new Account(1264, 223751);
        Account account4 = new Account(1264, 223751);
        Account account5 = new Account(1264, 223751);

        System.out.println(Account.getTotal());

    }
}
