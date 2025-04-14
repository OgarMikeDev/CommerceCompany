import java.time.LocalDate;

public class TopManager extends Employee {
    public TopManager(double fixedSalary, LocalDate dateStartWork, String name, Company company) {
        super(fixedSalary, dateStartWork, name, company);
    }

    @Override
    public double getMonthSalary() {
        double realSalary = getFixedSalary();

        if (company.getIncomeCompany() > 10_000_000) {
            realSalary += getFixedSalary() * 150 / 100;
        }

        return realSalary;
    }


}
