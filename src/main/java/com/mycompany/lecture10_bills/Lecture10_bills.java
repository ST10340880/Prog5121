/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecture10_bills;
//package f.lecture10_bills;
import javax.swing.*;

/**
 *
 * @author quellonnaicker
 */
public class Lecture10_bills {

    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Enter the customers");
        double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the  minutes talked"));
        double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cost per minute"));
        
        
        //sends variables to constructor in the bills class
        bills b = new bills(strName, dblCostPerMinute, dblMinutesTalked);
        
        
        JOptionPane.showMessageDialog(null, "CUSTOMER NAME: " + "TOTAL DUE: R" + b.getTotalBills());
       
    }
}
