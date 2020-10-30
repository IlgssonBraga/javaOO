public class TesteEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Ilgsson");
        employee1.setCpf("07811768402");
        employee1.setSalary(1000);

        System.out.println(employee1.getBonus());
    }
}
