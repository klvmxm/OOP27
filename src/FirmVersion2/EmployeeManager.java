package FirmVersion2;



import java.util.ArrayList;

/**
 *
 */
public class EmployeeManager extends Employee {

    private String dpt;

    public EmployeeManager(String name, String surname, String patronymic, int salary, int balance, String gender,
                           String department,  String dpt)
    {
        super(name, surname, patronymic, salary, balance, gender, department);
        this.dpt = dpt;
    }


}
