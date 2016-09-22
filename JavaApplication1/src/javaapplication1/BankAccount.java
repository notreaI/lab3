/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
/**
 *
 * @author student
 */

public class BankAccount {
    String AccNum;
    String AccName;
    String AccID;
    float AccBal;
    String PW;

    public void setPW(String PW) {
        this.PW = PW;
    }
    
    public boolean withdrawMoney(String password,float amount){
        if (PW.equals(password)){
            if (AccBal - amount >= 0){
                return true;
            }
            else
                return false;
        }
        else
            return false;
            
    }
    public void deposit(float amount){
        AccBal += amount;
    }

    public BankAccount(String AccNum, String AccName, String AccID, float AccBal, String PW) {
        this.AccNum = AccNum;
        this.AccName = AccName;
        this.AccID = AccID;
        this.AccBal = AccBal;
        this.PW = PW;
    }
    
}
