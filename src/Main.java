import java.util.*;

class Employee {
    String empId,name;
    int age;
    double salary;

    Employee(String empId, String name, int age, double salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("161E90", "Raman", 41, 56000));
        employees.add(new Employee("161F91", "Himadri", 38, 67500));
        employees.add(new Employee("161F99", "Jaya", 51, 82100));
        employees.add(new Employee("171E20", "Tejas", 30, 55000));
        employees.add(new Employee("171G30", "Ajay", 45, 44000));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose sorting parameter (1. Age, 2. Name, 3. Salary): ");
        int choice = scanner.nextInt();

        Comparator<Employee> comparator = null;
        switch (choice) {
            case 1:
                comparator = Comparator.comparingInt(emp -> emp.age);
                break;
            case 2:
                comparator = Comparator.comparing(emp -> emp.name);
                break;
            case 3:
                comparator = Comparator.comparingDouble(emp -> emp.salary);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        employees.sort(comparator);

        System.out.println("Sorted Employee Table:");
        employees.forEach(emp -> System.out.println(emp.empId + " " + emp.name + " " + emp.age + " " + emp.salary));
    }
}
