/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.NookoSession;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.NookoEntities.Order;

/**
 *
 * @author LEBUTE
 */
@Local
public interface OrderBean {
    public List<Order> retrieveOrder();
    public void placeOrder(Order order);
    public void updateOrder(Order order);
    public void deleteOrder(int orderId);
}
