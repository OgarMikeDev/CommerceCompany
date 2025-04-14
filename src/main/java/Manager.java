import java.time.LocalDate;

public class Manager extends Employee {
    private double moneyEarnedForCompany;
    public Manager(String name, double fixedSalary, double moneyEarnedForCompany, LocalDate dateStartWork, Company company) {
        super(name, fixedSalary, dateStartWork, company);
        this.moneyEarnedForCompany = moneyEarnedForCompany;
        company.addSumCompany(moneyEarnedForCompany);
    }

    @Override
    public double getMonthSalary() {
        return getFixedSalary() + moneyEarnedForCompany;
    }
}
