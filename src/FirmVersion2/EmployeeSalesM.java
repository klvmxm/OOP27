package FirmVersion2;



/**
 *
 */
public class EmployeeSalesM extends Employee {

    private int sales;


    public EmployeeSalesM(String name, String surname, String patronymic, int salary, int balance,
                          String gender, String department, int sales)
    {
        super(name, surname, patronymic, salary, balance, gender, department);
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

}

