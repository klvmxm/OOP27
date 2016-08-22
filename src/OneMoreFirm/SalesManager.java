package OneMoreFirm;

/**
 *
 */
public class SalesManager extends Employee{

    private int sales;


    public SalesManager(String name, String surname, String patronymic, int salary, int balance, String gender, int sales)
    {
        super(name, surname, patronymic, salary, balance, gender);
        sales = 0;
        this.sales = sales;

    }

    public int getSales()
    {
        return sales;
    }

    public void setSales(int sales)
    {
        this.sales = sales;
    }

    public void doWork()
    {
        setSales(10000);
    }

    public double CalculateSalary()
    {
        return getSalary() + sales * 0.3;
    }

}

