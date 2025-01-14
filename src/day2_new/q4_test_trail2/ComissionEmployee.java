package day2_new.q4_test_trail2;

public class ComissionEmployee extends Employee implements increase_percent
{
    private double a;
    private double sales_per_week;
    ComissionEmployee(String employee_name, int employee_id,double a, double sales_per_week)
    {
        super(employee_name, employee_id);
        this.a=a;
        this.sales_per_week=sales_per_week;
    }

    @Override
    void weekly_salary()
    {
        System.out.println("The weekly salary of a comission employee is: "+(a*sales_per_week/100));
    }

    @Override
    public void increase_salary(double percent)
    {
        a=a+(a*percent/100);
    }
}
