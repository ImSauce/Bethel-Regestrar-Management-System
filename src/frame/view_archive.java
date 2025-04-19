
package frame;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import server.serverCredentials;
import view_frames.viewImage;
import view_frames.viewImage_Archive;

public class view_archive extends javax.swing.JFrame {

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

FileOutputStream fos = null;


       Statement st;
        ResultSet rs;

    Connection con; //sql
    PreparedStatement pts; //sql
    
     public String serverIP ;
    public String userID ;
    public String passwordID ;
    
    
    
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
        
         serverIP = add_id.getText();
        userID = add_user.getText();
        passwordID =  add_pass.getText();
        
        
        
        
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
    public view_archive(main mainInstance) {
        
        initComponents();
        this.mainInstance = mainInstance;
        ImageIcon icon = new ImageIcon ("RMSLogo.png");
        setIconImage(icon.getImage());
        setTitle("view student");
      
        Connect();
       
        
    
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infopanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        classpanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        grade = new javax.swing.JTextField();
        track = new javax.swing.JTextField();
        section = new javax.swing.JTextField();
        strand = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        viewk2 = new javax.swing.JButton();
        view1 = new javax.swing.JButton();
        imagenamek1 = new javax.swing.JTextField();
        view2 = new javax.swing.JButton();
        imagenamek2 = new javax.swing.JTextField();
        view3 = new javax.swing.JButton();
        imagename1 = new javax.swing.JTextField();
        view4 = new javax.swing.JButton();
        imagename2 = new javax.swing.JTextField();
        downloadbirth = new javax.swing.JButton();
        imagename3 = new javax.swing.JTextField();
        downloadk1 = new javax.swing.JButton();
        imagename4 = new javax.swing.JTextField();
        downloadk2 = new javax.swing.JButton();
        download1 = new javax.swing.JButton();
        download2 = new javax.swing.JButton();
        imagenameform = new javax.swing.JTextField();
        imagenamebirth = new javax.swing.JTextField();
        viewform = new javax.swing.JButton();
        viewbirth = new javax.swing.JButton();
        viewk1 = new javax.swing.JButton();
        downloadform = new javax.swing.JButton();
        download3 = new javax.swing.JButton();
        download4 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        download11 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        view12 = new javax.swing.JButton();
        download12 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        imagename12 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        imagename5 = new javax.swing.JTextField();
        download6 = new javax.swing.JButton();
        view5 = new javax.swing.JButton();
        view6 = new javax.swing.JButton();
        download5 = new javax.swing.JButton();
        imagename6 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        download7 = new javax.swing.JButton();
        view7 = new javax.swing.JButton();
        imagename7 = new javax.swing.JTextField();
        download8 = new javax.swing.JButton();
        view8 = new javax.swing.JButton();
        imagename8 = new javax.swing.JTextField();
        download9 = new javax.swing.JButton();
        view9 = new javax.swing.JButton();
        imagename9 = new javax.swing.JTextField();
        imagename10 = new javax.swing.JTextField();
        view10 = new javax.swing.JButton();
        download10 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        imagename11 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        view11 = new javax.swing.JButton();
        imagenameenroll = new javax.swing.JTextField();
        viewenroll = new javax.swing.JButton();
        downloadenroll = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
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
        add_pass = new javax.swing.JLabel();
        add_user = new javax.swing.JLabel();
        add_id = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        address = new javax.swing.JTextField();
        mocc = new javax.swing.JTextField();
        religion = new javax.swing.JTextField();
        place = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        callname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        mother = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        father = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        fnum = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        lrn = new javax.swing.JTextField();
        focc = new javax.swing.JTextField();
        mnum = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        birthday = new javax.swing.JTextField();
        studentnum = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        guard = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        guardnum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        infopanel.setBackground(new java.awt.Color(255, 255, 255));
        infopanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Student Information");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Class");

        jSeparator1.setPreferredSize(new java.awt.Dimension(29, 3));

        classpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Section");

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Strand");

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Track");

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Grade");

        grade.setEditable(false);
        grade.setBackground(new java.awt.Color(255, 255, 255));
        grade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        grade.setEnabled(false);
        grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeActionPerformed(evt);
            }
        });

        track.setEditable(false);
        track.setBackground(new java.awt.Color(255, 255, 255));
        track.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        track.setEnabled(false);

        section.setEditable(false);
        section.setBackground(new java.awt.Color(255, 255, 255));
        section.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        section.setEnabled(false);

        strand.setEditable(false);
        strand.setBackground(new java.awt.Color(255, 255, 255));
        strand.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        strand.setEnabled(false);

        javax.swing.GroupLayout classpanelLayout = new javax.swing.GroupLayout(classpanel);
        classpanel.setLayout(classpanelLayout);
        classpanelLayout.setHorizontalGroup(
            classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classpanelLayout.createSequentialGroup()
                .addGroup(classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grade)
                    .addComponent(track))
                .addGap(51, 51, 51)
                .addGroup(classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(strand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        classpanelLayout.setVerticalGroup(
            classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(classpanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(classpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(track, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(classpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(strand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Documentary Details");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Kindergarten 1");

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Kindergarten 2");

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Grade 1");

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Grade 2");

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Grade 3");

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Grade 4");

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Form 137");

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Live Birth");

        viewk2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        viewk2.setToolTipText("view image files only");
        viewk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewk2ActionPerformed(evt);
            }
        });

        view1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        view1.setToolTipText("view image files only");
        view1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view1ActionPerformed(evt);
            }
        });

        imagenamek1.setEditable(false);
        imagenamek1.setEnabled(false);
        imagenamek1.setFocusable(false);
        imagenamek1.setMaximumSize(new java.awt.Dimension(212, 30));
        imagenamek1.setMinimumSize(new java.awt.Dimension(212, 30));
        imagenamek1.setPreferredSize(new java.awt.Dimension(212, 30));

        view2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        view2.setToolTipText("view image files only");
        view2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view2ActionPerformed(evt);
            }
        });

        imagenamek2.setEditable(false);
        imagenamek2.setEnabled(false);
        imagenamek2.setFocusable(false);
        imagenamek2.setMaximumSize(new java.awt.Dimension(212, 30));
        imagenamek2.setMinimumSize(new java.awt.Dimension(212, 30));
        imagenamek2.setPreferredSize(new java.awt.Dimension(212, 30));

        view3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        view3.setToolTipText("view image files only");
        view3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view3ActionPerformed(evt);
            }
        });

        imagename1.setEditable(false);
        imagename1.setEnabled(false);
        imagename1.setFocusable(false);
        imagename1.setMaximumSize(new java.awt.Dimension(212, 30));
        imagename1.setMinimumSize(new java.awt.Dimension(212, 30));
        imagename1.setPreferredSize(new java.awt.Dimension(212, 30));

        view4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        view4.setToolTipText("view image files only");
        view4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view4ActionPerformed(evt);
            }
        });

        imagename2.setEditable(false);
        imagename2.setEnabled(false);
        imagename2.setFocusable(false);
        imagename2.setMaximumSize(new java.awt.Dimension(212, 30));
        imagename2.setMinimumSize(new java.awt.Dimension(212, 30));
        imagename2.setPreferredSize(new java.awt.Dimension(212, 30));

        downloadbirth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        downloadbirth.setToolTipText("download documents");
        downloadbirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadbirthActionPerformed(evt);
            }
        });

        imagename3.setEditable(false);
        imagename3.setEnabled(false);
        imagename3.setFocusable(false);
        imagename3.setMaximumSize(new java.awt.Dimension(212, 30));
        imagename3.setMinimumSize(new java.awt.Dimension(212, 30));
        imagename3.setPreferredSize(new java.awt.Dimension(212, 30));

        downloadk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        downloadk1.setToolTipText("download documents");
        downloadk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadk1ActionPerformed(evt);
            }
        });

        imagename4.setEditable(false);
        imagename4.setEnabled(false);
        imagename4.setFocusable(false);
        imagename4.setMaximumSize(new java.awt.Dimension(212, 30));
        imagename4.setMinimumSize(new java.awt.Dimension(212, 30));
        imagename4.setPreferredSize(new java.awt.Dimension(212, 30));

        downloadk2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        downloadk2.setToolTipText("download documents");
        downloadk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadk2ActionPerformed(evt);
            }
        });

        download1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        download1.setToolTipText("download documents");
        download1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                download1ActionPerformed(evt);
            }
        });

        download2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        download2.setToolTipText("download documents");
        download2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                download2ActionPerformed(evt);
            }
        });

        imagenameform.setEditable(false);
        imagenameform.setEnabled(false);
        imagenameform.setFocusable(false);
        imagenameform.setMaximumSize(new java.awt.Dimension(212, 30));
        imagenameform.setMinimumSize(new java.awt.Dimension(212, 30));
        imagenameform.setPreferredSize(new java.awt.Dimension(212, 30));

        imagenamebirth.setEditable(false);
        imagenamebirth.setEnabled(false);
        imagenamebirth.setFocusable(false);
        imagenamebirth.setMaximumSize(new java.awt.Dimension(212, 30));
        imagenamebirth.setMinimumSize(new java.awt.Dimension(212, 30));
        imagenamebirth.setPreferredSize(new java.awt.Dimension(212, 30));

        viewform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        viewform.setToolTipText("view image files only");
        viewform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewformActionPerformed(evt);
            }
        });

        viewbirth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        viewbirth.setToolTipText("view image files only");
        viewbirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbirthActionPerformed(evt);
            }
        });

        viewk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        viewk1.setToolTipText("view image files only");
        viewk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewk1ActionPerformed(evt);
            }
        });

        downloadform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        downloadform.setToolTipText("download documents");
        downloadform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadformActionPerformed(evt);
            }
        });

        download3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        download3.setToolTipText("download documents");
        download3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                download3ActionPerformed(evt);
            }
        });

        download4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        download4.setToolTipText("download documents");
        download4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                download4ActionPerformed(evt);
            }
        });

        jLabel33.setBackground(new java.awt.Color(204, 204, 204));
        jLabel33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Grade 8");

        download11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        download11.setToolTipText("download documents");
        download11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                download11ActionPerformed(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(204, 204, 204));
        jLabel34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Grade 9");

        jLabel35.setBackground(new java.awt.Color(204, 204, 204));
        jLabel35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Grade 10");

        view12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        view12.setToolTipText("view image files only");
        view12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view12ActionPerformed(evt);
            }
        });

        download12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        download12.setToolTipText("download documents");
        download12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                download12ActionPerformed(evt);
            }
        });

        jLabel36.setBackground(new java.awt.Color(204, 204, 204));
        jLabel36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Grade 11");

        imagename12.setEditable(false);
        imagename12.setEnabled(false);
        imagename12.setFocusable(false);
        imagename12.setMaximumSize(new java.awt.Dimension(212, 30));
        imagename12.setMinimumSize(new java.awt.Dimension(212, 30));
        imagename12.setPreferredSize(new java.awt.Dimension(212, 30));
        imagename12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagename12ActionPerformed(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(204, 204, 204));
        jLabel37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Grade 12");

        imagename5.setEditable(false);
        imagename5.setEnabled(false);
        imagename5.setFocusable(false);
        imagename5.setMaximumSize(new java.awt.Dimension(212, 30));
        imagename5.setMinimumSize(new java.awt.Dimension(212, 30));
        imagename5.setPreferredSize(new java.awt.Dimension(212, 30));

        download6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        download6.setToolTipText("download documents");
        download6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                download6ActionPerformed(evt);
            }
        });

        view5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        view5.setToolTipText("view image files only");
        view5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view5ActionPerformed(evt);
            }
        });

        view6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        view6.setToolTipText("view image files only");
        view6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view6ActionPerformed(evt);
            }
        });

        download5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        download5.setToolTipText("download documents");
        download5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                download5ActionPerformed(evt);
            }
        });

        imagename6.setEditable(false);
        imagename6.setEnabled(false);
        imagename6.setFocusable(false);
        imagename6.setMaximumSize(new java.awt.Dimension(212, 30));
        imagename6.setMinimumSize(new java.awt.Dimension(212, 30));
        imagename6.setPreferredSize(new java.awt.Dimension(212, 30));

        jLabel30.setBackground(new java.awt.Color(204, 204, 204));
        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Grade 5");

        download7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        download7.setToolTipText("download documents");
        download7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                download7ActionPerformed(evt);
            }
        });

        view7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        view7.setToolTipText("view image files only");
        view7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view7ActionPerformed(evt);
            }
        });

        imagename7.setEditable(false);
        imagename7.setEnabled(false);
        imagename7.setFocusable(false);
        imagename7.setMaximumSize(new java.awt.Dimension(212, 30));
        imagename7.setMinimumSize(new java.awt.Dimension(212, 30));
        imagename7.setPreferredSize(new java.awt.Dimension(212, 30));

        download8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        download8.setToolTipText("download documents");
        download8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                download8ActionPerformed(evt);
            }
        });

        view8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        view8.setToolTipText("view image files only");
        view8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view8ActionPerformed(evt);
            }
        });

        imagename8.setEditable(false);
        imagename8.setEnabled(false);
        imagename8.setFocusable(false);
        imagename8.setMaximumSize(new java.awt.Dimension(212, 30));
        imagename8.setMinimumSize(new java.awt.Dimension(212, 30));
        imagename8.setPreferredSize(new java.awt.Dimension(212, 30));

        download9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        download9.setToolTipText("download documents");
        download9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                download9ActionPerformed(evt);
            }
        });

        view9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        view9.setToolTipText("view image files only");
        view9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view9ActionPerformed(evt);
            }
        });

        imagename9.setEditable(false);
        imagename9.setEnabled(false);
        imagename9.setFocusable(false);
        imagename9.setMaximumSize(new java.awt.Dimension(212, 30));
        imagename9.setMinimumSize(new java.awt.Dimension(212, 30));
        imagename9.setPreferredSize(new java.awt.Dimension(212, 30));

        imagename10.setEditable(false);
        imagename10.setEnabled(false);
        imagename10.setFocusable(false);
        imagename10.setMaximumSize(new java.awt.Dimension(212, 30));
        imagename10.setMinimumSize(new java.awt.Dimension(212, 30));
        imagename10.setPreferredSize(new java.awt.Dimension(212, 30));

        view10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        view10.setToolTipText("view image files only");
        view10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view10ActionPerformed(evt);
            }
        });

        download10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        download10.setToolTipText("download documents");
        download10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                download10ActionPerformed(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Grade 6");

        imagename11.setEditable(false);
        imagename11.setEnabled(false);
        imagename11.setFocusable(false);
        imagename11.setMaximumSize(new java.awt.Dimension(212, 30));
        imagename11.setMinimumSize(new java.awt.Dimension(212, 30));
        imagename11.setPreferredSize(new java.awt.Dimension(212, 30));

        jLabel32.setBackground(new java.awt.Color(204, 204, 204));
        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Grade 7");

        view11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        view11.setToolTipText("view image files only");
        view11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view11ActionPerformed(evt);
            }
        });

        imagenameenroll.setEditable(false);
        imagenameenroll.setEnabled(false);
        imagenameenroll.setFocusable(false);
        imagenameenroll.setMaximumSize(new java.awt.Dimension(212, 30));
        imagenameenroll.setMinimumSize(new java.awt.Dimension(212, 30));
        imagenameenroll.setPreferredSize(new java.awt.Dimension(212, 30));
        imagenameenroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagenameenrollActionPerformed(evt);
            }
        });

        viewenroll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.jpg"))); // NOI18N
        viewenroll.setToolTipText("view image files only");
        viewenroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewenrollActionPerformed(evt);
            }
        });

        downloadenroll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/downloadImage.jpg"))); // NOI18N
        downloadenroll.setToolTipText("download documents");
        downloadenroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadenrollActionPerformed(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(204, 204, 204));
        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Enrollment Form");

        jButton2.setBackground(new java.awt.Color(230, 230, 230));
        jButton2.setText("DOWNLOAD ALL");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(download4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(download3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(download2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(download1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(downloadk2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(downloadk1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(viewk1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(viewk2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(view1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(view2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(imagenamek2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(imagenamek1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(imagename1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(imagename2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(view3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(view4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(imagename4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(imagename3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(downloadform, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(downloadbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(viewform, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viewbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imagenamebirth, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imagenameform, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(download6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(view6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(download8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(view8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(download7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(view7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(imagename6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(imagename7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(imagename8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(download11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(view11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(imagename11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(download12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(view12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(imagename12, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(download9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(view9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imagename9, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(download10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(view10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imagename10, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(download5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(view5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imagename5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(downloadenroll, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewenroll, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagenameenroll, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imagenameform, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(downloadform, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewbirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imagenamebirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(downloadbirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(downloadk1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(152, 152, 152)
                                .addComponent(imagename4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(imagename2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(imagename1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(viewk1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(imagenamek1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(imagenamek2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(viewk2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(downloadk2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(view1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(download1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(view2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(download2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(view3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(view4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(imagename3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(download3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(download4))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(view5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(download5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imagename5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(view6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(download6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(imagename6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(download7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(view7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(imagename7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(download8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(view8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(imagename8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(download9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(view9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(imagename9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(imagename10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(download10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(view10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(download11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(view11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imagename11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(download12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(view12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(imagename12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(imagenameenroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewenroll, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(downloadenroll)))
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

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

        add_pass.setText("pass");

        add_user.setText("user");

        add_id.setText("id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(add_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(add_user)
                        .addGap(18, 18, 18)
                        .addComponent(add_pass))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addimagepathform, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepathbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepathk1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepathk2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepath1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepath2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepath3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepath4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addimagepath12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepath11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepath10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepath9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepath8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepath7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepath6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addimagepath5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepathform)
                    .addComponent(addimagepath5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepathbirth)
                    .addComponent(addimagepath6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepathk1)
                    .addComponent(addimagepath7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepathk2)
                    .addComponent(addimagepath8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepath1)
                    .addComponent(addimagepath9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepath2)
                    .addComponent(addimagepath10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepath3)
                    .addComponent(addimagepath11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addimagepath4)
                    .addComponent(addimagepath12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_id)
                    .addComponent(add_user)
                    .addComponent(add_pass))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        address.setEditable(false);
        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        address.setEnabled(false);
        address.setFocusable(false);
        address.setMaximumSize(new java.awt.Dimension(68, 26));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        mocc.setEditable(false);
        mocc.setBackground(new java.awt.Color(255, 255, 255));
        mocc.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mocc.setEnabled(false);
        mocc.setFocusable(false);
        mocc.setMaximumSize(new java.awt.Dimension(68, 26));

        religion.setEditable(false);
        religion.setBackground(new java.awt.Color(255, 255, 255));
        religion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        religion.setEnabled(false);
        religion.setFocusable(false);
        religion.setMaximumSize(new java.awt.Dimension(68, 26));

        place.setEditable(false);
        place.setBackground(new java.awt.Color(255, 255, 255));
        place.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        place.setEnabled(false);
        place.setFocusable(false);
        place.setMaximumSize(new java.awt.Dimension(68, 26));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Place of Birth");

        jLabel46.setBackground(new java.awt.Color(204, 204, 204));
        jLabel46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setText("Address");

        jLabel47.setBackground(new java.awt.Color(204, 204, 204));
        jLabel47.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("Call Name");

        callname.setEditable(false);
        callname.setBackground(new java.awt.Color(255, 255, 255));
        callname.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        callname.setEnabled(false);
        callname.setFocusable(false);
        callname.setMaximumSize(new java.awt.Dimension(68, 26));

        lname.setEditable(false);
        lname.setBackground(new java.awt.Color(255, 255, 255));
        lname.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lname.setEnabled(false);
        lname.setFocusable(false);
        lname.setMaximumSize(new java.awt.Dimension(68, 26));

        mother.setEditable(false);
        mother.setBackground(new java.awt.Color(255, 255, 255));
        mother.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mother.setEnabled(false);
        mother.setFocusable(false);
        mother.setMaximumSize(new java.awt.Dimension(68, 26));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Last Name");

        jLabel49.setBackground(new java.awt.Color(204, 204, 204));
        jLabel49.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel49.setText("Date of Birth");

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Middle Name");

        father.setEditable(false);
        father.setBackground(new java.awt.Color(255, 255, 255));
        father.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        father.setEnabled(false);
        father.setFocusable(false);
        father.setMaximumSize(new java.awt.Dimension(68, 26));

        jLabel50.setBackground(new java.awt.Color(204, 204, 204));
        jLabel50.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel50.setText("First Name");

        mname.setEditable(false);
        mname.setBackground(new java.awt.Color(255, 255, 255));
        mname.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mname.setEnabled(false);
        mname.setFocusable(false);
        mname.setMaximumSize(new java.awt.Dimension(68, 26));

        fname.setEditable(false);
        fname.setBackground(new java.awt.Color(255, 255, 255));
        fname.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        fname.setEnabled(false);
        fname.setFocusable(false);
        fname.setMaximumSize(new java.awt.Dimension(68, 26));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        fnum.setEditable(false);
        fnum.setBackground(new java.awt.Color(255, 255, 255));
        fnum.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        fnum.setEnabled(false);
        fnum.setFocusable(false);
        fnum.setMaximumSize(new java.awt.Dimension(68, 26));

        jLabel53.setBackground(new java.awt.Color(204, 204, 204));
        jLabel53.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel53.setText("LRN");

        lrn.setEditable(false);
        lrn.setBackground(new java.awt.Color(255, 255, 255));
        lrn.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lrn.setEnabled(false);
        lrn.setMaximumSize(new java.awt.Dimension(68, 26));
        lrn.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                lrnCaretUpdate(evt);
            }
        });

        focc.setEditable(false);
        focc.setBackground(new java.awt.Color(255, 255, 255));
        focc.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        focc.setEnabled(false);
        focc.setFocusable(false);
        focc.setMaximumSize(new java.awt.Dimension(68, 26));

        mnum.setEditable(false);
        mnum.setBackground(new java.awt.Color(255, 255, 255));
        mnum.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mnum.setEnabled(false);
        mnum.setFocusable(false);
        mnum.setMaximumSize(new java.awt.Dimension(68, 26));

        jLabel48.setBackground(new java.awt.Color(204, 204, 204));
        jLabel48.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("Father");

        jLabel51.setBackground(new java.awt.Color(204, 204, 204));
        jLabel51.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel51.setText("Father #");

        jLabel52.setBackground(new java.awt.Color(204, 204, 204));
        jLabel52.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel52.setText("Father's Occupation");

        jLabel54.setBackground(new java.awt.Color(204, 204, 204));
        jLabel54.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel54.setText("Mother");

        jLabel55.setBackground(new java.awt.Color(204, 204, 204));
        jLabel55.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel55.setText("Mother #");

        jLabel56.setBackground(new java.awt.Color(204, 204, 204));
        jLabel56.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel56.setText("Mother's Occupation");

        jLabel57.setBackground(new java.awt.Color(204, 204, 204));
        jLabel57.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel57.setText("Family Religion");

        birthday.setEditable(false);
        birthday.setBackground(new java.awt.Color(255, 255, 255));
        birthday.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        birthday.setEnabled(false);
        birthday.setFocusable(false);
        birthday.setMaximumSize(new java.awt.Dimension(68, 26));

        studentnum.setEditable(false);
        studentnum.setBackground(new java.awt.Color(255, 255, 255));
        studentnum.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        studentnum.setEnabled(false);
        studentnum.setFocusable(false);
        studentnum.setMaximumSize(new java.awt.Dimension(68, 26));
        studentnum.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                studentnumCaretUpdate(evt);
            }
        });

        jLabel58.setBackground(new java.awt.Color(204, 204, 204));
        jLabel58.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel58.setText("Student Number");

        jLabel59.setBackground(new java.awt.Color(204, 204, 204));
        jLabel59.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel59.setText("Guardian");

        guard.setEditable(false);
        guard.setBackground(new java.awt.Color(255, 255, 255));
        guard.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        guard.setEnabled(false);
        guard.setFocusable(false);
        guard.setMaximumSize(new java.awt.Dimension(68, 26));

        jLabel60.setBackground(new java.awt.Color(204, 204, 204));
        jLabel60.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel60.setText("Guardian #");

        guardnum.setEditable(false);
        guardnum.setBackground(new java.awt.Color(255, 255, 255));
        guardnum.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        guardnum.setEnabled(false);
        guardnum.setFocusable(false);
        guardnum.setMaximumSize(new java.awt.Dimension(68, 26));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lrn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(callname, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(place, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(studentnum, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mocc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(father, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fnum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mother, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(focc, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guard, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardnum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(father, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(studentnum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fnum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lrn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(focc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mother, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mnum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mocc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(callname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(place, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(guardnum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout infopanelLayout = new javax.swing.GroupLayout(infopanel);
        infopanel.setLayout(infopanelLayout);
        infopanelLayout.setHorizontalGroup(
            infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infopanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infopanelLayout.createSequentialGroup()
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(460, 460, 460)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator3)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(classpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infopanelLayout.setVerticalGroup(
            infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infopanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infopanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infopanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(infopanel);

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
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

    private void viewk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewk2ActionPerformed
        String lrnValue = lrn.getText();
        viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImagek2(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_viewk2ActionPerformed

    private void view1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view1ActionPerformed
        String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImage1(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_view1ActionPerformed

    private void view2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view2ActionPerformed
        String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImage2(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_view2ActionPerformed

    private void view3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view3ActionPerformed
        String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImage3(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_view3ActionPerformed

    private void view4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view4ActionPerformed
        String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImage4(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_view4ActionPerformed

    private void downloadbirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadbirthActionPerformed
        downloadbirth(folderName);
    }//GEN-LAST:event_downloadbirthActionPerformed

    private void downloadk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadk1ActionPerformed
        downloadk1(folderName);
    }//GEN-LAST:event_downloadk1ActionPerformed

    private void downloadk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadk2ActionPerformed
        downloadk2(folderName);
    }//GEN-LAST:event_downloadk2ActionPerformed

    private void download1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_download1ActionPerformed
        download1(folderName);
    }//GEN-LAST:event_download1ActionPerformed

    private void download2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_download2ActionPerformed
        download2(folderName);
    }//GEN-LAST:event_download2ActionPerformed

    private void viewformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewformActionPerformed
        String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImageform(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_viewformActionPerformed

    private void viewbirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbirthActionPerformed
        String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImagebirth(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_viewbirthActionPerformed

    private void viewk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewk1ActionPerformed
        String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImagek1(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_viewk1ActionPerformed

    private void downloadformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadformActionPerformed
        downloadform(folderName);
    }//GEN-LAST:event_downloadformActionPerformed

    private void download3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_download3ActionPerformed
        download3(folderName);
    }//GEN-LAST:event_download3ActionPerformed

    private void download4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_download4ActionPerformed
        download4(folderName);
    }//GEN-LAST:event_download4ActionPerformed

    private void download11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_download11ActionPerformed
        download11(folderName);
    }//GEN-LAST:event_download11ActionPerformed

    private void view12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view12ActionPerformed
        String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImage12(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_view12ActionPerformed

    private void download12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_download12ActionPerformed
        download12(folderName);
    }//GEN-LAST:event_download12ActionPerformed

    private void download6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_download6ActionPerformed
        download6(folderName);
    }//GEN-LAST:event_download6ActionPerformed

    private void view5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view5ActionPerformed
        String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImage5(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_view5ActionPerformed

    private void view6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view6ActionPerformed
        String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImage6(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_view6ActionPerformed

    private void download5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_download5ActionPerformed
        download5(folderName);
    }//GEN-LAST:event_download5ActionPerformed

    private void download7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_download7ActionPerformed
        download7(folderName);
    }//GEN-LAST:event_download7ActionPerformed

    private void view7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view7ActionPerformed
        String lrnValue = lrn.getText();
        viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImage7(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_view7ActionPerformed

    private void download8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_download8ActionPerformed
        download8(folderName);
    }//GEN-LAST:event_download8ActionPerformed

    private void view8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view8ActionPerformed
        String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImage8(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_view8ActionPerformed

    private void download9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_download9ActionPerformed
        download9(folderName);
    }//GEN-LAST:event_download9ActionPerformed

    private void view9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view9ActionPerformed
        String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImage9(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_view9ActionPerformed

    private void view10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view10ActionPerformed
        String lrnValue = lrn.getText();
        viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImage10(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_view10ActionPerformed

    private void download10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_download10ActionPerformed
        download10(folderName);
    }//GEN-LAST:event_download10ActionPerformed

    private void view11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view11ActionPerformed
        String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImage11(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_view11ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lrnCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_lrnCaretUpdate
        String lrnText = lrn.getText().trim();
        if (!lrnText.matches("\\d+")&& !lrnText.equals("")) {
            lrn.setForeground(Color.red);
        }else{
            lrn.setForeground(Color.black);
        }
    }//GEN-LAST:event_lrnCaretUpdate

    private void imagename12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagename12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagename12ActionPerformed

    private void gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeActionPerformed

    private void studentnumCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_studentnumCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_studentnumCaretUpdate

    private void imagenameenrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagenameenrollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagenameenrollActionPerformed

    private void viewenrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewenrollActionPerformed
       String lrnValue = lrn.getText();
         viewImage_Archive view = new viewImage_Archive(this);
        view.forConnection(con, serverIP, userID, passwordID);
        view.Connect();
        view.LoadImageenroll(lrnValue);
        view.setVisible(true);
    }//GEN-LAST:event_viewenrollActionPerformed

    private void downloadenrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadenrollActionPerformed
        downloadenroll(folderName);
    }//GEN-LAST:event_downloadenrollActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        downloadAll();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel add_id;
    public javax.swing.JLabel add_pass;
    public javax.swing.JLabel add_user;
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
    private javax.swing.JLabel addimagepathform;
    private javax.swing.JLabel addimagepathk1;
    private javax.swing.JLabel addimagepathk2;
    public javax.swing.JTextField address;
    public javax.swing.JTextField birthday;
    public javax.swing.JTextField callname;
    private javax.swing.JPanel classpanel;
    private javax.swing.JButton download1;
    private javax.swing.JButton download10;
    private javax.swing.JButton download11;
    private javax.swing.JButton download12;
    private javax.swing.JButton download2;
    private javax.swing.JButton download3;
    private javax.swing.JButton download4;
    private javax.swing.JButton download5;
    private javax.swing.JButton download6;
    private javax.swing.JButton download7;
    private javax.swing.JButton download8;
    private javax.swing.JButton download9;
    private javax.swing.JButton downloadbirth;
    private javax.swing.JButton downloadenroll;
    private javax.swing.JButton downloadform;
    private javax.swing.JButton downloadk1;
    private javax.swing.JButton downloadk2;
    public javax.swing.JTextField father;
    public javax.swing.JTextField fname;
    public javax.swing.JTextField fnum;
    public javax.swing.JTextField focc;
    public javax.swing.JTextField grade;
    public javax.swing.JTextField guard;
    public javax.swing.JTextField guardnum;
    public javax.swing.JTextField imagename1;
    public javax.swing.JTextField imagename10;
    public javax.swing.JTextField imagename11;
    public javax.swing.JTextField imagename12;
    public javax.swing.JTextField imagename2;
    public javax.swing.JTextField imagename3;
    public javax.swing.JTextField imagename4;
    public javax.swing.JTextField imagename5;
    public javax.swing.JTextField imagename6;
    public javax.swing.JTextField imagename7;
    public javax.swing.JTextField imagename8;
    public javax.swing.JTextField imagename9;
    public javax.swing.JTextField imagenamebirth;
    public javax.swing.JTextField imagenameenroll;
    public javax.swing.JTextField imagenameform;
    public javax.swing.JTextField imagenamek1;
    public javax.swing.JTextField imagenamek2;
    private javax.swing.JPanel infopanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JTextField lname;
    public javax.swing.JTextField lrn;
    private javax.swing.JPanel mainpanel;
    public javax.swing.JTextField mname;
    public javax.swing.JTextField mnum;
    public javax.swing.JTextField mocc;
    public javax.swing.JTextField mother;
    public javax.swing.JTextField place;
    public javax.swing.JTextField religion;
    public javax.swing.JTextField section;
    public javax.swing.JTextField strand;
    public javax.swing.JTextField studentnum;
    public javax.swing.JTextField track;
    private javax.swing.JButton view1;
    private javax.swing.JButton view10;
    private javax.swing.JButton view11;
    private javax.swing.JButton view12;
    private javax.swing.JButton view2;
    private javax.swing.JButton view3;
    private javax.swing.JButton view4;
    private javax.swing.JButton view5;
    private javax.swing.JButton view6;
    private javax.swing.JButton view7;
    private javax.swing.JButton view8;
    private javax.swing.JButton view9;
    private javax.swing.JButton viewbirth;
    private javax.swing.JButton viewenroll;
    private javax.swing.JButton viewform;
    private javax.swing.JButton viewk1;
    private javax.swing.JButton viewk2;
    // End of variables declaration//GEN-END:variables

//
//    
//public void downloadform() {
//   try {
//        String LRN = lrn.getText();
//
//        // SQL query to retrieve the blob data, image name, and file path
//        String sql = "SELECT imageFileform, imageNameform, imagePathform FROM students WHERE lrn=?";
//        
//        pts = con.prepareStatement(sql);
//        pts.setString(1, LRN); // Set the parameter value
//        rs = pts.executeQuery();
//
//        if (rs.next()) {
//            // Retrieve the blob data
//            Blob blob = rs.getBlob("imageFileform");
//            
//            // Check if the blob data is not null and has non-zero length
//            if (blob != null && blob.length() > 0) {
//                // Retrieve the image name and file path from the database
//                String imageName = rs.getString("imageNameform");
//                String imagePath = rs.getString("imagePathform");
//                
//                // Determine the default download folder path
//                String defaultDownloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads";
//
//                // Create the default download folder if it does not exist
//                File defaultDownloadFolder = new File(defaultDownloadFolderPath);
//                if (!defaultDownloadFolder.exists()) {
//                    defaultDownloadFolder.mkdirs();
//                }
//                
//                // Extract file extension from the file path
//                String fileExtension = imagePath.substring(imagePath.lastIndexOf('.'));
//                
//             
//
//                // Create a file in the default download folder with the image name from the database
//                // and a random number appended to it
//                String fileName = imageName  + fileExtension;
//                File file = new File(defaultDownloadFolder, fileName);
//
//                // Check if the file already exists
//                int fileNumber = 1;
//                while (file.exists()) {
//                    fileName = imageName + "(" + fileNumber + ")" + fileExtension;
//                    file = new File(defaultDownloadFolder, fileName);
//                    fileNumber++;
//                }
//
//                try (FileOutputStream fos = new FileOutputStream(file);
//                     InputStream in = blob.getBinaryStream()) {
//                    byte[] buffer = new byte[4096];
//                    int bytesRead;
//                    while ((bytesRead = in.read(buffer)) != -1) {
//                        fos.write(buffer, 0, bytesRead);
//                    }
//                }
//
//                System.out.println("File downloaded successfully.");
//                System.out.println("File saved at: " + file.getAbsolutePath()); // Print the absolute path of the downloaded file
//                
//                // Show JOptionPane message with file directory
//                JOptionPane.showMessageDialog(null, "File downloaded successfully.\nFile saved at: " + file.getAbsolutePath());
//            } else {
//                System.out.println("No image available for download.");
//                JOptionPane.showMessageDialog(null, "No image available for download.");
//            }
//        } else {
//            System.out.println("No data found.");
//        }
//    } catch (SQLException | IOException e) {
//        e.printStackTrace();
//    }
//}

    
     public void downloadform(String folderName) {
        try {
            String LRN = lrn.getText();

            // SQL query to retrieve the blob data, image name, and file path
            String sql = "SELECT imageFileform, imageNameform, imagePathform FROM archive_students WHERE lrn=?";

            pts = con.prepareStatement(sql);
            pts.setString(1, LRN); // Set the parameter value
            rs = pts.executeQuery();

            if (rs.next()) {
                // Retrieve the blob data
                Blob blob = rs.getBlob("imageFileform");

                // Check if the blob data is not null and has non-zero length
                if (blob != null && blob.length() > 0) {
                    // Retrieve the image name and file path from the database
                    String imageName = rs.getString("imageNameform");
                    String imagePath = rs.getString("imagePathform");

                    // Determine the default download folder path
                    String defaultDownloadFolderPath;
                    if (folderName != null && !folderName.isEmpty()) {
                        defaultDownloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + folderName;
                    } else {
                        defaultDownloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads";
                    }

                    // Create the default download folder if it does not exist
                    File defaultDownloadFolder = new File(defaultDownloadFolderPath);
                    if (!defaultDownloadFolder.exists()) {
                        defaultDownloadFolder.mkdirs();
                    }

                    // Extract file extension from the file path
                    String fileExtension = imagePath.substring(imagePath.lastIndexOf('.'));

                    // Create a file in the default download folder with the image name from the database
                    // and a random number appended to it
                    String fileName = imageName + fileExtension;
                    File file = new File(defaultDownloadFolder, fileName);

                    // Check if the file already exists
                    int fileNumber = 1;
                    while (file.exists()) {
                        fileName = imageName + "(" + fileNumber + ")" + fileExtension;
                        file = new File(defaultDownloadFolder, fileName);
                        fileNumber++;
                    }

                    try (FileOutputStream fos = new FileOutputStream(file);
                         InputStream in = blob.getBinaryStream()) {
                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = in.read(buffer)) != -1) {
                            fos.write(buffer, 0, bytesRead);
                        }
                    }

                    System.out.println("File downloaded successfully.");
                    System.out.println("File saved at: " + file.getAbsolutePath()); // Print the absolute path of the downloaded file

                    // Show JOptionPane message with file directory
                    if (folderName == null || folderName.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "File downloaded successfully.\nFile saved at: " + file.getAbsolutePath());
                    }
                } else {
                    System.out.println("No image available for download.");
                    
                    if (folderName != null ){
                         JOptionPane.showMessageDialog(null, "No image available for download.");
                    }
                   
                    
                }
            } else {
                System.out.println("No data found.");
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }


     
     
     public void downloadbirth(String folderName) {
        try {
            String LRN = lrn.getText();

            // SQL query to retrieve the blob data, image name, and file path
            String sql = "SELECT imageFilebirth, imageNamebirth, imagePathbirth FROM archive_students WHERE lrn=?";

            pts = con.prepareStatement(sql);
            pts.setString(1, LRN); // Set the parameter value
            rs = pts.executeQuery();

            if (rs.next()) {
                // Retrieve the blob data
                Blob blob = rs.getBlob("imageFilebirth");

                // Check if the blob data is not null and has non-zero length
                if (blob != null && blob.length() > 0) {
                    // Retrieve the image name and file path from the database
                    String imageName = rs.getString("imageNamebirth");
                    String imagePath = rs.getString("imagePathbirth");

                    // Determine the default download folder path
                    String defaultDownloadFolderPath;
                    if (folderName != null && !folderName.isEmpty()) {
                        defaultDownloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + folderName;
                    } else {
                        defaultDownloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads";
                    }

                    // Create the default download folder if it does not exist
                    File defaultDownloadFolder = new File(defaultDownloadFolderPath);
                    if (!defaultDownloadFolder.exists()) {
                        defaultDownloadFolder.mkdirs();
                    }

                    // Extract file extension from the file path
                    String fileExtension = imagePath.substring(imagePath.lastIndexOf('.'));

                    // Create a file in the default download folder with the image name from the database
                    // and a random number appended to it
                    String fileName = imageName + fileExtension;
                    File file = new File(defaultDownloadFolder, fileName);

                    // Check if the file already exists
                    int fileNumber = 1;
                    while (file.exists()) {
                        fileName = imageName + "(" + fileNumber + ")" + fileExtension;
                        file = new File(defaultDownloadFolder, fileName);
                        fileNumber++;
                    }

                    try (FileOutputStream fos = new FileOutputStream(file);
                         InputStream in = blob.getBinaryStream()) {
                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = in.read(buffer)) != -1) {
                            fos.write(buffer, 0, bytesRead);
                        }
                    }

                    System.out.println("File downloaded successfully.");
                    System.out.println("File saved at: " + file.getAbsolutePath()); // Print the absolute path of the downloaded file

                    // Show JOptionPane message with file directory
                    if (folderName == null || folderName.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "File downloaded successfully.\nFile saved at: " + file.getAbsolutePath());
                    }
                } else {
                    System.out.println("No image available for download.");
                    
                }
            } else {
                System.out.println("No data found.");
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
     
     
     
     public void downloadenroll(String folderName) {
        try {
            String LRN = lrn.getText();

            // SQL query to retrieve the blob data, image name, and file path
            String sql = "SELECT imageFileEnroll, imageNameEnroll, imagePathEnroll FROM archive_students WHERE lrn=?";

            pts = con.prepareStatement(sql);
            pts.setString(1, LRN); // Set the parameter value
            rs = pts.executeQuery();

            if (rs.next()) {
                // Retrieve the blob data
                Blob blob = rs.getBlob("imageFileEnroll");

                // Check if the blob data is not null and has non-zero length
                if (blob != null && blob.length() > 0) {
                    // Retrieve the image name and file path from the database
                    String imageName = rs.getString("imageNameEnroll");
                    String imagePath = rs.getString("imagePathEnroll");

                    // Determine the default download folder path
                    String defaultDownloadFolderPath;
                    if (folderName != null && !folderName.isEmpty()) {
                        defaultDownloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + folderName;
                    } else {
                        defaultDownloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads";
                    }

                    // Create the default download folder if it does not exist
                    File defaultDownloadFolder = new File(defaultDownloadFolderPath);
                    if (!defaultDownloadFolder.exists()) {
                        defaultDownloadFolder.mkdirs();
                    }

                    // Extract file extension from the file path
                    String fileExtension = imagePath.substring(imagePath.lastIndexOf('.'));

                    // Create a file in the default download folder with the image name from the database
                    // and a random number appended to it
                    String fileName = imageName + fileExtension;
                    File file = new File(defaultDownloadFolder, fileName);

                    // Check if the file already exists
                    int fileNumber = 1;
                    while (file.exists()) {
                        fileName = imageName + "(" + fileNumber + ")" + fileExtension;
                        file = new File(defaultDownloadFolder, fileName);
                        fileNumber++;
                    }

                    try (FileOutputStream fos = new FileOutputStream(file);
                         InputStream in = blob.getBinaryStream()) {
                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = in.read(buffer)) != -1) {
                            fos.write(buffer, 0, bytesRead);
                        }
                    }

                    System.out.println("File downloaded successfully.");
                    System.out.println("File saved at: " + file.getAbsolutePath()); // Print the absolute path of the downloaded file

                    // Show JOptionPane message with file directory
                    if (folderName == null || folderName.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "File downloaded successfully.\nFile saved at: " + file.getAbsolutePath());
                    }
                } else {
                    System.out.println("No image available for download.");
                    
                }
            } else {
                System.out.println("No data found.");
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
     
     
     public void downloadk1(String folderName) {
        try {
            String LRN = lrn.getText();

            // SQL query to retrieve the blob data, image name, and file path
            String sql = "SELECT imageFilek1, imageNamek1, imagePathk1 FROM archive_students WHERE lrn=?";

            pts = con.prepareStatement(sql);
            pts.setString(1, LRN); // Set the parameter value
            rs = pts.executeQuery();

            if (rs.next()) {
                // Retrieve the blob data
                Blob blob = rs.getBlob("imageFilek1");

                // Check if the blob data is not null and has non-zero length
                if (blob != null && blob.length() > 0) {
                    // Retrieve the image name and file path from the database
                    String imageName = rs.getString("imageNamek1");
                    String imagePath = rs.getString("imagePathk1");

                    // Determine the default download folder path
                    String defaultDownloadFolderPath;
                    if (folderName != null && !folderName.isEmpty()) {
                        defaultDownloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + folderName;
                    } else {
                        defaultDownloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads";
                    }

                    // Create the default download folder if it does not exist
                    File defaultDownloadFolder = new File(defaultDownloadFolderPath);
                    if (!defaultDownloadFolder.exists()) {
                        defaultDownloadFolder.mkdirs();
                    }

                    // Extract file extension from the file path
                    String fileExtension = imagePath.substring(imagePath.lastIndexOf('.'));

                    // Create a file in the default download folder with the image name from the database
                    // and a random number appended to it
                    String fileName = imageName + fileExtension;
                    File file = new File(defaultDownloadFolder, fileName);

                    // Check if the file already exists
                    int fileNumber = 1;
                    while (file.exists()) {
                        fileName = imageName + "(" + fileNumber + ")" + fileExtension;
                        file = new File(defaultDownloadFolder, fileName);
                        fileNumber++;
                    }

                    try (FileOutputStream fos = new FileOutputStream(file);
                         InputStream in = blob.getBinaryStream()) {
                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = in.read(buffer)) != -1) {
                            fos.write(buffer, 0, bytesRead);
                        }
                    }

                    System.out.println("File downloaded successfully.");
                    System.out.println("File saved at: " + file.getAbsolutePath()); // Print the absolute path of the downloaded file

                    // Show JOptionPane message with file directory
                    if (folderName == null || folderName.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "File downloaded successfully.\nFile saved at: " + file.getAbsolutePath());
                    }
                } else {
                    System.out.println("No image available for download.");
                     
                }
            } else {
                System.out.println("No data found.");
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
     
     
     
     public void downloadk2(String folderName) {
        try {
            String LRN = lrn.getText();

            // SQL query to retrieve the blob data, image name, and file path
            String sql = "SELECT imageFilek2, imageNamek2, imagePathk2 FROM archive_students WHERE lrn=?";

            pts = con.prepareStatement(sql);
            pts.setString(1, LRN); // Set the parameter value
            rs = pts.executeQuery();

            if (rs.next()) {
                // Retrieve the blob data
                Blob blob = rs.getBlob("imageFilek2");

                // Check if the blob data is not null and has non-zero length
                if (blob != null && blob.length() > 0) {
                    // Retrieve the image name and file path from the database
                    String imageName = rs.getString("imageNamek2");
                    String imagePath = rs.getString("imagePathk2");

                    // Determine the default download folder path
                    String defaultDownloadFolderPath;
                    if (folderName != null && !folderName.isEmpty()) {
                        defaultDownloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + folderName;
                    } else {
                        defaultDownloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads";
                    }

                    // Create the default download folder if it does not exist
                    File defaultDownloadFolder = new File(defaultDownloadFolderPath);
                    if (!defaultDownloadFolder.exists()) {
                        defaultDownloadFolder.mkdirs();
                    }

                    // Extract file extension from the file path
                    String fileExtension = imagePath.substring(imagePath.lastIndexOf('.'));

                    // Create a file in the default download folder with the image name from the database
                    // and a random number appended to it
                    String fileName = imageName + fileExtension;
                    File file = new File(defaultDownloadFolder, fileName);

                    // Check if the file already exists
                    int fileNumber = 1;
                    while (file.exists()) {
                        fileName = imageName + "(" + fileNumber + ")" + fileExtension;
                        file = new File(defaultDownloadFolder, fileName);
                        fileNumber++;
                    }

                    try (FileOutputStream fos = new FileOutputStream(file);
                         InputStream in = blob.getBinaryStream()) {
                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = in.read(buffer)) != -1) {
                            fos.write(buffer, 0, bytesRead);
                        }
                    }

                    System.out.println("File downloaded successfully.");
                    System.out.println("File saved at: " + file.getAbsolutePath()); // Print the absolute path of the downloaded file

                    // Show JOptionPane message with file directory
                    if (folderName == null || folderName.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "File downloaded successfully.\nFile saved at: " + file.getAbsolutePath());
                    }
                } else {
                    System.out.println("No image available for download.");
                   
                }
            } else {
                System.out.println("No data found.");
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
     
     
     public void download(int imageIndex, String folderName) {
    try {
        String LRN = lrn.getText();

        // SQL query to retrieve the blob data, image name, and file path
        String sql = "SELECT imageFile" + imageIndex + ", imageName" + imageIndex + ", imagePath" + imageIndex + " FROM archive_students WHERE lrn=?";

        pts = con.prepareStatement(sql);
        pts.setString(1, LRN); // Set the parameter value
        rs = pts.executeQuery();

        if (rs.next()) {
            // Retrieve the blob data
            Blob blob = rs.getBlob("imageFile" + imageIndex);

            // Check if the blob data is not null and has non-zero length
            if (blob != null && blob.length() > 0) {
                // Retrieve the image name and file path from the database
                String imageName = rs.getString("imageName" + imageIndex);
                String imagePath = rs.getString("imagePath" + imageIndex);

                // Determine the default download folder path
                String defaultDownloadFolderPath;
                if (folderName != null && !folderName.isEmpty()) {
                    defaultDownloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + folderName;
                } else {
                    defaultDownloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads";
                }

                // Create the default download folder if it does not exist
                File defaultDownloadFolder = new File(defaultDownloadFolderPath);
                if (!defaultDownloadFolder.exists()) {
                    defaultDownloadFolder.mkdirs();
                }

                // Extract file extension from the file path
                String fileExtension = imagePath.substring(imagePath.lastIndexOf('.'));

                // Create a file in the default download folder with the image name from the database
                // and a random number appended to it
                String fileName = imageName + fileExtension;
                File file = new File(defaultDownloadFolder, fileName);

                // Check if the file already exists
                int fileNumber = 1;
                while (file.exists()) {
                    fileName = imageName + "(" + fileNumber + ")" + fileExtension;
                    file = new File(defaultDownloadFolder, fileName);
                    fileNumber++;
                }

                try (FileOutputStream fos = new FileOutputStream(file);
                     InputStream in = blob.getBinaryStream()) {
                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = in.read(buffer)) != -1) {
                        fos.write(buffer, 0, bytesRead);
                    }
                }

                System.out.println("File downloaded successfully.");
                System.out.println("File saved at: " + file.getAbsolutePath()); // Print the absolute path of the downloaded file

                // Show JOptionPane message with file directory
                if (folderName == null || folderName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "File downloaded successfully.\nFile saved at: " + file.getAbsolutePath());
                }
            } else {
                System.out.println("No image available for download.");
              
            }
        } else {
            System.out.println("No data found.");
        }
    } catch (SQLException | IOException e) {
        e.printStackTrace();
    }
}


public void download1(String folderName) {
    download(1, folderName);
}

public void download2(String folderName) {
    download(2, folderName);
}

public void download3(String folderName) {
    download(3, folderName);
}

public void download4(String folderName) {
    download(4, folderName);
}

public void download5(String folderName) {
    download(5, folderName);
}

public void download6(String folderName) {
    download(6, folderName);
}

public void download7(String folderName) {
    download(7, folderName);
}

public void download8(String folderName) {
    download(8, folderName);
}

public void download9(String folderName) {
    download(9, folderName);
}

public void download10(String folderName) {
    download(10, folderName);
}

public void download11(String folderName) {
    download(11, folderName);
}

public void download12(String folderName) {
    download(12, folderName);
}

















public void edit (){
mainInstance.SelectEdit2(lrn.getText());
}



  private String folderName = null;

    public void createFolderInDownloads() {
          folderName = JOptionPane.showInputDialog(null, "Enter the name of the folder you want to create:");
    
    if (folderName != null) {
        if (!folderName.isEmpty()) {
            String home = System.getProperty("user.home");
            String downloads = home + File.separator + "Downloads";
            String folderPath = downloads + File.separator + folderName;
            File folder = new File(folderPath);

            if (folder.exists()) {
                JOptionPane.showMessageDialog(null, "Folder already exists!");
            } else {
                boolean created = folder.mkdir();
                if (created) {
                    JOptionPane.showMessageDialog(null, "Folder created successfully at: " + folderPath);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to create folder!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Folder name cannot be empty!");
        }
    } 
    }

    public void downloadAll() {
        createFolderInDownloads();
        
        if (folderName != null && !folderName.isEmpty()){
         downloadform(folderName);
        downloadbirth(folderName);
        downloadenroll(folderName);
        downloadk1(folderName);
        downloadk2(folderName);
        download1(folderName);
        download2(folderName);
        download3(folderName);
        download4(folderName);
        download5(folderName);
        download6(folderName);
        download7(folderName);
        download8(folderName);
        download9(folderName);
        download10(folderName);
        download11(folderName);
        download12(folderName);
        
        
        }
        
       
        
        folderName = null;
      
        
        
    }
}
