/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Employee;
import model.Employee_list;

/**
 *
 * @author essni
 */
public class SearchPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchPanel
     */
    Employee_list emplist=new Employee_list();
    
    public SearchPanel(Employee_list emplist) {
        initComponents();
        
        this.emplist=emplist;
        
        populateEmployees();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jSTable = new javax.swing.JTable();
        jSearch = new javax.swing.JLabel();
        jTxtSearch = new javax.swing.JTextField();

        jSTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "EId", "Name", "Title", "Phone", "email"
            }
        ));
        jScrollPane1.setViewportView(jSTable);

        jSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSearch.setText("Search box:");

        jTxtSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSearchActionPerformed(evt);
            }
        });
        jTxtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jSearch)
                .addGap(42, 42, 42)
                .addComponent(jTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearch)
                    .addComponent(jTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSearchActionPerformed

    private void jTxtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtSearchKeyReleased
        String search=jTxtSearch.getText();
        search(search);
    }//GEN-LAST:event_jTxtSearchKeyReleased

    public void search(String str){
        DefaultTableModel model=(DefaultTableModel) jSTable.getModel();
        TableRowSorter<DefaultTableModel> sorter=new TableRowSorter<>(model);
        jSTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(str));
    }
    
    private void populateEmployees() {
        DefaultTableModel model=(DefaultTableModel) jSTable.getModel();
        model.setRowCount(0);
      
        for(Employee e:emplist.getEmp_list()){
            Object[] col=new Object[5];
            col[0]=e;
            col[1]=e.getName();
            col[2]=e.getTitle();
            col[3]=e.getPhone();
            col[4]=e.getEmail();
            
            model.addRow(col);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jSTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jSearch;
    private javax.swing.JTextField jTxtSearch;
    // End of variables declaration//GEN-END:variables
}
