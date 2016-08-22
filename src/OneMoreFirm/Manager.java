package OneMoreFirm;



/**
 * C
 */
public class Manager extends Employee {
    private Department dp;
    private int countSubordinates;

    public Manager(String name, String surname, String patronymic, int salary, int balance, String gender, Department dp) {
        super(name, surname, patronymic, salary, balance, gender);
        this.dp = dp;
    }

    public Department getDp()
    {
        return dp;
    }

    public void doWork()
    {
        this.countSubordinates = dp.getEmployeesFromDpt().size();
    }

    public double CalculateSalary()
    {
        return getSalary() + countSubordinates * 50;
    }
}

