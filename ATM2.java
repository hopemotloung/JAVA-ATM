/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm2;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author Motlo
 */
public class ATM2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        NewClass get = new NewClass();
        boolean found = false;
        do{
        String user = JOptionPane.showInputDialog(null,"enter username");
        String pass = JOptionPane.showInputDialog(null,"enter password");
        
       
        String username[] = {"hope", "tebogo", "kb", "zama", "vusi"};
        String password[] = {"123", "456", "789", "1324","1234"};
        
        for(int i = 0; i < password.length; i++){
            if(user.equals(username[i]) && pass.equals(password[i])){
                JOptionPane.showMessageDialog(null, "Welome on board Mr/Miss/Mrs: "+username[i]);
                found = true;
               get.panel();
              
            }//end of if statement 
        }//end of for statement
              if(!found){
                JOptionPane.showMessageDialog(null,"Sorry, wrong password/username");
                }
        }//end of do statement 
        while (JOptionPane.OK_OPTION == JOptionPane.showOptionDialog(null, "Would you like to try again?", "Continue/Not", 0, 0, null, null, JOptionPane.OK_CANCEL_OPTION));
        JOptionPane.showMessageDialog(null, "Thank you for using our bank :) ");
        
    }
    }
    


