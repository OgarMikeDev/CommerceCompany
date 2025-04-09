import java.time.LocalDate;

public abstract class Employee implements FunctionsEmployee {
    private String name;
    private final double fixedSalary;
    private final LocalDate dateStartWork;

    public Employee(String name, double fixedSalary, LocalDate dateStartWork) {
        this.name = name;
        this.fixedSalary = fixedSalary;
        this.dateStartWork = dateStartWork;
    }

    public String getName() {
        return name;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public LocalDate getDateStartWork() {
        return dateStartWork;
    }

    public void setName(String name) {
        this.name = name;
    }
}
