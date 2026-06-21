/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritence;

/**
 *
 * @author ICBT
 */
public class Student extends Person {
    private double gpa;

    public Student() {
        super();
        this.gpa = 0.0;
    }

    public Student(String id, String name, String dateOfBirth, double gpa) {
        super(id, name, dateOfBirth);
        this.gpa = gpa;
    }
    
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
}
