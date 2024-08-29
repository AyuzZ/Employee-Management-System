public class EmployeeTest {

    public static void main(String[] args) {
        //Creating Instance of Employee Class
        Employee employee = new Employee("Aayush Katwal", 20,
                "Java Developers", 30000);
        //Creating Instance of Manager Class
        Manager manager = new Manager("Sanskriti Dhakal", 22,
                "Java Management", 50000, 10000);
        //Displaying Employee Information
        employee.displayEmployeeInfo();
        //Displaying Manager Information
        manager.displayEmployeeInfo();
        //Raising Employee Salary by 10%
        employee.raiseSalary(10);
        //Raising Manager Salary by 10%
        manager.raiseSalary(10);
        //Displaying Updated Employee Information
        employee.displayEmployeeInfo();
        //Displaying Updated Manager Information
        manager.displayEmployeeInfo();
    }
}
