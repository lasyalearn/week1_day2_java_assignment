package day2_new.q4_test_trail2;

 abstract public class Employee implements increase_percent
{
    private String employee_name;
    private int employee_id;
    Employee(String employee_name,int employee_id)
    {
        this.employee_id=employee_id;
        this.employee_name=employee_name;
    }
    abstract void weekly_salary();
    public abstract void increase_salary(double percent);



}
