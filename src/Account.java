public class Account {
    private double balance;
    private int agency;
    private int number;
    private Client holder;
    private static int total;

    public Account(int agency, int number){
        total++;
        this.agency = agency;
        this.number = number;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public boolean withdraw(double value){
        if(this.balance >= value){
            this.balance -= value;
            return true;
        }

        return false;
    }

    public boolean transfer(double value, Account destination ){
        if(this.balance >= value){
            this.balance -= value;
            destination.deposit(value);
            return true;
        }

        return false;
    }

    public double getBalance(){
        return this.balance;
    }

    public Client getHolder(){
        return this.holder;
    }

    public void setHolder(Client cliente){
        this.holder = cliente;
    }

    public int getNumber(){
        return  this.number;
    }

    public void setNumber(int newNumber) {
        if(newNumber <= 0){
            System.out.println("O número da conta não pode ter valor negativo!");
            return;
        }
        this.number = newNumber;
    }

    public void setAgency(int agency) {
        if(agency <= 0){
            System.out.println("A agência não pode ter valor negativo!");
            return;
        }
        this.agency = agency;
    }

    public int getAgency() {
        return agency;
    }

    public static int getTotal() {
        return total;
    }
}