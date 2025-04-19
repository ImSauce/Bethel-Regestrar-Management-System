
package frame;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
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
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import server.serverCredentials;
import server.serverConfig;

public class main extends javax.swing.JFrame {
  
    public String serverIP ;
    public String userID ;
    public String passwordID ;

File f_form = null;
String path_form = null;

File f_birth = null;
String path_birth = null;

File f_k1 = null;
String path_k1 = null;

File f_k2 = null;
String path_k2 = null;

File f1 = null;
String path1 = null;

File f2 = null;
String path2 = null;

File f3 = null;
String path3 = null;

File f4 = null;
String path4 = null;

File f5 = null;
String path5 = null;

File f6 = null;
String path6 = null;

File f7 = null;
String path7 = null;

File f8 = null;
String path8 = null;

File f9 = null;
String path9 = null;

File f10 = null;
String path10 = null;

File f11 = null;
String path11 = null;

File f12 = null;
String path12 = null; 


   
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    
    String url= "jdbc:mysql://localhost/bethel_registrar?allowMultiQueries=true";
        String user = "root";
        String pass= "";
        
        Statement st;
        ResultSet rs;

    Connection con; //sql
    PreparedStatement pts; //sql
    
    
    
     
    
    public void forConnection(Connection conn, String serverIP,String userID ,String passwordID){
        
        username.setText(userID);
        id.setText(serverIP);
        password.setText(passwordID);
        
       connect();
        
 
    }
    
    
    public void connect() {
        serverCredentials sv = new serverCredentials();
        sv.setServerIP(id.getText());
        sv.setUserID(username.getText());
        sv.setPass(password.getText());
        
        serverIP = id.getText();
        userID = username.getText();
        passwordID =  password.getText();
        
        
        
        
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
    
//    
//    public void Connect() {
//        try {
//            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bethel_registrar?allowMultiQueries=true", "root", "");
//            st = con.createStatement();
//            System.out.println("Successfully connected to the database");
//        } catch (SQLException ex) {
//            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Failed to connect to the database");
//        }
//    }
    
 

    private final serverConfig loginInstance ;
    
    public main(serverConfig loginInstance) {
        initComponents();
        
         username.setText(loginInstance.userID);
        id.setText(loginInstance.serverIP);
        password.setText(loginInstance.passwordID);
        
        this.loginInstance = loginInstance;
        
        
        
        
         StudentTable.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent me){
            if(SwingUtilities.isRightMouseButton(me)) {
               
                  view_info();
            }
        }
    });
         
         
           ArchiveTable.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent me){
            if(SwingUtilities.isRightMouseButton(me)) {
               
                  view_archive_info();
            }
        }
    });
        
        ImageIcon icon = new ImageIcon ("RMSLogo.png");
        setIconImage(icon.getImage());
        
        setExtendedState(MAXIMIZED_BOTH);
    
        setTitle("Registrar Management System");
        
        
        
        
        System.out.println(con);
//        refreshArchiveTable();
//   
//        refreshStudentTable();
//        refreshSections();
//        refreshStrand();
//        refreshTrack();
//        clear();
        
        StudentTable.setShowGrid(true);
        ArchiveTable.setShowGrid(true);
        
        
        SectionTable.setShowGrid(true);
        StrandTable.setShowGrid(true);
        TrackTable.setShowGrid(true);
        
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Set the cell renderer for each column in the table
//        for (int i = 0; i < GradesTable.getColumnCount(); i++) {
//            GradesTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
//        } 
        for (int i = 0; i < SectionTable.getColumnCount(); i++) {
            SectionTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        for (int i = 0; i < StrandTable.getColumnCount(); i++) {
            StrandTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        for (int i = 0; i < TrackTable.getColumnCount(); i++) {
            TrackTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        addGradesBtn = new javax.swing.JButton();
        archiveBtn = new javax.swing.JButton();
        importBtn = new javax.swing.JButton();
        addStudentBtn = new javax.swing.JButton();
        studentTablepanel = new javax.swing.JButton();
        importBtn1 = new javax.swing.JButton();
        GradeUpdateBT = new javax.swing.JButton();
        GradeUpdateBT1 = new javax.swing.JButton();
        layers = new javax.swing.JLayeredPane();
        StudentPanel = new javax.swing.JPanel();
        studenttablescroll = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        ArchiveBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        deleteBT = new javax.swing.JButton();
        sortstudent = new javax.swing.JComboBox<>();
        password = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        GradePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        newSectionTXT = new javax.swing.JTextField();
        removeSectionBT = new javax.swing.JButton();
        addSectionBT = new javax.swing.JButton();
        gradescroll1 = new javax.swing.JScrollPane();
        SectionTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        newStrandTXT = new javax.swing.JTextField();
        removeStrandBT = new javax.swing.JButton();
        addStrandBT = new javax.swing.JButton();
        gradescroll2 = new javax.swing.JScrollPane();
        StrandTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        newTrackTXT = new javax.swing.JTextField();
        removeTrackBT = new javax.swing.JButton();
        addTrackBT = new javax.swing.JButton();
        gradescroll3 = new javax.swing.JScrollPane();
        TrackTable = new javax.swing.JTable();
        ArchivePanel = new javax.swing.JPanel();
        deleteArchiveBT = new javax.swing.JButton();
        RestoreArchiveBT = new javax.swing.JButton();
        sortstudentarchive = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        searchTXTarchive = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        studenttablescroll1 = new javax.swing.JScrollPane();
        ArchiveTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));

        headerPanel.setBackground(new java.awt.Color(153, 204, 255));
        headerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addGradesBtn.setBackground(new java.awt.Color(51, 104, 211));
        addGradesBtn.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        addGradesBtn.setForeground(new java.awt.Color(255, 255, 255));
        addGradesBtn.setText("Add Sections/Strand/Track");
        addGradesBtn.setAutoscrolls(true);
        addGradesBtn.setBorderPainted(false);
        addGradesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addGradesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGradesBtngoToStudentsPanel(evt);
            }
        });

        archiveBtn.setBackground(new java.awt.Color(51, 104, 211));
        archiveBtn.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        archiveBtn.setForeground(new java.awt.Color(255, 255, 255));
        archiveBtn.setText("Archive");
        archiveBtn.setAutoscrolls(true);
        archiveBtn.setBorderPainted(false);
        archiveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        archiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archiveBtngoToStudentsPanel(evt);
            }
        });

        importBtn.setBackground(new java.awt.Color(51, 104, 211));
        importBtn.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        importBtn.setForeground(new java.awt.Color(255, 255, 255));
        importBtn.setText("Import from .xlsx");
        importBtn.setAutoscrolls(true);
        importBtn.setBorderPainted(false);
        importBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        importBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importBtnActionPerformed(evt);
            }
        });

        addStudentBtn.setBackground(new java.awt.Color(153, 102, 255));
        addStudentBtn.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        addStudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        addStudentBtn.setText("Add Student");
        addStudentBtn.setAutoscrolls(true);
        addStudentBtn.setBorderPainted(false);
        addStudentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBtngoToStudentsPanel(evt);
            }
        });

        studentTablepanel.setBackground(new java.awt.Color(51, 104, 211));
        studentTablepanel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        studentTablepanel.setForeground(new java.awt.Color(255, 255, 255));
        studentTablepanel.setText("Student Table");
        studentTablepanel.setAutoscrolls(true);
        studentTablepanel.setBorderPainted(false);
        studentTablepanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentTablepanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentTablepanelgoToStudentsPanel(evt);
            }
        });

        importBtn1.setBackground(new java.awt.Color(51, 104, 211));
        importBtn1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        importBtn1.setForeground(new java.awt.Color(255, 255, 255));
        importBtn1.setText("Export to .xlsx");
        importBtn1.setAutoscrolls(true);
        importBtn1.setBorderPainted(false);
        importBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        importBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importBtn1ActionPerformed(evt);
            }
        });

        GradeUpdateBT.setBackground(new java.awt.Color(121, 92, 191));
        GradeUpdateBT.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        GradeUpdateBT.setForeground(new java.awt.Color(255, 255, 255));
        GradeUpdateBT.setText("INCREMENT GRADES");
        GradeUpdateBT.setAutoscrolls(true);
        GradeUpdateBT.setBorderPainted(false);
        GradeUpdateBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GradeUpdateBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradeUpdateBTActionPerformed(evt);
            }
        });

        GradeUpdateBT1.setBackground(new java.awt.Color(121, 92, 191));
        GradeUpdateBT1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        GradeUpdateBT1.setForeground(new java.awt.Color(255, 255, 255));
        GradeUpdateBT1.setText("ARCHIVE ALL GRADE 12");
        GradeUpdateBT1.setAutoscrolls(true);
        GradeUpdateBT1.setBorderPainted(false);
        GradeUpdateBT1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GradeUpdateBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradeUpdateBT1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(studentTablepanel)
                .addGap(48, 48, 48)
                .addComponent(addStudentBtn)
                .addGap(12, 12, 12)
                .addComponent(addGradesBtn)
                .addGap(12, 12, 12)
                .addComponent(archiveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(importBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(importBtn1)
                .addContainerGap())
            .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                    .addContainerGap(883, Short.MAX_VALUE)
                    .addComponent(GradeUpdateBT, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(281, Short.MAX_VALUE)))
            .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                    .addContainerGap(673, Short.MAX_VALUE)
                    .addComponent(GradeUpdateBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(478, 478, 478)))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(importBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(importBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(archiveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addGradesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentTablepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(GradeUpdateBT, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(GradeUpdateBT1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        layers.setLayout(new java.awt.CardLayout());

        StudentPanel.setBackground(new java.awt.Color(255, 255, 255));

        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
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
        StudentTable.setToolTipText("Right Click to View");
        StudentTable.getTableHeader().setReorderingAllowed(false);
        studenttablescroll.setViewportView(StudentTable);

        ArchiveBT.setBackground(new java.awt.Color(15, 174, 174));
        ArchiveBT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ArchiveBT.setForeground(new java.awt.Color(255, 255, 255));
        ArchiveBT.setText("Archive");
        ArchiveBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchiveBTActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Sort");

        searchTXT.setForeground(new java.awt.Color(149, 149, 149));
        searchTXT.setText("Search...");
        searchTXT.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchTXTCaretUpdate(evt);
            }
        });
        searchTXT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTXTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTXTFocusLost(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N

        deleteBT.setBackground(new java.awt.Color(229, 87, 87));
        deleteBT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteBT.setForeground(new java.awt.Color(255, 255, 255));
        deleteBT.setText("Delete");
        deleteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTActionPerformed(evt);
            }
        });

        sortstudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Kindergarten 1", "Kindergarten 2", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11", "Grade 12" }));
        sortstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortstudentActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        password.setText("pass");

        id.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        id.setText("id");

        username.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        username.setText("user");

        javax.swing.GroupLayout StudentPanelLayout = new javax.swing.GroupLayout(StudentPanel);
        StudentPanel.setLayout(StudentPanelLayout);
        StudentPanelLayout.setHorizontalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studenttablescroll)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 564, Short.MAX_VALUE)
                        .addComponent(ArchiveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        StudentPanelLayout.setVerticalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentPanelLayout.createSequentialGroup()
                .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ArchiveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sortstudent, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchTXT)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studenttablescroll, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );

        layers.add(StudentPanel, "card5");

        GradePanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        removeSectionBT.setBackground(new java.awt.Color(207, 207, 207));
        removeSectionBT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        removeSectionBT.setText("Remove Section");
        removeSectionBT.setAutoscrolls(true);
        removeSectionBT.setBorderPainted(false);
        removeSectionBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeSectionBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSectionBTgoToStudentsPanel(evt);
            }
        });

        addSectionBT.setBackground(new java.awt.Color(142, 225, 152));
        addSectionBT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        addSectionBT.setText("Add Section");
        addSectionBT.setAutoscrolls(true);
        addSectionBT.setBorderPainted(false);
        addSectionBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addSectionBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSectionBTgoToStudentsPanel(evt);
            }
        });

        SectionTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SectionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "SECTION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SectionTable.setRowHeight(30);
        SectionTable.getTableHeader().setReorderingAllowed(false);
        gradescroll1.setViewportView(SectionTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gradescroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(newSectionTXT)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addSectionBT, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeSectionBT, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newSectionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSectionBT)
                    .addComponent(removeSectionBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradescroll1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        removeStrandBT.setBackground(new java.awt.Color(207, 207, 207));
        removeStrandBT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        removeStrandBT.setText("Remove Strand");
        removeStrandBT.setAutoscrolls(true);
        removeStrandBT.setBorderPainted(false);
        removeStrandBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeStrandBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStrandBTgoToStudentsPanel(evt);
            }
        });

        addStrandBT.setBackground(new java.awt.Color(142, 225, 152));
        addStrandBT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        addStrandBT.setText("Add Strand");
        addStrandBT.setAutoscrolls(true);
        addStrandBT.setBorderPainted(false);
        addStrandBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStrandBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStrandBTgoToStudentsPanel(evt);
            }
        });

        StrandTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        StrandTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "STRAND"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StrandTable.setRowHeight(30);
        StrandTable.getTableHeader().setReorderingAllowed(false);
        gradescroll2.setViewportView(StrandTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gradescroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(newStrandTXT)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(addStrandBT, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeStrandBT, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newStrandTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStrandBT)
                    .addComponent(removeStrandBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradescroll2)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        removeTrackBT.setBackground(new java.awt.Color(207, 207, 207));
        removeTrackBT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        removeTrackBT.setText("Remove Track");
        removeTrackBT.setAutoscrolls(true);
        removeTrackBT.setBorderPainted(false);
        removeTrackBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeTrackBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTrackBTgoToStudentsPanel(evt);
            }
        });

        addTrackBT.setBackground(new java.awt.Color(142, 225, 152));
        addTrackBT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        addTrackBT.setText("Add Track");
        addTrackBT.setAutoscrolls(true);
        addTrackBT.setBorderPainted(false);
        addTrackBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTrackBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrackBTgoToStudentsPanel(evt);
            }
        });

        TrackTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TrackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "TRACK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TrackTable.setRowHeight(30);
        TrackTable.getTableHeader().setReorderingAllowed(false);
        gradescroll3.setViewportView(TrackTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gradescroll3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(newTrackTXT)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(addTrackBT, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeTrackBT, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newTrackTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTrackBT)
                    .addComponent(removeTrackBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradescroll3, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout GradePanelLayout = new javax.swing.GroupLayout(GradePanel);
        GradePanel.setLayout(GradePanelLayout);
        GradePanelLayout.setHorizontalGroup(
            GradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GradePanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        GradePanelLayout.setVerticalGroup(
            GradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GradePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layers.add(GradePanel, "card4");

        ArchivePanel.setBackground(new java.awt.Color(255, 255, 255));

        deleteArchiveBT.setBackground(new java.awt.Color(229, 87, 87));
        deleteArchiveBT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteArchiveBT.setForeground(new java.awt.Color(255, 255, 255));
        deleteArchiveBT.setText("Delete");
        deleteArchiveBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteArchiveBTActionPerformed(evt);
            }
        });

        RestoreArchiveBT.setBackground(new java.awt.Color(142, 225, 152));
        RestoreArchiveBT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RestoreArchiveBT.setForeground(new java.awt.Color(255, 255, 255));
        RestoreArchiveBT.setText("Restore");
        RestoreArchiveBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestoreArchiveBTActionPerformed(evt);
            }
        });

        sortstudentarchive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Kindergarten 1", "Kindergarten 2", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11", "Grade 12" }));
        sortstudentarchive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortstudentarchiveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Sort");

        searchTXTarchive.setForeground(new java.awt.Color(149, 149, 149));
        searchTXTarchive.setText("Search...");
        searchTXTarchive.setFocusCycleRoot(true);
        searchTXTarchive.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchTXTarchiveCaretUpdate(evt);
            }
        });
        searchTXTarchive.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTXTarchiveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTXTarchiveFocusLost(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N

        ArchiveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
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
        ArchiveTable.setToolTipText("Right Click to View");
        ArchiveTable.getTableHeader().setReorderingAllowed(false);
        studenttablescroll1.setViewportView(ArchiveTable);

        javax.swing.GroupLayout ArchivePanelLayout = new javax.swing.GroupLayout(ArchivePanel);
        ArchivePanel.setLayout(ArchivePanelLayout);
        ArchivePanelLayout.setHorizontalGroup(
            ArchivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArchivePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ArchivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ArchivePanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTXTarchive, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortstudentarchive, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 776, Short.MAX_VALUE)
                        .addComponent(RestoreArchiveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteArchiveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(studenttablescroll1))
                .addContainerGap())
        );
        ArchivePanelLayout.setVerticalGroup(
            ArchivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArchivePanelLayout.createSequentialGroup()
                .addGroup(ArchivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sortstudentarchive, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTXTarchive, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RestoreArchiveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteArchiveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studenttablescroll1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );

        layers.add(ArchivePanel, "card3");

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layers)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layers))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addGradesBtngoToStudentsPanel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGradesBtngoToStudentsPanel
        layers.removeAll();
        layers.add(GradePanel);
        layers.repaint();
        layers.revalidate();
        clear();
    }//GEN-LAST:event_addGradesBtngoToStudentsPanel

    private void archiveBtngoToStudentsPanel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archiveBtngoToStudentsPanel
        layers.removeAll();
        layers.add(ArchivePanel);
        layers.repaint();
        layers.revalidate();
        refreshArchiveTable();
        clear();
    }//GEN-LAST:event_archiveBtngoToStudentsPanel

    private void addStudentBtngoToStudentsPanel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBtngoToStudentsPanel
        add Add = new add (this);
     
        Add.forConnection(con,serverIP,userID,passwordID);
        Add.Connect();
        Add.setVisible(true);
        Add.addlrn.requestFocusInWindow(); 
        Add.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_addStudentBtngoToStudentsPanel

    private void studentTablepanelgoToStudentsPanel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentTablepanelgoToStudentsPanel
        // STUDENTS TABLE BUTTON
        layers.removeAll();
        layers.add(StudentPanel);
        layers.repaint();
        layers.revalidate();
        clear();
        refreshStudentTable();
        
    }//GEN-LAST:event_studentTablepanelgoToStudentsPanel

    private void deleteArchiveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteArchiveBTActionPerformed
        int selectedRow = ArchiveTable.getSelectedRow();
    if(selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.");
    } else {
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {    
            deletearchive();
    } 
    
    }
          
    }//GEN-LAST:event_deleteArchiveBTActionPerformed

    private void RestoreArchiveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestoreArchiveBTActionPerformed
 int selectedRow = ArchiveTable.getSelectedRow();
    if(selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to restore.");
    } else {
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to restore this row?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {    
            restoreStudent();     
        } 
    }   
        
    }//GEN-LAST:event_RestoreArchiveBTActionPerformed

    private void searchTXTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTXTFocusGained
        if (searchTXT.getText().equals("Search...")) //mouseentered
        {
            searchTXT.setText("");
            searchTXT.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_searchTXTFocusGained

    private void searchTXTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTXTFocusLost
        if (searchTXT.getText().equals("")) //mouseexited
        {
            searchTXT.setText("Search...");
            searchTXT.setForeground(new Color (149,149,149));
        }
    }//GEN-LAST:event_searchTXTFocusLost

    private void searchTXTCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchTXTCaretUpdate
        if (!searchTXT.getText().equals("Search...")) //mouseentered
        {
           SearchStudent();
        }
    }//GEN-LAST:event_searchTXTCaretUpdate

    private void searchTXTarchiveCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchTXTarchiveCaretUpdate
        if (!searchTXTarchive.getText().equals("Search...")) //mouseentered
        {
           SearchStudentArchive();
        }
    }//GEN-LAST:event_searchTXTarchiveCaretUpdate

    private void searchTXTarchiveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTXTarchiveFocusGained
        if (searchTXTarchive.getText().equals("Search...")) //mouseentered
        {
            searchTXTarchive.setText("");
            searchTXTarchive.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_searchTXTarchiveFocusGained

    private void searchTXTarchiveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTXTarchiveFocusLost
        if (searchTXTarchive.getText().equals("")) //mouseexited
        {
            searchTXTarchive.setText("Search...");
            searchTXTarchive.setForeground(new Color (149,149,149));
        }
    }//GEN-LAST:event_searchTXTarchiveFocusLost

    private void importBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importBtnActionPerformed
        excel ex = new excel(this);
        ex.forConnection(con,serverIP,userID,passwordID);
         ex.Connect();
        ex.setVisible(true);
    }//GEN-LAST:event_importBtnActionPerformed

    private void ArchiveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchiveBTActionPerformed
        int selectedRow = StudentTable.getSelectedRow();
        if(selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to archive.");
        } else {
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to archive this Student?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                archiveStudent();
            }
        }
    }//GEN-LAST:event_ArchiveBTActionPerformed

    private void removeSectionBTgoToStudentsPanel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSectionBTgoToStudentsPanel
        int selectedRow = SectionTable.getSelectedRow();
        if(selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a section to delete.");
        } else {
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Section?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                removesection();
            }
        }
    }//GEN-LAST:event_removeSectionBTgoToStudentsPanel

    private void addSectionBTgoToStudentsPanel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSectionBTgoToStudentsPanel
        addsection();
    }//GEN-LAST:event_addSectionBTgoToStudentsPanel

    private void removeStrandBTgoToStudentsPanel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStrandBTgoToStudentsPanel
        int selectedRow = StrandTable.getSelectedRow();
        if(selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a strand to delete.");
        } else {
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Strand?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                removestrand();
            }
        }
    }//GEN-LAST:event_removeStrandBTgoToStudentsPanel

    private void addStrandBTgoToStudentsPanel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStrandBTgoToStudentsPanel
        addstrand();
    }//GEN-LAST:event_addStrandBTgoToStudentsPanel

    private void removeTrackBTgoToStudentsPanel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTrackBTgoToStudentsPanel
        int selectedRow = TrackTable.getSelectedRow();
        if(selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a track to delete.");
        } else {
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Track?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                removetrack();
            }
        }
    }//GEN-LAST:event_removeTrackBTgoToStudentsPanel

    private void addTrackBTgoToStudentsPanel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrackBTgoToStudentsPanel
        addtrack();
    }//GEN-LAST:event_addTrackBTgoToStudentsPanel

    private void importBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importBtn1ActionPerformed
        export2 ex = new export2(this);
        ex.forConnection(con, serverIP, userID, passwordID);
        ex.Connect();
        ex.setVisible(true);
        ex.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_importBtn1ActionPerformed

    private void deleteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTActionPerformed
       
    int selectedRow = StudentTable.getSelectedRow();
    if(selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.");
    } else {
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {    
            deleteStudent();
    }
    
    }
    }//GEN-LAST:event_deleteBTActionPerformed

    private void GradeUpdateBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradeUpdateBTActionPerformed
      
        int option = JOptionPane.showConfirmDialog(null, "<html>Are you sure you want to increment all student grades by +1?<br>This action cannot be reversed.</html>", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {    
            restoreStudent();    
            incrementGrade();
        refreshStudentTable();
        } 

       
    }//GEN-LAST:event_GradeUpdateBTActionPerformed

    private void sortstudentarchiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortstudentarchiveActionPerformed
        edit_sort_archive();
    }//GEN-LAST:event_sortstudentarchiveActionPerformed

    private void sortstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortstudentActionPerformed
        edit_sort();
    }//GEN-LAST:event_sortstudentActionPerformed

    private void GradeUpdateBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradeUpdateBT1ActionPerformed
         int option = JOptionPane.showConfirmDialog(null, "<html>Are you sure you want to archive all grade 12 students?</html>", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {    
       
        archiveAll();
        System.out.println(msg);
         JOptionPane.showMessageDialog(null, msg);
        refreshStudentTable();
        msg = "";
            
        } 
    }//GEN-LAST:event_GradeUpdateBT1ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ArchiveBT;
    private javax.swing.JPanel ArchivePanel;
    private javax.swing.JTable ArchiveTable;
    private javax.swing.JPanel GradePanel;
    private javax.swing.JButton GradeUpdateBT;
    private javax.swing.JButton GradeUpdateBT1;
    private javax.swing.JButton RestoreArchiveBT;
    public javax.swing.JTable SectionTable;
    public javax.swing.JTable StrandTable;
    private javax.swing.JPanel StudentPanel;
    private javax.swing.JTable StudentTable;
    public javax.swing.JTable TrackTable;
    private javax.swing.JButton addGradesBtn;
    private javax.swing.JButton addSectionBT;
    private javax.swing.JButton addStrandBT;
    private javax.swing.JButton addStudentBtn;
    private javax.swing.JButton addTrackBT;
    private javax.swing.JButton archiveBtn;
    private javax.swing.JButton deleteArchiveBT;
    private javax.swing.JButton deleteBT;
    private javax.swing.JScrollPane gradescroll1;
    private javax.swing.JScrollPane gradescroll2;
    private javax.swing.JScrollPane gradescroll3;
    private javax.swing.JPanel headerPanel;
    public javax.swing.JLabel id;
    private javax.swing.JButton importBtn;
    private javax.swing.JButton importBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLayeredPane layers;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField newSectionTXT;
    private javax.swing.JTextField newStrandTXT;
    private javax.swing.JTextField newTrackTXT;
    public javax.swing.JLabel password;
    private javax.swing.JButton removeSectionBT;
    private javax.swing.JButton removeStrandBT;
    private javax.swing.JButton removeTrackBT;
    private javax.swing.JTextField searchTXT;
    private javax.swing.JTextField searchTXTarchive;
    private javax.swing.JComboBox<String> sortstudent;
    private javax.swing.JComboBox<String> sortstudentarchive;
    private javax.swing.JButton studentTablepanel;
    private javax.swing.JScrollPane studenttablescroll;
    private javax.swing.JScrollPane studenttablescroll1;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

    



public void view_info(){
view view = new view(this);
view.forConnection(con,serverIP,userID,passwordID);
     view.Connect();
        
        int index = StudentTable.getSelectedRow();
        TableModel model = StudentTable.getModel();
        if (index != -1) {
        
       
        String LRN = model.getValueAt(index, 4).toString();
        
        String lrn = "";
        String Gr = "";
        String Se = "";
        String Ln = "";
        String Fn = "";
        String Mn = "";
        String call = "";
        String placebirth = "";
        String bday = "";
        String add = "";
        String Fad = "";
        String Fnum = "";
        String Foc = "";
        String Mod = "";
        String Mnum = "";
        String Moc = "";
        String Re = "";
        String Strand = "";
        String Track = "";
     
        
        String Nameform="";
        String Namebirth="";
        
        String Nameenroll="";
        
        String Namek1="";
        String Namek2="";
        String Name1="";
        String Name2="";
        String Name3="";
        String Name4="";
        String Name5="";
        String Name6="";
        String Name7="";
        String Name8="";
        String Name9="";
        String Name10="";
        String Name11="";
        String Name12="";
      
        String number = "";
        String guardian ="";
        String guardiannum = "";
        
        
        
        
        String sql = "SELECT * FROM `students` WHERE lrn = ?";
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, LRN);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {

                
                lrn = rs.getString("lrn");
                Gr = rs.getString("grade");
                Se = rs.getString("section");
                Ln = rs.getString("lname");
                Fn = rs.getString("fname");
                Mn = rs.getString("mname");
                call = rs.getString("callname");
                placebirth = rs.getString("placeofbirth");
                bday = rs.getString("birthday");
                add = rs.getString("address");
                Fad = rs.getString("father");
                Fnum = rs.getString("fathernumber");
                Foc = rs.getString("fatheroccupation");
                Mod = rs.getString("mother");
                Mnum = rs.getString("mothernumber");
                Moc = rs.getString("motheroccupation");
                Re = rs.getString("familyreligion");
                Strand = rs.getString("strand");
                Track = rs.getString("track");
                
                number = rs.getString("number");
                guardian = rs.getString("guardian");
                guardiannum = rs.getString("guardiannum");

   
                
                Nameform = rs.getString("imageNameform");
                Namebirth = rs.getString("imageNamebirth");
                Namek1 = rs.getString("imageNamek1");
                Namek2 = rs.getString("imageNamek2");
                Name1 = rs.getString("imageName1");
                Name2 = rs.getString("imageName2");
                Name3 = rs.getString("imageName3");
                Name4 = rs.getString("imageName4");
                Name5 = rs.getString("imageName5");
                Name6 = rs.getString("imageName6");
                Name7 = rs.getString("imageName7");
                Name8 = rs.getString("imageName8");
                Name9 = rs.getString("imageName9");
                Name10 = rs.getString("imageName10");
                Name11 = rs.getString("imageName11");
                Name12 = rs.getString("imageName12");
                Nameenroll = rs.getString("imageNameEnroll");
                
                
                        
            } else {   
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        view.lrn.setText(lrn);
        view.grade.setText(Gr);
        view.section.setText(Se);
        
        view.lname.setText(Ln);
        view.fname.setText(Fn);
        view.mname.setText(Mn);
        
        view.callname.setText(call);
        view.place.setText(placebirth);
        view.birthday.setText(bday);
        
        view.address.setText(add);
        
        view.father.setText(Fad);
        view.fnum.setText(Fnum);
        view.focc.setText(Foc);
        
        view.mother.setText(Mod);
        view.mnum.setText(Mnum);
        view.mocc.setText(Moc);
        
        view.religion.setText(Re);
        
        view.track.setText(Track);
        view.strand.setText(Strand);
    
        view.imagenameform.setText(Nameform);
        view.imagenamebirth.setText(Namebirth);
        view.imagenamek1.setText(Namek1);
        view.imagenamek2.setText(Namek2);
        
        view.imagename1.setText(Name1);
        view.imagename2.setText(Name2);
        view.imagename3.setText(Name3);
        view.imagename4.setText(Name4);
        view.imagename5.setText(Name5);
        view.imagename6.setText(Name6);
        view.imagename7.setText(Name7);
        view.imagename8.setText(Name8);
        view.imagename9.setText(Name9);
        view.imagename10.setText(Name10);
        view.imagename11.setText(Name11);
        view.imagename12.setText(Name12);
        
        view.imagenameenroll.setText(Nameenroll);
        
        view.studentnum.setText(number);
        view.guard.setText(guardian);
        view.guardnum.setText(guardiannum);
        
        
        
        
         view.setVisible(true);
         view.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        }
   
       

}



    public void view_archive_info(){
    view_archive view = new view_archive(this);
    
    view.forConnection(con,serverIP,userID,passwordID);
     view.Connect();

        int index = ArchiveTable.getSelectedRow();
        TableModel model = ArchiveTable.getModel();
        if (index != -1) {
        
       
        String LRN = model.getValueAt(index, 4).toString();
        
        String lrn = "";
        String Gr = "";
        String Se = "";
        String Ln = "";
        String Fn = "";
        String Mn = "";
        String call = "";
        String placebirth = "";
        String bday = "";
        String add = "";
        String Fad = "";
        String Fnum = "";
        String Foc = "";
        String Mod = "";
        String Mnum = "";
        String Moc = "";
        String Re = "";
        String Strand = "";
        String Track = "";
     
        
        String Nameform="";
        String Namebirth="";
        
        String Nameenroll="";
        
        String Namek1="";
        String Namek2="";
        String Name1="";
        String Name2="";
        String Name3="";
        String Name4="";
        String Name5="";
        String Name6="";
        String Name7="";
        String Name8="";
        String Name9="";
        String Name10="";
        String Name11="";
        String Name12="";
      
        String number = "";
        String guardian ="";
        String guardiannum = "";
        
        
        
        
        String sql = "SELECT * FROM `archive_students` WHERE lrn = ?";
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, LRN);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {

                
                lrn = rs.getString("lrn");
                Gr = rs.getString("grade");
                Se = rs.getString("section");
                Ln = rs.getString("lname");
                Fn = rs.getString("fname");
                Mn = rs.getString("mname");
                call = rs.getString("callname");
                placebirth = rs.getString("placeofbirth");
                bday = rs.getString("birthday");
                add = rs.getString("address");
                Fad = rs.getString("father");
                Fnum = rs.getString("fathernumber");
                Foc = rs.getString("fatheroccupation");
                Mod = rs.getString("mother");
                Mnum = rs.getString("mothernumber");
                Moc = rs.getString("motheroccupation");
                Re = rs.getString("familyreligion");
                Strand = rs.getString("strand");
                Track = rs.getString("track");
                
                number = rs.getString("number");
                guardian = rs.getString("guardian");
                guardiannum = rs.getString("guardiannum");

   
                
                Nameform = rs.getString("imageNameform");
                Namebirth = rs.getString("imageNamebirth");
                Namek1 = rs.getString("imageNamek1");
                Namek2 = rs.getString("imageNamek2");
                Name1 = rs.getString("imageName1");
                Name2 = rs.getString("imageName2");
                Name3 = rs.getString("imageName3");
                Name4 = rs.getString("imageName4");
                Name5 = rs.getString("imageName5");
                Name6 = rs.getString("imageName6");
                Name7 = rs.getString("imageName7");
                Name8 = rs.getString("imageName8");
                Name9 = rs.getString("imageName9");
                Name10 = rs.getString("imageName10");
                Name11 = rs.getString("imageName11");
                Name12 = rs.getString("imageName12");
                Nameenroll = rs.getString("imageNameEnroll");
                
                
                        
            } else {   
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        view.lrn.setText(lrn);
        view.grade.setText(Gr);
        view.section.setText(Se);
        
        view.lname.setText(Ln);
        view.fname.setText(Fn);
        view.mname.setText(Mn);
        
        view.callname.setText(call);
        view.place.setText(placebirth);
        view.birthday.setText(bday);
        
        view.address.setText(add);
        
        view.father.setText(Fad);
        view.fnum.setText(Fnum);
        view.focc.setText(Foc);
        
        view.mother.setText(Mod);
        view.mnum.setText(Mnum);
        view.mocc.setText(Moc);
        
        view.religion.setText(Re);
        
        view.track.setText(Track);
        view.strand.setText(Strand);
    
        view.imagenameform.setText(Nameform);
        view.imagenamebirth.setText(Namebirth);
        view.imagenamek1.setText(Namek1);
        view.imagenamek2.setText(Namek2);
        
        view.imagename1.setText(Name1);
        view.imagename2.setText(Name2);
        view.imagename3.setText(Name3);
        view.imagename4.setText(Name4);
        view.imagename5.setText(Name5);
        view.imagename6.setText(Name6);
        view.imagename7.setText(Name7);
        view.imagename8.setText(Name8);
        view.imagename9.setText(Name9);
        view.imagename10.setText(Name10);
        view.imagename11.setText(Name11);
        view.imagename12.setText(Name12);
        
        view.imagenameenroll.setText(Nameenroll);
        
        view.studentnum.setText(number);
        view.guard.setText(guardian);
        view.guardnum.setText(guardiannum);
        
        
        
        
         view.setVisible(true);
         view.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        }
   
       

}


















public void clear (){
      
                
         
                refreshSections();
                refreshStrand();
                refreshTrack();

                
            

                f_form = null;
                path_form = null;
                f_birth = null;
                path_birth = null;
                f_k1 = null;
                path_k1 = null;
                f_k2 = null;
                path_k2 = null;
                
                f1 = null;
                path1= null;
                f2= null;
                path2= null;
                f3 = null;
                path3= null;
                f4 = null;
                path4= null;
                f5 = null;
                path5= null;
                f6 = null;
                path6= null;
                f7 = null;
                path7= null;
                f8 = null;
                path8= null;
                f9= null;
                path9= null;
                f10 = null;
                path10= null;
                f11 = null;
                path11= null;
                f12 = null;
                path12= null;
            
            

}












////////////////////////////////////////////////////////////////////////////////////////////
//                                     GRADES METHOD                                    //
////////////////////////////////////////////////////////////////////////////////////////////


public void addsection(){

String sectionQuery = "SELECT * FROM sections WHERE section=?";
    String insertSectionQuery = "INSERT INTO sections (section) VALUES (?)";
    
    String newSection = newSectionTXT.getText().trim();
    if (!newSection.isEmpty()) {
        try {
            // Check if the section already exists
            PreparedStatement checkStmt = con.prepareStatement(sectionQuery);
            checkStmt.setString(1, newSection);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                // Section already exists, don't insert
                JOptionPane.showMessageDialog(null, "Section already exists!");
            } else {
                // Section doesn't exist, insert it
                PreparedStatement insertStmt = con.prepareStatement(insertSectionQuery);
                insertStmt.setString(1, newSection);
                insertStmt.executeUpdate();
                newSectionTXT.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        refreshSections();
    } else {
       
    }


}

public void addstrand(){
    String strandQuery = "SELECT * FROM strands WHERE strand=?";
    String insertStrandQuery = "INSERT INTO strands (strand) VALUES (?)";
    
    String newStrand = newStrandTXT.getText().trim();
    if (!newStrand.isEmpty()) {
        try {
            // Check if the strand already exists
            PreparedStatement checkStmt = con.prepareStatement(strandQuery);
            checkStmt.setString(1, newStrand);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                // Strand already exists, don't insert
                JOptionPane.showMessageDialog(null, "Strand already exists!");
            } else {
                // Strand doesn't exist, insert it
                PreparedStatement insertStmt = con.prepareStatement(insertStrandQuery);
                insertStmt.setString(1, newStrand);
                insertStmt.executeUpdate();
                newStrandTXT.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        refreshStrand();
    } else {
   
    }
}


public void addtrack(){
    String strandQuery = "SELECT * FROM tracks WHERE track=?";
    String insertStrandQuery = "INSERT INTO tracks (track) VALUES (?)";
    
    String newStrand = newTrackTXT.getText().trim();
    if (!newStrand.isEmpty()) {
        try {
            // Check if the strand already exists
            PreparedStatement checkStmt = con.prepareStatement(strandQuery);
            checkStmt.setString(1, newStrand);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                // Strand already exists, don't insert
                JOptionPane.showMessageDialog(null, "Track already exists!");
            } else {
                // Strand doesn't exist, insert it
                PreparedStatement insertStmt = con.prepareStatement(insertStrandQuery);
                insertStmt.setString(1, newStrand);
                insertStmt.executeUpdate();
                newTrackTXT.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
     
        refreshTrack();
    } else {
  
    }
}


public void removesection(){

    int selectedRow = SectionTable.getSelectedRow();
    
    if (selectedRow != -1) {
        // Get the ID from the selected row
        String LRN = SectionTable.getValueAt(selectedRow, 0).toString();
        
        String section = " DELETE FROM sections WHERE section =?" ;
        try {
                pts = con.prepareStatement(section);
                pts.setString(1, LRN);
                pts.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
    
   refreshSections();
}


public void removestrand(){

    int selectedRow = StrandTable.getSelectedRow();
    
    if (selectedRow != -1) {
        // Get the ID from the selected row
        String LRN = StrandTable.getValueAt(selectedRow, 0).toString();
        
        String grade = " DELETE FROM strands WHERE strand =?" ;
        try {
                pts = con.prepareStatement(grade);
                pts.setString(1, LRN);
                pts.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
    refreshStrand();
   
}

public void removetrack(){

    int selectedRow = TrackTable.getSelectedRow();
    
    if (selectedRow != -1) {
        // Get the ID from the selected row
        String LRN = TrackTable.getValueAt(selectedRow, 0).toString();
        
        String section = " DELETE FROM tracks WHERE track =?" ;
        try {
                pts = con.prepareStatement(section);
                pts.setString(1, LRN);
                pts.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
    
   refreshTrack();
}




public void deletearchive(){
     int selectedRow = ArchiveTable.getSelectedRow();
    
    if (selectedRow != -1) {
        // Get the ID from the selected row
        String LRN = ArchiveTable.getValueAt(selectedRow, 4).toString();
        
        String delete =" DELETE FROM archive_students WHERE lrn =?; " ;
        try {
                pts = con.prepareStatement(delete);
                pts.setString(1, LRN);
                
                 
                pts.executeUpdate();

                JOptionPane.showMessageDialog(this, "Succesfully Deleted Student");
               
               
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
    
    refreshArchiveTable();



}



public void deleteStudent(){
     int selectedRow = StudentTable.getSelectedRow();
    
    if (selectedRow != -1) {
        // Get the ID from the selected row
        String LRN = StudentTable.getValueAt(selectedRow, 4).toString();
        
        String delete =" DELETE FROM students WHERE lrn =?; " ;
        try {
                pts = con.prepareStatement(delete);
                pts.setString(1, LRN);
                
                 
                pts.executeUpdate();

                JOptionPane.showMessageDialog(this, "Succesfully to deleted student");
               
               
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
    
    refreshStudentTable();



}

public void restoreStudent() {
    int selectedRow = ArchiveTable.getSelectedRow();

    if (selectedRow != -1) {
        // Get the ID from the selected row
        String LRN = ArchiveTable.getValueAt(selectedRow, 4).toString();

        String restore = "INSERT INTO students SELECT * FROM archive_students WHERE lrn = ?;"
                + " DELETE FROM archive_students WHERE lrn = ?";
        try {
            pts = con.prepareStatement(restore);
            pts.setString(1, LRN);
            pts.setString(2, LRN);
            pts.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data has been restored!");

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(this, "Duplicate primary key! Cannot restore the same student twice.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    refreshArchiveTable();
}

public void archiveStudent() {
    int selectedRow = StudentTable.getSelectedRow();

    if (selectedRow != -1) {
        // Get the ID from the selected row
        String LRN = StudentTable.getValueAt(selectedRow, 4).toString();

        String archive = "INSERT INTO archive_students SELECT * FROM students WHERE lrn = ?;"
                + " DELETE FROM students WHERE lrn = ?";
        try {
            pts = con.prepareStatement(archive);
            pts.setString(1, LRN);
            pts.setString(2, LRN);
            pts.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data has been archived!");

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(this, "Duplicate primary key! Cannot archive the same student twice.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    refreshStudentTable();
}

















////////////////////////////////////////////////////////////////////////////////////////////
//                                     REFRESH METHODS                                    //
////////////////////////////////////////////////////////////////////////////////////////////



public void refreshStudentTable() {
    System.out.println(con);
    String sql = "SELECT * FROM students";

    
    try {
        DefaultTableModel model = (DefaultTableModel) StudentTable.getModel();
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



public void refreshArchiveTable() {
    String sql = "SELECT * FROM archive_students";

    
    try {
        DefaultTableModel model = (DefaultTableModel) ArchiveTable.getModel();
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




public void refreshSections() {
    String sql = "SELECT * FROM sections";
    try {
        DefaultTableModel model = (DefaultTableModel) SectionTable.getModel();
        model.setRowCount(0);
        
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getString(1)
            });
          
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}


public void refreshStrand() {
    String sql = "SELECT * FROM strands";
    try {
        DefaultTableModel model = (DefaultTableModel) StrandTable.getModel();
        model.setRowCount(0);
        
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getString(1)
            });
           
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}

public void refreshTrack() {
    String sql = "SELECT * FROM tracks";
    try {
        DefaultTableModel model = (DefaultTableModel) TrackTable.getModel();
        model.setRowCount(0);
   
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getString(1)
            });
          
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}






private void SearchStudentArchive (){
  // Get the search text from the searchTXT field
    String searchText = searchTXTarchive.getText().trim();

    // Check if search text is empty
    if (searchText.equals("")||searchText.equals("Search...")) {
        // If search text is empty, load all data from the database table
        String sqlQuery = "SELECT `grade`, `section`,  `track`,`strand`, `lrn`,`number`, `lname`, `fname`, `mname`, "
            + "`callname`, `birthday`, `placeofbirth`, `address`, "
            + "`father`, `fathernumber`, `fatheroccupation`, "
            + "`mother`, `mothernumber`, `motheroccupation`, "
            + "`familyreligion`,`guardian`, `guardiannum` FROM `archive_students` ";
        try {
            // Prepare the statement
            PreparedStatement preparedStatement = con.prepareStatement(sqlQuery);
            
            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Create a list to hold the data
            List<Object[]> data = new ArrayList<>();

            // Populate the list with fetched data
            while (resultSet.next()) {
                Object[] row = new Object[resultSet.getMetaData().getColumnCount()];
                for (int i = 0; i < row.length; i++) {
                    row[i] = resultSet.getObject(i + 1);
                }
                data.add(row);
            }

            // Update the existing table model with the data
            DefaultTableModel model = (DefaultTableModel) ArchiveTable.getModel();
            model.setRowCount(0); // Clear existing data
            for (Object[] row : data) {
                model.addRow(row);
            }

            // Close resources
            resultSet.close();
            preparedStatement.close();

          
           

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
        }
        
        return; // Exit the method
    }

    // Construct the SQL query to search across multiple columns
    String sqlQuery = "SELECT `grade`, `section`,  `track`,`strand` , `lrn`, `number`,`lname`, `fname`, `mname`, "
            + "`callname`, `birthday`, `placeofbirth`, `address`, "
            + "`father`, `fathernumber`, `fatheroccupation`, "
            + "`mother`, `mothernumber`, `motheroccupation`, "
            + "`familyreligion`,`guardian`, `guardiannum` FROM `archive_students` WHERE "
            + "CONCAT(`grade`, `section`,  `track`,`strand`, `lrn`, `number`,`lname`, `fname`, `mname`, "
            + "`callname`, `birthday`, `placeofbirth`, `address`, "
            + "`father`, `fathernumber`, `fatheroccupation`, "
            + "`mother`, `mothernumber`, `motheroccupation`, "
            + "`familyreligion`,`guardian`, `guardiannum`) "
            + "LIKE ?";

    try {
        // Prepare the statement
        PreparedStatement preparedStatement = con.prepareStatement(sqlQuery);

        // Set the parameter for the search text
        preparedStatement.setString(1, "%" + searchText + "%");

        // Execute the query
        ResultSet resultSet = preparedStatement.executeQuery();

        // Create a list to hold the updated data
        List<Object[]> data = new ArrayList<>();

        // Populate the list with fetched data
        while (resultSet.next()) {
            Object[] row = new Object[resultSet.getMetaData().getColumnCount()];
            for (int i = 0; i < row.length; i++) {
                row[i] = resultSet.getObject(i + 1);
            }
            data.add(row);
        }

        // Update the existing table model with new data
        DefaultTableModel model = (DefaultTableModel) ArchiveTable.getModel();
        model.setRowCount(0); // Clear existing data
        for (Object[] row : data) {
            model.addRow(row);
        }

        // Close resources
        resultSet.close();
        preparedStatement.close();

     
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
    }
}






private void SearchStudent() {
    // Get the search text from the searchTXT field
    String searchText = searchTXT.getText().trim();

    // Check if search text is empty
    if (searchText.equals("")||searchText.equals("Search...")) {
        // If search text is empty, load all data from the database table
        String sqlQuery = "SELECT `grade`, `section`,  `track`,`strand`, `lrn`,`number`, `lname`, `fname`, `mname`, "
            + "`callname`, `birthday`, `placeofbirth`, `address`, "
            + "`father`, `fathernumber`, `fatheroccupation`, "
            + "`mother`, `mothernumber`, `motheroccupation`, "
            + "`familyreligion`,`guardian`, `guardiannum` FROM `students` ";
        try {
            // Prepare the statement
            PreparedStatement preparedStatement = con.prepareStatement(sqlQuery);
            
            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Create a list to hold the data
            List<Object[]> data = new ArrayList<>();

            // Populate the list with fetched data
            while (resultSet.next()) {
                Object[] row = new Object[resultSet.getMetaData().getColumnCount()];
                for (int i = 0; i < row.length; i++) {
                    row[i] = resultSet.getObject(i + 1);
                }
                data.add(row);
            }

            // Update the existing table model with the data
            DefaultTableModel model = (DefaultTableModel) StudentTable.getModel();
            model.setRowCount(0); // Clear existing data
            for (Object[] row : data) {
                model.addRow(row);
            }

            // Close resources
            resultSet.close();
            preparedStatement.close();

          
           

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
        }
        
        return; // Exit the method
    }

    // Construct the SQL query to search across multiple columns
    String sqlQuery = "SELECT `grade`, `section`,  `track`,`strand` , `lrn`, `number`,`lname`, `fname`, `mname`, "
            + "`callname`, `birthday`, `placeofbirth`, `address`, "
            + "`father`, `fathernumber`, `fatheroccupation`, "
            + "`mother`, `mothernumber`, `motheroccupation`, "
            + "`familyreligion`,`guardian`, `guardiannum` FROM `students` WHERE "
            + "CONCAT(`grade`, `section`,  `track`,`strand`, `lrn`, `number`,`lname`, `fname`, `mname`, "
            + "`callname`, `birthday`, `placeofbirth`, `address`, "
            + "`father`, `fathernumber`, `fatheroccupation`, "
            + "`mother`, `mothernumber`, `motheroccupation`, "
            + "`familyreligion`,`guardian`, `guardiannum`) "
            + "LIKE ?";

    try {
        // Prepare the statement
        PreparedStatement preparedStatement = con.prepareStatement(sqlQuery);

        // Set the parameter for the search text
        preparedStatement.setString(1, "%" + searchText + "%");

        // Execute the query
        ResultSet resultSet = preparedStatement.executeQuery();

        // Create a list to hold the updated data
        List<Object[]> data = new ArrayList<>();

        // Populate the list with fetched data
        while (resultSet.next()) {
            Object[] row = new Object[resultSet.getMetaData().getColumnCount()];
            for (int i = 0; i < row.length; i++) {
                row[i] = resultSet.getObject(i + 1);
            }
            data.add(row);
        }

        // Update the existing table model with new data
        DefaultTableModel model = (DefaultTableModel) StudentTable.getModel();
        model.setRowCount(0); // Clear existing data
        for (Object[] row : data) {
            model.addRow(row);
        }

        // Close resources
        resultSet.close();
        preparedStatement.close();

     
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
    }
}










public void edit_sort(){
    String selectedValue = (String) sortstudent.getSelectedItem();

    // Construct appropriate SQL query based on selected value
   
    String sql = null;
    if (selectedValue.equals("All")) {
    sql = "SELECT " 
            + "`grade`, `section`, `track`, `strand`, `lrn`,`number`, `lname`, `fname`, `mname`, "
            + "`callname`, `birthday`, `placeofbirth`, `address`, "
            + "`father`, `fathernumber`, `fatheroccupation`, "
            + "`mother`, `mothernumber`, `motheroccupation`, "
            + "`familyreligion`,`guardian`,`guardiannum` "
          + "FROM "
            + "students";
    }else {
    sql = "SELECT "
            + "`grade`, `section`, `track`, `strand`, `lrn`,`number` , `lname`, `fname`, `mname`, "
            + "`callname`, `birthday`, `placeofbirth`, `address`, "
            + "`father`, `fathernumber`, `fatheroccupation`, "
            + "`mother`, `mothernumber`, `motheroccupation`, "
            + "`familyreligion`,`guardian`,`guardiannum` "
          + "FROM "
            + "students WHERE grade= '" + selectedValue +"'";
}

    try {
        // Prepare the statement
        pts = con.prepareStatement(sql);

        // Execute the query
        rs = pts.executeQuery();

        // Create a list to hold the updated data
        List<Object[]> data = new ArrayList<>();

        // Populate the list with fetched data
        while (rs.next()) {
            Object[] row = new Object[rs.getMetaData().getColumnCount()];
            for (int i = 0; i < row.length; i++) {
                row[i] = rs.getObject(i + 1);
            }
            data.add(row);
        }

        // Update the existing table model with new data
        DefaultTableModel model = (DefaultTableModel) StudentTable.getModel();
        model.setRowCount(0); // Clear existing data
        for (Object[] row : data) {
            model.addRow(row);
        }

        // Close resources
        rs.close();
        pts.close();

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
    }
}  

public void edit_sort_archive(){
    String selectedValue = (String) sortstudentarchive.getSelectedItem();

    // Construct appropriate SQL query based on selected value
   
    String sql = null;
    if (selectedValue.equals("All")) {
    sql = "SELECT " 
            + "`grade`, `section`, `track`, `strand`, `lrn`,`number`, `lname`, `fname`, `mname`, "
            + "`callname`, `birthday`, `placeofbirth`, `address`, "
            + "`father`, `fathernumber`, `fatheroccupation`, "
            + "`mother`, `mothernumber`, `motheroccupation`, "
            + "`familyreligion`,`guardian`,`guardiannum` "
          + "FROM "
            + "archive_students";
    }else {
    sql = "SELECT "
            + "`grade`, `section`, `track`, `strand`, `lrn`,`number`, `lname`, `fname`, `mname`, "
            + "`callname`, `birthday`, `placeofbirth`, `address`, "
            + "`father`, `fathernumber`, `fatheroccupation`, "
            + "`mother`, `mothernumber`, `motheroccupation`, "
            + "`familyreligion`,`guardian`,`guardiannum` "
          + "FROM "
            + "archive_students WHERE grade= '" + selectedValue +"'";
}

    try {
        // Prepare the statement
        pts = con.prepareStatement(sql);

        // Execute the query
        rs = pts.executeQuery();

        // Create a list to hold the updated data
        List<Object[]> data = new ArrayList<>();

        // Populate the list with fetched data
        while (rs.next()) {
            Object[] row = new Object[rs.getMetaData().getColumnCount()];
            for (int i = 0; i < row.length; i++) {
                row[i] = rs.getObject(i + 1);
            }
            data.add(row);
        }

        // Update the existing table model with new data
        DefaultTableModel model = (DefaultTableModel) ArchiveTable.getModel();
        model.setRowCount(0); // Clear existing data
        for (Object[] row : data) {
            model.addRow(row);
        }

        // Close resources
        rs.close();
        pts.close();

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
    }
}  























public void SelectEdit() {
    // Check if any row is selected
  
 
    
   
    int selectedRow = StudentTable.getSelectedRow();
     edit Edit = new edit(this);
    if (selectedRow != -1) {
        
//        layers.removeAll();
//        layers.add(AddPanel);
//        layers.repaint();
//        layers.revalidate();
//        
//        imagelayer.removeAll();
//        imagelayer.add(editimagepanel);
//        imagelayer.repaint();
//        imagelayer.revalidate();
//        
//        BTlayer.removeAll();
//        BTlayer.add(editBTpanel);
//        BTlayer.repaint();
//        BTlayer.revalidate();
//        
//        datelayer.removeAll();
//        datelayer.add(edit_date_panel);
//        datelayer.repaint();
//        datelayer.revalidate();
        
        
        // Get the ID from the selected row
        String productID = StudentTable.getValueAt(selectedRow, 4).toString();

        String sql = "SELECT `lrn`, `fname`, `mname`, `lname`, `placeofbirth`, `birthday`, `father`, `fathernumber`, `fatheroccupation`, `mother`, `mothernumber`, `motheroccupation`, `familyreligion`, `grade`, `section`, `track`, `strand`, `callname`, `address`, `imageNameform`, `imageNamebirth`, `imageNamek1`, `imageNamek2`, `imageName1`, `imageName2`, `imageName3`, `imageName4`, `imageName5`, `imageName6`, `imageName7`, `imageName8`, `imageName9`, `imageName10`, `imageName11`, `imageName12`, `imagePathform`, `imagePathbirth`, `imagePathk1`, `imagePathk2`, `imagePath1`, `imagePath2`, `imagePath3`, `imagePath4`, `imagePath5`, `imagePath6`, `imagePath7`, `imagePath8`, `imagePath9`, `imagePath10`, `imagePath11`, `imagePath12`, `imageFileform`, `imageFilebirth`, `imageFilek1`, `imageFilek2`, `imageFile1`, `imageFile2`, `imageFile3`, `imageFile4`, `imageFile5`, `imageFile6`, `imageFile7`, `imageFile8`, `imageFile9`, `imageFile10`, `imageFile11`, `imageFile12` FROM `students` WHERE lrn=?";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, productID);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // Populate the fields with data from the ResultSet
                Edit.editlrn.setText(rs.getString("lrn"));
                Edit.addlrn.setText(rs.getString("lrn"));
                
                Edit.addfirstname.setText(rs.getString("fname"));
                Edit.addmname.setText(rs.getString("mname"));
                Edit.addlastname.setText(rs.getString("lname"));
                
                Edit.addplaceofbirth.setText(rs.getString("placeofbirth"));
                
                
                Edit.addfather.setText(rs.getString("father"));
                Edit.addfathernumber.setText(rs.getString("fathernumber"));
                Edit.addfatheroccupation.setText(rs.getString("fatheroccupation"));
                
                Edit.addmother.setText(rs.getString("mother"));
                Edit.addmothernumber.setText(rs.getString("mothernumber"));
                Edit.addmotheroccupation.setText(rs.getString("motheroccupation"));
                
                Edit.addreligion.setText(rs.getString("familyreligion"));
                
                Edit.addcallname.setText(rs.getString("callname"));
                Edit.addaddress.setText(rs.getString("address"));
                
               
                String grade = rs.getString("grade");
                if (grade != null) {
                    Edit.addgrade.setSelectedItem(grade);
                }
                String section = rs.getString("section");
                if (section != null) {
                    Edit.addsection.setSelectedItem(section);
                }
                String strand = rs.getString("strand");
                if (strand != null) {
                    Edit.addstrand.setSelectedItem(strand);
                }
                String track = rs.getString("track");
                if (track != null) {
                    Edit.addtrack.setSelectedItem(track);
                }
                
                Edit.addimagenameform.setText(rs.getString("imageNameform"));
                Edit.addimagepathform.setText(rs.getString("imagePathform"));

                Edit.addimagenamebirth.setText(rs.getString("imageNamebirth"));
                Edit.addimagepathbirth.setText(rs.getString("imagePathbirth"));

                Edit.addimagenamek1.setText(rs.getString("imageNamek1"));
                Edit.addimagepathk1.setText(rs.getString("imagePathk1"));


                Edit.addimagenamek2.setText(rs.getString("imageNamek2"));
                Edit.addimagepathk2.setText(rs.getString("imagePathk2"));


                Edit.addimagename1.setText(rs.getString("imageName1"));
                Edit.addimagepath1.setText(rs.getString("imagePath1"));

                Edit.addimagename2.setText(rs.getString("imageName2"));
                Edit.addimagepath2.setText(rs.getString("imagePath2"));

                Edit.addimagename3.setText(rs.getString("imageName3"));
                Edit.addimagepath3.setText(rs.getString("imagePath3"));

                Edit.addimagename4.setText(rs.getString("imageName4"));
                Edit.addimagepath4.setText(rs.getString("imagePath4"));

                Edit.addimagename5.setText(rs.getString("imageName5"));
                Edit.addimagepath5.setText(rs.getString("imagePath5"));

                Edit.addimagename6.setText(rs.getString("imageName6"));
                Edit.addimagepath6.setText(rs.getString("imagePath6"));

                Edit.addimagename7.setText(rs.getString("imageName7"));
                Edit.addimagepath7.setText(rs.getString("imagePath7"));

                Edit.addimagename8.setText(rs.getString("imageName8"));
                Edit.addimagepath8.setText(rs.getString("imagePath8"));

                Edit.addimagename9.setText(rs.getString("imageName9"));
                Edit.addimagepath9.setText(rs.getString("imagePath9"));

                Edit.addimagename10.setText(rs.getString("imageName10"));
                Edit.addimagepath10.setText(rs.getString("imagePath10"));

                Edit.addimagename11.setText(rs.getString("imageName11"));
                Edit.addimagepath11.setText(rs.getString("imagePath11"));

                Edit.addimagename12.setText(rs.getString("imageName12"));
                Edit.addimagepath12.setText(rs.getString("imagePath12"));

            
                Edit.addbirthday.setDate(rs.getDate("birthday"));
                
                Edit.setVisible(true);
                Edit.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        
                
                
    } else {
        // If no row is selected, notify the user or handle it accordingly
        JOptionPane.showMessageDialog(null, "Please select a row to edit.");
    }
}




public void SelectEdit2(String lrn) {
    // Check if any row is selected
  
 
    
   
  
     edit Edit = new edit(this);
     Edit.forConnection(con,serverIP,userID,passwordID);
     Edit.Connect();
     Edit.addlrn.requestFocusInWindow();
     
        String productID = lrn;

        String sql = "SELECT `lrn`, `fname`, `mname`, `lname`, `placeofbirth`, `birthday`, `father`, `fathernumber`, `fatheroccupation`, `mother`, `mothernumber`, `motheroccupation`, `familyreligion`, `grade`, `section`, `track`, `strand`, `callname`, `address`, `imageNameform`, `imageNamebirth`, `imageNamek1`, `imageNamek2`, `imageName1`, `imageName2`, `imageName3`, `imageName4`, `imageName5`, `imageName6`, `imageName7`, `imageName8`, `imageName9`, `imageName10`, `imageName11`, `imageName12`, `imagePathform`, `imagePathbirth`, `imagePathk1`, `imagePathk2`, `imagePath1`, `imagePath2`, `imagePath3`, `imagePath4`, `imagePath5`, `imagePath6`, `imagePath7`, `imagePath8`, `imagePath9`, `imagePath10`, `imagePath11`, `imagePath12`, `imageFileform`, `imageFilebirth`, `imageFilek1`, `imageFilek2`, `imageFile1`, `imageFile2`, `imageFile3`, `imageFile4`, `imageFile5`, `imageFile6`, `imageFile7`, `imageFile8`, `imageFile9`, `imageFile10`, `imageFile11`, `imageFile12` ,`number`,`guardian`,`guardiannum`,`imageNameEnroll`,`imagePathEnroll`, `imageFileEnroll` FROM `students` WHERE lrn=?";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, productID);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // Populate the fields with data from the ResultSet
                Edit.editlrn.setText(rs.getString("lrn"));
                Edit.addlrn.setText(rs.getString("lrn"));
                
                Edit.addfirstname.setText(rs.getString("fname"));
                Edit.addmname.setText(rs.getString("mname"));
                Edit.addlastname.setText(rs.getString("lname"));
                
                Edit.addplaceofbirth.setText(rs.getString("placeofbirth"));
                
                
                Edit.addfather.setText(rs.getString("father"));
                Edit.addfathernumber.setText(rs.getString("fathernumber"));
                Edit.addfatheroccupation.setText(rs.getString("fatheroccupation"));
                
                Edit.addmother.setText(rs.getString("mother"));
                Edit.addmothernumber.setText(rs.getString("mothernumber"));
                Edit.addmotheroccupation.setText(rs.getString("motheroccupation"));
                
                Edit.addreligion.setText(rs.getString("familyreligion"));
                
                Edit.addcallname.setText(rs.getString("callname"));
                Edit.addaddress.setText(rs.getString("address"));
                
                Edit.addstudentnum.setText(rs.getString("number"));
                Edit.addguardian.setText(rs.getString("guardian"));
                Edit.addguardiannum.setText(rs.getString("guardiannum"));
                
               
                String grade = rs.getString("grade");
                if (grade != null) {
                    Edit.addgrade.setSelectedItem(grade);
                }
                String section = rs.getString("section");
                if (section != null) {
                    Edit.addsection.setSelectedItem(section);
                }
                String strand = rs.getString("strand");
                if (strand != null) {
                    Edit.addstrand.setSelectedItem(strand);
                }
                String track = rs.getString("track");
                if (track != null) {
                    Edit.addtrack.setSelectedItem(track);
                }
                
                Edit.addimagenameform.setText(rs.getString("imageNameform"));
                Edit.addimagepathform.setText(rs.getString("imagePathform"));

                Edit.addimagenamebirth.setText(rs.getString("imageNamebirth"));
                Edit.addimagepathbirth.setText(rs.getString("imagePathbirth"));

                Edit.addimagenamek1.setText(rs.getString("imageNamek1"));
                Edit.addimagepathk1.setText(rs.getString("imagePathk1"));


                Edit.addimagenamek2.setText(rs.getString("imageNamek2"));
                Edit.addimagepathk2.setText(rs.getString("imagePathk2"));


                Edit.addimagename1.setText(rs.getString("imageName1"));
                Edit.addimagepath1.setText(rs.getString("imagePath1"));

                Edit.addimagename2.setText(rs.getString("imageName2"));
                Edit.addimagepath2.setText(rs.getString("imagePath2"));

                Edit.addimagename3.setText(rs.getString("imageName3"));
                Edit.addimagepath3.setText(rs.getString("imagePath3"));

                Edit.addimagename4.setText(rs.getString("imageName4"));
                Edit.addimagepath4.setText(rs.getString("imagePath4"));

                Edit.addimagename5.setText(rs.getString("imageName5"));
                Edit.addimagepath5.setText(rs.getString("imagePath5"));

                Edit.addimagename6.setText(rs.getString("imageName6"));
                Edit.addimagepath6.setText(rs.getString("imagePath6"));

                Edit.addimagename7.setText(rs.getString("imageName7"));
                Edit.addimagepath7.setText(rs.getString("imagePath7"));

                Edit.addimagename8.setText(rs.getString("imageName8"));
                Edit.addimagepath8.setText(rs.getString("imagePath8"));

                Edit.addimagename9.setText(rs.getString("imageName9"));
                Edit.addimagepath9.setText(rs.getString("imagePath9"));

                Edit.addimagename10.setText(rs.getString("imageName10"));
                Edit.addimagepath10.setText(rs.getString("imagePath10"));

                Edit.addimagename11.setText(rs.getString("imageName11"));
                Edit.addimagepath11.setText(rs.getString("imagePath11"));

                Edit.addimagename12.setText(rs.getString("imageName12"));
                Edit.addimagepath12.setText(rs.getString("imagePath12"));
                
                Edit.addimagenameenroll.setText(rs.getString("imageNameEnroll"));
                Edit.addimagepathenroll.setText(rs.getString("imagePathEnroll"));

            
                Edit.addbirthday.setDate(rs.getDate("birthday"));
                
                Edit.setVisible(true);
                Edit.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        
                
                
    }


public void incrementGrade(){

    String selectSQL = "SELECT * FROM students";
    String updateSQL = "UPDATE students SET grade = ? WHERE grade = ?";
    String newGrade = "";
    
    try {
        PreparedStatement selectStatement = con.prepareStatement(selectSQL);
        ResultSet resultSet = selectStatement.executeQuery();
        
        PreparedStatement updateStatement = con.prepareStatement(updateSQL);
        
        while (resultSet.next()) {
            String oldGrade = resultSet.getString("grade");
            
            switch (oldGrade){
                case "Kindergarten 1": 
                    newGrade =  "Kindergarten 2";
                    break;
                case "Kindergarten 2": 
                    newGrade =  "Grade 1";
                    break;
                case "Grade 1": 
                    newGrade =  "Grade 2";
                    break;
                case "Grade 2": 
                    newGrade =  "Grade 3";
                    break;
                case "Grade 3": 
                    newGrade =  "Grade 4";
                    break;
                case "Grade 4": 
                    newGrade =  "Grade 5";
                    break;
                case "Grade 5": 
                    newGrade =  "Grade 6";
                    break;
                case "Grade 6": 
                    newGrade =  "Grade 7";
                    break;
                case "Grade 7": 
                    newGrade =  "Grade 8";
                    break;
                case "Grade 8": 
                    newGrade =  "Grade 9";
                    break;
                case "Grade 9": 
                    newGrade =  "Grade 10";
                    break;
                case "Grade 10": 
                    newGrade =  "Grade 11";
                    break;
                case "Grade 11": 
                    newGrade =  "Grade 12";
                    break;
                case "Grade 12": 
                    // No need to update Grade 12
                    continue;
            }
            
            updateStatement.setString(1, newGrade);
            updateStatement.setString(2, oldGrade);
            updateStatement.executeUpdate();
        }
   
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}


String msg = "";
    private void archiveAll(){
  
        String sql = "INSERT INTO archive_students SELECT * FROM students WHERE grade ='Grade 12';"
                     + "DELETE FROM students WHERE grade ='Grade 12';"; 
        
        try {
            pts = con.prepareStatement(sql);
            int affectedRows = pts.executeUpdate();
            
            
            
            if (affectedRows > 0) {
               
                msg = "Rows archived successfully";
                
                
                
            } else {
             
                msg = "No rows were archived";
            }
        } catch (SQLException ex) {
            
        }
        
  
    
}
   


}
