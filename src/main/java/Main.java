import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Company firstCompany = new Company();

        Employee firstEmployee = new Operator(
                25_000,
                LocalDate.of(2020, 9, 20),
                "Артём",
                firstCompany
        );

        Employee secondEmployee = new Manager(
                "Борис", 45_000,
                115_000 + (int) (Math.random() * (140_000-115_000)+ 1),
                LocalDate.of(2023, 12, 25),
                firstCompany
        );

        Employee thirdEmployee = new TopManager(
                45_000,
                LocalDate.of(2023, 12, 25),
                "Владислав",
                firstCompany
        );

        for (int i = 0; i < 10; i++) {
            Employee employee = new Manager(
                    "Борис", 45_000,
                    115_000 + (int) (Math.random() * (140_000-115_000)+ 1),
                    LocalDate.of(2023, 12, 25),
                    firstCompany
            );
            firstCompany.hire(employee);
        }

        firstCompany.hire(firstEmployee);
        firstCompany.hire(secondEmployee);
        firstCompany.hire(thirdEmployee);

        System.out.println(firstCompany);

        System.out.println("Топ 3 самых высоких зп: " + firstCompany.getTopSalaryStaff(3));
        System.out.println("Топ 3 самых низких зп: " + firstCompany.getLowSalaryStaff(3));
    }
}
