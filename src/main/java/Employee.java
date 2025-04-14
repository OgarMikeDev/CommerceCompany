import java.time.LocalDate;

public abstract class Employee {
    private final double fixedSalary;
    private String name;
    private final LocalDate dateStartWork;
    protected Company company;

    public Employee(double fixedSalary, LocalDate dateStartWork, String name, Company company) {
        this.fixedSalary = fixedSalary;
        this.dateStartWork = dateStartWork;
        this.name = name;
        this.company = company;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateStartWork() {
        return dateStartWork;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getMonthSalary();


    @Override
    public String toString() {
        return "Employee{" +
                "fixedSalary=" + fixedSalary +
                ", name='" + name + '\'' +
                ", dateStartWork=" + dateStartWork +
                '}';
    }
}
