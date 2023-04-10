/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hospital_MS;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Prakhar
 */
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form Doctor
     */
    public Doctor() {
        initComponents();
        selectional();
    }

    Connection con = null; 
    Statement st = null;
    ResultSet rs = null;
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jDIDLabel = new javax.swing.JLabel();
        jDNameLabel = new javax.swing.JLabel();
        jDPasswordLabel = new javax.swing.JLabel();
        jDExperienceLabel = new javax.swing.JLabel();
        docPass = new javax.swing.JTextField();
        docExp = new javax.swing.JTextField();
        docId = new javax.swing.JTextField();
        docName = new javax.swing.JTextField();
        jDoctorInfoLabel = new javax.swing.JLabel();
        docDelete = new javax.swing.JButton();
        docClear = new javax.swing.JButton();
        docAdd = new javax.swing.JButton();
        docUpdate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jDoctorListLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        docTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jDHomeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Management System");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Doctor");
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jDIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jDIDLabel.setText("ID:");

        jDNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jDNameLabel.setText("Name:");

        jDPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jDPasswordLabel.setText("Password:");

        jDExperienceLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jDExperienceLabel.setText("Experience:");

        docPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        docPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docPassActionPerformed(evt);
            }
        });

        docExp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        docId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        docName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        docName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docNameActionPerformed(evt);
            }
        });

        jDoctorInfoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jDoctorInfoLabel.setText("DOCTOR INFORMATION");

        docDelete.setBackground(new java.awt.Color(0, 0, 0));
        docDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        docDelete.setForeground(new java.awt.Color(255, 255, 255));
        docDelete.setText("DELETE");
        docDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        docDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docDeleteMouseClicked(evt);
            }
        });

        docClear.setBackground(new java.awt.Color(0, 0, 0));
        docClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        docClear.setForeground(new java.awt.Color(255, 255, 255));
        docClear.setText("CLEAR");
        docClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        docClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docClearMouseClicked(evt);
            }
        });

        docAdd.setBackground(new java.awt.Color(0, 0, 0));
        docAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        docAdd.setForeground(new java.awt.Color(255, 255, 255));
        docAdd.setText("ADD");
        docAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        docAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docAddMouseClicked(evt);
            }
        });

        docUpdate.setBackground(new java.awt.Color(0, 0, 0));
        docUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        docUpdate.setForeground(new java.awt.Color(255, 255, 255));
        docUpdate.setText("UPDATE");
        docUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        docUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docUpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDoctorInfoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(docName, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(docId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDExperienceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(docPass)
                    .addComponent(docExp, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(docAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(docUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(docDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(docClear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDoctorInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDPasswordLabel)
                            .addComponent(docPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDExperienceLabel)
                            .addComponent(docExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDIDLabel)
                            .addComponent(docId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDNameLabel)
                            .addComponent(docName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(docAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(docClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(docDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(docUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jDoctorListLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jDoctorListLabel.setForeground(new java.awt.Color(255, 255, 255));
        jDoctorListLabel.setText("DOSTORS LIST");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDoctorListLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDoctorListLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        docTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        docTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor ID", "Doctor Name", "Experience", "Password"
            }
        ));
        docTable.setRowHeight(25);
        docTable.setSelectionBackground(new java.awt.Color(0, 153, 153));
        docTable.setSelectionForeground(new java.awt.Color(51, 204, 255));
        docTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(docTable);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jDHomeButton.setBackground(new java.awt.Color(0, 0, 0));
        jDHomeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jDHomeButton.setForeground(new java.awt.Color(255, 255, 255));
        jDHomeButton.setText("HOME");
        jDHomeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDHomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDHomeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void connection(){
        try {
            //derbyclient.jar use to connect with the JDBC Java derby database and for table customization rsxml.jar is used 
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalDB","root","121");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void selectional(){
        try {
            connection();
            st = con.createStatement();
            rs = st.executeQuery("select * from DOCTORDB");
            docTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void docAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docAddMouseClicked
        if(docId.getText().isEmpty() || docName.getText().isEmpty() || docPass.getText().isEmpty() || docExp.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please fill all the details!");
            }
            else{
            try {
            //DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver()); // not usable
            connection();
            PreparedStatement add = con.prepareStatement("insert into DOCTORDB values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(docId.getText()));
            add.setString(2, docName.getText());
            add.setInt(3, Integer.valueOf(docExp.getText()));
            add.setString(4, docPass.getText());
            int row = add.executeUpdate();
            selectional();
            docId.setText("");
            docName.setText("");
            docPass.setText("");
            docExp.setText("");
            docId.requestFocus();
            JOptionPane.showMessageDialog(this, "Doctor Added Successfully");
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Doctor ID Already Exist!");
            ex.printStackTrace();
        }
            }
        
    }//GEN-LAST:event_docAddMouseClicked

    private void docPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docPassActionPerformed

    private void docNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docNameActionPerformed

    private void docClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docClearMouseClicked
        // TODO add your handling code here:
        docId.setText("");
        docName.setText("");
        docPass.setText("");
        docExp.setText("");
        docId.requestFocus();
    }//GEN-LAST:event_docClearMouseClicked

    private void docTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)docTable.getModel();
        int index = docTable.getSelectedRow();
        docId.setText(model.getValueAt(index, 0).toString());
        docName.setText(model.getValueAt(index, 1).toString());
        docExp.setText(model.getValueAt(index, 2).toString());
        docPass.setText(model.getValueAt(index, 3).toString());
    }//GEN-LAST:event_docTableMouseClicked

    private void docDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docDeleteMouseClicked
        // TODO add your handling code here:
        if(docId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please select a valid ID to delete!");
        }
        else{
            try {
                connection();
                String id = docId.getText();
                String query = "delete from DOCTORDB where DOCID="+id;
                PreparedStatement ps = con.prepareStatement(query);
                ps.executeUpdate();
                selectional();
                docId.setText("");
                docName.setText("");
                docPass.setText("");
                docExp.setText("");
                docId.requestFocus();
                JOptionPane.showMessageDialog(this, "Doctor Successfully Deleted!");
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_docDeleteMouseClicked

    private void docUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docUpdateMouseClicked
        // TODO add your handling code here:
        if(docId.getText().isEmpty() || docName.getText().isEmpty() || docExp.getText().isEmpty() || docPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Information Missing!");
        }
        else{
            connection();
            try {
                String query = "update DOCTORDB set DOCNAME='"+docName.getText().toString()+"'"+", DOCEXP="+docExp.getText().toString()+", DOCPASS='"+docPass.getText().toString()+"'"+" where DOCID="+docId.getText();
                PreparedStatement ps = con.prepareStatement(query);
                ps.executeUpdate();
                selectional();
                docId.setText("");
                docName.setText("");
                docPass.setText("");
                docExp.setText("");
                docId.requestFocus();
                JOptionPane.showMessageDialog(this, "Update Successfull!");
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_docUpdateMouseClicked

    private void jDHomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDHomeButtonMouseClicked
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Do you want to continue!", "Confirm?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION){
            new HospitalForm().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jDHomeButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton docAdd;
    private javax.swing.JButton docClear;
    private javax.swing.JButton docDelete;
    private javax.swing.JTextField docExp;
    private javax.swing.JTextField docId;
    private javax.swing.JTextField docName;
    private javax.swing.JTextField docPass;
    private javax.swing.JTable docTable;
    private javax.swing.JButton docUpdate;
    private javax.swing.JLabel jDExperienceLabel;
    private javax.swing.JButton jDHomeButton;
    private javax.swing.JLabel jDIDLabel;
    private javax.swing.JLabel jDNameLabel;
    private javax.swing.JLabel jDPasswordLabel;
    private javax.swing.JLabel jDoctorInfoLabel;
    private javax.swing.JLabel jDoctorListLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
