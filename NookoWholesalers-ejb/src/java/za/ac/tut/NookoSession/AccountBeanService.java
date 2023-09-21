/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.NookoSession;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.NookoEntities.Account;

/**
 *
 * @author LEBUTE
 */
@Stateless
public class AccountBeanService implements AccountBean {

    @PersistenceContext(unitName = ("NookoWholesalersPersistanceConnect"))
    private EntityManager manager;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    @Override
    public Account validateAccount(int customerID, double balance) {
        String sql = "select account from Account account where account.customerID Like :customerID and account.balance : balance";
        Query query = manager.createQuery(sql);
        query.setParameter("customerId", customerID);
        query.setParameter("balance", balance);
        Account accountResults = new Account();
        try{
        accountResults = (Account) query.getSingleResult();
        }
        catch(Exception ex){
            accountResults = null;
        }
        
        return accountResults;
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void update(Account account) {
        Account acc = findAccount(account.getAccountId());
        
        if(acc != null){
            manager.merge(acc);
        }
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Account findAccount(int accountId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
