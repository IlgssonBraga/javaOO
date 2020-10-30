public class InternSystem {
    private String password = "2222";

    public void auth(Authentically e){
        boolean authenticated = e.auth(this.password);

        if(authenticated){
            System.out.println("Pode entrar no sistema!");
        }else {
            System.out.println("Não pode entrar no sistema!");
        }
    }
}
