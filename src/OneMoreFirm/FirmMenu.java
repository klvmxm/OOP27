package OneMoreFirm;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class FirmMenu {

    private Firm firm;
    private Department dpt;

    public FirmMenu(Firm firm) {
        this.firm = firm;
    }

    public void start() throws IOException {
        boolean input = true;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (input) {
                 firmSayHi();
            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                        addWorkers();
                    break;
                case 2:
                        removeWorker();
                    break;
                case 3:
                        creatDepartment();
                    break;
                case 4:
                        setWorkerToDepart();
                    break;
                case 5:
                        setManagerToDpt();
                    break;
                case 6:
                        getSellers();
                    break;
                case 7:
                        getWorkerList();
                    break;
                case 8:
                        getWorkersSortedBySel();
                    break;
                case 9:
                        getWorkersSortedByName();
                    break;
                case 10:
                        getWorkersFromDpt();
                    break;
                case 11:
                        getSortedWorkersFromDptBySalary();
                    break;
                case 12:
                        getSortedWorkersFromDptByName();
                    break;
                case 13:
                        giveSomeWork();
                    break;
                case 14:
                        giveSomeMoney();
                    break;
                case 15:
                        giveSomeInformation();
                    break;
                case 16:
                    System.out.println("������ ��������� ���������");
                    input = false;
                    break;
                default:
                    System.out.println("���� ����� 15 ���� ����!");
            }
        }
    }

    public void firmSayHi() {

        System.out.println();
        System.out.println();
        System.out.println("            ����� ���������� � ����!           ");
        System.out.println(" ��� ���������� ������ ���������� ������� <1>. ");
        System.out.println("       ���� ������ ������� ���������� <2>.     ");
        System.out.println(" ���� ������ ������� ����� ����� ������� <3>.  ");
        System.out.println("   ��������� ���������� � ����� ������� <4>.   ");
        System.out.println("    ������ ��������� ��� ������ ������� <5>.   ");
        System.out.println("    ������ ���������� � �������� ������� <6>.  ");
        System.out.println(" ��� ��������� ������ ����������� ������� <7>. ");
        System.out.println("  ������������� ����������� �� �� ������� <8>. ");
        System.out.println("  ������������� ����������� ����� ������� <9>. ");
        System.out.println("�������� ������ ����������� ������ �������<10>.");
        System.out.println(" �������������� ����������� ������ �� �� <11>. ");
        System.out.println(" �������������� ����������� ������ �� �� <12>. ");
        System.out.println("        ��������� ����������� ������� <13>.    ");
        System.out.println("            ������ ���� �������� <14>.         ");
        System.out.println("     ���������� ������ � ����� ������� <15>.   ");
        System.out.println("    ��� ������ �� ���� ������� �������� <16>.  ");
    }

    public void addWorkers() throws IOException{
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("������� ����������� �� ������ ��������?");
        int rabotyagi = Integer.parseInt(br1.readLine());

        for (int i = 0; i < rabotyagi; i++) {
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br7 = new BufferedReader(new InputStreamReader(System.in));


            System.out.println("���: ");
            String employeeName = br2.readLine();
            System.out.println("�������: ");
            String employeeSurname = br3.readLine();
            System.out.println("��������: ");
            String employeePatronimic = br4.readLine();
            System.out.println("��: ");
            int employeeSalary = Integer.parseInt(br5.readLine());
            System.out.println("����� �� �����: ");
            int employeeBankCaount = Integer.parseInt(br6.readLine());
            System.out.println("���: ");
            String employeeGender = br7.readLine();
            if(firm.addEmployee(new Employee(employeeName, employeeSurname, employeePatronimic, employeeSalary, employeeBankCaount, employeeGender)))
            {
                System.out.println("���������� ������ ����������: "+employeePatronimic + " " + employeeSurname+ " "+ employeeName);
            }
            else System.out.println("���������� ��� ���!");
        }
    }

    public void removeWorker() throws IOException{

        System.out.println("������� ��� ���������� �������� ���������� �������:");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("���: ");
        String employeeName = br1.readLine();
        System.out.println("�������: ");
        String employeeSurname = br2.readLine();
        System.out.println("��������: ");
        String employeePatronimic = br3.readLine();
        if(firm.fireEmployee(employeeName, employeeSurname, employeePatronimic))
        {
            System.out.println("�����, "+employeePatronimic + " " + employeeSurname+ " "+ employeeName);
        }
        else System.out.println("��� ������ ����������");
    }

    public void creatDepartment()throws IOException
    {
        System.out.println("������� �������� ������������:");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("��������: ");
        String dptName = br1.readLine();
        dpt = new Department(dptName);
        firm.getDpt().add(dpt);
        System.out.println("����������� "+dptName+" ������");
    }

    public void setWorkerToDepart() throws IOException
    {
        System.out.println("��� �������� ���������� � ����� ������� ��� ��� � �������� ������");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("���: ");
        String employeeName = br1.readLine();
        System.out.println("�������: ");
        String employeeSurname = br2.readLine();
        System.out.println("��������: ");
        String employeePatronimic = br3.readLine();
        System.out.println("�������� ������: ");
        String departmentName = br4.readLine();

        if(firm.setDepartmentForEmployee(employeeName, employeeSurname, employeePatronimic, departmentName))
        {
            System.out.println("��������� "+ " "+employeePatronimic + " " + employeeSurname+ " "+ employeeName + " ��������� � ����� "+departmentName);
        }
        else System.out.println("�� ����������. ����� �����/��������� �� ������, ���� ��������� ��� �������� � ������.");
    }

    public void setManagerToDpt() throws IOException
    {
        System.out.println("������� ������ ��������� � �������� ������");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br7 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br8 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("���: ");
        String employeeName = br2.readLine();
        System.out.println("�������: ");
        String employeeSurname = br3.readLine();
        System.out.println("��������: ");
        String employeePatronimic = br4.readLine();
        System.out.println("��: ");
        int employeeSalary = Integer.parseInt(br5.readLine());
        System.out.println("����� �� �����: ");
        int employeeBankCaount = Integer.parseInt(br6.readLine());
        System.out.println("���: ");
        String employeeGender = br7.readLine();
        System.out.println("�����: ");
        String employeeDPT = br8.readLine();
        for(int i = 0; i < firm.getDpt().size(); i++)
        {
            System.out.println("chek");
            if(firm.getDpt().get(i).getDepartmentName().equalsIgnoreCase(employeeDPT))
            {   Manager mg = new Manager(employeeName, employeeSurname, employeePatronimic, employeeSalary, employeeBankCaount, employeeGender, firm.getDpt().get(i));
                firm.addEmployee(mg);
                System.out.println(employeePatronimic + " " + employeeSurname+ " "+ employeeName+" �������� ������������� ������ "+employeeDPT);
            }
            else System.out.println("�� ���-�� ������� �� ���");
        }
    }

    public void getSellers() throws IOException
    {
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("������� ����������� �� ������ ������?");
    int rabotyagi = Integer.parseInt(br1.readLine());

    for (int i = 0; i < rabotyagi; i++) {
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br7 = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("���: ");
        String employeeName = br2.readLine();
        System.out.println("�������: ");
        String employeeSurname = br3.readLine();
        System.out.println("��������: ");
        String employeePatronimic = br4.readLine();
        System.out.println("��: ");
        int employeeSalary = Integer.parseInt(br5.readLine());
        System.out.println("����� �� �����: ");
        int employeeBankCaount = Integer.parseInt(br6.readLine());
        System.out.println("���: ");
        String employeeGender = br7.readLine();
        if(firm.addEmployee(new SalesManager(employeeName, employeeSurname, employeePatronimic, employeeSalary, employeeBankCaount, employeeGender, 0)))
        {
            System.out.println("���������� ������ ����������: "+employeePatronimic + " " + employeeName+ " "+ employeeSurname);
        }
        else System.out.println("���������� ��� ���!");
    }
}

    public void getWorkerList()
    {
        if(firm.getEmp().isEmpty())
        {
            System.out.println("������� ����� ������ �����������.");
        }
        else System.out.println(firm.getAllEmployes().toString());
    }

    public void getWorkersSortedBySel()
    {
        if(firm.getEmp().isEmpty())
        {
            System.out.println("������� ����� ������ �����������.");
        }
        else System.out.println(firm.getAllEmployeesSortedBySalary().toString());
    }

    public void getWorkersSortedByName()
    {
        if(firm.getEmp().isEmpty())
        {
            System.out.println("������� ����� ������ �����������.");
        }
        else System.out.println(firm.getAllEmployeesSortedBySalary().toString());
    }

    public void giveSomeMoney()
    {
        if(firm.getEmp().isEmpty())
        {
            System.out.println("������� ����� ������ �����������.");
        }
        else System.out.println("������ �������!");
        firm.giveSalaryForAll();
    }

    public void getWorkersFromDpt() throws IOException
    {

        if(firm.getDpt().isEmpty())
        {
            System.out.println("������� ����� �������� ����������� � �����������.");
        }
        else
        {
            for (int i = 0; i < firm.getDpt().size(); i++) {
                System.out.println("�� ����� ���� ������: "+firm.getDpt().get(i).getDepartmentName());
            }
            System.out.println("�������� �������� ������, ������� ��� ���������: ");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String dptname = br1.readLine();
            firm.getEmployeesFromDep(dptname);
        }
    }

    public void getSortedWorkersFromDptBySalary() throws IOException
    {
        if(firm.getDpt().isEmpty())
        {
            System.out.println("������� ����� �������� ����������� � �����������.");
        }
        else
        {
            for (int i = 0; i < firm.getDpt().size(); i++) {
                System.out.println("�� ����� ���� ������: "+firm.getDpt().get(i).getDepartmentName());
            }
            System.out.println("�������� �������� ������, ������� ��� ���������: ");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String dptname = br1.readLine();
            firm.getEmployeesFromDepSortedBySalary(dptname);
        }
    }

    public void getSortedWorkersFromDptByName() throws IOException
    {
        if(firm.getDpt().isEmpty())
        {
            System.out.println("������� ����� �������� ����������� � �����������.");
        }
        else
        {
            for (int i = 0; i < firm.getDpt().size(); i++) {
                System.out.println("�� ����� ���� ������: "+firm.getDpt().get(i).getDepartmentName());
            }
            System.out.println("�������� �������� ������, ������� ��� ���������: ");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String dptname = br1.readLine();
            firm.getEmployeesFromDepSortedBySName(dptname);
        }
    }

    public void giveSomeWork()
    {
        firm.sellFor10();
        System.out.println("��� ��������� ������.");
    }

    public void giveSomeInformation()
    {
        System.out.println("�����: "+ firm.getName()+" ���������� "+firm.getAdress()+ " ����� �� ����� "+ firm.getbankCount());
    }
}

