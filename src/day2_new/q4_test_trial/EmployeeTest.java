package day2_new.q4_test_trial;
import java.util.ArrayList;
public class EmployeeTest
{
    public static void main(String[] args)
    {
        // we can't create a class of an abstract class
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new SalariedEmployee("Koerber1", 1,2000));
        employees.add(new HourlyEmployee("Koerber2", 2, 40,10));
        employees.add(new ComissionEmployee("koerber3", 3, 10, 20));


        System.out.println("Weekly Salaries of Employees:");
        for (Employee employee : employees) {
            employee.weekly_salary();
        }
        System.out.println("---------------------------------------------------------");

        System.out.println("\nWeekly Salaries After Increase:");
        for (Employee employee : employees) {
            employee.weekly_salary();
        }

        System.out.println("---------------------------------------------------------");


        System.out.println("\nSalaried Salaries After Increase:");
        for (Employee employee : employees) {
            employee.weekly_salary();
        }


        System.out.println("---------------------------------------------------------");


        System.out.println("\nSalaried Salaries After Increase:");
        for (Employee employee : employees) {
            employee.weekly_salary();
        }

    }

}
