package OneMoreFirm;

/**
 *
 */
public class Zavod {
    public static void main(String[] args) {
        Firm zavod = new Firm("Шарашка", "Челябинск", 50000);
        Department dp = new Department("Manafers");
        Department dp1 = new Department("Buga");
        zavod.getDpt().add(dp);
        zavod.getDpt().add(dp1);
        Manager mg = new Manager("Васьок", "Михайлов", "Васильевич", 4000, 0, "М", dp);
        zavod.addEmployee(mg);
        Employee employee1 = new Employee("Стасян", "Михайлов", "Васильевич", 4000, 0, "М");
        SalesManager employee2 = new SalesManager("Михаил", "Стасов", "Львович", 9000, 0, "М", 3000);
        zavod.addEmployee(employee1);
        zavod.addEmployee(employee2);
       zavod.setDepartmentForEmployee("Стасян", "Михайлов", "Васильевич", "Buga");
       // zavod.setDepartmentForEmployee("Стасян", "Михайлов", "Васильевич", "Buga");
//        zavod.setDepartmentForEmployee("Стасян", "Михайлов", "Васильевич", "sdasd");
       // zavod.setDepartmentForEmployee("Стасян", "Михайлов", "Васильевич", "Manafers");
        zavod.setDepartmentForEmployee("Стасян", "Михайлов", "Васильевич", "Manafers");
        //zavod.fireEmployee("Стасян", "Михайлов", "Васильевич");

        zavod.setDepartmentForEmployee("Михаил", "Стасов", "Львович", "Buga");
        System.out.println(zavod.getEmployeesFromDep("Buga").toString());
        System.out.println();
//        System.out.println(zavod.getEmployeesFromDep("Manafers").toString());

        System.out.println(zavod.getAllEmployes().toString());
    }
}
