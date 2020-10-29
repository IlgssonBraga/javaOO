public class TestBank {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.name = "Ilgsson Braga";
        client1.cpf = "07811768402";
        client1.occupation = "Dev";

        Account accountTest = new Account();
        accountTest.deposit(1000);
        accountTest.setHolder(client1);

        System.out.println(accountTest.getHolder().name);
    }
}
