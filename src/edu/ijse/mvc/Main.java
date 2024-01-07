/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc;

import edu.ijse.mvc.view.CustomerView;
import edu.ijse.mvc.view.ItemView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anjanathrishakya
 */
public class Main {
    public static void main(String[] args) {
        try {
            new CustomerView().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
