package OneMoreFirm;

import java.util.Comparator;

/**
 *
 */
public class Employee extends EmployeeAbstract{
    private String name;
    private String surname;
    private String patronymic;
    private int salary;
    private double balance;
    private String gender;

    public static final Comparator<Employee> BY_NAME = (p1, p2) -> p1.name.compareTo(p2.name);
    public static final Comparator<Employee> BY_SURNAME = (p1, p2) -> p1.surname.compareTo(p2.surname);
    public static final Comparator<Employee> BY_PATRONYMIC = (p1, p2) -> p1.patronymic.compareTo(p2.patronymic);
    public static final Comparator<Employee> BY_SALARY = (p1, p2) -> p1.salary-p2.salary;


    public Employee(String name, String surname, String patronymic, int salary, int balance, String gender) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.salary = salary;
        this.balance = balance;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getSalary() {return salary; }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double calculateSalary()
    {
        return balance+= salary;
    }

    public boolean employeeEquals(String name, String surname, String patronymic)
    {
       return (this.name.equalsIgnoreCase(name) && this.surname.equalsIgnoreCase(surname) && this.patronymic.equalsIgnoreCase(patronymic));
    }
    public boolean empEqualsOtherEmp(Employee other)
    {
        return (this.name.equalsIgnoreCase(other.getName()) && this.surname.equalsIgnoreCase(other.getSurname()) && this.patronymic.equalsIgnoreCase(other.getPatronymic()));
    }
}
