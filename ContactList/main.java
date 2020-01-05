/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asuspc
 */
public class main {
    
    public static void main(String[] args) {
        ContactList ct = new ContactList();
        int choose;
        do {
            choose = ct.menu();
            switch(choose){
                case 1:
                     ct.addCt();
                     break;
                case 2:
                    ct.display();
                    break;
                case 3:
                    ct.deleteCt();
                    break;
                case 4:
                    ct.Edit();
                    break;
                case 5:
                    System.exit(choose);
                    break;
            }
        } while (true);
        
       
        
        
    }
}
