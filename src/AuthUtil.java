public class AuthUtil {

    private String password;

    public void setPassword(String password){
        this.password = password;
    }


    public boolean auth(String password) {
        if(this.password == password){
            return true;
        }else{
            return false;
        }
    }
}
