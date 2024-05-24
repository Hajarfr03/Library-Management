/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SignUP;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class emprunts extends javax.swing.JFrame {

       int ID;
       String nom ;
       String prenom; 

    public emprunts() throws SQLException {
        initComponents();
        
        SessionManager sessionManager = SessionManager.getInstance();
     ID = (int) sessionManager.getAttribute("ID");
     nom = (String) sessionManager.getAttribute("nom");
    prenom = (String) sessionManager.getAttribute("prenom");
    jLabel11.setText("Welcome, " + nom + " " + prenom);
    jLabel11.setVisible(true);

    String driver = "com.mysql.jdbc.Driver";
    String strCon = "jdbc:mysql://localhost:3306/utilisateur";
    String req = "SELECT Book,firstD,lastD FROM emprunteur  WHERE ID = ?";
     Connection conn = (Connection)DriverManager.getConnection(strCon,"root", "");
     int rowHeight = 40; // Définir la hauteur souhaitée en pixels
        T22.setRowHeight(rowHeight);
    try {
        DefaultTableModel model = (DefaultTableModel) T22.getModel();
        Class.forName(driver);
       
        PreparedStatement pre = (PreparedStatement) conn.prepareStatement(req);
        pre.setInt(1, ID);
        ResultSet res = pre.executeQuery();
        while(res.next()) {
            model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3)});
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        but = new javax.swing.JButton();
        first = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        last = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        T22 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(103, 113, 121));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(206, 206, 206));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Brush Script MT", 1, 20)); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 200, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/icons8-book-reading-50.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 50, 40));

        jLabel13.setFont(new java.awt.Font("Arjenta Black", 1, 12)); // NOI18N
        jLabel13.setText("Read");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 40, 40, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/backk.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 60));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(103, 113, 121));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/livres (1).png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 80));

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(206, 206, 206));
        jLabel1.setText("      BooK");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 120));

        jPanel6.setBackground(new java.awt.Color(103, 113, 121));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(153, 105, 54));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/student (1).png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 122, 80));

        jLabel4.setFont(new java.awt.Font("Brush Script MT", 1, 23)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(206, 206, 206));
        jLabel4.setText("       Member");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 30));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 180, 110));

        jPanel7.setBackground(new java.awt.Color(103, 113, 121));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/knowledge (1).png"))); // NOI18N
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 90));

        jLabel6.setFont(new java.awt.Font("Brush Script MT", 1, 23)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(206, 206, 206));
        jLabel6.setText("       Loan");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, 110));

        jPanel8.setBackground(new java.awt.Color(103, 113, 121));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/graph-bar (1).png"))); // NOI18N
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, 80));

        jLabel8.setFont(new java.awt.Font("Brush Script MT", 1, 23)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(206, 206, 206));
        jLabel8.setText("       Statistics ");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 190, -1));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 180, 110));

        jPanel9.setBackground(new java.awt.Color(103, 113, 121));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setForeground(new java.awt.Color(103, 113, 121));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(206, 206, 206));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUP/khadija.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 70, 70));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 180, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 180, 520));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, 100));

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        but.setBackground(new java.awt.Color(204, 204, 204));
        but.setFont(new java.awt.Font("Brush Script MT", 0, 18)); // NOI18N
        but.setText("Back");
        but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butActionPerformed(evt);
            }
        });
        jPanel11.add(but, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 100, 30));

        first.setForeground(new java.awt.Color(223, 222, 222));
        first.setText("YYYY-MM-DD");
        jPanel11.add(first, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 180, 30));

        jLabel14.setFont(new java.awt.Font("Brush Script MT", 0, 24)); // NOI18N
        jLabel14.setText("First Day :");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 100, 30));

        last.setForeground(new java.awt.Color(223, 222, 222));
        last.setText("YYYY-MM-DD");
        jPanel11.add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 180, 30));

        jLabel15.setFont(new java.awt.Font("Brush Script MT", 0, 24)); // NOI18N
        jLabel15.setText("Last Day :");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 100, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Brush Script MT", 0, 18)); // NOI18N
        jButton1.setText("Borrow");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 480, 100, 30));

        T22.setBackground(new java.awt.Color(204, 204, 204));
        T22.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book", "Firstday", "Lastday"
            }
        ));
        jScrollPane1.setViewportView(T22);

        jPanel11.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 940, 360));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 100, 30));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Brush Script MT", 1, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, 90, 30));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 1030, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
        Main deuxiemeFrame = new Main();
        deuxiemeFrame.setVisible(true);

        // Fermeture de la première frame
        dispose();
    }//GEN-LAST:event_jLabel10MousePressed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed

    }//GEN-LAST:event_jPanel4MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
      
    }//GEN-LAST:event_jLabel3MousePressed

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel7MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel9MousePressed

    private void butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butActionPerformed
        espaceutilisateur deuxiemeFrame;
        deuxiemeFrame = new espaceutilisateur();
        deuxiemeFrame.setVisible(true);
        // Fermeture de la première frame
        dispose();
    }//GEN-LAST:event_butActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int quantites = 0;
        DefaultTableModel model = (DefaultTableModel) T22.getModel();
        int selectedRow = T22.getSelectedRow();
        if (selectedRow != -1) {

            String ISBN = (String) model.getValueAt(selectedRow, 0);
            String Title = (String) model.getValueAt(selectedRow, 1);
            int quantite=(int) model.getValueAt(selectedRow,5);
            String lastD= last.getText();
            String firstD= first.getText();
            last.setText("");
            first.setText("");
            LocalDate firstDate = LocalDate.parse(firstD);
            LocalDate lastDate = LocalDate.parse(lastD);
            String driver = "com.mysql.jdbc.Driver";
            String strCon = "jdbc:mysql://localhost:3306/utilisateur";

            try{
                long joursEntre = ChronoUnit.DAYS.between(firstDate, lastDate);
                Class.forName(driver);
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/utilisateur", "root", "");
                String req1 = "SELECT Quantite FROM book where ISBN=?";
                PreparedStatement preP = (PreparedStatement) con.prepareStatement(req1);
                preP.setString(1, ISBN);
                ResultSet res1 = preP.executeQuery();

                if (res1.next()) {
                    quantites = res1.getInt("Quantite");
                }
                if(quantites!=0){
                    if (joursEntre < 7  ) {

                        String req = "insert into emprunteur values(?,?,?,?,?,?)";
                        PreparedStatement p = (PreparedStatement) con.prepareStatement(req);

                        p.setInt(1, ID);
                        p.setString(2, nom);
                        p.setString(3, prenom);
                        p.setString(4, Title);
                        p.setString(5, firstD);
                        p.setString(6, lastD);
                        String req3 = "UPDATE book SET Quantite = ? WHERE ISBN = ?";
                        PreparedStatement pr = (PreparedStatement) con.prepareStatement(req3);
                        quantites--; // Décrémentez la quantité
                        pr.setInt(1, quantites);
                        pr.setString(2, ISBN);
                        pr.executeUpdate();
                        model.setValueAt(quantites,selectedRow, 5);

                        p.executeUpdate();

                        JOptionPane.showMessageDialog(null, "your registered loan");

                    }else{
                        JOptionPane.showMessageDialog(null, "The loan period does not exceed 7 days");

                    }
                }else{
                    JOptionPane.showMessageDialog(null, "the Quantity is 0 ");
                }

            }
            catch (Exception e) {
                e.printStackTrace();
            }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int quantites = 0 ;
        
        
         DefaultTableModel model = (DefaultTableModel) T22.getModel();
        String driver="com.mysql.jdbc.Driver";
        String strcon= "jdbc:mysql://localhost:3306/utilisateur";
        String req= "delete from emprunteur where Book=? AND FirstName=? and LastName=?AND ID=? and firstD=? and lastD=?";
        int selectedRow = T22.getSelectedRow();

        if (selectedRow != -1) {
            try {
                Class.forName(driver);
                Connection conn = (Connection)DriverManager.getConnection(strcon, "root", "");
                java.sql.PreparedStatement pre = conn.prepareStatement(req);

               
                String Book = (String) model.getValueAt(selectedRow, 0);
                 String firstd = (String) model.getValueAt(selectedRow, 1);
                  String lastd = (String) model.getValueAt(selectedRow, 2);
                  
                 
                pre.setString(1, Book);
                 pre.setString(2, prenom);
                  pre.setString(3, nom);
                   pre.setInt(4, ID);
                    pre.setString(5, firstd);
                     pre.setString(6, lastd);
                     
 
                
               
                int rowsDeleted = pre.executeUpdate();
                 String str= "jdbc:mysql://localhost:3306/utilisateur";
                 String req2 = "SELECT Quantite FROM book  WHERE Title=?";
     Connection connn = (Connection)DriverManager.getConnection(str,"root", "");
            PreparedStatement pree = (PreparedStatement) connn.prepareStatement(req2);
        pree.setString(1, Book);
        ResultSet ress = pree.executeQuery();
        if(ress.next()){
             quantites=ress.getInt("Quantite");
        

           String req3 = "UPDATE book SET Quantite = ? WHERE Title = ?";
           java.sql.PreparedStatement pr = conn.prepareStatement(req3);
          quantites++; 
          pr.setInt(1, quantites);
          
        
          
          pr.setString(2, Book);
          pr.executeUpdate();
          
        }
        else{
          
            String strc= "jdbc:mysql://localhost:3306/utilisateur";
                 String req4 = "SELECT Quantite FROM statistic  WHERE Title=?";
     Connection c = (Connection)DriverManager.getConnection(strc,"root", "");
            PreparedStatement prp = (PreparedStatement) c.prepareStatement(req4);
        prp.setString(1, Book);
        ResultSet r = pree.executeQuery();
        if(r.next()){
             quantites=r.getInt("Quantite");
        }

           String req5 = "UPDATE statistic SET Quantite = ? WHERE Title = ?";
           java.sql.PreparedStatement p = conn.prepareStatement(req5);
          quantites++; 
          p.setInt(1, quantites);
          
        
          
          p.setString(2, Book);
          p.executeUpdate();
          
        }
         
                
                if (rowsDeleted > 0) {
                    model.removeRow(selectedRow);
                }

                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           // TODO add your handling code here:
           espaceutilisateur deuxiemepage = new espaceutilisateur();
           deuxiemepage.setVisible(true);
           dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(emprunts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emprunts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emprunts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emprunts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new emprunts().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(emprunts.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable T22;
    private javax.swing.JButton but;
    private javax.swing.JTextField first;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField last;
    // End of variables declaration//GEN-END:variables
}
