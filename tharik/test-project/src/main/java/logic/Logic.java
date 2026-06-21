/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author ICBT
 */
public class Logic {
    public void process(DBUtils utils) {
        // business logic
        utils.addSales(new Sales());
         
        utils.getSales();
         
        utils.updateSales(new Sales());
        
        utils.deleteSales(1);   
    }
}
