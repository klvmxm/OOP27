package FirmVersion2;

import Firm.Firm;

import java.util.ArrayList;

/**
 *
 */
public class FirmVersion2 extends Firm {

    private ArrayList<Employee> employees;
    private ArrayList<Department> dpt;


    public FirmVersion2(String name, String adress, int bankCount) {
        super(name, adress, bankCount);
        this.employees = new ArrayList<Employee>();
        this.dpt = new ArrayList<Department>();
    }

    public ArrayList<Department> getDpt() {
        return dpt;
    }


    public boolean addEmployee(Employee employee) {
        for (Employee e : employees) {
            if (e.getName().equals(employee.getName()) && e.getSurname().equals(employee.getSurname())) {
                System.out.println(employee.getName() + " " + employee.getSurname() + " уже числится в компании");
                return false;
            }
        }
        employees.add(employee);
        System.out.println(employee.getName() + " " + employee.getSurname() + " принят на работу");
        return true;

    }

    public boolean fireEmployee(String name, String surname, String patronymic) {

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equalsIgnoreCase(name) && employees.get(i).getSurname().equalsIgnoreCase(surname)
                    && employees.get(i).getPatronymic().equalsIgnoreCase(patronymic)) {
                employees.remove(i);
                System.out.println("Досвидание, " + name + " " + surname + " " + patronymic);
                return true;
            }
        }
        System.out.println("Сотрудник, " + name + " " + surname + " " + patronymic + " не числится на фирме.");
        return false;
    }

    public boolean setDepartmentForEmployee(String name, String surname, String patronymic, String departmentName) {
        Employee emp = null;

        for (Employee e : employees) {
            if (e.getName().equals(name) && e.getSurname()
                    .equals(surname) && e.getPatronymic().equals(patronymic)) {
                emp = e;
            }
        }

        for (Department x : dpt) {

            if (!(x.getDepartmentName().equals(departmentName))) {
                System.out.println("Отдела " + departmentName + " нет на фирме.");
                return false;
            }
            if (x.getDepartmentName().equals(departmentName)) {
                for (int i = 0; i < x.getEmployeesDpt(departmentName).size(); i++) {
                    if (x.getEmployeesDpt(departmentName).get(i).getName().equals(name) && x.getEmployeesDpt(departmentName).get(i).getSurname()
                            .equals(surname) && x.getEmployeesDpt(departmentName).get(i).getPatronymic().equals(patronymic))
                        System.out.println(name + " " + surname + " " + patronymic + " уже числится в отделе");
                    return false;
                }

            }
            if (x.getDepartmentName().equals(departmentName)) {
                x.getEmployeesDpt().add(emp);
                System.out.println(emp.getName() + " " + emp.getSurname() + " " + emp.getPatronymic() + " переведен в отдел " + x.getDepartmentName());
                return true;
            }
        }


        System.out.println("Нет такого сотрудника!");
        return false;
    }

    public ArrayList<Employee> getAllEmployes() {
        for (Employee x : employees) {
            System.out.println("Сотрудник: " + x.getName() + " " + x.getSurname() + " " + x.getPatronymic() +
                    ", с зарплатой: " + x.getSalary() +
                    ". Его текущий баланс: " + x.getBalance() +
                    ". Пол: " + x.getGender() + ". Департамент: " + x.getDepartment());

        }
        return new ArrayList<Employee>(employees);
    }

    public ArrayList<Employee> getAllEmployeesSortedBySalary() {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size() - 1 - i; j++) {
                if (employees.get(j).getSalary() < employees.get(j + 1).getSalary()) {
                    Employee richMan = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, richMan);
                }
            }
        }

        for (Employee x : employees) {
            System.out.println("Сотрудник: " + x.getName() + " " + x.getSurname() +
                    ", с зарплатой: " + x.getSalary() +
                    ". Его текущий баланс: " + x.getBalance() +
                    ". Пол: " + x.getGender() + ". Департамент: " + x.getDepartment());

        }
        return new ArrayList<Employee>(employees);
    }

    public ArrayList<Employee> getAllEmployeesSortedBySName() {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size() - 1 - i; j++) {
                if (employees.get(j).getSurname().compareTo(employees.get(j + 1).getSurname()) < 0) {
                    Employee firstOne = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, firstOne);
                }
            }
        }

        for (Employee x : employees) {
            System.out.println("Сотрудник: " + x.getName() + " " + x.getSurname() + " " + x.getPatronymic() +
                    ", с зарплатой: " + x.getSalary() +
                    ". Его текущий баланс: " + x.getBalance() +
                    ". Пол: " + x.getGender() + ". Департамент: " + x.getDepartment());

        }
        return new ArrayList<Employee>(employees);
    }

    public ArrayList<Employee> getEmployeesFromDep(String departmentName) {

        for (Department x : dpt) {
            if (x.getDepartmentName().equals(departmentName)) {
                if (x.getEm() != null) {
                    System.out.println("Отдел " + departmentName + ", менеджер отдела " + x.getEm().getName() + " " + x.getEm().getSurname() + " " +
                            x.getEm().getPatronymic());
                } else System.out.println("У отдела " + departmentName + " руководитель не назначен.");

                ArrayList<Employee> e = x.getEmployeesDpt(departmentName);
                System.out.println("Сотрудники отдела " + departmentName + ":");
                for (int i = 0; i < e.size(); i++) {
                    System.out.println(e.get(i).getName() + " " + e.get(i).getSurname() + " " + e.get(i).getPatronymic() +
                            ", с зарплатой: " + e.get(i).getSalary() +
                            ". Его текущий баланс: " + e.get(i).getBalance() +
                            ". Пол: " + e.get(i).getGender() + ". Департамент: " + e.get(i).getDepartment());
                }
            } else System.out.println("Отдела " + departmentName + " не существует.");
        }
        return new ArrayList<Employee>(employees);
    }

    public ArrayList<Employee> getEmployeesFromDepSortedBySalary(String departmentName) {
        for (Department x : dpt) {
            if (x.getDepartmentName().equals(departmentName)) {
                if (x.getEm() != null) {
                    System.out.println("Отдел " + departmentName + ", менеджер отдела " + x.getEm().getName() + " " + x.getEm().getSurname() + " " +
                            x.getEm().getPatronymic());
                } else System.out.println("У отдела " + departmentName + " руководитель не назначен.");

                ArrayList<Employee> e = x.getEmployeesDpt(departmentName);
                for (int i = 0; i < e.size(); i++) {
                    for (int j = 0; j < e.size() - 1 - i; j++) {
                        if (e.get(j).getSalary() < e.get(j + 1).getSalary()) {
                            Employee richMan = e.get(j);
                            e.set(j, e.get(j + 1));
                            e.set(j + 1, richMan);
                        }
                    }
                }
                System.out.println("Сотрудники отдела " + departmentName + ":");
                for (int i = 0; i < e.size(); i++) {
                    System.out.println(e.get(i).getName() + " " + e.get(i).getSurname() + " " + e.get(i).getPatronymic() +
                            ", с зарплатой: " + e.get(i).getSalary() +
                            ". Его текущий баланс: " + e.get(i).getBalance() +
                            ". Пол: " + e.get(i).getGender() + ". Департамент: " + e.get(i).getDepartment());
                }
            } else System.out.println("Отдела " + departmentName + " не существует.");
        }
        return new ArrayList<Employee>(employees);
    }

    public ArrayList<Employee> getEmployeesFromDepSortedBySName(String departmentName) {
        for (Department x : dpt) {
            if (x.getDepartmentName().equals(departmentName)) {
                if (x.getEm() != null) {
                    System.out.println("Отдел " + departmentName + ", менеджер отдела " + x.getEm().getName() + " " + x.getEm().getSurname() + " " +
                            x.getEm().getPatronymic());
                } else System.out.println("У отдела " + departmentName + " руководитель не назначен.");

                ArrayList<Employee> e = x.getEmployeesDpt(departmentName);
                for (int i = 0; i < e.size(); i++) {
                    for (int j = 0; j < e.size() - 1 - i; j++) {
                        if (e.get(j).getSurname().compareTo(e.get(j + 1).getSurname()) < 0) {
                            Employee firstOne = e.get(j);
                            e.set(j, e.get(j + 1));
                            e.set(j + 1, firstOne);
                        }
                    }
                }
                System.out.println("Сотрудники отдела " + departmentName + ":");
                for (int i = 0; i < e.size(); i++) {
                    System.out.println(e.get(i).getName() + " " + e.get(i).getSurname() + " " + e.get(i).getPatronymic() +
                            ", с зарплатой: " + e.get(i).getSalary() +
                            ". Его текущий баланс: " + e.get(i).getBalance() +
                            ". Пол: " + e.get(i).getGender() + ". Департамент: " + e.get(i).getDepartment());
                }
            } else System.out.println("Отдела " + departmentName + " не существует.");
        }
        return new ArrayList<Employee>(employees);
    }

    public void sellFor10() {
        if (employees.size() > 0) {
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i) instanceof EmployeeSalesM) {
                    ((EmployeeSalesM) employees.get(i)).setSales(((EmployeeSalesM) employees.get(i)).getSales() + 10000);
                }
            }
        }
    }

    public void giveSalaryForAll() {
        for (int i = 0; i < employees.size(); i++) {
            if (super.getbankCount() - employees.get(i).getSalary() >= 0) {
                super.setbankCount(super.getbankCount() - employees.get(i).getSalary());
                employees.get(i).setBalance(employees.get(i).getBalance() + employees.get(i).getSalary());
            } else {
                employees.get(i).setBalance(employees.get(i).getBalance() + super.getbankCount());
                super.setbankCount(0);
            }
        }
        int mangerBonus = 0;

            for(Department x : dpt)
            {
                mangerBonus = x.getEmployeesDpt().size() * 50;
                if (super.getbankCount() - mangerBonus >= 0) {
                    super.setbankCount(super.getbankCount() - mangerBonus);
                x.getEm().setBalance(x.getEm().getBalance() + mangerBonus);
            } else
                {
                    x.getEm().setBalance(super.getbankCount());
                    super.setbankCount(0);
                }
             }
        int sallaryBonus = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof EmployeeSalesM) {
                sallaryBonus += ((EmployeeSalesM) employees.get(i)).getSales() * 0.3;
                if (super.getbankCount() - sallaryBonus >= 0) {
                    super.setbankCount(super.getbankCount() - sallaryBonus);
                    employees.get(i).setBalance(employees.get(i).getBalance() + sallaryBonus);
                } else {
                    employees.get(i).setBalance(employees.get(i).getBalance() + super.getbankCount());
                    super.setbankCount(0);
                }
            }
        }
    }
}

