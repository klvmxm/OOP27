package OneMoreFirm;

/**
 *
 */
public class Zavod {
    public static void main(String[] args) {
        Firm zavod = new Firm("�������", "���������", 50000);
        Department dp = new Department("Manafers");
        Department dp1 = new Department("Buga");
        zavod.getDpt().add(dp);
        zavod.getDpt().add(dp1);
        Manager mg = new Manager("������", "��������", "����������", 4000, 0, "�", dp);
        zavod.addEmployee(mg);
        Employee employee1 = new Employee("������", "��������", "����������", 4000, 0, "�");
        SalesManager employee2 = new SalesManager("������", "������", "�������", 9000, 0, "�", 3000);
        zavod.addEmployee(employee1);
        zavod.addEmployee(employee2);
       zavod.setDepartmentForEmployee("������", "��������", "����������", "Buga");
       // zavod.setDepartmentForEmployee("������", "��������", "����������", "Buga");
//        zavod.setDepartmentForEmployee("������", "��������", "����������", "sdasd");
       // zavod.setDepartmentForEmployee("������", "��������", "����������", "Manafers");
        zavod.setDepartmentForEmployee("������", "��������", "����������", "Manafers");
        //zavod.fireEmployee("������", "��������", "����������");

        zavod.setDepartmentForEmployee("������", "������", "�������", "Buga");
        System.out.println(zavod.getEmployeesFromDep("Buga").toString());
        System.out.println();
//        System.out.println(zavod.getEmployeesFromDep("Manafers").toString());

        System.out.println(zavod.getAllEmployes().toString());
    }
}
