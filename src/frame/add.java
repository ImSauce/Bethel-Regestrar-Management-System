
package frame;

import java.awt.Color;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import server.serverCredentials;

public class add extends javax.swing.JFrame {

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


File f_enroll = null;
String path_enroll = null; 


       Statement st;
        ResultSet rs;

    Connection con; //sql
    PreparedStatement pts; //sql
    
    
    
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
    public add(main mainInstance) {
        
        initComponents();
        setTitle("add student");
        this.mainInstance = mainInstance;
       
        
        Connect();
        ImageIcon icon = new ImageIcon ("RMSLogo.png");
        setIconImage(icon.getImage());
        
        
    
        mainInstance.refreshStudentTable();
        refreshSections();
        refreshStrand();
        refreshTrack();
        clear();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infopanel = new javax.swing.JPanel();
        addlrn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addfirstname = new javax.swing.JTextField();
        addmiddlename = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addlastname = new javax.swing.JTextField();
        addcallname = new javax.swing.JTextField();
        addaddress = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        addplaceofbirth = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        addreligion = new javax.swing.JTextField();
        addmotheroccupation = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        addmothernumber = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        addmother = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        addfatheroccupation = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        addfathernumber = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        addfather = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        addbirthday = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        classpanel = new javax.swing.JPanel();
        addtrack = new javax.swing.JComboBox<>();
        addgrade = new javax.swing.JComboBox<>();
        addsection = new javax.swing.JComboBox<>();
        addstrand = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        addimagenamek1 = new javax.swing.JTextField();
        addimagenamek2 = new javax.swing.JTextField();
        addimagename1 = new javax.swing.JTextField();
        addimagename2 = new javax.swing.JTextField();
        addimagename3 = new javax.swing.JTextField();
        addimagename4 = new javax.swing.JTextField();
        addimage4 = new javax.swing.JButton();
        addimage3 = new javax.swing.JButton();
        addimage2 = new javax.swing.JButton();
        addimage1 = new javax.swing.JButton();
        addimagek2 = new javax.swing.JButton();
        addimagek1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        addimagenameform = new javax.swing.JTextField();
        addimagenamebirth = new javax.swing.JTextField();
        addimagebirth = new javax.swing.JButton();
        addimageform = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        addimage6 = new javax.swing.JButton();
        addimage7 = new javax.swing.JButton();
        addimage8 = new javax.swing.JButton();
        addimage9 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        addimage10 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        addimagename6 = new javax.swing.JTextField();
        addimage5 = new javax.swing.JButton();
        addimagename7 = new javax.swing.JTextField();
        addimagename8 = new javax.swing.JTextField();
        addimagename9 = new javax.swing.JTextField();
        addimagename10 = new javax.swing.JTextField();
        addimagename11 = new javax.swing.JTextField();
        addimagename12 = new javax.swing.JTextField();
        addimage11 = new javax.swing.JButton();
        addimage12 = new javax.swing.JButton();
        addimagename5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        addimagenameenroll = new javax.swing.JTextField();
        addimageenroll = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        hidden = new javax.swing.JPanel();
        addimagepathform = new javax.swing.JLabel();
        addimagepathbirth = new javax.swing.JLabel();
        addimagepathk1 = new javax.swing.JLabel();
        addimagepathk2 = new javax.swing.JLabel();
        addimagepath1 = new javax.swing.JLabel();
        addimagepath2 = new javax.swing.JLabel();
        addimagepath3 = new javax.swing.JLabel();
        addimagepath4 = new javax.swing.JLabel();
        addimagepath5 = new javax.swing.JLabel();
        addimagepath6 = new javax.swing.JLabel();
        addimagepath7 = new javax.swing.JLabel();
        addimagepath8 = new javax.swing.JLabel();
        addimagepath9 = new javax.swing.JLabel();
        addimagepath10 = new javax.swing.JLabel();
        addimagepath11 = new javax.swing.JLabel();
        addimagepath12 = new javax.swing.JLabel();
        addimagepathenroll = new javax.swing.JLabel();
        add_id = new javax.swing.JLabel();
        add_user = new javax.swing.JLabel();
        add_pass = new javax.swing.JLabel();
        addstudentnum = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        addguardian = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        addguardiannum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        infopanel.setBackground(new java.awt.Color(255, 255, 255));
        infopanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        addlrn.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                addlrnCaretUpdate(evt);
            }
        });
        addlrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addlrnActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("LRN");
        jLabel4.setToolTipText("");

        addfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfirstnameActionPerformed(evt);
            }
        });

        addmiddlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmiddlenameActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("First Name");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Middle Name");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Last Name");

        addlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addlastnameActionPerformed(evt);
            }
        });

        addcallname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcallnameActionPerformed(evt);
            }
        });

        addaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addaddressActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Call Name");

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Address");

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Place of Birth");

        addplaceofbirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addplaceofbirthActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Family Religion");

        addreligion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addreligionActionPerformed(evt);
            }
        });

        addmotheroccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmotheroccupationActionPerformed(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(204, 204, 204));
        jLabel43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setText("Mother's Occupation");

        addmothernumber.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                addmothernumberCaretUpdate(evt);
            }
        });
        addmothernumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmothernumberActionPerformed(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(204, 204, 204));
        jLabel42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("Mother #");

        addmother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmotherActionPerformed(evt);
            }
        });

        jLabel41.setBackground(new java.awt.Color(204, 204, 204));
        jLabel41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText("Mother");

        addfatheroccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfatheroccupationActionPerformed(evt);
            }
        });

        jLabel40.setBackground(new java.awt.Color(204, 204, 204));
        jLabel40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("Father's Occupation");

        addfathernumber.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                addfathernumberCaretUpdate(evt);
            }
        });
        addfathernumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfathernumberActionPerformed(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(204, 204, 204));
        jLabel39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Father #");

        jLabel38.setBackground(new java.awt.Color(204, 204, 204));
        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Father");

        addfather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfatherActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Date of Birth");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Student Information");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Class");

        jSeparator1.setPreferredSize(new java.awt.Dimension(29, 3));

        classpanel.setBackground(new java.awt.Color(255, 255, 255));

        addtrack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        addtrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtrackActionPerformed(evt);
            }
        });

        addgrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kindergarten 1", "Kindergarten 2", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11", "Grade 12" }));
        addgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addgradeActionPerformed(evt);
            }
        });

        addsection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        addsection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsectionActionPerformed(evt);
            }
        });

        addstrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        addstrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstrandActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Grade");

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Section");

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Strand");

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Track");

        javax.swing.GroupLayout classpanelLayout = new javax.swing.GroupLayout(classpanel);
        classpanel.setLayout(classpanelLayout);
        classpanelLayout.setHorizontalGroup(
            classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classpanelLayout.createSequentialGroup()
                .addGroup(classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addgrade, 0, 204, Short.MAX_VALUE)
                    .addComponent(addtrack, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addsection, 0, 200, Short.MAX_VALUE)
                    .addComponent(addstrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        classpanelLayout.setVerticalGroup(
            classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addsection, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addtrack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addstrand, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Documentary Details");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        addimagenamek1.setEditable(false);
        addimagenamek1.setEnabled(false);
        addimagenamek1.setFocusable(false);
        addimagenamek1.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagenamek1.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagenamek1.setPreferredSize(new java.awt.Dimension(212, 30));

        addimagenamek2.setEditable(false);
        addimagenamek2.setEnabled(false);
        addimagenamek2.setFocusable(false);
        addimagenamek2.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagenamek2.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagenamek2.setPreferredSize(new java.awt.Dimension(212, 30));

        addimagename1.setEditable(false);
        addimagename1.setEnabled(false);
        addimagename1.setFocusable(false);
        addimagename1.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagename1.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagename1.setPreferredSize(new java.awt.Dimension(212, 30));

        addimagename2.setEditable(false);
        addimagename2.setEnabled(false);
        addimagename2.setFocusable(false);
        addimagename2.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagename2.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagename2.setPreferredSize(new java.awt.Dimension(212, 30));

        addimagename3.setEditable(false);
        addimagename3.setEnabled(false);
        addimagename3.setFocusable(false);
        addimagename3.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagename3.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagename3.setPreferredSize(new java.awt.Dimension(212, 30));

        addimagename4.setEditable(false);
        addimagename4.setEnabled(false);
        addimagename4.setFocusable(false);
        addimagename4.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagename4.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagename4.setPreferredSize(new java.awt.Dimension(212, 30));

        addimage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimage4.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimage4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimage4ActionPerformed(evt);
            }
        });

        addimage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimage3.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimage3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimage3ActionPerformed(evt);
            }
        });

        addimage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimage2.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimage2ActionPerformed(evt);
            }
        });

        addimage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimage1.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimage1ActionPerformed(evt);
            }
        });

        addimagek2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimagek2.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimagek2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimagek2ActionPerformed(evt);
            }
        });

        addimagek1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimagek1.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimagek1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimagek1ActionPerformed(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Kindergarten 1");

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Kindergarten 2");

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Grade 1");

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Grade 2");

        jLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Grade 3");

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Grade 4");

        addimagenameform.setEditable(false);
        addimagenameform.setEnabled(false);
        addimagenameform.setFocusable(false);
        addimagenameform.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagenameform.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagenameform.setPreferredSize(new java.awt.Dimension(212, 30));

        addimagenamebirth.setEditable(false);
        addimagenamebirth.setEnabled(false);
        addimagenamebirth.setFocusable(false);
        addimagenamebirth.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagenamebirth.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagenamebirth.setPreferredSize(new java.awt.Dimension(212, 30));

        addimagebirth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimagebirth.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimagebirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimagebirthActionPerformed(evt);
            }
        });

        addimageform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimageform.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimageform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimageformActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Form 137");

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Live Birth");

        jLabel33.setBackground(new java.awt.Color(204, 204, 204));
        jLabel33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Grade 8");

        jLabel34.setBackground(new java.awt.Color(204, 204, 204));
        jLabel34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Grade 9");

        jLabel35.setBackground(new java.awt.Color(204, 204, 204));
        jLabel35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Grade 10");

        jLabel36.setBackground(new java.awt.Color(204, 204, 204));
        jLabel36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Grade 11");

        jLabel37.setBackground(new java.awt.Color(204, 204, 204));
        jLabel37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Grade 12");

        addimage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimage6.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimage6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimage6ActionPerformed(evt);
            }
        });

        addimage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimage7.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimage7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimage7ActionPerformed(evt);
            }
        });

        addimage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimage8.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimage8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimage8ActionPerformed(evt);
            }
        });

        addimage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimage9.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimage9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimage9ActionPerformed(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Grade 6");

        addimage10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimage10.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimage10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimage10ActionPerformed(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(204, 204, 204));
        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Grade 5");

        jLabel32.setBackground(new java.awt.Color(204, 204, 204));
        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Grade 7");

        addimagename6.setEditable(false);
        addimagename6.setEnabled(false);
        addimagename6.setFocusable(false);
        addimagename6.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagename6.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagename6.setPreferredSize(new java.awt.Dimension(212, 30));

        addimage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimage5.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimage5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimage5ActionPerformed(evt);
            }
        });

        addimagename7.setEditable(false);
        addimagename7.setEnabled(false);
        addimagename7.setFocusable(false);
        addimagename7.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagename7.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagename7.setPreferredSize(new java.awt.Dimension(212, 30));

        addimagename8.setEditable(false);
        addimagename8.setEnabled(false);
        addimagename8.setFocusable(false);
        addimagename8.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagename8.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagename8.setPreferredSize(new java.awt.Dimension(212, 30));

        addimagename9.setEditable(false);
        addimagename9.setEnabled(false);
        addimagename9.setFocusable(false);
        addimagename9.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagename9.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagename9.setPreferredSize(new java.awt.Dimension(212, 30));

        addimagename10.setEditable(false);
        addimagename10.setEnabled(false);
        addimagename10.setFocusable(false);
        addimagename10.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagename10.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagename10.setPreferredSize(new java.awt.Dimension(212, 30));

        addimagename11.setEditable(false);
        addimagename11.setEnabled(false);
        addimagename11.setFocusable(false);
        addimagename11.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagename11.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagename11.setPreferredSize(new java.awt.Dimension(212, 30));

        addimagename12.setEditable(false);
        addimagename12.setEnabled(false);
        addimagename12.setFocusable(false);
        addimagename12.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagename12.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagename12.setPreferredSize(new java.awt.Dimension(212, 30));

        addimage11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimage11.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimage11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimage11ActionPerformed(evt);
            }
        });

        addimage12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimage12.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimage12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimage12ActionPerformed(evt);
            }
        });

        addimagename5.setEditable(false);
        addimagename5.setEnabled(false);
        addimagename5.setFocusable(false);
        addimagename5.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagename5.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagename5.setPreferredSize(new java.awt.Dimension(212, 30));

        jButton1.setBackground(new java.awt.Color(142, 225, 152));
        jButton1.setText("ADD");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(62, 182, 77)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(230, 230, 230));
        jButton2.setText("CLEAR");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Note: Information can always be Updated Later");

        addimagenameenroll.setEditable(false);
        addimagenameenroll.setEnabled(false);
        addimagenameenroll.setFocusable(false);
        addimagenameenroll.setMaximumSize(new java.awt.Dimension(212, 30));
        addimagenameenroll.setMinimumSize(new java.awt.Dimension(212, 30));
        addimagenameenroll.setPreferredSize(new java.awt.Dimension(212, 30));

        addimageenroll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-image.png"))); // NOI18N
        addimageenroll.setToolTipText("Insert Files (png, jpg, docx, pdf, xlsx, mp4)");
        addimageenroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addimageenrollActionPerformed(evt);
            }
        });

        jLabel47.setBackground(new java.awt.Color(204, 204, 204));
        jLabel47.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Enrollment Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(addimageform, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addimagebirth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addimagek1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addimagenamebirth, javax.swing.GroupLayout.PREFERRED_SIZE, 163, Short.MAX_VALUE)
                                            .addComponent(addimagenamek1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(addimagenameform, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addimagek2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(addimage2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(addimage1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(addimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(addimage4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addimagename3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, Short.MAX_VALUE)
                                            .addComponent(addimagename2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(addimagename1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(addimagenamek2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(addimagename4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addimageenroll, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addimagenameenroll, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addimage11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addimage12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addimagename11, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addimagename12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(addimage9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addimage10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addimagename9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, Short.MAX_VALUE)
                                        .addComponent(addimagename10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(addimage8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(addimagename8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(addimage7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(addimagename7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(addimage6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(170, 170, 170)))))
                            .addComponent(addimagename6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addimage5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addimagename5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addimage5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addimagenameform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(addimagename5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addimage6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagename6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addimage7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addimagenamek1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addimagename7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addimage8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addimagenamek2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addimagename8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addimage9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagename9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addimage10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(addimagename10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagename11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimage11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addimage12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagename12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addimageform, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagenamebirth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagebirth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addimagename4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addimagename2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(addimagename1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(addimagek1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(addimagek2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(addimage1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(8, 8, 8)
                                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addimage2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(addimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addimage4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addimagename3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addimagenameenroll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addimageenroll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        hidden.setBackground(new java.awt.Color(153, 153, 255));

        addimagepathform.setText("a");

        addimagepathbirth.setText("a");

        addimagepathk1.setText("a");

        addimagepathk2.setText("a");

        addimagepath1.setText("a");

        addimagepath2.setText("a");

        addimagepath3.setText("a");

        addimagepath4.setText("a");

        addimagepath5.setText("a");

        addimagepath6.setText("a");

        addimagepath7.setText("a");

        addimagepath8.setText("a");

        addimagepath9.setText("a");

        addimagepath10.setText("a");

        addimagepath11.setText("a");

        addimagepath12.setText("a");

        addimagepathenroll.setText("a");

        add_id.setText("id");

        add_user.setText("user");

        add_pass.setText("pass");

        javax.swing.GroupLayout hiddenLayout = new javax.swing.GroupLayout(hidden);
        hidden.setLayout(hiddenLayout);
        hiddenLayout.setHorizontalGroup(
            hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hiddenLayout.createSequentialGroup()
                .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hiddenLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addimagepathenroll, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hiddenLayout.createSequentialGroup()
                        .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hiddenLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addimagepathform, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepathbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepathk1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepathk2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepath1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepath2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepath3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepath4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addimagepath12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepath11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepath10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepath9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepath8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepath7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepath6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addimagepath5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(hiddenLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add_id)
                                    .addGroup(hiddenLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(add_user)
                                        .addGap(32, 32, 32)
                                        .addComponent(add_pass)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        hiddenLayout.setVerticalGroup(
            hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hiddenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepathform)
                    .addComponent(addimagepath5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepathbirth)
                    .addComponent(addimagepath6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepathk1)
                    .addComponent(addimagepath7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepathk2)
                    .addComponent(addimagepath8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepath1)
                    .addComponent(addimagepath9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepath2)
                    .addComponent(addimagepath10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepath3)
                    .addComponent(addimagepath11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepath4)
                    .addComponent(addimagepath12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addimagepathenroll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(hiddenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_user)
                    .addComponent(add_pass))
                .addContainerGap())
        );

        addstudentnum.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                addstudentnumCaretUpdate(evt);
            }
        });
        addstudentnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstudentnumActionPerformed(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(204, 204, 204));
        jLabel44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("Student Number");

        jLabel45.setBackground(new java.awt.Color(204, 204, 204));
        jLabel45.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel45.setText("Guardian");

        addguardian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addguardianActionPerformed(evt);
            }
        });

        jLabel46.setBackground(new java.awt.Color(204, 204, 204));
        jLabel46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setText("Guardian #");

        addguardiannum.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                addguardiannumCaretUpdate(evt);
            }
        });
        addguardiannum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addguardiannumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infopanelLayout = new javax.swing.GroupLayout(infopanel);
        infopanel.setLayout(infopanelLayout);
        infopanelLayout.setHorizontalGroup(
            infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infopanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infopanelLayout.createSequentialGroup()
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(infopanelLayout.createSequentialGroup()
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infopanelLayout.createSequentialGroup()
                                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(infopanelLayout.createSequentialGroup()
                                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addbirthday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(addplaceofbirth)
                                            .addComponent(addaddress)
                                            .addComponent(addcallname)
                                            .addComponent(addlastname)
                                            .addComponent(addmiddlename, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(addfirstname, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(addlrn)))
                                    .addGroup(infopanelLayout.createSequentialGroup()
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addstudentnum, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(infopanelLayout.createSequentialGroup()
                                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(infopanelLayout.createSequentialGroup()
                                                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(addmotheroccupation, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(addmothernumber, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(addreligion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(infopanelLayout.createSequentialGroup()
                                                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(addfatheroccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(addmother, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(infopanelLayout.createSequentialGroup()
                                                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(addfather)
                                                    .addComponent(addfathernumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(100, 100, 100)
                                        .addComponent(hidden, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(infopanelLayout.createSequentialGroup()
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addguardian, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(infopanelLayout.createSequentialGroup()
                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addguardiannum, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(classpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator3)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)))
                        .addGap(0, 132, Short.MAX_VALUE))))
        );
        infopanelLayout.setVerticalGroup(
            infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infopanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infopanelLayout.createSequentialGroup()
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addlrn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addstudentnum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hidden, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addmiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addcallname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addplaceofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infopanelLayout.createSequentialGroup()
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addfather, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addfathernumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addfatheroccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addmother, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addmothernumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addmotheroccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addreligion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addguardian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infopanelLayout.createSequentialGroup()
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addguardiannum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addbirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(infopanel);

        jLabel1.setBackground(new java.awt.Color(51, 255, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add a new Student");

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
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

    private void addlrnCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_addlrnCaretUpdate
        String lrnText = addlrn.getText().trim();
        if (!lrnText.matches("\\d+")&& !lrnText.equals("")) {
            addlrn.setForeground(Color.red);
        }else{
            addlrn.setForeground(Color.black);
        }
    }//GEN-LAST:event_addlrnCaretUpdate

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addimage6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimage6ActionPerformed
        addimage6BT();
    }//GEN-LAST:event_addimage6ActionPerformed

    private void addimage7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimage7ActionPerformed
        addimage7BT();
    }//GEN-LAST:event_addimage7ActionPerformed

    private void addimage8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimage8ActionPerformed
        addimage8BT();
    }//GEN-LAST:event_addimage8ActionPerformed

    private void addimage9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimage9ActionPerformed
        addimage9BT();
    }//GEN-LAST:event_addimage9ActionPerformed

    private void addimage10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimage10ActionPerformed
        addimage10BT();
    }//GEN-LAST:event_addimage10ActionPerformed

    private void addimage11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimage11ActionPerformed
        addimage11BT();
    }//GEN-LAST:event_addimage11ActionPerformed

    private void addimage12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimage12ActionPerformed
        addimage12BT();
    }//GEN-LAST:event_addimage12ActionPerformed

    private void addimage5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimage5ActionPerformed
        addimage5BT();
    }//GEN-LAST:event_addimage5ActionPerformed

    private void addimage4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimage4ActionPerformed
        addimage4BT();
    }//GEN-LAST:event_addimage4ActionPerformed

    private void addimage3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimage3ActionPerformed
        addimage3BT();
    }//GEN-LAST:event_addimage3ActionPerformed

    private void addimage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimage2ActionPerformed
        addimage2BT();
    }//GEN-LAST:event_addimage2ActionPerformed

    private void addimage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimage1ActionPerformed
        addimage1BT();
    }//GEN-LAST:event_addimage1ActionPerformed

    private void addimagek2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimagek2ActionPerformed
        addimagek2BT();
    }//GEN-LAST:event_addimagek2ActionPerformed

    private void addimagek1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimagek1ActionPerformed
        addimagek1BT();
    }//GEN-LAST:event_addimagek1ActionPerformed

    private void addimagebirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimagebirthActionPerformed
        addimagebirthBT();
    }//GEN-LAST:event_addimagebirthActionPerformed

    private void addimageformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimageformActionPerformed
        addimageformBT();
    }//GEN-LAST:event_addimageformActionPerformed

    private void addimageenrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addimageenrollActionPerformed
        addimageenrollBT();
    }//GEN-LAST:event_addimageenrollActionPerformed

    private void addlrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addlrnActionPerformed
         addstudentnum.requestFocusInWindow();
    }//GEN-LAST:event_addlrnActionPerformed

    private void addstudentnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstudentnumActionPerformed
         addfirstname.requestFocusInWindow();
    }//GEN-LAST:event_addstudentnumActionPerformed

    private void addfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfirstnameActionPerformed
        addmiddlename.requestFocusInWindow();
    }//GEN-LAST:event_addfirstnameActionPerformed

    private void addmiddlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmiddlenameActionPerformed
       addlastname.requestFocusInWindow();
    }//GEN-LAST:event_addmiddlenameActionPerformed

    private void addlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addlastnameActionPerformed
        addcallname.requestFocusInWindow();
    }//GEN-LAST:event_addlastnameActionPerformed

    private void addcallnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcallnameActionPerformed
         addaddress.requestFocusInWindow();
    }//GEN-LAST:event_addcallnameActionPerformed

    private void addaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addaddressActionPerformed
         addplaceofbirth.requestFocusInWindow();
    }//GEN-LAST:event_addaddressActionPerformed

    private void addplaceofbirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addplaceofbirthActionPerformed
         addbirthday.requestFocusInWindow();
    }//GEN-LAST:event_addplaceofbirthActionPerformed

    private void addfatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfatherActionPerformed
       addfathernumber.requestFocusInWindow();
    }//GEN-LAST:event_addfatherActionPerformed

    private void addfathernumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfathernumberActionPerformed
       addfatheroccupation.requestFocusInWindow();
    }//GEN-LAST:event_addfathernumberActionPerformed

    private void addfatheroccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfatheroccupationActionPerformed
       addmother.requestFocusInWindow();
    }//GEN-LAST:event_addfatheroccupationActionPerformed

    private void addmotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmotherActionPerformed
        addmothernumber.requestFocusInWindow();
    }//GEN-LAST:event_addmotherActionPerformed

    private void addmothernumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmothernumberActionPerformed
        addmotheroccupation.requestFocusInWindow();
    }//GEN-LAST:event_addmothernumberActionPerformed

    private void addmotheroccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmotheroccupationActionPerformed
       addreligion.requestFocusInWindow();
    }//GEN-LAST:event_addmotheroccupationActionPerformed

    private void addreligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addreligionActionPerformed
       addguardian.requestFocusInWindow();
    }//GEN-LAST:event_addreligionActionPerformed

    private void addguardianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addguardianActionPerformed
       addguardiannum.requestFocusInWindow();
    }//GEN-LAST:event_addguardianActionPerformed

    private void addguardiannumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addguardiannumActionPerformed
        addgrade.requestFocusInWindow();
    }//GEN-LAST:event_addguardiannumActionPerformed

    private void addgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addgradeActionPerformed
        addtrack.requestFocusInWindow();
    }//GEN-LAST:event_addgradeActionPerformed

    private void addtrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtrackActionPerformed
        addsection.requestFocusInWindow();
    }//GEN-LAST:event_addtrackActionPerformed

    private void addsectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsectionActionPerformed
        addstrand.requestFocusInWindow();
    }//GEN-LAST:event_addsectionActionPerformed

    private void addstrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstrandActionPerformed
       addimageform.requestFocusInWindow();
    }//GEN-LAST:event_addstrandActionPerformed

    private void addstudentnumCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_addstudentnumCaretUpdate
          String lrnText = addstudentnum.getText().trim();
        if (!lrnText.matches("\\d+")&& !lrnText.equals("")) {
            addstudentnum.setForeground(Color.red);
        }else{
            addstudentnum.setForeground(Color.black);
        }
    }//GEN-LAST:event_addstudentnumCaretUpdate

    private void addfathernumberCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_addfathernumberCaretUpdate
    String lrnText = addfathernumber.getText().trim();
    if (!lrnText.matches("[\\d\\p{Punct}\\s]*") && !lrnText.equals("")) {
        addfathernumber.setForeground(Color.red);
    } else {
        addfathernumber.setForeground(Color.black);
    }
    }//GEN-LAST:event_addfathernumberCaretUpdate

    private void addmothernumberCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_addmothernumberCaretUpdate
    String lrnText = addmothernumber.getText().trim();
    if (!lrnText.matches("[\\d\\p{Punct}\\s]*") && !lrnText.equals("")) {
        addmothernumber.setForeground(Color.red);
    } else {
        addmothernumber.setForeground(Color.black);
    }
    }//GEN-LAST:event_addmothernumberCaretUpdate

    private void addguardiannumCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_addguardiannumCaretUpdate
    
     String lrnText = addguardiannum.getText().trim();
    if (!lrnText.matches("[\\d\\p{Punct}\\s]*") && !lrnText.equals("")) {
        addguardiannum.setForeground(Color.red);
    } else {
        addguardiannum.setForeground(Color.black);
    }
    }//GEN-LAST:event_addguardiannumCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel add_id;
    public javax.swing.JLabel add_pass;
    public javax.swing.JLabel add_user;
    private javax.swing.JTextField addaddress;
    private com.toedter.calendar.JDateChooser addbirthday;
    private javax.swing.JTextField addcallname;
    private javax.swing.JTextField addfather;
    private javax.swing.JTextField addfathernumber;
    private javax.swing.JTextField addfatheroccupation;
    private javax.swing.JTextField addfirstname;
    private javax.swing.JComboBox<String> addgrade;
    private javax.swing.JTextField addguardian;
    private javax.swing.JTextField addguardiannum;
    private javax.swing.JButton addimage1;
    private javax.swing.JButton addimage10;
    private javax.swing.JButton addimage11;
    private javax.swing.JButton addimage12;
    private javax.swing.JButton addimage2;
    private javax.swing.JButton addimage3;
    private javax.swing.JButton addimage4;
    private javax.swing.JButton addimage5;
    private javax.swing.JButton addimage6;
    private javax.swing.JButton addimage7;
    private javax.swing.JButton addimage8;
    private javax.swing.JButton addimage9;
    private javax.swing.JButton addimagebirth;
    private javax.swing.JButton addimageenroll;
    private javax.swing.JButton addimageform;
    private javax.swing.JButton addimagek1;
    private javax.swing.JButton addimagek2;
    private javax.swing.JTextField addimagename1;
    private javax.swing.JTextField addimagename10;
    private javax.swing.JTextField addimagename11;
    private javax.swing.JTextField addimagename12;
    private javax.swing.JTextField addimagename2;
    private javax.swing.JTextField addimagename3;
    private javax.swing.JTextField addimagename4;
    private javax.swing.JTextField addimagename5;
    private javax.swing.JTextField addimagename6;
    private javax.swing.JTextField addimagename7;
    private javax.swing.JTextField addimagename8;
    private javax.swing.JTextField addimagename9;
    private javax.swing.JTextField addimagenamebirth;
    private javax.swing.JTextField addimagenameenroll;
    private javax.swing.JTextField addimagenameform;
    private javax.swing.JTextField addimagenamek1;
    private javax.swing.JTextField addimagenamek2;
    private javax.swing.JLabel addimagepath1;
    private javax.swing.JLabel addimagepath10;
    private javax.swing.JLabel addimagepath11;
    private javax.swing.JLabel addimagepath12;
    private javax.swing.JLabel addimagepath2;
    private javax.swing.JLabel addimagepath3;
    private javax.swing.JLabel addimagepath4;
    private javax.swing.JLabel addimagepath5;
    private javax.swing.JLabel addimagepath6;
    private javax.swing.JLabel addimagepath7;
    private javax.swing.JLabel addimagepath8;
    private javax.swing.JLabel addimagepath9;
    private javax.swing.JLabel addimagepathbirth;
    private javax.swing.JLabel addimagepathenroll;
    private javax.swing.JLabel addimagepathform;
    private javax.swing.JLabel addimagepathk1;
    private javax.swing.JLabel addimagepathk2;
    private javax.swing.JTextField addlastname;
    public javax.swing.JTextField addlrn;
    private javax.swing.JTextField addmiddlename;
    private javax.swing.JTextField addmother;
    private javax.swing.JTextField addmothernumber;
    private javax.swing.JTextField addmotheroccupation;
    private javax.swing.JTextField addplaceofbirth;
    private javax.swing.JTextField addreligion;
    private javax.swing.JComboBox<String> addsection;
    private javax.swing.JComboBox<String> addstrand;
    private javax.swing.JTextField addstudentnum;
    private javax.swing.JComboBox<String> addtrack;
    private javax.swing.JPanel classpanel;
    private javax.swing.JPanel hidden;
    private javax.swing.JPanel infopanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel mainpanel;
    // End of variables declaration//GEN-END:variables


    
////////////////////////////////////////////////////////////////////////////////////////////
//                             IMAGE BUTTON METHODS                                       //
////////////////////////////////////////////////////////////////////////////////////////////
    public void addimageformBT(){
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
    fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f_form = fileChooser.getSelectedFile();
        path_form = f_form.getAbsolutePath();
        String imageName = f_form.getName();
        addimagenameform.setText(imageName);
        
        //addimagename1.setColumns(6);
        
        addimagepathform.setText(path_form);
       
    }

    }
    
    public void addimagebirthBT(){
    JFileChooser fileChooser = new JFileChooser();
   FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
     fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f_birth = fileChooser.getSelectedFile();
        path_birth = f_birth.getAbsolutePath();
        String imageName = f_birth.getName();
        addimagenamebirth.setText(imageName);
     
        //addimagename1.setColumns(6);
        
        addimagepathbirth.setText(path_birth);
       
    }

    }
    
    
    public void addimagek1BT(){
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
     fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f_k1 = fileChooser.getSelectedFile();
        path_k1 = f_k1.getAbsolutePath();
        String imageName = f_k1.getName();
        addimagenamek1.setText(imageName);
   
        
        addimagepathk1.setText(path_k1);
      
    }

    }
    
    
    public void addimagek2BT(){
    JFileChooser fileChooser = new JFileChooser();
   FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
     fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f_k2 = fileChooser.getSelectedFile();
        path_k2 = f_k2.getAbsolutePath();
        String imageName = f_k2.getName();
        addimagenamek2.setText(imageName);
       
        addimagepathk2.setText(path_k2);
       
    }

    }
    
    
    public void addimage1BT(){
    JFileChooser fileChooser = new JFileChooser();
   FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
      fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f1 = fileChooser.getSelectedFile();
        path1 = f1.getAbsolutePath();
        String imageName = f1.getName();
        addimagename1.setText(imageName);
       
        addimagepath1.setText(path1);
       
    }

    }
    
    
    public void addimage2BT(){
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
     fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f2 = fileChooser.getSelectedFile();
        path2 = f2.getAbsolutePath();
        String imageName = f2.getName();
        addimagename2.setText(imageName);
       
        addimagepath2.setText(path2);
       
    }

    }
    
    public void addimage3BT(){
    JFileChooser fileChooser = new JFileChooser();
   FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
      fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f3 = fileChooser.getSelectedFile();
        path3 = f3.getAbsolutePath();
        String imageName = f3.getName();
        addimagename3.setText(imageName);
       
        addimagepath3.setText(path3);
       
    }

}

public void addimage4BT(){
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
     fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f4 = fileChooser.getSelectedFile();
        path4 = f4.getAbsolutePath();
        String imageName = f4.getName();
        addimagename4.setText(imageName);
       
        addimagepath4.setText(path4);
        
    }

}

public void addimage5BT(){
    JFileChooser fileChooser = new JFileChooser();
   FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
     fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f5 = fileChooser.getSelectedFile();
        path5 = f5.getAbsolutePath();
        String imageName = f5.getName();
        addimagename5.setText(imageName);
       
        addimagepath5.setText(path5);
       
    }

}

public void addimage6BT(){
    JFileChooser fileChooser = new JFileChooser();
   FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
     fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f6 = fileChooser.getSelectedFile();
        path6 = f6.getAbsolutePath();
        String imageName = f6.getName();
        addimagename6.setText(imageName);
        //addimagename1.setColumns(6);
        
        addimagepath6.setText(path6);
       
    }

}

public void addimage7BT(){
    JFileChooser fileChooser = new JFileChooser();
   FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
     fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f7 = fileChooser.getSelectedFile();
        path7 = f7.getAbsolutePath();
        String imageName = f7.getName();
        addimagename7.setText(imageName);
        
        addimagepath7.setText(path7);
        
    }

}

public void addimage8BT(){
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
     fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f8 = fileChooser.getSelectedFile();
        path8 = f8.getAbsolutePath();
        String imageName = f8.getName();
        addimagename8.setText(imageName);
       
        addimagepath8.setText(path8);
       
    }

}

public void addimage9BT(){
    JFileChooser fileChooser = new JFileChooser();
   FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
     fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f9 = fileChooser.getSelectedFile();
        path9 = f9.getAbsolutePath();
        String imageName = f9.getName();
        addimagename9.setText(imageName);
       
        addimagepath9.setText(path9);
        
    }

}


public void addimage10BT(){
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
     fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f10 = fileChooser.getSelectedFile();
        path10 = f10.getAbsolutePath();
        String imageName = f10.getName();
        addimagename10.setText(imageName);
        
        addimagepath10.setText(path10);
        
    }

}

public void addimage11BT(){
    JFileChooser fileChooser = new JFileChooser();
   FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
     fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f11 = fileChooser.getSelectedFile();
        path11 = f11.getAbsolutePath();
        String imageName = f11.getName();
        addimagename11.setText(imageName);
        
        addimagepath11.setText(path11);
        
    }

}

public void addimage12BT(){
    JFileChooser fileChooser = new JFileChooser();
   FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
      fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f12 = fileChooser.getSelectedFile();
        path12 = f12.getAbsolutePath();
        String imageName = f12.getName();
        addimagename12.setText(imageName);
        
        
        addimagepath12.setText(path12);
        
    }

}

public void addimageenrollBT(){
    JFileChooser fileChooser = new JFileChooser();
   FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg","pdf","docx","xlsx","mp4");
      fileChooser.setFileFilter(imageFilter);
    int load = fileChooser.showOpenDialog(null);
    
    if (load == JFileChooser.APPROVE_OPTION) {
        f_enroll = fileChooser.getSelectedFile();
        path_enroll = f_enroll.getAbsolutePath();
        String imageName = f_enroll.getName();
        addimagenameenroll.setText(imageName);
        
        
        addimagepathenroll.setText(path_enroll);
        
    }

}
    
    
    
    
    
    
    
    
    
    
    
    
////////////////////////////////////////////////////////////////////////////////////////////
//                                     IMAGE METHODS                                      //
////////////////////////////////////////////////////////////////////////////////////////////
private void saveImageToDatabase(File f1, String path1,
                                  File f2, String path2,
                                  File f3, String path3,
                                  File f4, String path4,
                                  File f5, String path5,
                                  File f6, String path6,
                                  File f7, String path7,
                                  File f8, String path8,
                                  File f9, String path9,
                                  File f10, String path10,
                                  File f11, String path11,
                                  File f12, String path12,
                                  File f_form, String path_form,
                                  File f_birth, String path_birth,
                                  File f_k1, String path_k1,
                                  File f_k2, String path_k2,
                                  File f_enroll, String path_enroll

) {
    String LRN = addlrn.getText();
    
    

    try {
        String query = "UPDATE students SET " +
                       "imageName1 = ?, imagePath1 = ?, imageFile1 = ?, " +
                       "imageName2 = ?, imagePath2 = ?, imageFile2 = ?, " +
                       "imageName3 = ?, imagePath3 = ?, imageFile3 = ?, " +
                       "imageName4 = ?, imagePath4 = ?, imageFile4 = ?, " +
                       "imageName5 = ?, imagePath5 = ?, imageFile5 = ?, " +
                       "imageName6 = ?, imagePath6 = ?, imageFile6 = ?, " +
                       "imageName7 = ?, imagePath7 = ?, imageFile7 = ?, " +
                       "imageName8 = ?, imagePath8 = ?, imageFile8 = ?, " +
                       "imageName9 = ?, imagePath9 = ?, imageFile9 = ?, " +
                       "imageName10 = ?, imagePath10 = ?, imageFile10 = ?, " +
                       "imageName11 = ?, imagePath11 = ?, imageFile11 = ?, " +
                       "imageName12 = ?, imagePath12 = ?, imageFile12 = ?, " +
                       "imageNameform = ?, imagePathform = ?, imageFileform = ?, " +
                       "imageNamebirth = ?, imagePathbirth = ?, imageFilebirth = ?, " +
                       "imageNamek1 = ?, imagePathk1 = ?, imageFilek1 = ?, " +
                       "imageNamek2 = ?, imagePathk2 = ?, imageFilek2 = ?, " +
                        "imageNameEnroll = ?, imagePathEnroll = ?, imageFileEnroll = ? " +
                       "WHERE lrn = ?";
        
        PreparedStatement pts = con.prepareStatement(query);

        // Setting values for image 1
        setPreparedStatementParams(pts, f1, path1, 1, LRN);

        // Setting values for image 2
        setPreparedStatementParams(pts, f2, path2, 4, LRN);

        // Setting values for image 3
        setPreparedStatementParams(pts, f3, path3, 7, LRN);

        // Setting values for image 4
        setPreparedStatementParams(pts, f4, path4, 10, LRN);

        // Setting values for image 5
        setPreparedStatementParams(pts, f5, path5, 13, LRN);

        // Setting values for image 6
        setPreparedStatementParams(pts, f6, path6, 16, LRN);

        // Setting values for image 7
        setPreparedStatementParams(pts, f7, path7, 19, LRN);

        // Setting values for image 8
        setPreparedStatementParams(pts, f8, path8, 22, LRN);

        // Setting values for image 9
        setPreparedStatementParams(pts, f9, path9, 25, LRN);

        // Setting values for image 10
        setPreparedStatementParams(pts, f10, path10, 28, LRN);

        // Setting values for image 11
        setPreparedStatementParams(pts, f11, path11, 31, LRN);

        // Setting values for image 12
        setPreparedStatementParams(pts, f12, path12, 34, LRN);

        // Setting values for form image
        setPreparedStatementParams(pts, f_form, path_form, 37, LRN);

        // Setting values for birth certificate image
        setPreparedStatementParams(pts, f_birth, path_birth, 40, LRN);

        // Setting values for kindergarten report card image
        setPreparedStatementParams(pts, f_k1, path_k1, 43, LRN);

        // Setting values for grade 1 report card image
        setPreparedStatementParams(pts, f_k2, path_k2, 46, LRN);
        
         
        setPreparedStatementParams(pts, f_enroll, path_enroll, 49, LRN);

        pts.executeUpdate();

    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Image file not found: " + ex.getMessage());
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error saving image to database: " + ex.getMessage());
        System.out.println(ex);
    }

}

private void setPreparedStatementParams(PreparedStatement pts, File file, String path, int startIndex, String LRN) throws SQLException, FileNotFoundException {
    if (file != null && path != null && !path.isEmpty()) {
        FileInputStream fis = new FileInputStream(file);
        pts.setString(startIndex, file.getName());
        pts.setString(startIndex + 1, path);
        pts.setBinaryStream(startIndex + 2, fis, (int) file.length());
    } else {
        pts.setString(startIndex, "");
        pts.setString(startIndex + 1, "");
        pts.setString(startIndex + 2, "");
    }
    pts.setString(startIndex + 3, LRN);
}



















public void add(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String track = addtrack.getSelectedItem().toString();
        String strand = addstrand.getSelectedItem().toString();
        String grade = addgrade.getSelectedItem().toString();
        String section =addsection.getSelectedItem().toString();
        String lrn = addlrn.getText();
        String last_name = addlastname.getText();
        String first_name = addfirstname.getText();
        String middle_name = addmiddlename.getText();
        String call_name = addcallname.getText();
        String date_of_birth = sdf.format(addbirthday.getDate());
        String place_of_birth = addplaceofbirth.getText();
        String present_mailing_address = addaddress.getText();
        String father = addfather.getText();
        String father_mobile_number = addfathernumber.getText();
        String father_occupation = addfatheroccupation.getText();
        String mother = addmother.getText();
        String mother_mobile_number = addmothernumber.getText();
        String mother_occupation = addmotheroccupation.getText();
        String religion = addreligion.getText();
        
        String number = addstudentnum.getText();
        String guard = addguardian.getText();
        String guardnum = addguardiannum.getText();
        

        String save = "INSERT INTO `students`"
            + "(`lrn`, `fname`, `mname`, `lname`, `placeofbirth`, `birthday`, `father`, `fathernumber`,"
            + "`fatheroccupation`, `mother`, `mothernumber`, `motheroccupation`, `familyreligion`, `grade`,"
            + "`section`, `track`, `strand`, `callname`, `address`, `imageNameform`, `imageNamebirth`,"
            + "`imageNamek1`, `imageNamek2`, `imageName1`, `imageName2`, `imageName3`, `imageName4`,"
            + "`imageName5`, `imageName6`, `imageName7`, `imageName8`, `imageName9`, `imageName10`,"
            + "`imageName11`, `imageName12`, `imagePathform`, `imagePathbirth`, `imagePathk1`, `imagePathk2`,"
            + "`imagePath1`, `imagePath2`, `imagePath3`, `imagePath4`, `imagePath5`, `imagePath6`, `imagePath7`,"
            + "`imagePath8`, `imagePath9`, `imagePath10`, `imagePath11`, `imagePath12`, `imageFileform`,"
            + "`imageFilebirth`, `imageFilek1`, `imageFilek2`, `imageFile1`, `imageFile2`, `imageFile3`,"
            + "`imageFile4`, `imageFile5`, `imageFile6`, `imageFile7`, `imageFile8`, `imageFile9`, `imageFile10`,"
            + "`imageFile11`, `imageFile12`,`number`,`guardian`,`guardiannum`,`imageNameEnroll`,`imagePathEnroll`,`imageFileEnroll`)"
            + " VALUES (?,?,?,?,?,?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
            + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?)";

        try {
            pts = con.prepareStatement(save);
            pts.setString(1, lrn);
            pts.setString(2, first_name);
            pts.setString(3, middle_name);
            pts.setString(4, last_name);
            pts.setString(5, place_of_birth);
            pts.setString(6, date_of_birth);
            pts.setString(7, father);
            pts.setString(8, father_mobile_number);
            pts.setString(9, father_occupation);
            pts.setString(10, mother);
            pts.setString(11, mother_mobile_number);
            pts.setString(12, mother_occupation);
            pts.setString(13, religion);
            pts.setString(14, grade);
            pts.setString(15, section);
            pts.setString(16, track);
            pts.setString(17, strand);
            pts.setString(18, call_name);
            pts.setString(19, present_mailing_address);
            pts.setString(20, ""); // imageNameform
            pts.setString(21, ""); // imageNamebirth
            pts.setString(22, ""); // imageNamek1
            pts.setString(23, ""); // imageNamek2
            pts.setString(24, ""); // imageName1
            pts.setString(25, ""); // imageName2
            pts.setString(26, ""); // imageName3
            pts.setString(27, ""); // imageName4
            pts.setString(28, ""); // imageName5
            pts.setString(29, ""); // imageName6
            pts.setString(30, ""); // imageName7
            pts.setString(31, ""); // imageName8
            pts.setString(32, ""); // imageName9
            pts.setString(33, ""); // imageName10
            pts.setString(34, ""); // imageName11
            pts.setString(35, ""); // imageName12
            pts.setString(36, ""); // imagePathform
            pts.setString(37, ""); // imagePathbirth
            pts.setString(38, ""); // imagePathk1
            pts.setString(39, ""); // imagePathk2
            pts.setString(40, ""); // imagePath1
            pts.setString(41, ""); // imagePath2
            pts.setString(42, ""); // imagePath3
            pts.setString(43, ""); // imagePath4
            pts.setString(44, ""); // imagePath5
            pts.setString(45, ""); // imagePath6
            pts.setString(46, ""); // imagePath7
            pts.setString(47, ""); // imagePath8
            pts.setString(48, ""); // imagePath9
            pts.setString(49, ""); // imagePath10
            pts.setString(50, ""); // imagePath11
            pts.setString(51, ""); // imagePath12
            pts.setString(52, ""); // imageFileform
            pts.setString(53, ""); // imageFilebirth
            pts.setString(54, ""); // imageFilek1
            pts.setString(55, ""); // imageFilek2
            pts.setString(56, ""); // imageFile1
            pts.setString(57, ""); // imageFile2
            pts.setString(58, ""); // imageFile3
            pts.setString(59, ""); // imageFile4
            pts.setString(60, ""); // imageFile5
            pts.setString(61, ""); // imageFile6
            pts.setString(62, ""); // imageFile7
            pts.setString(63, ""); // imageFile8
            pts.setString(64, ""); // imageFile9
            pts.setString(65, ""); // imageFile10
            pts.setString(66, ""); // imageFile11
            pts.setString(67, ""); // imageFile12
            
            pts.setString(68, number); 
            pts.setString(69, guard); 
            pts.setString(70, guardnum); 
            pts.setString(71, ""); 
            pts.setString(72, "");
            pts.setString(73, "");

            int k = pts.executeUpdate();
            System.out.println(f1+" file");
             System.out.println(path1+ " path");
             
             
            
             
             
            
             
             
            if (k == 1) {
                
                JOptionPane.showMessageDialog(this, "Student has been Added!");
             
                
              
                saveImageToDatabase(f1, path1, f2, path2, f3, path3, f4, path4, f5, path5, f6, path6, f7, path7, f8, path8, f9, path9, f10, path10, f11, path11, f12, path12, f_form, path_form, f_birth, path_birth, f_k1, path_k1, f_k2, path_k2, f_enroll, path_enroll);
                System.out.println(f1+" file");
                System.out.println(path1+ " path");
                
                clear();
                dispose();

            } else {
                
                JOptionPane.showMessageDialog(this, "Failed to add student");
         
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Failed to add student");
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }



}


public void clear (){
   
 addlrn.setText("");
 
                addlastname.setText("");
                addfirstname.setText("");
                addmiddlename.setText("");
                addcallname.setText("");
                addbirthday.setCalendar(null);
                addplaceofbirth.setText("");
                addaddress.setText("");
                addfather.setText("");
                addfathernumber.setText("");
                addfatheroccupation.setText("");
                addmother.setText("");
                addmothernumber.setText("");
                addmotheroccupation.setText("");
                addreligion.setText("");
                
                addguardian.setText("");
                addguardiannum.setText("");
                addstudentnum.setText("");
         
                refreshSections();
                refreshStrand();
                refreshTrack();
                
                addimagenameform.setText(" ");
                addimagenamebirth.setText(" ");
                addimagenamek1.setText(" ");
                addimagenamek2.setText(" ");
                addimagename1.setText(" ");
                addimagename2.setText(" ");
                addimagename3.setText(" ");
                addimagename4.setText(" ");
                addimagename5.setText(" ");
                addimagename6.setText(" ");
                addimagename7.setText(" ");
                addimagename8.setText(" ");
                addimagename9.setText(" ");
                addimagename10.setText(" ");
                addimagename11.setText(" ");
                addimagename12.setText(" ");
                
                addimagepathform.setText(" ");
                addimagepathbirth.setText(" ");
                addimagepathk1.setText(" ");
                addimagepathk2.setText(" ");
                addimagepath1.setText(" ");
                addimagepath2.setText(" ");
                addimagepath3.setText(" ");
                addimagepath4.setText(" ");
                addimagepath5.setText(" ");
                addimagepath6.setText(" ");
                addimagepath7.setText(" ");
                addimagepath8.setText(" ");
                addimagepath9.setText(" ");
                addimagepath10.setText(" ");
                addimagepath11.setText(" ");
                addimagepath12.setText(" ");
                
                addimagenameenroll.setText(" ");
                addimagepathenroll.setText(" ");
                
             
                

                f_enroll = null;
                path_enroll = null;
                
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
                
                mainInstance.refreshStudentTable();
            
            

}














public void refreshSections() {
    String sql = "SELECT * FROM sections";
    try {
        DefaultTableModel model = (DefaultTableModel) mainInstance.SectionTable.getModel();
        model.setRowCount(0);
        addsection.removeAllItems(); // Clear combo box items
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getString(1)
            });
            addsection.addItem(rs.getString("section"));
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}


public void refreshStrand() {
    String sql = "SELECT * FROM strands";
    try {
        DefaultTableModel model = (DefaultTableModel) mainInstance.StrandTable.getModel();
        model.setRowCount(0);
        addstrand.removeAllItems(); // Clear combo box items
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getString(1)
            });
            addstrand.addItem(rs.getString("strand"));
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}

public void refreshTrack() {
    String sql = "SELECT * FROM tracks";
    try {
        DefaultTableModel model = (DefaultTableModel) mainInstance.TrackTable.getModel();
        model.setRowCount(0);
        addtrack.removeAllItems(); // Clear combo box items
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getString(1)
            });
            addtrack.addItem(rs.getString("track"));
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}




}
