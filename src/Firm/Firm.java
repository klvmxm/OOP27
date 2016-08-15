package Firm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * �����
 */
public class Firm {

    private String name;
    private String adress;
    private int bankCount;
    private ArrayList<Employee> employees;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getadress()
    {
        return adress;
    }

    public void setadress(String adress)
    {
        this.adress = adress;
    }

    public int getbankCount()
    {
        return bankCount;
    }

    public void setbankCount(int bankCount)
    {
        this.bankCount = bankCount;
    }

    public Firm(String name, String adress, int bankCount)
    {
        this.name = name;
        this.adress = adress;
        this.bankCount = bankCount;
        this.employees = new ArrayList<Employee>();
    }

    public boolean addEmployee(Employee employee)
    {
        for(Employee e : employees){
            if(e.getName().equals(employee.getName()) && e.getSurname().equals(employee.getSurname())){
                System.out.println(employee.getName() +" "+ employee.getSurname() +" ��� �������� � ��������");
                return false;
            }
        }
        employees.add(employee);
        System.out.println(employee.getName() +" "+ employee.getSurname() +" ������ �� ������");
        return true;

    }

    public boolean fireEmployee(String name, String surname)
    {

        for(int i = 0; i < employees.size(); i++)
        {
            if(employees.get(i).getName().equalsIgnoreCase(name) && employees.get(i).getSurname().equalsIgnoreCase(surname))
            {
                employees.remove(i);
                System.out.println("����������, " + name +" " + surname);
                return true;
            }
        }
            System.out.println("���������, " + name +" " + surname +" �� �������� �� �����.");
        return false;
    }

    public ArrayList<Employee> getAllEmployees()
    {
        for(Employee x : employees)
        {
            System.out.println("���������: " + x.getName() +" "+x.getSurname() +
                    ", � ���������: " + x.getSalary() +
                    ". ��� ������� ������: "+ x.getBalance() +
                    ". ���: " + x.getGender() +". �����������: "+ x.getDepartment());

        }
        return new ArrayList<Employee>(employees);
    }

    public ArrayList<Employee> getAllEmployeesOrderedBySalary()
    {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size() - 1 - i; j++) {
                if (employees.get(j).getSalary() < employees.get(j + 1).getSalary()) {
                    Employee richMan = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, richMan);
                }
            }
        }

        for(Employee x : employees)
        {
            System.out.println("���������: " + x.getName() +" "+x.getSurname() +
                    ", � ���������: " + x.getSalary() +
                    ". ��� ������� ������: "+ x.getBalance() +
                    ". ���: " + x.getGender() +". �����������: "+ x.getDepartment());

        }
        return new ArrayList<Employee>(employees);
}


    public void giveSalaryForAll()
    {

        for (int i = 0; i < employees.size(); i++) {
            if (bankCount - employees.get(i).getSalary() >= 0)
            {
                bankCount -= employees.get(i).getSalary();
                employees.get(i).setBalance(employees.get(i).getSalary());
            }
            else {
                employees.get(i).setBalance(bankCount);
                bankCount = 0;
            }

        }



    }
    public void printMenu(Firm firm) throws IOException {
        boolean input = true;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (input) {
            System.out.println();
            System.out.println();
            System.out.println("           ����� ���������� � ����!          ");
            System.out.println("��� ���������� ������ ���������� ������� <1>.");
            System.out.println("      ���� ������ ������� ���������� <2>.    ");
            System.out.println("��� ��������� ������ ����������� ������� <3>.");
            System.out.println("������������� ����������� �� ��? ������� <4>.");
            System.out.println("     ���� ������ �������� ���� ������� <5>.  ");
            System.out.println("    ��� ������ �� ���� ������� �������� <6>.  ");
            int choice = Integer.parseInt(br.readLine());


            switch (choice) {
                case 1:
                    BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

                    System.out.println("������� ����������� �� ������ ��������?");
                    int rabotyagi = Integer.parseInt(br3.readLine());

                    for (int i = 0; i < rabotyagi; i++) {
                        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
                        BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
                        BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
                        BufferedReader br7 = new BufferedReader(new InputStreamReader(System.in));
                        BufferedReader br8 = new BufferedReader(new InputStreamReader(System.in));


                        System.out.println("���: ");
                        String employeeName = br4.readLine();
                        System.out.println("�������: ");
                        String employeeSurname = br5.readLine();
                        System.out.println("��: ");
                        int employeeSalary = Integer.parseInt(br6.readLine());
                        System.out.println("����� �� �����: ");
                        int employeeBankCaount = Integer.parseInt(br7.readLine());
                        System.out.println("���: ");
                        String employeeGender = br8.readLine();
                        System.out.println("�����: ");
                        String employeeDepartment = br8.readLine();
                        Employee employee = new Employee(employeeName, employeeSurname, employeeSalary, employeeBankCaount, employeeGender, employeeDepartment);
                        firm.addEmployee(employee);

                    }
                    input = true;
                    break;

                case 2:
                    System.out.println("������� ��� � ������� ���������� �������� ���������� ������:");
                    BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
                    BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("���: ");
                    String employeeName = br4.readLine();
                    System.out.println("�������: ");
                    String employeeSurname = br5.readLine();
                    firm.fireEmployee(employeeName, employeeSurname);
                    input = true;
                    break;
                case 3:
                    System.out.println("��������� ��������� �����, ��������...");
                    firm.getAllEmployeesOrderedBySalary();
                    input = true;
                    break;
                case 4:
                    System.out.println("�������� ������� ��:");
                    firm.getAllEmployees();
                    input = true;
                    break;

                case 5:
                    System.out.println("����� ��������. �����������.");
                    firm.giveSalaryForAll();
                    input = true;
                    break;

                case 6:
                    System.out.println("������ ��������� ���������");
                    input = false;
                    break;
                default:
                    System.out.println("���� ����� 6 ���� ����!");
            }
        }
    }


}

