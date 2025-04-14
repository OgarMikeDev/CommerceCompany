import java.time.LocalDate;

public class Operator extends Employee {
    public Operator(String name, double fixedSalary, LocalDate dateStartWork, Company company) {
        super(name, fixedSalary, dateStartWork, company);
    }

    @Override
    public double getMonthSalary() {
        return getFixedSalary();
    }
}
