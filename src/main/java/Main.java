import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Employee firstEmployee = new Operator(
                "Арсений",
                30_000,
                LocalDate.of(2020, 4, 9)
        );

        Employee secondEmployee = new Manager(
                "Борис",
                40_000,
                115_000.0 + (int) ((Math.random() * (140_000 - 115_000)) + 1),
                LocalDate.of(2023, 4, 9)
        );

        System.out.println("Месячная зарплата первого сотрудника \"" + firstEmployee.getName() +
                "\" равна " + firstEmployee.getMonthSalary());
        System.out.println("Месячная зарплата второго сотрудника \"" + secondEmployee.getName() +
                "\" равна " + secondEmployee.getMonthSalary());
    }
}
