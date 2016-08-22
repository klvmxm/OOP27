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
                    System.out.println("Работа программы завершена");
                    input = false;
                    break;
                default:
                    System.out.println("Есть всего 15 цифр меню!");
            }
        }
    }

    public void firmSayHi() {

        System.out.println();
        System.out.println();
        System.out.println("            Добро пожаловать в меню!           ");
        System.out.println(" Для добавления нового сотрудника нажмите <1>. ");
        System.out.println("       Если хотите уволить сотрудника <2>.     ");
        System.out.println(" Если хотите создать новый отдел нажмите <3>.  ");
        System.out.println("   Перевести сотрудника в отдел нажмите <4>.   ");
        System.out.println("    Нанять менеджера для отдела нажмите <5>.   ");
        System.out.println("    Нанять продажника в компанию нажмите <6>.  ");
        System.out.println(" Для получения списка сотрудников нажмите <7>. ");
        System.out.println("  Отсортировать сотрудников по ЗП нажмите <8>. ");
        System.out.println("  Отсортировать сотрудников имени Нажмите <9>. ");
        System.out.println("Получить список сотрудников отдела нажмите<10>.");
        System.out.println(" Отскортировать сотрудников отдела по ЗП <11>. ");
        System.out.println(" Отскортировать сотрудников отдела по ЗП <12>. ");
        System.out.println("        Припахать сотрудников нажмите <13>.    ");
        System.out.println("            Выдать всем зарплату <14>.         ");
        System.out.println("     Посмотреть данные о фирме нажмите <15>.   ");
        System.out.println("    Для выхода из меню нажмите напишите <16>.  ");
    }

    public void addWorkers() throws IOException{
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Сколько сотрудников Вы хотите добавить?");
        int rabotyagi = Integer.parseInt(br1.readLine());

        for (int i = 0; i < rabotyagi; i++) {
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br7 = new BufferedReader(new InputStreamReader(System.in));


            System.out.println("Имя: ");
            String employeeName = br2.readLine();
            System.out.println("Фамилия: ");
            String employeeSurname = br3.readLine();
            System.out.println("Отчество: ");
            String employeePatronimic = br4.readLine();
            System.out.println("ЗП: ");
            int employeeSalary = Integer.parseInt(br5.readLine());
            System.out.println("Сумма на счету: ");
            int employeeBankCaount = Integer.parseInt(br6.readLine());
            System.out.println("Пол: ");
            String employeeGender = br7.readLine();
            if(firm.addEmployee(new Employee(employeeName, employeeSurname, employeePatronimic, employeeSalary, employeeBankCaount, employeeGender)))
            {
                System.out.println("Встречайте нового сотрудника: "+employeePatronimic + " " + employeeSurname+ " "+ employeeName);
            }
            else System.out.println("Попробуйте еще раз!");
        }
    }

    public void removeWorker() throws IOException{

        System.out.println("Укажите ФИО сотрудника которого необходимо уволить:");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Имя: ");
        String employeeName = br1.readLine();
        System.out.println("Фамилия: ");
        String employeeSurname = br2.readLine();
        System.out.println("Отчество: ");
        String employeePatronimic = br3.readLine();
        if(firm.fireEmployee(employeeName, employeeSurname, employeePatronimic))
        {
            System.out.println("Удачи, "+employeePatronimic + " " + employeeSurname+ " "+ employeeName);
        }
        else System.out.println("Нет такого сотрудника");
    }

    public void creatDepartment()throws IOException
    {
        System.out.println("Укажите название департамента:");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Название: ");
        String dptName = br1.readLine();
        dpt = new Department(dptName);
        firm.getDpt().add(dpt);
        System.out.println("департамент "+dptName+" создан");
    }

    public void setWorkerToDepart() throws IOException
    {
        System.out.println("Для перевода сотрудника в отдел укажите его ФИО и название отдела");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Имя: ");
        String employeeName = br1.readLine();
        System.out.println("Фамилия: ");
        String employeeSurname = br2.readLine();
        System.out.println("Отчество: ");
        String employeePatronimic = br3.readLine();
        System.out.println("Название отдела: ");
        String departmentName = br4.readLine();

        if(firm.setDepartmentForEmployee(employeeName, employeeSurname, employeePatronimic, departmentName))
        {
            System.out.println("Сотрудник "+ " "+employeePatronimic + " " + employeeSurname+ " "+ employeeName + " переведен в отедл "+departmentName);
        }
        else System.out.println("Не получилось. Такой отдел/сотрудник не найден, либо сотрудник уже числится в отделе.");
    }

    public void setManagerToDpt() throws IOException
    {
        System.out.println("Укажите данные менеджера и название отдела");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br7 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br8 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Имя: ");
        String employeeName = br2.readLine();
        System.out.println("Фамилия: ");
        String employeeSurname = br3.readLine();
        System.out.println("Отчество: ");
        String employeePatronimic = br4.readLine();
        System.out.println("ЗП: ");
        int employeeSalary = Integer.parseInt(br5.readLine());
        System.out.println("Сумма на счету: ");
        int employeeBankCaount = Integer.parseInt(br6.readLine());
        System.out.println("Пол: ");
        String employeeGender = br7.readLine();
        System.out.println("Отдел: ");
        String employeeDPT = br8.readLine();
        for(int i = 0; i < firm.getDpt().size(); i++)
        {
            System.out.println("chek");
            if(firm.getDpt().get(i).getDepartmentName().equalsIgnoreCase(employeeDPT))
            {   Manager mg = new Manager(employeeName, employeeSurname, employeePatronimic, employeeSalary, employeeBankCaount, employeeGender, firm.getDpt().get(i));
                firm.addEmployee(mg);
                System.out.println(employeePatronimic + " " + employeeSurname+ " "+ employeeName+" назначен руководителем отдела "+employeeDPT);
            }
            else System.out.println("Вы что-то сделали не так");
        }
    }

    public void getSellers() throws IOException
    {
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Сколько продажников Вы хотите нанять?");
    int rabotyagi = Integer.parseInt(br1.readLine());

    for (int i = 0; i < rabotyagi; i++) {
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br7 = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Имя: ");
        String employeeName = br2.readLine();
        System.out.println("Фамилия: ");
        String employeeSurname = br3.readLine();
        System.out.println("Отчество: ");
        String employeePatronimic = br4.readLine();
        System.out.println("ЗП: ");
        int employeeSalary = Integer.parseInt(br5.readLine());
        System.out.println("Сумма на счету: ");
        int employeeBankCaount = Integer.parseInt(br6.readLine());
        System.out.println("Пол: ");
        String employeeGender = br7.readLine();
        if(firm.addEmployee(new SalesManager(employeeName, employeeSurname, employeePatronimic, employeeSalary, employeeBankCaount, employeeGender, 0)))
        {
            System.out.println("Встречайте нового сотрудника: "+employeePatronimic + " " + employeeName+ " "+ employeeSurname);
        }
        else System.out.println("Попробуйте еще раз!");
    }
}

    public void getWorkerList()
    {
        if(firm.getEmp().isEmpty())
        {
            System.out.println("Сначала нужно нанять сотрудников.");
        }
        else System.out.println(firm.getAllEmployes().toString());
    }

    public void getWorkersSortedBySel()
    {
        if(firm.getEmp().isEmpty())
        {
            System.out.println("Сначала нужно нанять сотрудников.");
        }
        else System.out.println(firm.getAllEmployeesSortedBySalary().toString());
    }

    public void getWorkersSortedByName()
    {
        if(firm.getEmp().isEmpty())
        {
            System.out.println("Сначала нужно нанять сотрудников.");
        }
        else System.out.println(firm.getAllEmployeesSortedBySalary().toString());
    }

    public void giveSomeMoney()
    {
        if(firm.getEmp().isEmpty())
        {
            System.out.println("Сначала нужно нанять сотрудников.");
        }
        else System.out.println("Капуня канпула!");
        firm.giveSalaryForAll();
    }

    public void getWorkersFromDpt() throws IOException
    {

        if(firm.getDpt().isEmpty())
        {
            System.out.println("Сначала нужно добавить сотрудников в департамент.");
        }
        else
        {
            for (int i = 0; i < firm.getDpt().size(); i++) {
                System.out.println("На фирме есть отделы: "+firm.getDpt().get(i).getDepartmentName());
            }
            System.out.println("Напишите название отдела, который вам интересен: ");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String dptname = br1.readLine();
            firm.getEmployeesFromDep(dptname);
        }
    }

    public void getSortedWorkersFromDptBySalary() throws IOException
    {
        if(firm.getDpt().isEmpty())
        {
            System.out.println("Сначала нужно добавить сотрудников в департамент.");
        }
        else
        {
            for (int i = 0; i < firm.getDpt().size(); i++) {
                System.out.println("На фирме есть отделы: "+firm.getDpt().get(i).getDepartmentName());
            }
            System.out.println("Напишите название отдела, который вам интересен: ");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String dptname = br1.readLine();
            firm.getEmployeesFromDepSortedBySalary(dptname);
        }
    }

    public void getSortedWorkersFromDptByName() throws IOException
    {
        if(firm.getDpt().isEmpty())
        {
            System.out.println("Сначала нужно добавить сотрудников в департамент.");
        }
        else
        {
            for (int i = 0; i < firm.getDpt().size(); i++) {
                System.out.println("На фирме есть отделы: "+firm.getDpt().get(i).getDepartmentName());
            }
            System.out.println("Напишите название отдела, который вам интересен: ");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String dptname = br1.readLine();
            firm.getEmployeesFromDepSortedBySName(dptname);
        }
    }

    public void giveSomeWork()
    {
        firm.sellFor10();
        System.out.println("Все выполнили работу.");
    }

    public void giveSomeInformation()
    {
        System.out.println("Фирма: "+ firm.getName()+" координаты "+firm.getAdress()+ " денег на счету "+ firm.getbankCount());
    }
}

