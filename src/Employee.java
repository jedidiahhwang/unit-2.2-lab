public class Employee {
    // Fields or member variables.
	private String name; 
    private int employeeID;
    private int salary;
    private String title;
    private String description;

    // Methods
    public void printInfo() {
        System.out.println("The employee's name is " + this.name + ", their ID is " + this.employeeID + ", and they work as a " + this.title + ". " + this.name + "'s job description is " + this.description + " and they earn " + this.salary + " every year.");
    }

    public void raise() {
        this.salary += 1000;
    }

    public void promotion(String newTitle) {
        this.title = newTitle;
    }

    // Constructors, getters, and setters.
    public Employee(String name, int employeeID, int salary, String title, String description) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.title = title;
        this.description = description;
    }

    public Employee(String name, int employeeID, String title, String description) {
        this.name = name;
        this.employeeID = employeeID;
        this.title = title;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
