import java.time.LocalDate;

public class Manager extends Employee {
    private double moneyEarnedForCompany;
    public Manager(String name, double fixedSalary, double moneyEarnedForCompany, LocalDate dateStartWork) {
        super(name, fixedSalary, dateStartWork);
        this.moneyEarnedForCompany = moneyEarnedForCompany;
    }

    @Override
    public double getMonthSalary() {
        return getFixedSalary() + moneyEarnedForCompany;
    }
}
