/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm2;
import javax.swing.*;
/**
 *
 * @author Motlo
 */
public class NewClass {
   private int balance;
    
    
     String options[] = { "Money", "Buy", "Documents" };
    public void panel(){
         int selection = JOptionPane.showOptionDialog(null, "Choose an option", "Welcome to Bank panel",
                  0, 3, null, options, options[0]);
          if(selection==0){money();}
          if(selection==1){buy();}
          if(selection==2){JOptionPane.showMessageDialog(null, "you really want a bank statement?");}
          if(selection==3){JOptionPane.showMessageDialog(null, "how much would you like to withdraw?");}
    }
    
    public void buy(){
        String optionz[] = { "Electricity","Airtime","Vouchers","Rates","Back"};
       int a = JOptionPane.showOptionDialog(null, "Choose an option", "Buy", 0, 3, null, optionz, 0);
        if(a == 4){panel();}
        if(a == 0){ String v = JOptionPane.showInputDialog(null,"please Enter meter number");
        String optiong[] = {"R50","R100","R150","R200","Own Amount"};
        int u= JOptionPane.showOptionDialog(null, "Choose an option", "Electricity", 0, 3, null, optiong, 0);
        if(u==4){ String h = JOptionPane.showInputDialog(null, "Enter an amount you would like to buy");
        JOptionPane.showMessageDialog(null, "You have successfully bought R"+h+" for "+v);}}
    }//end of buy
    
    public void airtime(){
       JOptionPane.showMessageDialog(null, "choose which network");
              String network[] = { "Vodacom", "MTN", "CellC", "Telkom","Back" };
              int selection1 = JOptionPane.showOptionDialog(null, "Networks ", "Choose an option",
                  0, 3, null, network, network[0]);  
          if(selection1 == 4){panel();}}
    
    public void money(){
        
        String options[] = { "Balance", "Deposit","withdraw","Transfer","Back"};
        int selection = JOptionPane.showOptionDialog(null, "choose an option you would like", "Money", 0, 3, null, options, 0);
        if(selection == 4){panel();}
        if(selection == 0){
            String bal[] = { "Back","Okay/Exit"};
            int k = JOptionPane.showOptionDialog(null, "Balance: "+balance, "Balance", 0, 1, null, bal, bal[0]);
            if(k == 0){money();}}
        if(selection == 1){
            if(JOptionPane.OK_OPTION == JOptionPane.showOptionDialog(null, "please insert notes \n if you have press YES \n \n NO to exit", "Deposit", 0, JOptionPane.OK_CANCEL_OPTION, null, null, 0)){
             int selct = JOptionPane.showOptionDialog(null, "you have inserted R2300, \n press OK to continue back \n or cancel if done", "Deposit", JOptionPane.OK_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION , null, null, 0);
             if(selct == 0){
                money();
             }}}
        
        if(selection == 2){
           String amount = JOptionPane.showInputDialog(null, "Enter how much would you like to withdraw");
           int amoun = Integer.parseInt(amount);
           balance = balance- amoun; 
           JOptionPane.showMessageDialog(null, "Successfuly withdrew R"+amount );
            JOptionPane.showMessageDialog(null, "New balance R"+amoun );
           money();
        }
        
        if(selection == 3){
           String amount = JOptionPane.showInputDialog(null, "Enter how much would you like to transfer");
          String person = JOptionPane.showInputDialog(null, "To whom would you like to send R"+amount+" to? \n Enter bank acc no.s or cell no.s");
           JOptionPane.showMessageDialog(null, "Successfuly sent R"+amount+" to "+person);
           money();
        }
            
        }
    }

