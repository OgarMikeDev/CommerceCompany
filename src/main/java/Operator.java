import java.time.LocalDate;

public class Operator extends Employee {
    public Operator(String name, double fixedSalary, LocalDate dateStartWork) {
        super(name, fixedSalary, dateStartWork);
    }

    @Override
    public double getMonthSalary() {
        return getFixedSalary();
    }
}
