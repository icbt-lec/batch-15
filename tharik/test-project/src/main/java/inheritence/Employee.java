/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritence;

/**
 *
 * @author ICBT
 */
public class Employee extends Person {
    
    private double salary;

    public Employee() {
        super();
        this.salary = 0.0;
    }

    public Employee(String id, String name, String dateOfBirth, double salary) {
        super(id, name, dateOfBirth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
}
