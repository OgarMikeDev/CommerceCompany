import java.time.LocalDate;

public class Operator extends Employee{

    public Operator(double fixedSalary, LocalDate dateStartWork, String name, Company company) {
        super(fixedSalary, dateStartWork, name, company);
    }

    @Override
    public double getMonthSalary() {
        return getFixedSalary();
    }
}
