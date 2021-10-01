package Employee;

import arrayList.Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class EmployeeManager {
    ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    public void displayEmployee(ArrayList<Employee> employeeArrayList) {

        for (Employee employeeList : employeeArrayList
        ) {
            System.out.println(employeeList);
        }
    }


    public void addEmployee(Employee employee) {
        employeeArrayList.add(employee);
    }

    public double averageEmployee() {
        double sum = 0;
        for (Employee e : employeeArrayList
        ) {
            sum += e.getSalary();
        }
        return sum / employeeArrayList.size();
    }

    public ArrayList<Employee> FullTimeEmployeeLowerAvgSalary() {
        ArrayList<Employee> newEmployeeList = new ArrayList<>();

        for (Employee e : employeeArrayList
        ) {
            if (e instanceof FullTimeEmployee && ((FullTimeEmployee) e).getSalary() < averageEmployee()) {
                newEmployeeList.add(e);
            }
        }
        return newEmployeeList;

    }

    public ArrayList<Employee> PartTimeSalary() {
        ArrayList<Employee> PartTimeList = new ArrayList<Employee>();
        for (Employee e : employeeArrayList) {
            if (e instanceof PartTimeEmployee) {
                PartTimeList.add(e);
            }
        }
        return PartTimeList;
    }

    public ArrayList<Employee> sortFullTime() {
        System.out.println("nv full time tu thap len cao");
        ArrayList<Employee> newFullTime = new ArrayList<>();
        System.out.println(" day la employee : " + employeeArrayList);
        for (Employee e : employeeArrayList
        ) {
            if (e instanceof FullTimeEmployee) {
                newFullTime.add(e);
            }
        }
        System.out.println(" day la new full time"+ newFullTime);
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee t1, Employee t2) {

                return t1.getSalary() < t2.getSalary() ? 1 : -1;
            }
        };

        newFullTime.sort(employeeComparator);
//        System.out.println("sau sap xep " + newFullTime);
        return newFullTime;


    }


}
