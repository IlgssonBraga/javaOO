public class TestReferency {
    public static void main(String[] args) {
        Employee m1 = new Manager();

        m1.setName("Arlaine");
        String name = m1.getName();
        m1.setSalary(5000);

        Employee e1 = new Employee();
        e1.setSalary(2500);

        BonusController controller = new BonusController();

        Employee ev = new EditorVideo();
        controller.register(m1);
        controller.register(e1);
        controller.register(ev);

        System.out.println(controller.getSum());
    }
}
