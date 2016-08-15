package FirmVersion2;


/**
 * .
 */
public class Employee{

        private String name;
        private String surname;
        private String patronymic;
        private int salary;
        private int balance;
        private String gender;
        private String department;

        public Employee(String name, String surname, String patronymic, int salary, int balance, String gender, String department)
        {
            this.name = name;
            this.surname = surname;
            this.patronymic = patronymic;
            this.salary = salary;
            this.balance = balance;
            this.gender = gender;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
    }