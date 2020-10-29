public class Account {
    private double balance;
    private int agency;
    private int number;
    private Client holder;

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

    public void setHolder(Client newCliente){
        this.holder = newCliente;
    }

    public int getNumber(){
        return  this.number;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getAgency() {
        return agency;
    }
}