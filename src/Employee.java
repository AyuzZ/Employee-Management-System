public class Employee {

    //Attributes for Employee Class
    private String name;
    private int age;
    private String department;
    private double salary;

    //Default Constructor
    public Employee() {}

    //Parameterized Constructor
    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    //Getter and Setter Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Method to raise salary by given percentage
    public void raiseSalary(double percentage) {
        setSalary(salary + (salary * percentage / 100));
        System.out.println("\nSalary of " + getName() + " has been raised by "+ percentage + "%.");
    }

    //Method to display information of employee
    public void displayEmployeeInfo(){
        if(!name.isEmpty()){
            if(getClass().getSimpleName().equals("Employee")){
                System.out.println("\n---Displaying Employee Information---");
            }
            if(getClass().getSimpleName().equals("Manager")){
                System.out.println("\n---Displaying Manager Information---");
            }
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Department: " + department);
            System.out.println("Salary: Rs " + salary);
        }else{
            System.out.println("Name is empty");
        }
    }
}
