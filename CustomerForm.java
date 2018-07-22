/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repairshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LabC
 */
public class CustomerForm extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    ResultSet rs2;
    Statement stmt2;
    int curRow = 0;
  
    public CustomerForm() {
        initComponents();
        DoConnect();
    }

    public void DoConnect(){
        try{
            String host = "jdbc:mysql://localhost:3306/VRS?zeroDateTimeBehavior=convertToNull";          
            String uName = "root";
            String uPass = "";
            con = DriverManager.getConnection(host, uName, uPass);
            
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE );
            String sql = "SELECT * FROM Customer";
            rs = stmt.executeQuery(sql);
            
            rs.next();
            int id_col = rs.getInt("CustomerID");
            String contact = rs.getString("ContactNo");
            String id = Integer.toString(id_col);
            String first = rs.getString("Fname");
            String last = rs.getString("Lname");
            String middle = rs.getString("Mi");
            String address = rs.getString("Address");
            
            txtID.setText(id);
            txtFname.setText(first);
            txtLname.setText(last);
            txtMI.setText(middle);            
            txtAddress.setText(address);
            txtContactNo.setText(contact);
      }
        catch (SQLException err){
            JOptionPane.showMessageDialog(CustomerForm.this, err.getMessage());
        }
        
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("VRS?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        customerQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Customer c");
        customerList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : customerQuery.getResultList();
        customerQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Customer c");
        customerList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : customerQuery1.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnDRecord = new javax.swing.JButton();
        btnNRecord = new javax.swing.JButton();
        btnURecord = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Last Name");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });
        jPanel7.add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, 96, -1));
        jPanel7.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 93, 94, -1));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("First Name");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Middle Initial");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        txtMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMIActionPerformed(evt);
            }
        });
        jPanel7.add(txtMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 93, 59, -1));

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact Number");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, -1, -1));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer ID");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));
        jPanel7.add(txtContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, 147, -1));
        jPanel7.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 60, -1));

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Address");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 189, -1, -1));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, 219, -1));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/repairshop/Save.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel7.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 65, -1));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/repairshop/Cancel.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel7.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 60, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNext.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        btnNext.setText("<");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel3.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 113, -1));

        btnPrevious.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        btnPrevious.setText(">");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel3.add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 113, -1));

        btnLast.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        btnLast.setText(">>");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel3.add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 113, -1));

        btnFirst.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        btnFirst.setText("<<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel3.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 113, -1));

        btnDRecord.setFont(new java.awt.Font("Stencil", 0, 10)); // NOI18N
        btnDRecord.setText("Delete Record");
        btnDRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDRecordActionPerformed(evt);
            }
        });
        jPanel3.add(btnDRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 113, -1));

        btnNRecord.setFont(new java.awt.Font("Stencil", 0, 10)); // NOI18N
        btnNRecord.setText("New Record");
        btnNRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNRecordActionPerformed(evt);
            }
        });
        jPanel3.add(btnNRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 113, -1));

        btnURecord.setFont(new java.awt.Font("Stencil", 0, 10)); // NOI18N
        btnURecord.setText("Update Record");
        btnURecord.setToolTipText("");
        btnURecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnURecordActionPerformed(evt);
            }
        });
        jPanel3.add(btnURecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 113, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/repairshop/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, -1));

        jPanel7.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 130, 390));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 440, 390));

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Customer Form");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 370, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu jButton1 = new Menu();
        jButton1.setVisible(true);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNRecordActionPerformed
        // TODO add your handling code here:
         try {
        rs.last();
        curRow = rs.getRow();              
        int curID = curRow + 1;
        String newCurID = Integer.toString(curID);
        
        txtFname.setText("");
        txtLname.setText("");
        txtAddress.setText("");
        txtID.setText(newCurID);
        txtContactNo.setText("");
        txtMI.setText("");       
                   
        btnFirst.setEnabled( false );
        btnPrevious.setEnabled( false ) ;
        btnNext.setEnabled( false );
        btnLast.setEnabled( false );
        btnURecord.setEnabled( false );
        btnDRecord.setEnabled( false );
        btnNRecord.setEnabled( false );

        btnSave.setEnabled( true );
        btnCancel.setEnabled( true );
        }
        catch (SQLException err){
             System.out.println(err.getMessage());
             }       
    }//GEN-LAST:event_btnNRecordActionPerformed

    private void txtMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMIActionPerformed

    private void btnURecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnURecordActionPerformed
        // TODO add your handling code here:
        String ID = txtID.getText();
        String contact = txtContactNo.getText();
        String first = txtFname.getText();
        String last = txtLname.getText();
        String middle = txtMI.getText();
        String address = txtAddress.getText();
        
        int newID = Integer.parseInt(ID);
        
        try{
            rs.updateInt("CustomerID", newID);
            rs.updateString("ContactNo", contact);
            rs.updateString("Fname", first);
            rs.updateString("Lname", last);
            rs.updateString("Mi", middle);
            rs.updateString("Address", address);
            rs.updateRow();
            JOptionPane.showMessageDialog(CustomerForm.this, "Database Updated");
        }
        catch (SQLException err){
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_btnURecordActionPerformed

    private void btnDRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDRecordActionPerformed
        // TODO add your handling code here:
        try{
          rs.deleteRow();
          JOptionPane.showMessageDialog(CustomerForm.this, "Record Deleted!");
          DoConnect();
          
        }
         catch (SQLException err){
             System.out.println(err.getMessage());
             }
    }//GEN-LAST:event_btnDRecordActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
            String ID = txtID.getText();
            String contact = txtContactNo.getText();
            String first = txtFname.getText();
            String last = txtLname.getText();
            String middle = txtMI.getText();
            String address = txtAddress.getText();
        
            int newID = Integer.parseInt(ID);
            
            try{
            rs.moveToInsertRow();
                
            rs.updateInt("CustomerID", newID);
            rs.updateString("Fname", first);
            rs.updateString("Lname", last);
            rs.updateString("MI", middle);
            rs.updateString("Address", address);
            rs.updateString("ContactNo", contact);
                
            rs.insertRow();
                
            stmt.close();
            rs.close();
                
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE );
            String sql = "SELECT * FROM Customer";
            rs = stmt.executeQuery(sql);
            
            rs.next();            
            
            txtID.setText(ID);
            txtFname.setText(first);
            txtLname.setText(last);
            txtMI.setText(middle);
            txtAddress.setText(address);
            txtContactNo.setText(contact);
                       
                                            
            btnFirst.setEnabled( true );
            btnPrevious.setEnabled( true ) ;
            btnNext.setEnabled( true );
            btnLast.setEnabled( true );
            btnURecord.setEnabled( true );
            btnDRecord.setEnabled( true );
            btnNRecord.setEnabled( true );

            btnSave.setEnabled( false );
            btnCancel.setEnabled( false );
            
            JOptionPane.showMessageDialog(CustomerForm.this, "Database Saved!");            
            DoConnect();     
      }
        catch (SQLException err){
            JOptionPane.showMessageDialog(CustomerForm.this, err.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        try {
        rs.first();
        txtFname.setText(rs.getString("Fname"));
        txtLname.setText(rs.getString("Lname"));
        txtAddress.setText(rs.getString("Address"));
        txtID.setText( Integer.toString(rs.getInt("CustomerID")) );
        txtContactNo.setText(rs.getString("ContactNo"));
        txtMI.setText(rs.getString("Mi"));
                          
        btnFirst.setEnabled( true );
        btnPrevious.setEnabled( true ) ;
        btnNext.setEnabled( true );
        btnLast.setEnabled( true );
        btnURecord.setEnabled( true );
        btnDRecord.setEnabled( true );
        btnNRecord.setEnabled( true );

        btnSave.setEnabled( false );
        btnCancel.setEnabled( false );
        }
        catch (SQLException err){
             System.out.println(err.getMessage());
             }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        try {
            if ( rs.next( ) ) {
                int id_col = rs.getInt("CustomerID");
                String contact = rs.getString("ContactNo");
                String id = Integer.toString(id_col);
                String first = rs.getString("Fname");
                String last = rs.getString("Lname");
                String middle = rs.getString("Mi");
                String address = rs.getString("Address");

                txtID.setText(id);
                txtFname.setText(first);
                txtLname.setText(last);
                txtMI.setText(middle);
                txtAddress.setText(address);
                txtContactNo.setText(contact);

            }
            else {
                rs.previous( );
                JOptionPane.showMessageDialog(CustomerForm.this, "End of File");
            }
        }
        catch (SQLException err) {
            JOptionPane.showMessageDialog(CustomerForm.this, err.getMessage());
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        try {
            if ( rs.previous( ) ) {
                int id_col = rs.getInt("CustomerID");
                String contact = rs.getString("ContactNo");
                String id = Integer.toString(id_col);
                String first = rs.getString("Fname");
                String last = rs.getString("Lname");
                String middle = rs.getString("MI");
                String address = rs.getString("Address");

                txtID.setText(id);
                txtFname.setText(first);
                txtLname.setText(last);
                txtMI.setText(middle);
                txtAddress.setText(address);
                txtContactNo.setText(contact);

            }
            else {
                rs.next( );
                JOptionPane.showMessageDialog(CustomerForm.this, "End of File");
            }
        }
        catch (SQLException err) {
            JOptionPane.showMessageDialog(CustomerForm.this, err.getMessage());
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        try{
            rs.last();
            int id_col = rs.getInt("CustomerID");
            String contact = rs.getString("ContactNo");
            String id = Integer.toString(id_col);
            String first = rs.getString("Fname");
            String last = rs.getString("Lname");
            String middle = rs.getString("MI");
            String address = rs.getString("Address");

            txtID.setText(id);
            txtFname.setText(first);
            txtLname.setText(last);
            txtMI.setText(middle);
            txtAddress.setText(address);
            txtContactNo.setText(contact);
        }
        catch (SQLException err) {
            JOptionPane.showMessageDialog(CustomerForm.this, err.getMessage());
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        try{
            rs.first();
            int id_col = rs.getInt("CustomerID");
            String contact = rs.getString("ContactNo");
            String id = Integer.toString(id_col);
            String first = rs.getString("Fname");
            String last = rs.getString("Lname");
            String middle = rs.getString("MI");
            String address = rs.getString("Address");

            txtID.setText(id);
            txtFname.setText(first);
            txtLname.setText(last);
            txtMI.setText(middle);
            txtAddress.setText(address);
            txtContactNo.setText(contact);
        }
        catch (SQLException err) {
            JOptionPane.showMessageDialog(CustomerForm.this, err.getMessage());
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDRecord;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNRecord;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnURecord;
    private java.util.List<repairshop.Customer> customerList;
    private java.util.List<repairshop.Customer> customerList1;
    private javax.persistence.Query customerQuery;
    private javax.persistence.Query customerQuery1;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMI;
    // End of variables declaration//GEN-END:variables
}
