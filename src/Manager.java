public class Manager extends Employee{
    private String password;

    public boolean auth(String password){
        if(this.password == password){
            return true;
        }else{
            return false;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBonus(){
        return super.getSalary();
     }


}
