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
public class GuessNumber {
    int Num;
    int i;
    public GuessNumber(int Num) {
        this.Num = Num;
        i=0;
    }
    
    public int guess(int guessNum){
        if (i == 10){
            return -2;
        }
        i++;
        if (Num - guessNum == 0){
            return 0;
        }
        else if(Num - guessNum >= 0){
            return -1;
        }
        else
            return 1;
    }
}
