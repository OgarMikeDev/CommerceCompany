import java.time.LocalDate;

public class TopManager extends Employee {
    public TopManager(String name, double fixedSalary, LocalDate dateStartWork, Company company) {
        super(name, fixedSalary, dateStartWork, company);
    }

    @Override
    public double getMonthSalary() {
        double realIncome = getFixedSalary();
        if (company.getIncomeCompany() > 10_000_000) {
            realIncome += (getFixedSalary() * 150) / 100;
        }
        return realIncome;
    }
}
