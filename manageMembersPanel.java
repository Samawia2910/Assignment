/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projectmanagementproject;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTable;

/**
 *
 * @author Samawiaijaz
 */
public class manageMembersPanel extends javax.swing.JPanel {

    /**
     * Creates new form manageMembersPanel
     */
    public manageMembersPanel() {
        initComponents();
        
        nameSearchTextField.setEnabled(false);
        emailSearchTxtField.setEnabled(false);
        membertSearchField.setEnabled(false);
        MembersTableModel t = new MembersTableModel(Projectmanagement.getIsntance().getAllMembers());
         
        jTable1.setModel(t);
      
      Action increase = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JTable table = (JTable) e.getSource();
                int row = Integer.valueOf(e.getActionCommand());
                MembersTableModel model = (MembersTableModel) table.getModel();
                model.editRow(row);     
            }
        };
        ButtonColumn inc = new ButtonColumn(jTable1, increase, 4);
        
       
         Action deleteAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JTable table = (JTable) e.getSource();
                int row = Integer.valueOf(e.getActionCommand());
                MembersTableModel model = (MembersTableModel) table.getModel();
                model.deleteRow(row);     
            }
        };
        ButtonColumn deleteButton = new ButtonColumn(jTable1, deleteAction, 5);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        nameSearchBtn = new javax.swing.JRadioButton();
        emailSearchButton = new javax.swing.JRadioButton();
        contactNumberSearchBtn = new javax.swing.JRadioButton();
        nameSearchTextField = new javax.swing.JTextField();
        emailSearchTxtField = new javax.swing.JTextField();
        contactSearchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Contact"));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 30, 0, 30, 0};
        jPanel1Layout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel1.setLayout(jPanel1Layout);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        addButton.setText("Add a New Member");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel3.add(addButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel1.add(jPanel3, gridBagConstraints);

        nameSearchBtn.setBackground(new java.awt.Color(255, 255, 255));
        nameSearchBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameSearchBtn.setText("Search By Name");
        nameSearchBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nameSearchBtnStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(nameSearchBtn, gridBagConstraints);

        emailSearchButton.setBackground(new java.awt.Color(255, 255, 255));
        emailSearchButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailSearchButton.setText("Search By Email");
        emailSearchButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                emailSearchButtonStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(emailSearchButton, gridBagConstraints);

        contactNumberSearchBtn.setBackground(new java.awt.Color(255, 255, 255));
        contactNumberSearchBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contactNumberSearchBtn.setText("Search By Membername");
        contactNumberSearchBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                contactNumberSearchBtnStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(contactNumberSearchBtn, gridBagConstraints);

        nameSearchTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 30);
        jPanel1.add(nameSearchTextField, gridBagConstraints);

        emailSearchTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel1.add(emailSearchTxtField, gridBagConstraints);

        contactSearchField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel1.add(contactSearchField, gridBagConstraints);

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel1.add(searchBtn, gridBagConstraints);

        clearBtn.setText("Clear Filters");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(clearBtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.4;
        add(jPanel1, gridBagConstraints);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(35);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.6;
        add(jScrollPane1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        AddMemberPanel panel = new AddMemberPanel(null, "Add");
        MainForm.getInstance().goToPage(panel);
    }//GEN-LAST:event_addButtonActionPerformed

    private void nameSearchBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nameSearchBtnStateChanged
        // TODO add your handling code here:
       if(nameSearchBtn.isSelected())
       {
           emailSearchTxtField.setText("");
           memeberSearchField.setText("");
              emailSearchTxtField.setEnabled(false);
           memeberSearchField.setEnabled(false);
             nameSearchTextField.setEnabled(true);
       }
       
     
    }//GEN-LAST:event_nameSearchBtnStateChanged

    private void emailSearchButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_emailSearchButtonStateChanged
        // TODO add your handling code here:
        if(emailSearchButton.isSelected())
       {
             nameSearchTextField.setText("");
           memberSearchField.setText("");
              nameSearchTextField.setEnabled(false);
           memberSearchField.setEnabled(false);
             emailSearchTxtField.setEnabled(true);
       }
    }//GEN-LAST:event_emailSearchButtonStateChanged

    private void contactNumberSearchBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_contactNumberSearchBtnStateChanged
        // TODO add your handling code here:
        if(MembernameSearchBtn.isSelected())
       {
             nameSearchTextField.setText("");
           emailSearchTxtField.setText("");
              nameSearchTextField.setEnabled(false);
           emailSearchTxtField.setEnabled(false);
             memeberSearchField.setEnabled(true);
       }
    }//GEN-LAST:event_contactNumberSearchBtnStateChanged

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here
           nameSearchTextField.setEnabled(false);
        emailSearchTxtField.setEnabled(false);
        memberSearchField.setEnabled(false);
          nameSearchTextField.setText("");
        emailSearchTxtField.setText("");
        memberSearchField.setText("");
        
        MembernameSearchBtn.setSelected(false);
        nameSearchBtn.setSelected(false);
        emailSearchButton.setSelected(false);
        
       jTable1.setModel(new MembersTableModel(Projectmanagement.getIsntance().getAllMembers()));
        
    }//GEN-LAST:event_clearBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
      List<Member> searched = null;
        if(nameSearchBtn.isSelected())
       {
       searched =    Projectmanagement.getIsntance().searchBasedOnName(nameSearchTextField.getText());
       }
        else if(emailSearchButton.isSelected())
        {
             searched =    Projectmanagement.getIsntance().searchBasedOnName(emailSearchTxtField.getText());
        }
        
        else if (MembernameSearchBtn.isSelected())
                {
                       searched =    Projectmanagement.getIsntance().searchBasedOnContact(memberSearchField.getText());
                }
        
        
        jTable1.setModel(new MembersTableModel(searched));
                
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearBtn;
    private javax.swing.JRadioButton contactNumberSearchBtn;
    private javax.swing.JTextField contactSearchField;
    private javax.swing.JRadioButton emailSearchButton;
    private javax.swing.JTextField emailSearchTxtField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton nameSearchBtn;
    private javax.swing.JTextField nameSearchTextField;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}