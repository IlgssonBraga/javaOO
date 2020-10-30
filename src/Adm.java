public class Adm extends Employee implements Authentically {

    private AuthUtil util;

    public Adm(){
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

    @Override
    public double getBonus(){
        return 50;
    }
}
