/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author ICBT
 */
public class Test {
    public static void main(String[] args) { 
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        
        
        v1.start();
        v1.move();
        v2.start();
        v2.move();
    }
}
