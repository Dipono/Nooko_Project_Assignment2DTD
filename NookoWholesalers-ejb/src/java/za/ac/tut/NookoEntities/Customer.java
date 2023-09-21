/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.NookoEntities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author LEBUTE
 */
@Entity
public class Customer implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerID;
    private String telephone;

    public Customer() {
    }

    public Customer(String telephone) {
        this.telephone = telephone;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
