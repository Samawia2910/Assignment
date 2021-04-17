/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projectmanagementproject;

import javax.swing.UIManager;

/**
 *
 * @author Samawiaiajz
 */
public class Projectmanagementproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try{
        // TODO code application logic here
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        }catch(Exception ex)
        {
            System.out.println("Hellp1");
        }
        MainForm f = MainForm.getInstance();
        f.setVisible(true);
        System.out.println("Hellp2");
    }
    
}
