public class Client implements Authentically {
    private String name;
    private String cpf;
    private String occupation;
    private String password;

    public String getName() {
        return name;
    }

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


