public class TestSystem {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setPassword("2222");

        Adm adm1 = new Adm();
        adm1.setPassword("12");

        InternSystem is = new InternSystem();
        is.auth(m1);
        is.auth(adm1);
    }
}
