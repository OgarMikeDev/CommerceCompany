import java.util.ArrayList;
import java.util.List;

public class Company {
    private ArrayList<Employee> listAllEmployees;
    private ArrayList<Double> listAllSalaries;
    private double incomeCompany;

    public Company() {
        incomeCompany = 0;
        listAllEmployees = new ArrayList<>();
        listAllSalaries = new ArrayList<>();
    }

    public void addSumCompany(double sumForCompany) {
        incomeCompany += sumForCompany;
        listAllSalaries.add(sumForCompany);
    }

    public void hire(Employee employee) {
        listAllEmployees.add(employee);
    }

    public void hireAll(ArrayList<Employee> employees) {
        listAllEmployees.addAll(employees);
    }

    public void fire(Employee employee) {
        listAllEmployees.remove(employee);
    }

    public double getIncomeCompany() {
        return incomeCompany;
    }

    public List<Double> getTopSalaryStaff(int count) {
        sortedSalaries();
        List<Double> listTopSalaryStaff = new ArrayList<>();

        if (listAllSalaries.size() >= count) {
            for (int i = listAllSalaries.size() - 1; i >= listAllSalaries.size() - count; i--) {
                listTopSalaryStaff.add(listAllSalaries.get(i));
            }
        }

        return listTopSalaryStaff;
    }

    public List<Double> getLowSalaryStaff(int count) {
        sortedSalaries();
        List<Double> listLowSalaryStaff = new ArrayList<>();

        if (listAllSalaries.size() >= count) {
            for (int i = 0; i < count; i++) {
                listLowSalaryStaff.add(listAllSalaries.get(i));
            }
        }

        return listLowSalaryStaff;
    }

    public void sortedSalaries() {
        int i = 0;
        int j = listAllSalaries.size() - 1;
        /*
        ВГАБ
        АБВГ
         */
        for (; i < listAllSalaries.size() - 2; i++) {
            for (; j >= (i + 1); j--) {
                double temp = listAllSalaries.get(i);
                if (listAllSalaries.get(i).compareTo(listAllSalaries.get(j)) > 0) {
                    listAllSalaries.set(i, listAllSalaries.get(j));
                    listAllSalaries.set(j, temp
                    );
                }
            }
            j = listAllSalaries.size() - 1;
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                ", listAllEmployees" + listAllEmployees +
                ", listAllSalaries=" + listAllSalaries +
                ", incomeCompany=" + incomeCompany +
                '}';
    }
}
