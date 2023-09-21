/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.NookoSession;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.NookoEntities.Product;

/**
 *
 * @author LEBUTE
 */
@Local
public interface ProductBean {
    public List<Product> getAllProduct(String name);
}
