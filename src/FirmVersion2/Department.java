package FirmVersion2;


import java.util.ArrayList;

/**
 *
 */
public class Department {

    private String departmentName;
    private EmployeeManager em;
    private ArrayList<Employee> employeesDpt;


    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employeesDpt = new ArrayList<Employee>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public EmployeeManager getEm() {
        return em;
    }

    public void setEm(EmployeeManager em) {
        this.em = em;
    }


    public ArrayList<Employee> getEmployeesDpt(String departmentName)
    {
        this.departmentName = departmentName;
        return employeesDpt;
    }
    public ArrayList<Employee> getEmployeesDpt()
    {
        return employeesDpt;
    }


}
