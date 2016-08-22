package OneMoreFirm;

import java.util.ArrayList;

/**
 *
 */
public abstract class AbstrackFirm {

    public abstract String getName();

    public abstract String getAdress();

    public abstract double getbankCount();

    public abstract ArrayList<Department> getDpt();

    public abstract boolean addEmployee(Employee employee);

    public abstract boolean fireEmployee(String name, String surname, String patronymic);

    public abstract boolean setDepartmentForEmployee(String name, String surname, String patronymic, String departmentName);

    public abstract ArrayList<Employee> getAllEmployes();

    public abstract ArrayList<Employee> getAllEmployeesSortedBySalary();

    public abstract ArrayList<Employee> getAllEmployeesSortedBySName();

    public abstract ArrayList<Employee> getEmployeesFromDep(String departmentName);

    public abstract ArrayList<Employee> getEmployeesFromDepSortedBySalary(String departmentName);

    public abstract ArrayList<Employee> getEmployeesFromDepSortedBySName(String departmentName);

    public abstract void sellFor10();

    public abstract void giveSalaryForAll();
}
