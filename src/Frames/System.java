package Frames;


import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JFileChooser;

public class System extends javax.swing.JFrame {
    static ImageIcon icon;
    static String monthnow;
    static String yearnow;
    static String daterep;
      String path = null;
    public System() {
        
        initComponents();

        new Thread() {
                       public void run() {
                while (true) {   //get date time and month
                    Date timenow = new Date();  
                    Date datenow = new Date();
                    Date month =new Date();
                    Date year = new Date();
                    Date datea = new Date();
                    SimpleDateFormat sdft = new SimpleDateFormat("hh:mm:ss a");  //time 12h
                    SimpleDateFormat sdfd = new SimpleDateFormat("dd / MM / yyyy"); //date/month/year
                    SimpleDateFormat sdftodaysales = new SimpleDateFormat("yyyy-MM-dd"); //date-month-year
                    SimpleDateFormat tomonth = new SimpleDateFormat("MM"); //month
                    SimpleDateFormat toyear = new SimpleDateFormat("yyyy"); //year
                    String time = "" + sdft.format(timenow); //present time 
                    String date = "" + sdfd.format(datenow); //present date
                    monthnow="" + tomonth.format(month);
                    yearnow="" + toyear.format(year);
                    daterep=""+sdftodaysales.format(datea);
                    timelbl.setText(time);
                    datelbl.setText(date);
                }
            }
        }.start();
        System.this.setExtendedState(JFrame.MAXIMIZED_BOTH); //full screen
        System.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // do nothing on close
        setIcon();
        lastactivitiesrefresh();
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
        header = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();
        leftside = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel22 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        restorebtn = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        restorelocationfield = new javax.swing.JTextField();
        browsepathinrestore = new javax.swing.JButton();
        stateofrestorelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Green Food Stores");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("login"); // NOI18N
        setUndecorated(true);

        loginpanel.setBackground(new java.awt.Color(153, 153, 153));

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
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close))
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

        leftside.setBackground(new java.awt.Color(189, 189, 189));

        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/images/greenfoodslight.png"))); // NOI18N

        javax.swing.GroupLayout leftsideLayout = new javax.swing.GroupLayout(leftside);
        leftside.setLayout(leftsideLayout);
        leftsideLayout.setHorizontalGroup(
            leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftsideLayout.setVerticalGroup(
            leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftsideLayout.createSequentialGroup()
                .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addContainerGap())
        );

        jList1.setBackground(new java.awt.Color(0, 0, 0));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setFocusable(false);
        jList1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane9.setViewportView(jList1);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel28.setText("Restore Database");
        jPanel22.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, -1, -1));

        restorebtn.setBackground(new java.awt.Color(204, 204, 204));
        restorebtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        restorebtn.setText("Restore");
        restorebtn.setContentAreaFilled(false);
        restorebtn.setFocusPainted(false);
        restorebtn.setOpaque(true);
        restorebtn.setPreferredSize(new java.awt.Dimension(140, 40));
        restorebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                restorebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                restorebtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                restorebtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                restorebtnMouseReleased(evt);
            }
        });
        restorebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restorebtnActionPerformed(evt);
            }
        });
        jPanel22.add(restorebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 409, 180, -1));

        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel29.setText("Open location");
        jPanel22.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 239, 193, -1));

        restorelocationfield.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        restorelocationfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        restorelocationfield.setSelectionColor(new java.awt.Color(100, 183, 0));
        jPanel22.add(restorelocationfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 180, 35));

        browsepathinrestore.setBackground(new java.awt.Color(204, 204, 204));
        browsepathinrestore.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        browsepathinrestore.setText("Browse Path");
        browsepathinrestore.setContentAreaFilled(false);
        browsepathinrestore.setFocusPainted(false);
        browsepathinrestore.setOpaque(true);
        browsepathinrestore.setPreferredSize(new java.awt.Dimension(140, 40));
        browsepathinrestore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                browsepathinrestoreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                browsepathinrestoreMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                browsepathinrestoreMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                browsepathinrestoreMouseReleased(evt);
            }
        });
        browsepathinrestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsepathinrestoreActionPerformed(evt);
            }
        });
        jPanel22.add(browsepathinrestore, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 363, 180, -1));

        stateofrestorelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel22.add(stateofrestorelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 311, 180, 40));

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addComponent(leftside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void restorebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restorebtnMouseEntered
        restorebtn.setBackground(new Color(229, 229, 229));
    }//GEN-LAST:event_restorebtnMouseEntered

    private void restorebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restorebtnMouseExited
        restorebtn.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_restorebtnMouseExited

    private void restorebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restorebtnMousePressed
        restorebtn.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_restorebtnMousePressed

    private void restorebtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restorebtnMouseReleased
        restorebtn.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_restorebtnMouseReleased

    private void restorebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restorebtnActionPerformed
        new Thread() {
                public void run() {
        String user = "root";
        String pass = "";
        String[] restoreCmd = new String[]{"C:/xampp/mysql/bin/mysql.exe", "--user=" + user, "--password=" + pass, "-e", "source " + path};
        Process process;
        try {
            process = Runtime.getRuntime().exec(restoreCmd);
            int procCom = process.waitFor();
            if (procCom == 0) {
                ImageIcon statusicon = new ImageIcon(getClass().getResource("images/success.png"));
                stateofrestorelbl.setIcon(statusicon);
            } else {
                ImageIcon statusicon = new ImageIcon(getClass().getResource("images/failed.png"));
                stateofrestorelbl.setIcon(statusicon);
            }
        } catch (Exception e) {
        }
                }}.start();
    }//GEN-LAST:event_restorebtnActionPerformed

    private void browsepathinrestoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinrestoreMouseEntered
        browsepathinrestore.setBackground(new Color(229, 229, 229));
    }//GEN-LAST:event_browsepathinrestoreMouseEntered

    private void browsepathinrestoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinrestoreMouseExited
        browsepathinrestore.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_browsepathinrestoreMouseExited

    private void browsepathinrestoreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinrestoreMousePressed
        browsepathinrestore.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_browsepathinrestoreMousePressed

    private void browsepathinrestoreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browsepathinrestoreMouseReleased
        browsepathinrestore.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_browsepathinrestoreMouseReleased

    private void browsepathinrestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsepathinrestoreActionPerformed
        JFileChooser fcrestore = new JFileChooser();
        fcrestore.showOpenDialog(this);
        try {
            File f = fcrestore.getSelectedFile();
            path = f.getAbsolutePath();
            path = path.replace('\\', '/');
            restorelocationfield.setText(path);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_browsepathinrestoreActionPerformed

        private void lastactivitiesrefresh() {
        try {
            ResultSet rs = DB.DB.search("SELECT cast(datetime as TIME),`activitytype`,`description` FROM `log` ORDER BY `log`.datetime DESC ");
            Vector v = new Vector();  //new vector object
            while (rs.next()) { //if quary has results
                v.add("  " + rs.getString(1) + "-" + rs.getString(2) + "-" +rs.getString(3));
            }
            jList1.setListData(v); //add vector to jlist1
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browsepathinrestore;
    private javax.swing.JLabel close;
    private javax.swing.JLabel datelbl;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel leftside;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JButton restorebtn;
    private javax.swing.JTextField restorelocationfield;
    private javax.swing.JLabel stateofrestorelbl;
    private javax.swing.JLabel timelbl;
    // End of variables declaration//GEN-END:variables
}
