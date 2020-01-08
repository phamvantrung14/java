/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiThi;

import java.util.Scanner;

/**
 *
 * @author asuspc
 */
public class Bank {
    private double balance;
    private double rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }
    
    public double calculateInterest(){
        double interest;
        double annualInterestRate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter interest: ");
        interest = sc.nextDouble();
        System.out.println("Enter annualInterestRate: ");
        annualInterestRate = sc.nextDouble();
        
        interest = balance*(annualInterestRate/1200);
                System.out.println("Interest is: "+interest);

        
        return interest;
    }
    public static void main(String[] args) {
        Bank bank = new Bank(1000, 10);
        bank.calculateInterest();
     }
}
