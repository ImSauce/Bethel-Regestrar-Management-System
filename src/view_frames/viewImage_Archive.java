
package view_frames;

import frame.main;
import frame.view;
import frame.view_archive;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import server.serverCredentials;


public class viewImage_Archive extends javax.swing.JFrame {

 
   
 public Connection con = null;
PreparedStatement pst = null;
ResultSet rs;
private ImageIcon format1 = null;

public void forConnection(Connection conn, String serverIP,String userID ,String passwordID){
        
        add_user.setText(userID);
        
        add_id.setText(serverIP);
        add_pass.setText(passwordID);
        
       Connect();
        
 
    }


public void Connect() {
        serverCredentials sv = new serverCredentials();
        sv.setServerIP(viewInstance.add_id.getText());
        sv.setUserID(viewInstance.add_user.getText());
        sv.setPass(viewInstance.add_pass.getText());
        
        
        
        
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

 private final view_archive viewInstance;
  
    public viewImage_Archive(view_archive viewInstance) {
        initComponents();
        ImageIcon icon = new ImageIcon ("RMSLogo.png");
        setIconImage(icon.getImage());
        setTitle("view image");
        
       this.viewInstance = viewInstance;
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // Add a WindowListener to handle the closing event
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                // Hide the frame instead of closing
                setVisible(false);
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        imagepanel = new javax.swing.JPanel();
        view = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        add_id = new javax.swing.JLabel();
        add_user = new javax.swing.JLabel();
        add_pass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));

        imagepanel.setBackground(new java.awt.Color(235, 235, 235));

        view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout imagepanelLayout = new javax.swing.GroupLayout(imagepanel);
        imagepanel.setLayout(imagepanelLayout);
        imagepanelLayout.setHorizontalGroup(
            imagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        imagepanelLayout.setVerticalGroup(
            imagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        scroll.setViewportView(imagepanel);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/zoom-out.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/zoom-in.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainpanelLayout.createSequentialGroup()
                    .addGap(404, 404, 404)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(405, Short.MAX_VALUE)))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE))
            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainpanelLayout.createSequentialGroup()
                    .addGap(319, 319, 319)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(320, Short.MAX_VALUE)))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        zoomIcon2(view, 0.9);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        zoomIcon(view, 1.1);
    }//GEN-LAST:event_jButton1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel add_id;
    public javax.swing.JLabel add_pass;
    public javax.swing.JLabel add_user;
    private javax.swing.JPanel imagepanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables


private void zoomIcon(JLabel label, double factor) {
        ImageIcon icon = (ImageIcon) label.getIcon();
        Image img = icon.getImage();
        
        int width = (int) (img.getWidth(null) * factor);
        int height = (int) (img.getHeight(null) * factor);
        
        Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(newImg));
    }

    private void zoomIcon2(JLabel label, double factor) {
    ImageIcon icon = (ImageIcon) label.getIcon();
    Image img = icon.getImage();
    
    int width = (int) (img.getWidth(null) * factor);
    int height = (int) (img.getHeight(null) * factor);
    
    Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    label.setIcon(new ImageIcon(newImg));
}

    
    
    
    public void LoadImageform(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFileform FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Loadform();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Loadform(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFileform");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     public void LoadImageenroll(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFileEnroll FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Loadenroll();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Loadenroll(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFileEnroll");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    
    
     public void LoadImagebirth(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFilebirth FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Loadbirth();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Loadbirth(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFilebirth");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    
    
    
    
     public void LoadImage1(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFile1 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Load1();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
     
     
     
     
      
     public void LoadImagek1(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFilek1 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Loadk1();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Loadk1(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFilek1");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }

    
    
     public void LoadImagek2(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFilek2 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Loadk2();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Loadk2(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFilek2");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    
    

    public void Load1(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFile1");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }

    
    
    
    
     public void LoadImage2(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFile2 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Load2();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Load2(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFile2");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    
    
    
     public void LoadImage3(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFile3 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Load3();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Load3(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFile3");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }

    
    
     
     public void LoadImage4(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFile4 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Load4();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Load4(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFile4");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    
    
     public void LoadImage5(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFile5 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Load5();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Load5(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFile5");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    
     public void LoadImage6(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFile6 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Load6();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Load6(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFile6");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    
    
    
    
    public void LoadImage7(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFile7 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Load7();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Load7(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFile7");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }

    
    public void LoadImage8(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFile8 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Load8();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Load8(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFile8");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    
    
    public void LoadImage9(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFile9 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Load9();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Load9(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFile9");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }


    public void LoadImage10(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFile10 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Load10();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Load10(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFile10");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    
    
    
    public void LoadImage11(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFile11 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Load11();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Load11(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFile11");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }


    public void LoadImage12(String LRN){
      
       
  try {
       
        System.out.println(LRN);
        
        pst = con.prepareStatement("SELECT imageFile12 FROM archive_students WHERE lrn=?");
        pst.setString(1, LRN);
        System.out.println(pst);
        // Execute the query and assign the result set to rs
        rs = pst.executeQuery();

        if (rs.next()){
        Load12();
        
        
        
        } else {
            JOptionPane.showMessageDialog(this, "no image found");
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  
  
   }
    

    public void Load12(){
   
    try {
        
        byte[] imagedata = rs.getBytes("imageFile12");
        format1 = new ImageIcon(imagedata);
        Image mm = format1.getImage();
        Image img2 = mm.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        view.setIcon(image);
       
       
    } catch (SQLException ex) {
        Logger.getLogger(viewImage_Archive.class.getName()).log(Level.SEVERE, null, ex);
    }
   }

    
    
}
