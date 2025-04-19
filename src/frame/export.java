/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author GodisGood
 */
public class export extends javax.swing.JFrame {

    Connection con; //sql
    PreparedStatement pts; //sql

     Statement st;
        ResultSet rs;
    
    
    public void Connect() {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bethel_registrar?allowMultiQueries=true", "root", "");
            st = con.createStatement();
            System.out.println("Successfully connected to the database");
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Failed to connect to the database");
        }
    }
    
    public export() {
        initComponents();
        ImageIcon icon = new ImageIcon ("RMSLogo.png");
        setIconImage(icon.getImage());
        setTitle("export");
        Connect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        students = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Please select the data to be exported");

        students.setBackground(new java.awt.Color(133, 196, 255));
        students.setForeground(new java.awt.Color(0, 0, 0));
        students.setText("Student Table");
        students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(133, 196, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Archive Table");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(170, 170, 170));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("*When typing the Excel file name, don't forget to add \".xlsx\" at the end of the name.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(students, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(students, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

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

    private void studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsActionPerformed
        exportFromDatabaseToExcel();
        
    }//GEN-LAST:event_studentsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        exportFromDatabaseToExcel2();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton students;
    // End of variables declaration//GEN-END:variables

    
    public void exportFromDatabaseToExcel() {
    try {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Excel File");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files", "xlsx"));
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String excelFilePath = fileToSave.getAbsolutePath();

            String backup ="INSERT INTO excel_backup \n" +
"(`lrn`, `fname`, `mname`, `lname`, `placeofbirth`, `birthday`, `father`, `fathernumber`, `fatheroccupation`, `mother`, `mothernumber`, `motheroccupation`, `familyreligion`, `grade`, `section`, `track`, `strand`, `callname`, `address`)\n" +
"SELECT `lrn`, `fname`, `mname`, `lname`, `placeofbirth`, `birthday`, `father`, `fathernumber`, `fatheroccupation`, `mother`, `mothernumber`, `motheroccupation`, `familyreligion`, `grade`, `section`, `track`, `strand`, `callname`, `address` \n" +
"FROM students;";
            
            PreparedStatement a = con.prepareStatement(backup);
            a.executeUpdate();
            
            String sql = "SELECT * FROM excel_backup";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Students");

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Create header row
            XSSFRow headerRow = sheet.createRow(0);
            for (int col = 1; col <= columnCount; col++) {
                headerRow.createCell(col - 1).setCellValue(metaData.getColumnName(col));
            }

            // Create data rows
            int rowNum = 1;
            while (rs.next()) {
                XSSFRow row = sheet.createRow(rowNum++);
                for (int col = 1; col <= columnCount; col++) {
                    row.createCell(col - 1).setCellValue(rs.getString(col));
                }
            }

            // Write the workbook to the output file
            try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
                workbook.write(outputStream);
            }

            JOptionPane.showMessageDialog(null, "Export Successful");
        }
        
         String aa = "DELETE FROM excel_backup";
    PreparedStatement a = con.prepareStatement(aa);
    a.executeUpdate();
    } catch (SQLException | IOException e) {
        JOptionPane.showMessageDialog(null, "Error exporting data: " + e.getMessage());
    }
    
   
}
    
    
    
    
    
    
    
    
    
    
    
    public void exportFromDatabaseToExcel2() {
    try {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Excel File");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files", "xlsx"));
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String excelFilePath = fileToSave.getAbsolutePath();

            String backup ="INSERT INTO excel_backup \n" +
"(`lrn`, `fname`, `mname`, `lname`, `placeofbirth`, `birthday`, `father`, `fathernumber`, `fatheroccupation`, `mother`, `mothernumber`, `motheroccupation`, `familyreligion`, `grade`, `section`, `track`, `strand`, `callname`, `address`)\n" +
"SELECT `lrn`, `fname`, `mname`, `lname`, `placeofbirth`, `birthday`, `father`, `fathernumber`, `fatheroccupation`, `mother`, `mothernumber`, `motheroccupation`, `familyreligion`, `grade`, `section`, `track`, `strand`, `callname`, `address` \n" +
"FROM archive_students;";
            
            PreparedStatement a = con.prepareStatement(backup);
            a.executeUpdate();
            
            String sql = "SELECT * FROM excel_backup";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Students");

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Create header row
            XSSFRow headerRow = sheet.createRow(0);
            for (int col = 1; col <= columnCount; col++) {
                headerRow.createCell(col - 1).setCellValue(metaData.getColumnName(col));
            }

            // Create data rows
            int rowNum = 1;
            while (rs.next()) {
                XSSFRow row = sheet.createRow(rowNum++);
                for (int col = 1; col <= columnCount; col++) {
                    row.createCell(col - 1).setCellValue(rs.getString(col));
                }
            }

            // Write the workbook to the output file
            try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
                workbook.write(outputStream);
            }
            

            JOptionPane.showMessageDialog(null, "Export Successful");
        }
        
         String aa = "DELETE FROM excel_backup";
    PreparedStatement a = con.prepareStatement(aa);
    a.executeUpdate();
    } catch (SQLException | IOException e) {
        JOptionPane.showMessageDialog(null, "Error exporting data: " + e.getMessage());
    }
    
   
}




}
