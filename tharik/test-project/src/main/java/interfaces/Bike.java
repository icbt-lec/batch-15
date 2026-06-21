/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author ICBT
 */
public class Bike implements Vehicle {

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }

    @Override
    public int start() {
        System.out.println("Bike is starting");
        return 1;
    }   
}
