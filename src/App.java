public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Employee employee = new Employee("Bill", 123456, 60000, "Instructor", "Teaches students coding topics.");
        System.out.println(employee.getName());
        System.out.println(employee.getEmployeeID());
        System.out.println(employee.getSalary());
        System.out.println(employee.getTitle());
        System.out.println(employee.getDescription());

        employee.raise();
        System.out.println(employee.getSalary());

        employee.promotion("Manager");
        System.out.println(employee.getTitle());
    }
}