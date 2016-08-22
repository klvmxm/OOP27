package OneMoreFirm;

/**
 *
 */
public abstract class EmployeeAbstract implements EmployeeInterface {


    public abstract String getName();
    public abstract String getSurname();
    public abstract String getPatronymic();
    public abstract int getSalary();
    public abstract double getBalance();
    public abstract String getGender();



    @Override
    public String toString() {
        return "Сотрудник: " + getName() + " " + getSurname() +
                        ", с зарплатой: " + getSalary() +
                        ". Его текущий баланс: " + getBalance() +
                        ". Пол: " + getGender() + ".\n";
        //String.format("%s, %s, %s, salary : %05.2d, balance : %05.2f, %s", getName(),  getSurname(), getPatronymic(), getSalary(), getBalance(), getGender());
    }
}
