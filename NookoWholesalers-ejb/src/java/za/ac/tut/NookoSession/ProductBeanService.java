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
import za.ac.tut.NookoEntities.Product;

/**
 *
 * @author LEBUTE
 */
@Stateless
public class ProductBeanService implements ProductBean{
    @PersistenceContext(unitName = "NookoWholesalersPersistanceConnect")
    private EntityManager em;
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public List<Product> getAllProduct(String name) {
       String sql = "select product from Product product";
        Query query = em.createQuery(sql);
        List<Product> prodList = query.getResultList();
        
        return prodList;
    }
    
}
