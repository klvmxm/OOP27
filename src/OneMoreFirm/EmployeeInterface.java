package OneMoreFirm;

/**
 *
 */
public interface EmployeeInterface {

    default void doWork()
    {

    }

    abstract double calculateSalary();


}
