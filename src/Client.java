public class Client implements Authentically {
    private String name;
    private String cpf;
    private String occupation;
    private AuthUtil util;

    public Client(){
        this.util = new AuthUtil();
    }

    public String getName() {
        return name;
    }

    @Override
    public void setPassword(String password){
        this.util.setPassword(password);
    }

    @Override
    public boolean auth(String password) {
        return this.util.auth(password);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}


