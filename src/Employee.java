public class Employee {
    private String firstName;
    private Integer id;
    private String secondName;
    private String patronymic;
    private int department;
    private int salary;
    private static int counter = 0;

    public Employee(String secondName, String firstName, String patronymic, int department, int salary) {
        this.secondName = secondName ;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getId() {
        return this.id;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "ID: " + id + '\n' +
                "Фамилия: " + secondName + " Имя: " + firstName + " Отчество: " + patronymic + '\n' +
                "Отдел: " + department + " Зарплата: " + salary ;
    }
}
