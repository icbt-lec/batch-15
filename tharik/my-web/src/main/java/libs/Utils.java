/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ICBT
 */
public class Utils {
    static List<Student>  students = new ArrayList<>();
    
    public static void loadStudents() {
        students.add(new Student(1, "Niki Lauda"));
        students.add(new Student(2, "James Hunt"));
    }
    
    public static List<Student> getStudents() {
        if (students.isEmpty()){
            loadStudents();
        }  
        return students;
    }
    
    public static Student getStudent(int id) {
        if (students.isEmpty()){
            loadStudents();
        } 
        for(Student st: students) {
            if (st.getId() == id) {
                return st;
            }
        }
        return null;
    }
}
