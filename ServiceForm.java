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
public class ServiceForm extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;
    /**
     * Creates new form ServiceForm
     */
    public ServiceForm() {
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
            String sql = "SELECT * FROM Service";
            rs = stmt.executeQuery(sql);
             
            
            rs.next();

            int service_col = rs.getInt("ServiceID");                      
            int vehicle_col = rs.getInt("VehicleID");     
            String service = Integer.toString(service_col);
            String vehicle = Integer.toString(vehicle_col);            
            String servicename = rs.getString("ServiceName"); 

            
            
            txtServiceID.setText(service);           
            txtVehicleID.setText(vehicle);
            txtService.setText(servicename);
      }
        catch (SQLException err){
            JOptionPane.showMessageDialog(ServiceForm.this, err.getMessage());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("VRS?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        serviceQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Service s");
        serviceList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : serviceQuery.getResultList();
        serviceQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Service s");
        serviceList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : serviceQuery1.getResultList();
        vehicleQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT v FROM Vehicle v");
        vehicleList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : vehicleQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtServiceID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtVehicleID = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtService = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnURecord = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNRecord = new javax.swing.JButton();
        btnDRecord = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtServiceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 65, -1));

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Service ID");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Vehicle ID");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel3.add(txtVehicleID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 65, -1));

        txtService.setColumns(20);
        txtService.setRows(5);
        jScrollPane3.setViewportView(txtService);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 210, 110));

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Service");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/repairshop/Save.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 65, -1));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/repairshop/Cancel.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNext.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel6.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, -1));

        btnPrevious.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        btnPrevious.setText("<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel6.add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, -1));

        btnURecord.setFont(new java.awt.Font("Stencil", 0, 10)); // NOI18N
        btnURecord.setText("Update Record");
        btnURecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnURecordActionPerformed(evt);
            }
        });
        jPanel6.add(btnURecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 110, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/repairshop/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel6.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 30));

        btnFirst.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        btnFirst.setText("<<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel6.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, -1));

        btnLast.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        btnLast.setText(">>");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel6.add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, -1));

        btnNRecord.setFont(new java.awt.Font("Stencil", 0, 10)); // NOI18N
        btnNRecord.setText("New Record");
        btnNRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNRecordActionPerformed(evt);
            }
        });
        jPanel6.add(btnNRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 110, -1));

        btnDRecord.setFont(new java.awt.Font("Stencil", 0, 10)); // NOI18N
        btnDRecord.setText("Delete Record");
        btnDRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDRecordActionPerformed(evt);
            }
        });
        jPanel6.add(btnDRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 110, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 130, 410));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Service Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu jButton1 = new Menu();
        jButton1.setVisible(true);  
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
       try{
            rs.first();
            int service_col = rs.getInt("ServiceID");                      
            int vehicle_col = rs.getInt("VehicleID");     
            String service = Integer.toString(service_col);
            String vehicle = Integer.toString(vehicle_col);            
            String servicename = rs.getString("ServiceName"); 

                     
            txtServiceID.setText(service);           
            txtVehicleID.setText(vehicle);
            txtService.setText(servicename);
                        
       } 
      catch (SQLException err) {
        JOptionPane.showMessageDialog(ServiceForm.this, err.getMessage());
        }        
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
      try {
        if ( rs.previous( ) ) {
            int service_col = rs.getInt("ServiceID");                      
            int vehicle_col = rs.getInt("VehicleID");     
            String service = Integer.toString(service_col);
            String vehicle = Integer.toString(vehicle_col);            
            String servicename = rs.getString("ServiceName"); 

                        
            txtServiceID.setText(service);           
            txtVehicleID.setText(vehicle);
            txtService.setText(servicename);                     
        }
        else {
        rs.next( );
        JOptionPane.showMessageDialog(ServiceForm.this, "End of File");
        }
        }
        catch (SQLException err) {
        JOptionPane.showMessageDialog(ServiceForm.this, err.getMessage());
        }                
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        try {
        if ( rs.next( ) ) {
            int service_col = rs.getInt("ServiceID");                      
            int vehicle_col = rs.getInt("VehicleID");     
            String service = Integer.toString(service_col);
            String vehicle = Integer.toString(vehicle_col);            
            String servicename = rs.getString("ServiceName"); 

                       
            txtServiceID.setText(service);           
            txtVehicleID.setText(vehicle);
            txtService.setText(servicename);
        }
        else {
        rs.previous( );
        JOptionPane.showMessageDialog(ServiceForm.this, "End of File");
        }
        }
        catch (SQLException err) {
        JOptionPane.showMessageDialog(ServiceForm.this, err.getMessage());
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        try{
            rs.last();
            int service_col = rs.getInt("ServiceID");                      
            int vehicle_col = rs.getInt("VehicleID");     
            String service = Integer.toString(service_col);
            String vehicle = Integer.toString(vehicle_col);            
            String servicename = rs.getString("ServiceName"); 

                       
            txtServiceID.setText(service);           
            txtVehicleID.setText(vehicle);
            txtService.setText(servicename);             
       } 
      catch (SQLException err) {
        JOptionPane.showMessageDialog(ServiceForm.this, err.getMessage());
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnURecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnURecordActionPerformed
        // TODO add your handling code here:
        String service = txtServiceID.getText();
        String vehicle = txtVehicleID.getText();       
        String servicename = txtService.getText();      
        
        int newService = Integer.parseInt(service);
        int newVehicle = Integer.parseInt(vehicle); 
        
        try{
            rs.updateInt("ServiceID", newService);
            rs.updateInt("VehicleID", newVehicle);
            rs.updateString("ServiceName", servicename);
            rs.updateRow();
            JOptionPane.showMessageDialog(ServiceForm.this, "Database Updated");     
        }
        catch (SQLException err){
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_btnURecordActionPerformed

    private void btnDRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDRecordActionPerformed
        // TODO add your handling code here:
        try{
          rs.deleteRow();
          JOptionPane.showMessageDialog(ServiceForm.this, "Record Deleted!");
          DoConnect();
          
        }
         catch (SQLException err){
             System.out.println(err.getMessage());
             }        
    }//GEN-LAST:event_btnDRecordActionPerformed

    private void btnNRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNRecordActionPerformed
        // TODO add your handling code here:
        try {
        rs.last();
        curRow = rs.getRow();              
        int curService = curRow + 1;
        int curVehicle = curRow + 1;
        
        String newCurService = Integer.toString(curService);
        String newCurVehicle = Integer.toString(curVehicle);
        
        txtServiceID.setText(newCurService);
        txtVehicleID.setText(newCurVehicle);       
        txtService.setText("");        
                   
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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
            String service = txtServiceID.getText();
            String vehicle = txtVehicleID.getText();       
            String servicename = txtService.getText();       
        
            int newService = Integer.parseInt(service);
            int newVehicle = Integer.parseInt(vehicle);
            
            
            try{
            rs.moveToInsertRow();
                
            rs.updateInt("ServiceID", newService);        
            rs.updateInt("VehicleID", newVehicle);      
            rs.updateString("ServiceName",servicename );            
                
            rs.insertRow();
                
            stmt.close();
            rs.close();
                
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE );
            String sql = "SELECT * FROM service";
            rs = stmt.executeQuery(sql);
            
            rs.next();            
            
            txtServiceID.setText(service);           
            txtVehicleID.setText(vehicle);
            txtService.setText(servicename);        
                       
                                            
            btnFirst.setEnabled( true );
            btnPrevious.setEnabled( true ) ;
            btnNext.setEnabled( true );
            btnLast.setEnabled( true );
            btnURecord.setEnabled( true );
            btnDRecord.setEnabled( true );
            btnNRecord.setEnabled( true );

            btnSave.setEnabled( false );
            btnCancel.setEnabled( false );
            
            JOptionPane.showMessageDialog(ServiceForm.this, "Database Saved!");
            DoConnect();
      }
        catch (SQLException err){
            JOptionPane.showMessageDialog(ServiceForm.this, err.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        try {
        rs.first();      
        txtServiceID.setText(rs.getString("ServiceID"));       
        txtVehicleID.setText(rs.getString("VehicleID"));
        txtService.setText(rs.getString("ServiceName"));              
        
        
            
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
            java.util.logging.Logger.getLogger(ServiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDRecord;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNRecord;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnURecord;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private java.util.List<repairshop.Service> serviceList;
    private java.util.List<repairshop.Service> serviceList1;
    private javax.persistence.Query serviceQuery;
    private javax.persistence.Query serviceQuery1;
    private javax.swing.JTextArea txtService;
    private javax.swing.JTextField txtServiceID;
    private javax.swing.JTextField txtVehicleID;
    private java.util.List<repairshop.Vehicle> vehicleList;
    private javax.persistence.Query vehicleQuery;
    // End of variables declaration//GEN-END:variables
}