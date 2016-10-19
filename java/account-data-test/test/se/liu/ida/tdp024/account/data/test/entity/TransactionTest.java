package se.liu.ida.tdp024.account.data.test.entity;
import java.util.Date;
import se.liu.ida.tdp024.account.data.api.entity.Transaction;
import org.junit.Assert;
import org.junit.Test;
import se.liu.ida.tdp024.account.data.api.entity.Account;
import se.liu.ida.tdp024.account.data.impl.db.entity.AccountDB;
import se.liu.ida.tdp024.account.data.impl.db.entity.TransactionDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author frejo105
 */
public class TransactionTest {
    //---- Unit under test ----/
    Transaction transaction = new TransactionDB();
    Account account = new AccountDB();
    
    @Test
    public void setValidId() {
        transaction.setId(10);
        Assert.assertEquals(10, transaction.getId());
    }
    
    @Test
    public void setTypeCredit() {
        transaction.setType(Transaction.Type.CREDIT);
        Assert.assertEquals(Transaction.Type.CREDIT, transaction.getType());
    }
    
    @Test
    public void setStatusOK() {
        transaction.setStatus(Transaction.Status.OK);
        Assert.assertEquals(Transaction.Status.OK, transaction.getStatus());
    }
    
    @Test
    public void setValidAmount() {
        transaction.setAmount(10);
        Assert.assertEquals(10, transaction.getAmount());
    }
    
    @Test
    public void setValidDate() {
        Date now = new Date();
        transaction.setCreated(now);
        Assert.assertEquals(now, transaction.getCreated());
    }
    
    @Test
    public void setAccount() {
        transaction.setAccount(account);
        Assert.assertEquals(account, transaction.getAccount());
    }
}
