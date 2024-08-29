public class Manager extends Employee {

    //Attributes of Manager Class
    private double bonus;

    //Default Constructor
    public Manager() {}

    //Parameterized Constructor
    public Manager(String name, int age, String department, double salary, double bonus) {
        super(name, age, department, salary);
        this.bonus = bonus;
    }

    //Getter and Setter Methods
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //Method to calculate Total Salary
    public double calculateTotalSalary(double bonus) {
        return (getSalary() + bonus);
    }

    //Method to display information of Employee with added Manager Information
    public void displayEmployeeInfo(){
        if(!getName().isEmpty()){
            super.displayEmployeeInfo();
            System.out.println("Bonus: Rs " + bonus);
            System.out.println("Total Salary: Rs " + calculateTotalSalary(bonus));
        }else{
            System.out.println("Name is empty");
        }
    }
}
