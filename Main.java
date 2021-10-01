package Employee;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        EmployeeManager dinh = new EmployeeManager();
        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        employeeArrayList.add(new FullTimeEmployee("1", "kawa1", 23, "0932389054", "abc", 100, 50, 700));
        employeeArrayList.add(new FullTimeEmployee("2", "kawa2", 23, "0932389054", "abc", 100, 50, 1500));
        employeeArrayList.add(new FullTimeEmployee("2", "kawa2", 23, "0932389054", "abc", 100, 50, 600));

        employeeArrayList.add(new PartTimeEmployee("3", "kawa3", 23, "0932389054", "abc", 10));
        employeeArrayList.add(new PartTimeEmployee("4", "kawa4", 23, "0932389054", "abc", 5));

        dinh.setEmployeeArrayList(employeeArrayList);
        dinh.displayEmployee(employeeArrayList);
        System.out.println("------");
        dinh.addEmployee(new PartTimeEmployee("5", "kawa5", 23, "0932389054", "xyz", 5));
        dinh.displayEmployee(employeeArrayList);
        System.out.println("--------");
        System.out.println("gia tri trung binh");
        System.out.println(dinh.averageEmployee());
        System.out.println("-------");
        dinh.displayEmployee(dinh.FullTimeEmployeeLowerAvgSalary());
        System.out.println("ds nv parttime");
        dinh.displayEmployee(dinh.PartTimeSalary());

        System.out.println( dinh.sortFullTime());

    }
}
