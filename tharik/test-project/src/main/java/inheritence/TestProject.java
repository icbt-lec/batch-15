/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package inheritence;

/**
 *
 * @author ICBT
 */
public class TestProject {

    public static void main(String[] args) { 
        Person p3;
      //  p3 = new Person();
        p3 = new Student();
        p3 = new Employee();
        
       Person[] persons = new Person[4];
       
       persons[0] = new Employee("123V", "John", "1999",  100000); 
       persons[1] = new Student("256V", "George", "1997", 3.7);
       persons[2] = new Student("ST01", "Charles", "1998", 3.8);
       persons[3] = new Employee("EMP01", "Lewis", "1985", 120000);
       
       for (Person p1: persons) {
            System.out.println(p1.getId() + "   " + p1.getName() + "   " + p1.getDateOfBirth());
       }
       
       for (int i = 0; i < persons.length; i++) {
           System.out.println(persons[i].getId() + "   " + persons[i].getName() + "   " + persons[i].getDateOfBirth());
       }

    }
}
