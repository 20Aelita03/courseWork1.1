public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee person1 = new Employee("Мельникова", "Ксения", "Витальевна", 1, 100_000);
        Employee person2 = new Employee("Иванова","София", "Ивановна", 2, 120_000);
        Employee person3 = new Employee("Буракшаева", "Юлия", "Сергеевна", 3, 150_000);
        Employee person4 = new Employee("Фурсова", "Елизавета", "Владимировна", 4, 170_000);
        Employee person5 = new Employee("Сапсай", "Иван", "Алексеевич", 5, 200_000);
        Employee person6 = new Employee("Богословский", "Артем", "Михайлович", 1, 80_000);
        Employee person7 = new Employee("Самбикина", "Юлия", "Владимировна", 2, 110_000);
        Employee person8 = new Employee("Шпак", "Ангелина", "Эдуардовна", 3, 155_000);
        Employee person9 = new Employee("Пименов", "Максим", "Евгеньевич", 4, 188_000);
        Employee person10 = new Employee("Сигида", "Валерия", "Романовна", 5, 220_000);

        employees[0] = person1;
        employees[1] = person2;
        employees[2] = person3;
        employees[3] = person4;
        employees[4] = person5;
        employees[5] = person6;
        employees[6] = person7;
        employees[7] = person8;
        employees[8] = person9;
        employees[9] = person10;

        printEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц: " + countSumForSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalary());
        System.out.println("Среднее значение зарплат: " + findTheAverageSalary());
        takeFullName();

    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int countSumForSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Employee minSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        } return result;
    }

    public static Employee maxSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        } return result;
    }

    public static double findTheAverageSalary() {
        return countSumForSalary() / (double) employees.length;
    }

    private static void takeFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getSecondName() + " " + employee.getFirstName() + " " + employee.getPatronymic());
        }
    }
}