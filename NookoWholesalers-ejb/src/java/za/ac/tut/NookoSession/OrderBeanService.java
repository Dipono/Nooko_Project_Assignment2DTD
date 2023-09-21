/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.NookoSession;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.NookoEntities.Order;

/**
 *
 * @author LEBUTE
 */
@Stateless
public class OrderBeanService implements OrderBean{
    @PersistenceContext(unitName = "NookoWholesalersPersistanceConnect")
    private EntityManager en;
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public List<Order> retrieveOrder() {
        String sql = "select order from Order order";
        Query query = en.createQuery(sql);
        List<Order> orderList = query.getResultList();
        
        return orderList;
    }

    @Override
    public void placeOrder(Order order) {
        en.persist(order);
    }

    @Override
    public void updateOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteOrder(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
