
package server;

import frame.main;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class serverConfig extends javax.swing.JFrame {

     public String serverIP ;
    public String userID ;
    public String passwordID ;

    
    public serverConfig() {
        initComponents();
        
        ImageIcon icon = new ImageIcon ("RMSLogo.png");
        setIconImage(icon.getImage());
        
   
    
        setTitle("Registrar Management System");
    }

    Connection conn;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        curvesPanel11 = new splashscreen.CurvesPanel1();
        jLabel4 = new javax.swing.JLabel();
        serverIP_txtfld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userID_txtfld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pass_txtfld = new javax.swing.JPasswordField();
        conect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RMS SERVER");

        serverIP_txtfld.setBackground(new java.awt.Color(255, 255, 255));
        serverIP_txtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverIP_txtfldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Server IP:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("User ID:");

        userID_txtfld.setBackground(new java.awt.Color(255, 255, 255));
        userID_txtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userID_txtfldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Password");

        pass_txtfld.setBackground(new java.awt.Color(255, 255, 255));
        pass_txtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_txtfldActionPerformed(evt);
            }
        });

        conect.setBackground(new java.awt.Color(255, 255, 255));
        conect.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        conect.setText("CONNECT");
        conect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        conect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout curvesPanel11Layout = new javax.swing.GroupLayout(curvesPanel11);
        curvesPanel11.setLayout(curvesPanel11Layout);
        curvesPanel11Layout.setHorizontalGroup(
            curvesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel11Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, curvesPanel11Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(curvesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(conect, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(curvesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userID_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(serverIP_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pass_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        curvesPanel11Layout.setVerticalGroup(
            curvesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel11Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serverIP_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userID_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(conect, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(curvesPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(curvesPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void conectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectActionPerformed
        serverCredentials sv = new serverCredentials();
        sv.setServerIP(serverIP_txtfld.getText());
        sv.setUserID(userID_txtfld.getText());
        sv.setPass(pass_txtfld.getText());

        serverIP = serverIP_txtfld.getText();
        userID = userID_txtfld.getText();
        passwordID = new String(pass_txtfld.getPassword());

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://" + sv.getServerIP() + "/bethel_registrar?allowMultiQueries=true", sv.getUserID(), sv.getPass());

            //            Class.forName("com.mysql.jdbc.Driver");
            //            conn = (Connection)  DriverManager.getConnection("jdbc:mysql://" + sv.getServerIP() + "/bethel_registrar?allowMultiQueries=true", sv.getUserID(), sv.getPass());
            //
            JOptionPane.showMessageDialog(this,"Connection Established!");

            main main = new main(this);
            main.forConnection(conn,serverIP,userID,passwordID);

            main.refreshArchiveTable();

            main.refreshStudentTable();
            main.refreshSections();
            main.refreshStrand();
            main.refreshTrack();
            main.clear();
            dispose();
            new splash.SplashScreen(null, true).setVisible(true);
            main.setVisible(true);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(serverConfig.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(serverConfig.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_conectActionPerformed

    private void serverIP_txtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverIP_txtfldActionPerformed
        userID_txtfld.requestFocusInWindow();
    }//GEN-LAST:event_serverIP_txtfldActionPerformed

    private void userID_txtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userID_txtfldActionPerformed
         pass_txtfld.requestFocusInWindow();
    }//GEN-LAST:event_userID_txtfldActionPerformed

    private void pass_txtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_txtfldActionPerformed
        conect.requestFocusInWindow();
    }//GEN-LAST:event_pass_txtfldActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton conect;
    private splashscreen.CurvesPanel1 curvesPanel11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass_txtfld;
    private javax.swing.JTextField serverIP_txtfld;
    private javax.swing.JTextField userID_txtfld;
    // End of variables declaration//GEN-END:variables
}
