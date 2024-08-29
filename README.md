You are tasked with designing an Employee Management System for a small company using Object-Oriented Programming concepts in Java. The system should allow the company to manage its employees' information, such as name, age, department, and salary.

#Requirements

*Create a class Employee with the following private attributes

String name
int age
String department
double salary

*Implement the following methods in the Employee class

A constructor to initialize all the attributes.
Getter and setter methods for each attribute.
A method raiseSalary(double percentage) that increases the employee's salary by a given percentage.
A method displayEmployeeInfo() that prints out the employee's information in a readable format.

*Create a Manager class that inherits from the Employee class. The Manager class should have an additional attribute

double bonus

*Implement the following in the Manager class

A constructor that initializes the manager's attributes including those inherited from the Employee class.
A method calculateTotalSalary() that returns the total salary (base salary + bonus).
Override the displayEmployeeInfo() method to include the bonus information.

*Create a main method in a class EmployeeTest that

Creates an instance of Employee.
Creates an instance of Manager.
Displays the information of both the employee and the manager.
Raises the salary of both the employee and the manager by 10%.
Displays the updated information of both.
