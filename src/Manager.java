public class Manager extends Employee implements Authentically {
    private AuthUtil util;

    public Manager(){
        this.util = new AuthUtil();
    }

    @Override
    public void setPassword(String password){
        this.util.setPassword(password);
    }

    @Override
    public boolean auth(String password) {
        return this.util.auth(password);
    }

    public double getBonus(){
        return super.getSalary();
     }

}
