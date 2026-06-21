/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usage;

import logic.DBUtils;
import logic.Sales;

/**
 *
 * @author ICBT
 */
public class MySQLUtils implements DBUtils {

    @Override
    public Sales[] getSales() {
        System.out.println("Reading sales from MySQL DB");
        return new Sales[5];
    }

    @Override
    public Sales getSales(int i) {
        System.out.println("Reading sales from MySQL DB");
        return new Sales();
    }

    @Override
    public boolean addSales(Sales sales) {
        System.out.println("Creating sales on MySQL DB");
        return true;
    }

    @Override
    public boolean updateSales(Sales sales) {
         System.out.println("Updating sales on MySQL DB");
        return true;

    }

    @Override
    public boolean deleteSales(int i) {
         System.out.println("Deleting sales from MySQL DB");
        return true;
    }
    
}
