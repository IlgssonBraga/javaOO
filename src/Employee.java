import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;

public abstract class Employee {
    private String name;
    private String cpf;
    private double salary;

    public abstract double getBonus();

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
