/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.NookoEntities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author LEBUTE
 */
@Entity
public class Item implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;
    private String item;
    private double itemPrice;
    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;
    
    public Item() {
    }

    public Item(int itemId, String item, double itemPrice, Order order) {
        this.itemId = itemId;
        this.item = item;
        this.itemPrice = itemPrice;
        this.order = order;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItem() {
        return item;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public Order getOrder() {
        return order;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
   
}
