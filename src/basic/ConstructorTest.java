package basic;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("har", 40000);
        employees[1] = new Employee(60000);
        employees[2] = new Employee();
        for (Employee employee : employees) {
            System.out.println("name:" + employee.getName() + ",id：" + employee.getId() + ",salary:" + employee.getSalary());
        }
    }

    static class Employee {
        private static int nextId;
        private int id;
        private String name = "";
        private double salary;

        static {
            Random random = new Random();
            nextId = random.nextInt(1000);
        }

        {
            id = nextId;
            nextId++;
        }

        public Employee(String n, double s) {
            name = n;
            salary = s;
        }

        public Employee(double s) {
            this("Employee," + nextId, s);
        }

        public Employee() {

        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }


        public double getSalary() {
            return salary;
        }
    }
}
