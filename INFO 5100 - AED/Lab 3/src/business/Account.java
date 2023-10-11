/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.Date;

/**
 *
 * @author nouma
 */
public class Account {
    private String routingnumber;
    private String accountNumber;
    private String bankName;
    private int balance;
    private Date createdOn;

    public Account() {
        this.createdOn = new Date();
    }

    public Date getCreatedOn() {
        return createdOn;
    }
    
    

    public String getRoutingnumber() {
        return routingnumber;
    }

    public void setRoutingnumber(String routingnumber) {
        this.routingnumber = routingnumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
      @Override
    public String toString(){
        return bankName;
        
    }
}
