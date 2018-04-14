/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hp
 */
public class BalanceBean {
    
    double amount ;

    @Override
    public String toString() {
        return "Balance{" + "amount=" + amount + '}';
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BalanceBean(double amount) {
        this.amount = amount;
    }
    
    
}
