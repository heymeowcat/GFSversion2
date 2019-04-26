package Frames;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    static ImageIcon icon;
    static String monthnow;
    static String yearnow;
    static String daterep;

    public Login() {

        initComponents();

        new Thread() {
            public void run() {
                while (true) {   //get date time and month
                    Date timenow = new Date();
                    Date datenow = new Date();
                    Date month = new Date();
                    Date year = new Date();
                    Date datea = new Date();
                    SimpleDateFormat sdft = new SimpleDateFormat("hh:mm:ss a");  //time 12h
                    SimpleDateFormat sdfd = new SimpleDateFormat("dd / MM / yyyy"); //date/month/year
                    SimpleDateFormat sdftodaysales = new SimpleDateFormat("yyyy-MM-dd"); //date-month-year
                    SimpleDateFormat tomonth = new SimpleDateFormat("MM"); //month
                    SimpleDateFormat toyear = new SimpleDateFormat("yyyy"); //year
                    String time = "" + sdft.format(timenow); //present time 
                    String date = "" + sdfd.format(datenow); //present date
                    monthnow = "" + tomonth.format(month);
                    yearnow = "" + toyear.format(year);
                    daterep = "" + sdftodaysales.format(datea);
                    timelbl.setText(time);
                    datelbl.setText(date);
                }
            }
        }.start();
        Login.this.setExtendedState(JFrame.MAXIMIZED_BOTH); //full screen
        Login.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // do nothing on close
        setIcon();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginpanel = new javax.swing.JPanel();
        mainloginarea = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        usernamelbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        accounttypelbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Green Food Stores");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("login"); // NOI18N
        setUndecorated(true);

        loginpanel.setBackground(new java.awt.Color(229, 229, 229));

        mainloginarea.setBackground(new java.awt.Color(189, 189, 189));

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        login.setText("Login");
        login.setBorder(null);
        login.setContentAreaFilled(false);
        login.setFocusPainted(false);
        login.setOpaque(true);
        login.setPreferredSize(new java.awt.Dimension(140, 40));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginMouseReleased(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jTextField1.setSelectionColor(new java.awt.Color(100, 183, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jPasswordField1.setSelectionColor(new java.awt.Color(100, 183, 0));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        usernamelbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        usernamelbl.setForeground(new java.awt.Color(255, 255, 255));
        usernamelbl.setText("Username");

        passwordlbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        passwordlbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordlbl.setText("Passoword");

        jComboBox1.setBackground(new java.awt.Color(89, 163, 0));
        jComboBox1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Member", "System" }));
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        accounttypelbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        accounttypelbl.setForeground(new java.awt.Color(255, 255, 255));
        accounttypelbl.setText("Account type");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/loginimg.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/greenfoodslight.png"))); // NOI18N

        javax.swing.GroupLayout mainloginareaLayout = new javax.swing.GroupLayout(mainloginarea);
        mainloginarea.setLayout(mainloginareaLayout);
        mainloginareaLayout.setHorizontalGroup(
            mainloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainloginareaLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(mainloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordlbl)
                            .addComponent(usernamelbl))
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(accounttypelbl)
                    .addGroup(mainloginareaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        mainloginareaLayout.setVerticalGroup(
            mainloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainloginareaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(usernamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(passwordlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accounttypelbl)
                .addGap(5, 5, 5)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(224, 224, 224));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/logout.png"))); // NOI18N
        close.setToolTipText("");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setText("Green Food Stores V.2.0");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        footer.setBackground(new java.awt.Color(224, 224, 224));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel7.setText("Vivex.ml");

        datelbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        datelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datelbl.setName("timelbl"); // NOI18N

        timelbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        timelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timelbl.setName("timelbl"); // NOI18N

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datelbl, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(timelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                        .addComponent(timelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addComponent(mainloginarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(mainloginarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/mainicon.png")));
    }

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered

        login.setBackground(new java.awt.Color(229, 229, 229));
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited

        login.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_loginMouseExited

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // login process
        String pass = String.valueOf(jPasswordField1.getPassword()); //convert password into string

        if (jComboBox1.getSelectedItem() == "Admin") {  //login if value of the combobx is admin
            try {
                ResultSet rs = DB.DB.search("SELECT * FROM  `account` WHERE  `userName` LIKE  '" + jTextField1.getText().trim() + "' AND `accounttype` =  'Admin' AND  `password` =  '" + pass + "' ");
                if (rs.next()) { //if username and password is true
                    String activityloglogin = "INSERT INTO `log`(`accountId`,`user`, `activitytype`, `description`) VALUES ('0','Admin','Admin Login','Admin Logged In')";
                    DB.DB.iud(activityloglogin);
                    Dashboard d = new Dashboard();
                    d.setVisible(true); //open dashboard frame
                    this.dispose();
                } else { //for invalid entry
                    String activitylogloginfailed = "INSERT INTO `log`(`accountId`,`user`, `activitytype`, `description`) VALUES ('0','Admin','Admin Login','Admin Login Failed')";
                    try {
                        DB.DB.iud(activitylogloginfailed);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Access Denied", "Access Denied", JOptionPane.ERROR_MESSAGE); //invalid entry message
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (jComboBox1.getSelectedItem() == "Member") {//login if value of the combobx is member
            try {
                ResultSet rs = DB.DB.search("SELECT * FROM  `account` WHERE  `username` =  '" + jTextField1.getText().trim() + "' AND `accounttype` =  'Member' AND  `password` =  '" + pass + "' ");
                if (rs.next()) { //if username and password is true

                    String activityloglogin = "INSERT INTO `log`(`accountId`,`user`, `activitytype`, `description`) VALUES ((SELECT `accountId` FROM `account` WHERE `userName`= '" + jTextField1.getText() + "'),'" + jComboBox1.getSelectedItem().toString() + "','Member Login','" + jTextField1.getText() + " Logged In')";
                    DB.DB.iud(activityloglogin);
                    ResultSet ga = DB.DB.search("SELECT date FROM `employee_attendance` WHERE empid=(SELECT `accountId` FROM `account` WHERE `userName`= '" + jTextField1.getText() + "') and month='" + monthnow + "' and year='" + yearnow + "' and date='" + daterep + "' ");
                    if (!ga.isBeforeFirst()) {
                        String empattendance = "INSERT INTO `employee_attendance` (`employee_id`, `month`,  `year`, `empid`,`date`) VALUES ((SELECT `accountId` FROM `account` WHERE `userName`= '" + jTextField1.getText() + "'), '" + monthnow + "', '" + yearnow + "',(SELECT `accountId` FROM `account` WHERE `userName`= '" + jTextField1.getText() + "'),'" + daterep + "');";
                        DB.DB.iud(empattendance);
                    }
                    String memberid = jTextField1.getText();
                    new MembersDashboard(memberid).setVisible(true);
                    setVisible(false);

                } else { //for invalid entry
                    String activitylogloginfailed = "INSERT  INTO `log`(`accountId`,`user`, `activitytype`, `description`) VALUES ((SELECT `accountId` FROM `account` WHERE `userName`= '" + jTextField1.getText() + "'),'" + jComboBox1.getSelectedItem().toString() + "','Member Login','" + jTextField1.getText() + " Login Failed')"; // adding invalid entry data to the table
                    try {
                        DB.DB.iud(activitylogloginfailed);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Access Denied", "Access Denied", JOptionPane.ERROR_MESSAGE); //error message
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (jComboBox1.getSelectedItem() == "System") {  //login if value of the combobx is System
            try {
               String usn="gfs";
               String psn="12345678";
               if(usn.equals(jTextField1.getText()) && psn.equals(jPasswordField1.getText())){
                     System s = new System();
                     s.setVisible(true);
                     setVisible(false);
               }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_loginActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        try {
            String systart = "INSERT INTO `log`(`accountId`,`user`, `activitytype`, `description`) VALUES ('0','System','System Exit','System Exited')";
            DB.DB.iud(systart);
        } catch (Exception e) {
        }

        java.lang.System.exit(0);
        // close button action
    }//GEN-LAST:event_closeMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jPasswordField1.grabFocus();//focusing a component
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed

        // login process
        String pass = String.valueOf(jPasswordField1.getPassword());

        if (jComboBox1.getSelectedItem() == "Admin") { //login if value of the combobx is admin
            try {
                ResultSet rs = DB.DB.search("SELECT * FROM  `account` WHERE  `userName` LIKE  '" + jTextField1.getText().trim() + "' AND `accounttype` =  'Admin' AND  `password` =  '" + pass + "' ");
                if (rs.next()) { //if username and password is true
                    String activityloglogin = "INSERT INTO `log`(`accountId`,`user`, `activitytype`, `description`) VALUES ('0','Admin','Admin Login','Admin Logged In')";
                    DB.DB.iud(activityloglogin);
                    Dashboard d = new Dashboard();
                    d.setVisible(true); // open dashboard frame
                    this.dispose();
                } else { //for invalid entry
                    String activitylogloginfailed = "INSERT INTO `log`(`accountId`,`user`, `activitytype`, `description`) VALUES ('0','Admin','Admin Login','Admin Login Failed')";
                    try {
                        DB.DB.iud(activitylogloginfailed);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Access Denied", "Access Denied", JOptionPane.ERROR_MESSAGE);//error message for invalid entry
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (jComboBox1.getSelectedItem() == "Member") { // check if the value of the combobox is memeber
            try {
                ResultSet rs = DB.DB.search("SELECT * FROM  `account` WHERE  `username` =  '" + jTextField1.getText().trim() + "' AND `accounttype` =  'Member' AND  `password` =  '" + pass + "' ");
                if (rs.next()) {

                    String activityloglogin = "INSERT INTO `log`(`accountId`,`user`, `activitytype`, `description`) VALUES ((SELECT `accountId` FROM `account` WHERE `userName`= '" + jTextField1.getText() + "'),'" + jComboBox1.getSelectedItem().toString() + "','Member Login','" + jTextField1.getText() + " Logged In')";
                    DB.DB.iud(activityloglogin);
                    ResultSet ga = DB.DB.search("SELECT date FROM `employee_attendance` WHERE empid=(SELECT `accountId` FROM `account` WHERE `userName`= '" + jTextField1.getText() + "') and month='" + monthnow + "' and year='" + yearnow + "' and date='" + daterep + "' ");
                    if (!ga.isBeforeFirst()) {
                        String empattendance = "INSERT INTO `employee_attendance` (`employee_id`, `month`,  `year`, `empid`,`date`) VALUES ((SELECT `accountId` FROM `account` WHERE `userName`= '" + jTextField1.getText() + "'), '" + monthnow + "', '" + yearnow + "',(SELECT `accountId` FROM `account` WHERE `userName`= '" + jTextField1.getText() + "'),'" + daterep + "');";
                        DB.DB.iud(empattendance);
                    }
                    String memberid = jTextField1.getText();
                    new MembersDashboard(memberid).setVisible(true); //open memberdashboard frame
                    setVisible(false); //close this frame

                } else { // for invalid entry
                    String activitylogloginfailed = "INSERT  INTO `log`(`accountId`,`user`, `activitytype`, `description`) VALUES ((SELECT `accountId` FROM `account` WHERE `userName`= '" + jTextField1.getText() + "'),'" + jComboBox1.getSelectedItem().toString() + "','Member Login','" + jTextField1.getText() + " Login Failed')";
                    try {
                        DB.DB.iud(activitylogloginfailed);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Access Denied", "Access Denied", JOptionPane.ERROR_MESSAGE); //error message
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMousePressed
        login.setBackground(new java.awt.Color(153, 153, 153)); // chage background color when mouse pressed
    }//GEN-LAST:event_loginMousePressed

    private void loginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseReleased
        login.setBackground(new java.awt.Color(255, 255, 255));// chage background color when mouse released
    }//GEN-LAST:event_loginMouseReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accounttypelbl;
    private javax.swing.JLabel close;
    private javax.swing.JLabel datelbl;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton login;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JPanel mainloginarea;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JLabel timelbl;
    private javax.swing.JLabel usernamelbl;
    // End of variables declaration//GEN-END:variables
}
