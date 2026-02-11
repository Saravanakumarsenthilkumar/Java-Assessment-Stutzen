import java.util.*;



public class EmployeeFilter {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1, "Arun", 25000, "IT"));
        list.add(new Employee(2, "Bala", 35000, "HR"));
        list.add(new Employee(3, "Charan", 40000, "IT"));
        list.add(new Employee(4, "David", 28000, "Sales"));
        list.add(new Employee(5, "Ezhil", 50000, "HR"));
        list.add(new Employee(6, "Farhan", 27000, "Sales"));
        list.add(new Employee(7, "Gokul", 45000, "IT"));
        list.add(new Employee(8, "Hari", 32000, "HR"));
        list.add(new Employee(9, "Imran", 29000, "Sales"));
        list.add(new Employee(10, "John", 60000, "IT"));
        System.out.println("\nEmployees with Salary > 30000");
        for (Employee e : list) {
            if (e.salary > 30000) {
                System.out.println(e.name + " - " + e.salary);
            }
        }
        System.out.println("\nIT Department");
        for (Employee e : list) {
            if (e.department.equals("IT")) {
                System.out.println(e.name);
            }
        }
        System.out.println("\nHR Department");
        for (Employee e : list) {
            if (e.department.equals("HR")) {
                System.out.println(e.name);
            }
        }

        System.out.println("\nSales Department");
        for (Employee e : list) {
            if (e.department.equals("Sales")) {
                System.out.println(e.name);
            }
        }

        TreeMap<String, Employee> map = new TreeMap<String, Employee>();

        for (Employee e : list) {
            map.put(e.name, e);  
        }

        System.out.println("\nEmployees Sorted by Name (Using TreeMap)");
        for (Employee e : map.values()) {
            System.out.println(e.name + " - " + e.department);
        }
    }
}

class Employee {
    int id;
    String name;
    double salary;
    String department;
    Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
}