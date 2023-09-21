/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.NookoSession;

import javax.ejb.Local;
import za.ac.tut.NookoEntities.Account;

/**
 *
 * @author LEBUTE
 */
@Local
public interface AccountBean {
    public Account validateAccount(int customerID, double balance);
    public void update(Account account);
    public Account findAccount(int accountId);
}
