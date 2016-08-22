package OneMoreFirm;

import OneMoreFirm.AbstrackFirm;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 */
public class Firm extends AbstrackFirm{

    private String name;
    private String adress;
    private double bankCount;
    private ArrayList<Employee> employees;
    private ArrayList<Department> dpt;

    public Firm(String name, String adress, int bankCount)
    {
        this.name = name;
        this.adress = adress;
        this.bankCount = bankCount;
        this.employees = new ArrayList<Employee>();
        this.dpt = new ArrayList<Department>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAdress()
    {
        return adress;
    }

    public void setadress(String adress)
    {
        this.adress = adress;
    }

    public double getbankCount()
    {
        return bankCount;
    }

    public void setbankCount(double bankCount)
    {
        this.bankCount = bankCount;
    }

    public ArrayList<Employee> getEmp() {return employees;}
    public ArrayList<Department> getDpt() {
        return dpt;
    }

    public boolean addEmployee(Employee employee) {
        for (Employee e : employees) {
            if (e.empEqualsOtherEmp(employee)){
                return false;
            }
        }
        employees.add(employee);
        return true;
    }

    public boolean fireEmployee(String name, String surname, String patronymic) {

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).employeeEquals(name, surname, patronymic))
            {
                for(Department x : dpt)
                {
                    x.removeEmp(employees.get(i));
                }
                employees.remove(i);

                return true;
            }
        }
        return false;
    }

    public boolean setDepartmentForEmployee(String name, String surname, String patronymic, String departmentName) {
        Employee emp = null;
        for (Employee e : employees) {
            if (e.employeeEquals(name, surname, patronymic)) {
                emp = e;
            }
        }
        for (Department x : dpt) {
            for (int i = 0; i < x.getEmployeesFromDpt().size(); i++) {
                if (x.getEmployeesFromDpt().get(i).equals(emp)) {
                    System.out.println("Уже числитя в " + x.getDepartmentName());
                    return false;
                }
            }
        }
        for (Department x : dpt) {
                if (x.getDepartmentName().equalsIgnoreCase(departmentName)) {
                        x.getEmployeesFromDpt().add(emp);
                        return true;
                    }

        }
        return false;
    }
    public ArrayList<Employee> getAllEmployes() {
        return new ArrayList<Employee>(employees);
    }

    public ArrayList<Employee> getAllEmployeesSortedBySalary() {
        Collections.sort(employees, Employee.BY_SALARY);
        return new ArrayList<Employee>(employees);
    }

    public ArrayList<Employee> getAllEmployeesSortedBySName() {
        Collections.sort(employees, Employee.BY_NAME);
        return new ArrayList<Employee>(employees);
    }

    public ArrayList<Employee> getEmployeesFromDep(String departmentName) {
        ArrayList<Employee> emp = null;
        for (Department x : dpt) {
            if (x.getDepartmentName().equalsIgnoreCase(departmentName)) {
                emp = x.getEmployeesFromDpt();
            }
        }
        return new ArrayList<Employee>(emp);
    }
    public ArrayList<Employee> getEmployeesFromDepSortedBySalary(String departmentName) {
        ArrayList<Employee> emp = null;
        for (Department x : dpt) {
            if (x.getDepartmentName().equalsIgnoreCase(departmentName)) {
                emp = x.getEmployeesFromDpt();
                Collections.sort(emp, Employee.BY_SALARY);
            }
        }
        return new ArrayList<Employee>(emp);
    }
    public ArrayList<Employee> getEmployeesFromDepSortedBySName(String departmentName) {
        ArrayList<Employee> emp = null;
        for (Department x : dpt) {
            if (x.getDepartmentName().equalsIgnoreCase(departmentName)) {
                emp = x.getEmployeesFromDpt();
                Collections.sort(emp, Employee.BY_NAME);
            }
        }
        return new ArrayList<Employee>(emp);
    }
    public void sellFor10() {
        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).doWork();
        }
    }
    public void giveSalaryForAll() {
        for (int i = 0; i < employees.size(); i++) {
            if (bankCount - employees.get(i).calculateSalary() >= 0)
            {
                bankCount -= employees.get(i).calculateSalary();
                employees.get(i).setBalance(employees.get(i).getBalance()+employees.get(i).calculateSalary());
            }
            else {
                employees.get(i).setBalance(employees.get(i).getBalance()+bankCount);
                bankCount = 0;
            }
        }
    }
}



