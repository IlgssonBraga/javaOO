public class Manager extends Employee implements Authentically {
    private String password;

    @Override
    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public boolean auth(String password) {
        if(this.password == password){
            return true;
        }else{
            return false;
        }
    }

    public double getBonus(){
        return super.getSalary();
     }

}
