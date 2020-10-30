public class TestManager {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setName("Ilgner");
        m1.setCpf("07811993932");
        m1.setSalary(2000);
        m1.setPassword("123456");

        System.out.println(m1.getName());
        System.out.println(m1.getCpf());


        boolean auth = m1.auth("123456");

        System.out.println(auth);
    }
}
