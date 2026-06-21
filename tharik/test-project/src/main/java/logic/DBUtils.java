/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logic;

/**
 *
 * @author ICBT
 */
public interface DBUtils {
    public Sales[] getSales();
    
    public Sales getSales(int i);
    
    public boolean addSales(Sales sales);
    
    public boolean updateSales(Sales sales);
    
    public boolean deleteSales(int i);
}
