package OneMoreFirm;


import java.util.ArrayList;

/**
 *
 */
public class Department {

    private String departmentName;
    private Manager em;
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

    public Manager getEm() {
        return em;
    }

    public void setEm(Manager em) {
        this.em = em;
    }

    public ArrayList<Employee> getEmployeesFromDpt()
    {
        return employeesDpt;
    }

    public boolean removeEmp(Employee employee)
    {
       for(int i = 0; i < employeesDpt.size(); i++)
       {
           if(employeesDpt.get(i).empEqualsOtherEmp(employee))
           {
               employeesDpt.remove(i);
               return true;
           }
       }
        return false;
    }
}