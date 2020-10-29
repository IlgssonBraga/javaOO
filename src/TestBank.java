public class TestBank {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.setName("Ilgsson Braga");
        client1.setCpf("07811768402");
        client1.setOccupation("Dev");

        Account accountTest = new Account(1264, 223751);
        accountTest.deposit(1000);
        accountTest.setHolder(client1);

        System.out.println(accountTest.getHolder().getName());
    }
}
