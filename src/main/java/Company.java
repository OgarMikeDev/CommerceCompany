import java.util.ArrayList;
import java.util.Collection;

public class Company {
    private Collection<Employee> collectionEmployees = new ArrayList<>();
    private ArrayList<Double> collectionFullSalaries = new ArrayList<>();
    private double incomeCompany = 0;

    public double getIncomeCompany() {
        return incomeCompany;
    }

    public void addSumCompany(double sum) {
        this.incomeCompany += sum;
    }

    public void addSalaryAllEmpoloyees(double currentSalary) {
        collectionFullSalaries.add(currentSalary);
    }

    public void hire(Employee employee) {
        collectionEmployees.add(employee);

    }

    public void hireAll(Collection<Employee> collectionEmployees) {
        collectionEmployees.addAll(collectionEmployees);
    }

    public void fire(Employee employee) {
        collectionEmployees.remove(employee);
    }

    public Collection<Double> getTopSalaryStaff(int count) {
        sortedCollectionWithSalaries();
        ArrayList<Double> listTopSalaryStaff = new ArrayList<>();
        for (int i = collectionFullSalaries.size() - 1; i < collectionFullSalaries.size() - count; i--) {
            listTopSalaryStaff.add(collectionFullSalaries.get(i));
        }
        return listTopSalaryStaff;
    }

    public Collection<Double> getLowSalaryStaff(int count) {
        sortedCollectionWithSalaries();
        ArrayList<Double> listLowSalaryStaff = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            listLowSalaryStaff.add(collectionFullSalaries.get(i));
        }
        return listLowSalaryStaff;
    }

    public void sortedCollectionWithSalaries() {
        int i = 0;
        int j = collectionFullSalaries.size() - 1;
        /*        ВГАБ
        АБВГ         */
        for (; i < collectionFullSalaries.size() - 2; i++) {
            for (; j >= (i + 1); j--) {
                System.out.println("Итерация № " + i);
                System.out.println("i " + collectionFullSalaries.get(i));
                System.out.println("j " + collectionFullSalaries.get(j));
                double temp = collectionFullSalaries.get(i);
                if (collectionFullSalaries.get(i).compareTo(collectionFullSalaries.get(j)) > 0) {
                    collectionFullSalaries.set(i, collectionFullSalaries.get(j));
                    collectionFullSalaries.set(j, temp);
                }
            }
            j = collectionFullSalaries.size() - 1;
        }
    }
}