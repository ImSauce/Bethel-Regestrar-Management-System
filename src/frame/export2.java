
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
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import server.serverCredentials;


public class export2 extends javax.swing.JFrame {

    Connection con; //sql
    PreparedStatement pts; //sql

     Statement st;
        ResultSet rs;
    
    
    public void forConnection(Connection conn, String serverIP,String userID ,String passwordID){
        
        add_user.setText(userID);
        
        add_id.setText(serverIP);
        add_pass.setText(passwordID);
        
       Connect();
        
 
    }
    
     public void Connect() {
        serverCredentials sv = new serverCredentials();
        sv.setServerIP(mainInstance.id.getText());
        sv.setUserID(mainInstance.username.getText());
        sv.setPass(mainInstance.password.getText());
        
        
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://"+sv.getServerIP() +"/bethel_registrar?allowMultiQueries=true", sv.getUserID(), sv.getPass());
            
            System.out.println(con+"sadasd");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
     
      private final main mainInstance;
    
    public export2(main mainInstance) {
        initComponents();
        this.mainInstance = mainInstance;
        ImageIcon icon = new ImageIcon ("RMSLogo.png");
        setIconImage(icon.getImage());
        setTitle("export");
        Connect();
        
        refreshArchiveTable();
        refreshStudentTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        students = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        importscroll = new javax.swing.JScrollPane();
        ImportTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        importscroll2 = new javax.swing.JScrollPane();
        ImportTableArchive = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        add_id = new javax.swing.JLabel();
        add_user = new javax.swing.JLabel();
        add_pass = new javax.swing.JLabel();

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

        ImportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grade", "Section", "Track", "Strand", "LRN", "Student Number", "Last Name", "First Name", "Middle Name", "Call Name", "Date of Birth", "Place of Birth", "Address", "Father", "Father #", "Father Occupation", "Mother", "Mother #", "Mother Occupation", "Religion", "Guardian", "Guardian #"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ImportTable.getTableHeader().setReorderingAllowed(false);
        importscroll.setViewportView(ImportTable);

        jLabel2.setForeground(new java.awt.Color(170, 170, 170));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("*Exporting Excel files does not include saving images.");

        ImportTableArchive.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grade", "Section", "Track", "Strand", "LRN", "Student Number", "Last Name", "First Name", "Middle Name", "Call Name", "Date of Birth", "Place of Birth", "Address", "Father", "Father #", "Father Occupation", "Mother", "Mother #", "Mother Occupation", "Religion", "Guardian", "Guardian #"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ImportTableArchive.getTableHeader().setReorderingAllowed(false);
        importscroll2.setViewportView(ImportTableArchive);

        add_id.setText("id");

        add_user.setText("user");

        add_pass.setText("pass");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_id)
                .addGap(18, 18, 18)
                .addComponent(add_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add_user, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_pass)
                    .addComponent(add_user, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_id))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(students, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(importscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(importscroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(409, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(454, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(students, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(importscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(145, Short.MAX_VALUE)
                    .addComponent(importscroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(101, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsActionPerformed
        exportJTableToExcel();
      
        
    }//GEN-LAST:event_studentsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     exportJTableToExcel2();
    
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ImportTable;
    private javax.swing.JTable ImportTableArchive;
    public javax.swing.JLabel add_id;
    public javax.swing.JLabel add_pass;
    public javax.swing.JLabel add_user;
    private javax.swing.JScrollPane importscroll;
    private javax.swing.JScrollPane importscroll2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton students;
    // End of variables declaration//GEN-END:variables

    
    
public void refreshArchiveTable() {
    String sql = "SELECT * FROM archive_students";

    
    try {
        DefaultTableModel model = (DefaultTableModel) ImportTableArchive.getModel();
        model.setRowCount(0);
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
 
    while (rs.next()) {
 
        model.addRow(new Object[] {

             rs.getString(14),
            rs.getString(15),
            rs.getString(16),
            rs.getString(17),
            rs.getString(1),
            rs.getString(68),
            rs.getString(4),
            rs.getString(2),
            rs.getString(3),
            rs.getString(18),
            rs.getString(6),
            rs.getString(5),
            rs.getString(19),
             rs.getString(7),
            rs.getString(8),
            rs.getString(9),
            rs.getString(10),
            rs.getString(11),
            rs.getString(12),
            rs.getString(13),
            rs.getString(69),
            rs.getString(70),

        });
    }
   
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}


    
public void refreshStudentTable() {
    String sql = "SELECT * FROM students";

    
    try {
        DefaultTableModel model = (DefaultTableModel) ImportTable.getModel();
        model.setRowCount(0);
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
 
    while (rs.next()) {
 
        model.addRow(new Object[] {

             rs.getString(14),
            rs.getString(15),
            rs.getString(16),
            rs.getString(17),
            rs.getString(1),
            rs.getString(68),
            rs.getString(4),
            rs.getString(2),
            rs.getString(3),
            rs.getString(18),
            rs.getString(6),
            rs.getString(5),
            rs.getString(19),
             rs.getString(7),
            rs.getString(8),
            rs.getString(9),
            rs.getString(10),
            rs.getString(11),
            rs.getString(12),
            rs.getString(13),
            rs.getString(69),
            rs.getString(70),

        });
    }
   
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}


    
    public void exportJTableToExcel() {
    JFileChooser excelFileChooser = new JFileChooser();
    excelFileChooser.setDialogTitle("Save As Excel File");
    excelFileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files", "xls", "xlsx", "xlsm"));
    int excelChooser = excelFileChooser.showSaveDialog(null);
    if (excelChooser == JFileChooser.APPROVE_OPTION) {
        XSSFWorkbook excelExport = new XSSFWorkbook();
        XSSFSheet excelSheet = excelExport.createSheet("Sheet1");
        DefaultTableModel model = (DefaultTableModel) ImportTable.getModel();

        // Create header row
        XSSFRow header = excelSheet.createRow(0);
        for (int i = 0; i < model.getColumnCount(); i++) {
            XSSFCell cell = header.createCell(i);
            cell.setCellValue(model.getColumnName(i));
        }

        // Fill data rows
        for (int row = 0; row < model.getRowCount(); row++) {
            XSSFRow excelRow = excelSheet.createRow(row + 1);
            for (int col = 0; col < model.getColumnCount(); col++) {
                XSSFCell cell = excelRow.createCell(col);
                cell.setCellValue(model.getValueAt(row, col).toString());
            }
        }

        try {
            FileOutputStream excelFOS = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
            excelExport.write(excelFOS);
            excelExport.close();
            excelFOS.close();
            JOptionPane.showMessageDialog(null, "Data exported successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error exporting data: " + e.getMessage());
        }
    }
}
    

    
    public void exportJTableToExcel2() {
    JFileChooser excelFileChooser = new JFileChooser();
    excelFileChooser.setDialogTitle("Save As Excel File");
    excelFileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files", "xls", "xlsx", "xlsm"));
    int excelChooser = excelFileChooser.showSaveDialog(null);
    if (excelChooser == JFileChooser.APPROVE_OPTION) {
        XSSFWorkbook excelExport = new XSSFWorkbook();
        XSSFSheet excelSheet = excelExport.createSheet("Sheet1");
        DefaultTableModel model = (DefaultTableModel) ImportTableArchive.getModel();

        // Create header row
        XSSFRow header = excelSheet.createRow(0);
        for (int i = 0; i < model.getColumnCount(); i++) {
            XSSFCell cell = header.createCell(i);
            cell.setCellValue(model.getColumnName(i));
        }

        // Fill data rows
        for (int row = 0; row < model.getRowCount(); row++) {
            XSSFRow excelRow = excelSheet.createRow(row + 1);
            for (int col = 0; col < model.getColumnCount(); col++) {
                XSSFCell cell = excelRow.createCell(col);
                cell.setCellValue(model.getValueAt(row, col).toString());
            }
        }

        try {
            FileOutputStream excelFOS = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
            excelExport.write(excelFOS);
            excelExport.close();
            excelFOS.close();
            JOptionPane.showMessageDialog(null, "Data exported successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error exporting data: " + e.getMessage());
        }
    }
}
    



}
