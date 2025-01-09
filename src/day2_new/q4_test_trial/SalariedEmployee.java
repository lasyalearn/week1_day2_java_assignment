package day2_new.q4_test_trial;

public class SalariedEmployee extends Employee
{
    private double salary_per_week;

    SalariedEmployee(String employee_name, int employee_id,double salary_per_week)
    {
        super(employee_name, employee_id);
        this.salary_per_week=salary_per_week;
    }

    @Override
    void weekly_salary()
    {
        System.out.println("The weekly salary of a salaried employee is: "+salary_per_week);
    }

    @Override
    void increase_salary(double percent)
    {
        salary_per_week=salary_per_week+(salary_per_week*percent/100);
    }
}
