
package frame;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSetMetaData;
import javax.swing.JFrame;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import server.serverCredentials;

public class excel extends javax.swing.JFrame {
    
     Statement st;
        ResultSet rs;

    Connection con; //sql
    PreparedStatement pts; //sql
    private final main mainInstance;
    
    
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
    
    
File file = null;
String filepath = null;
   


    public excel(main mainInstance) {
        initComponents();
        ImageIcon icon = new ImageIcon ("RMSLogo.png");
        setIconImage(icon.getImage());
        this.mainInstance = mainInstance;
        setTitle("import");
        
        Connect();
        
         setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // Add a WindowListener to handle the closing event
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                // Hide the frame instead of closing
                del();
                setVisible(false);
            }
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        pathTXT = new javax.swing.JTextField();
        select = new javax.swing.JButton();
        ImportBT = new javax.swing.JButton();
        importscroll = new javax.swing.JScrollPane();
        ImportTable = new javax.swing.JTable();
        removeBT = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        add_id = new javax.swing.JLabel();
        add_user = new javax.swing.JLabel();
        add_pass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));

        pathTXT.setEditable(false);
        pathTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathTXTActionPerformed(evt);
            }
        });

        select.setBackground(new java.awt.Color(51, 153, 255));
        select.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        select.setForeground(new java.awt.Color(255, 255, 255));
        select.setText("Select a File");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        ImportBT.setBackground(new java.awt.Color(0, 204, 102));
        ImportBT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ImportBT.setForeground(new java.awt.Color(255, 255, 255));
        ImportBT.setText("IMPORT");
        ImportBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportBTActionPerformed(evt);
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
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ImportTable.getTableHeader().setReorderingAllowed(false);
        importscroll.setViewportView(ImportTable);

        removeBT.setBackground(new java.awt.Color(255, 255, 255));
        removeBT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        removeBT.setForeground(new java.awt.Color(0, 0, 0));
        removeBT.setText("Remove Row");
        removeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBTActionPerformed(evt);
            }
        });

        add_id.setText("id");

        add_user.setText("user");

        add_pass.setText("pass");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_id)
                .addGap(18, 18, 18)
                .addComponent(add_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add_user, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_pass)
                    .addComponent(add_user, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_id))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImportBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                        .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pathTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeBT)))
                .addContainerGap())
            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainpanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(importscroll, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(select, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pathTXT)
                                .addComponent(removeBT, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                .addComponent(ImportBT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainpanelLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(importscroll, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addGap(48, 48, 48)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ImportBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportBTActionPerformed
  
        moveDatabase();
        
        if (exit == 1){
        dispose();
        }
        
        
        mainInstance.refreshStudentTable();
    }//GEN-LAST:event_ImportBTActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        importExcelToJtableJava();
        importToDatabase();
        
    }//GEN-LAST:event_selectActionPerformed

    private void pathTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathTXTActionPerformed

    private void removeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBTActionPerformed
   remove();
    }//GEN-LAST:event_removeBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ImportBT;
    private javax.swing.JTable ImportTable;
    public javax.swing.JLabel add_id;
    public javax.swing.JLabel add_pass;
    public javax.swing.JLabel add_user;
    private javax.swing.JScrollPane importscroll;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField pathTXT;
    private javax.swing.JButton removeBT;
    private javax.swing.JButton select;
    // End of variables declaration//GEN-END:variables

    public void remove(){
          DefaultTableModel model = (DefaultTableModel) ImportTable.getModel();
    int selectedRow = ImportTable.getSelectedRow();
    if (selectedRow != -1) {
        String studentID = ImportTable.getValueAt(selectedRow, 4).toString(); 
        try {
            String sql = "DELETE FROM `excel_student_table` WHERE lrn = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, studentID);
            int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Selected Row: " + selectedRow); //debugging
                model.removeRow(selectedRow);
                System.out.println("Row deleted successfully!");
            } else {
                System.out.println("No rows deleted!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    
public void importExcelToJtableJava() {

    DefaultTableModel model = (DefaultTableModel) ImportTable.getModel();

    File f = null;
    String paths = null;
    File excelFile;
    FileInputStream excelFIS = null;
    BufferedInputStream excelBIS = null;
    XSSFWorkbook excelImportToJTable = null;

    JFileChooser excelFileChooser = new JFileChooser();
    excelFileChooser.setDialogTitle("Select Excel File");
    FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
    excelFileChooser.setFileFilter(fnef);
    int excelChooser = excelFileChooser.showOpenDialog(null);
    if (excelChooser == JFileChooser.APPROVE_OPTION) {

        f = excelFileChooser.getSelectedFile();
        paths = f.getAbsolutePath();
        pathTXT.setText(paths);

        try {
            excelFile = excelFileChooser.getSelectedFile();
            excelFIS = new FileInputStream(excelFile);
            excelBIS = new BufferedInputStream(excelFIS);
            excelImportToJTable = new XSSFWorkbook(excelBIS);
            XSSFSheet excelSheet = excelImportToJTable.getSheetAt(0);

            for (int row = 0; row <= excelSheet.getLastRowNum(); row++) {
                XSSFRow excelRow = excelSheet.getRow(row);

                XSSFCell grade = excelRow.getCell(0);
                XSSFCell sec = excelRow.getCell(1);
                
                
                XSSFCell track = excelRow.getCell(2);
                XSSFCell strand = excelRow.getCell(3);
                
                XSSFCell lrn = excelRow.getCell(4);
                XSSFCell num = excelRow.getCell(5);
                
                
                XSSFCell last = excelRow.getCell(6);
                XSSFCell first = excelRow.getCell(7);
                XSSFCell mid = excelRow.getCell(8);
                XSSFCell call = excelRow.getCell(9);
                XSSFCell date = excelRow.getCell(10);
                XSSFCell place = excelRow.getCell(11);
                XSSFCell add = excelRow.getCell(12);
                XSSFCell father = excelRow.getCell(13);
                XSSFCell fathernum = excelRow.getCell(14);
                XSSFCell focc = excelRow.getCell(15);
                XSSFCell mother = excelRow.getCell(16);
                XSSFCell mothernum = excelRow.getCell(17);
                XSSFCell mocc = excelRow.getCell(18);
                XSSFCell re = excelRow.getCell(19);
                
                XSSFCell guard = excelRow.getCell(20);
                XSSFCell guardnum = excelRow.getCell(21);
                
                
                
                
                

               model.addRow(new Object[]{
                    getStringCellValue(grade),
                    getStringCellValue(sec),
                    getStringCellValue(track),
                    getStringCellValue(strand),
                    getStringCellValue(lrn),
                    getStringCellValue(num),
                    getStringCellValue(last),
                    getStringCellValue(first),
                    getStringCellValue(mid),
                    getStringCellValue(call),
                    getStringCellValue(date),
                    getStringCellValue(place),
                    getStringCellValue(add),
                    getStringCellValue(father),
                    getStringCellValue(fathernum),
                    getStringCellValue(focc),
                    getStringCellValue(mother),
                    getStringCellValue(mothernum),
                    getStringCellValue(mocc),
                    getStringCellValue(re),
                    getStringCellValue(guard),
                    getStringCellValue(guardnum)
                });
            }

        } catch (IOException iOException) {
            JOptionPane.showMessageDialog(null, iOException.getMessage());
        } finally {
            try {
                if (excelFIS != null) {
                    excelFIS.close();
                }
                if (excelBIS != null) {
                    excelBIS.close();
                }
                if (excelImportToJTable != null) {
                    excelImportToJTable.close();
                }
            } catch (IOException iOException) {
                JOptionPane.showMessageDialog(null, iOException.getMessage());
            }
        }
    }
}

// Helper method to get string cell value
private String getStringCellValue(XSSFCell cell) {
    if (cell == null) {
        return "";
    }
    cell.setCellType(CellType.STRING);
    return cell.getStringCellValue();
}

public void importToDatabase() {
        try {
            
            Statement stmt = con.createStatement();
            stmt.execute("TRUNCATE TABLE excel_student_table");
          
            String sql = "INSERT INTO excel_student_table ( `lrn`, `fname`, `mname`, `lname`, `placeofbirth`, `birthday`, `father`, `fathernumber`, `fatheroccupation`, `mother`, `mothernumber`, `motheroccupation`, `familyreligion`, `grade`, `section`, `track`, `strand`, `callname`, `address`, `imageNameform`, `imageNamebirth`, `imageNamek1`, `imageNamek2`, `imageName1`, `imageName2`, `imageName3`, `imageName4`, `imageName5`, `imageName6`, `imageName7`, `imageName8`, `imageName9`, `imageName10`, `imageName11`, `imageName12`, `imagePathform`, `imagePathbirth`, `imagePathk1`, `imagePathk2`, `imagePath1`, `imagePath2`, `imagePath3`, `imagePath4`, `imagePath5`, `imagePath6`, `imagePath7`, `imagePath8`, `imagePath9`, `imagePath10`, `imagePath11`, `imagePath12`, `imageFileform`, `imageFilebirth`, `imageFilek1`, `imageFilek2`, `imageFile1`, `imageFile2`, `imageFile3`, `imageFile4`, `imageFile5`, `imageFile6`, `imageFile7`, `imageFile8`, `imageFile9`, `imageFile10`, `imageFile11`, `imageFile12`,`number`,`guardian`,`guardiannum`,`imageNameEnroll`,`imagePathEnroll`,`imageFileEnroll`) SELECT ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            
            for (int row = 0; row < ImportTable.getRowCount(); row++) {
                pstmt.setString(1, ImportTable.getValueAt(row, 4).toString());//lrn
                pstmt.setString(2, ImportTable.getValueAt(row, 7).toString());//fname
                pstmt.setString(3, ImportTable.getValueAt(row, 8).toString());//mname
                pstmt.setString(4, ImportTable.getValueAt(row, 6).toString());//lname
                pstmt.setString(5, ImportTable.getValueAt(row, 11).toString());//place
                pstmt.setString(6, ImportTable.getValueAt(row, 10).toString());//birth
                pstmt.setString(7, ImportTable.getValueAt(row, 13).toString());//father
                pstmt.setString(8, ImportTable.getValueAt(row, 14).toString());//fathernum
                pstmt.setString(9, ImportTable.getValueAt(row, 15).toString());//father job
                pstmt.setString(10, ImportTable.getValueAt(row, 16).toString());//mom
                pstmt.setString(11, ImportTable.getValueAt(row, 17).toString());//mom num
                pstmt.setString(12, ImportTable.getValueAt(row, 18).toString());//mom job
                pstmt.setString(13, ImportTable.getValueAt(row, 19).toString());//religion
                pstmt.setString(14, ImportTable.getValueAt(row, 0).toString());//grade
                pstmt.setString(15, ImportTable.getValueAt(row, 1).toString());//section
                pstmt.setString(16, ImportTable.getValueAt(row, 2).toString());//track
                pstmt.setString(17, ImportTable.getValueAt(row, 3).toString());//strand
                pstmt.setString(18, ImportTable.getValueAt(row, 9).toString());//callname
                pstmt.setString(19, ImportTable.getValueAt(row, 12).toString());//address
                
                
              
                pstmt.setString(20, "");
                pstmt.setString(21, "");
                pstmt.setString(22, "");
                pstmt.setString(23, "");
                pstmt.setString(24, "");
                pstmt.setString(25, "");
                pstmt.setString(26, "");
                pstmt.setString(27, "");
                pstmt.setString(28, "");
                pstmt.setString(29, "");
                pstmt.setString(30, "");
                pstmt.setString(31, "");
                pstmt.setString(32, "");
                pstmt.setString(33, "");
                pstmt.setString(34, "");
                pstmt.setString(35, "");
                pstmt.setString(36, "");
                pstmt.setString(37, "");
                pstmt.setString(38, "");
                pstmt.setString(39, "");
                pstmt.setString(40, "");
                pstmt.setString(41, "");
                pstmt.setString(42, "");
                pstmt.setString(43, "");
                pstmt.setString(44, "");
                pstmt.setString(45, "");
                pstmt.setString(46, "");
                pstmt.setString(47, "");
                pstmt.setString(48, "");
                pstmt.setString(49, "");
                pstmt.setString(50, "");
                pstmt.setString(51, "");
                pstmt.setString(52, "");
                pstmt.setString(53, "");
                pstmt.setString(54, "");
                pstmt.setString(55, "");
                pstmt.setString(56, "");
                pstmt.setString(57, "");
                pstmt.setString(58, "");
                pstmt.setString(59, "");
                pstmt.setString(60, "");
                pstmt.setString(61, "");
                pstmt.setString(62, "");
                pstmt.setString(63, "");
                pstmt.setString(64, "");
                pstmt.setString(65, "");
                pstmt.setString(66, "");
                pstmt.setString(67, "");
                
                pstmt.setString(68, ImportTable.getValueAt(row, 5).toString());
                pstmt.setString(69, ImportTable.getValueAt(row, 20).toString());
                pstmt.setString(70, ImportTable.getValueAt(row, 21).toString());
                
                pstmt.setString(71, "");
                pstmt.setString(72, "");
                pstmt.setString(73, "");
            
    
                pstmt.addBatch();
            }
            
            
            
            // Execute batch insert
            pstmt.executeBatch();
            
            
            
         
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }          


private int exit =0;
    public void moveDatabase() {
        //String move =  "INSERT INTO test SELECT lrn, fname, mname, lname, placeofbirth, birthday, father, fathernumber, fatheroccupation, mother, mothernumber, motheroccupation, familyreligion, grade, section, track, strand, callname, address, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL , NULL , NULL , NULL , NULL , NULL , NULL , NULL , NULL , NULL FROM excel_student_table;";
        String move = "INSERT INTO students SELECT * FROM excel_student_table; DELETE FROM excel_student_table;";
        
        try {
            PreparedStatement pstmt = con.prepareStatement(move);
            pstmt.executeUpdate();
            
        
            JOptionPane.showMessageDialog(null, " IMPORT SUCCESSFUL " );
            exit = 1;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error moving data: " + e.getMessage());
        }
    }
    
    
     public void del() {
        //String move =  "INSERT INTO test SELECT lrn, fname, mname, lname, placeofbirth, birthday, father, fathernumber, fatheroccupation, mother, mothernumber, motheroccupation, familyreligion, grade, section, track, strand, callname, address, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL , NULL , NULL , NULL , NULL , NULL , NULL , NULL , NULL , NULL FROM excel_student_table;";
        String move = "DELETE FROM excel_student_table;";
        
        try {
            PreparedStatement pstmt = con.prepareStatement(move);
            pstmt.executeUpdate();
            
        
        

            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error moving data: " + e.getMessage());
        }
    }
    



}
