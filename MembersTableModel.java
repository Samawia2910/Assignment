/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projectmanagementproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Samyan
 */
public class MembersTableModel extends AbstractTableModel {

    private List<Member> li = new ArrayList();
    private String[] columnNames = { "Name", "Email", "Member name", "Date Of Birth", "Edit","Delete"};

    public MembersTableModel(List<Contact> list){
         this.li = list;
    }

    
   
    
    @Override
    public String getColumnName(int columnIndex){
         return columnNames[columnIndex];
    }
    
  

    @Override     
    public int getRowCount() {
        return li.size();
    }

    @Override        
    public int getColumnCount() {
        return columnNames.length; 
    }

    
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Contact si = li.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return si.getName();
            case 1:
                return si.getEmail();
            case 2:
                return si.getMembername();
            case 3:
                return si.getDob();
            case 4:
                return "Edit";
            case 5:
                
                 
                        return "Delete";
            
           }
           return null;
   }

   @Override
   public Class<?> getColumnClass(int columnIndex){
       System.out.println("column index = " + columnIndex);
          switch (columnIndex){
             case 0:
               return String.class;
             case 1:
               return String.class;
             case 2:
               return String.class;
             case 3:
               return Date.class;
             case 4: 
               return String.class;
                case 5: 
               return String.class;
             }
             return null;
      }

    @Override
    public boolean isMemberEditable(int rowIndex, int columnIndex) {
      
        return columnIndex == 4 || columnIndex==5;
    }
   
    
    public void editRow(int row){
     String member = (String)getValueAt(row, 2);
     AddMemberPanel p = new AddMemberPanel(member,"Edit");
     MainForm.getInstance().goToPage(p);
                
    }
    
    
      
    public void deleteRow(int row){
     String member = (String)getValueAt(row, 2);
     AddMemberPanel p=new  AddMemberPanel(member, "Delete");
     MainForm.getInstance().goToPage(p);
                
    }
   
 }