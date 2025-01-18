/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Currency.pages;
import Currency.SessionManager;
import Currency.dao.FavoritesDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.json.JSONObject;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.*;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import Currency.dao.UserDAO;

public class HistoryPage extends javax.swing.JFrame {

    public HistoryPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        homebtn = new javax.swing.JButton();
        histbtn = new javax.swing.JButton();
        favbtn = new javax.swing.JButton();
        currinfobtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        histtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 255, 0));

        homebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        homebtn.setText("Home");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        histbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        histbtn.setText("History");
        histbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histbtnActionPerformed(evt);
            }
        });

        favbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        favbtn.setText("Favorites");
        favbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favbtnActionPerformed(evt);
            }
        });

        currinfobtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        currinfobtn.setText("CurrInfo");
        currinfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currinfobtnActionPerformed(evt);
            }
        });

        logoutbtn.setBackground(new java.awt.Color(255, 0, 0));
        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homebtn)
                .addGap(18, 18, 18)
                .addComponent(histbtn)
                .addGap(29, 29, 29)
                .addComponent(favbtn)
                .addGap(28, 28, 28)
                .addComponent(currinfobtn)
                .addGap(27, 27, 27)
                .addComponent(logoutbtn)
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homebtn)
                    .addComponent(histbtn)
                    .addComponent(favbtn)
                    .addComponent(currinfobtn)
                    .addComponent(logoutbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        histtable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        histtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "From Currency", "To Currency", "Amount", "Converted Amount", "Date"
            }
        ));
        jScrollPane2.setViewportView(histtable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void histbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_histbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
       
         // Confirm logout 
        int choice = JOptionPane.showConfirmDialog(
            this, 
            "Are you sure you want to log out??", 
            "Logout Confirmation", 
            JOptionPane.YES_NO_OPTION
        );

        if (choice == JOptionPane.YES_OPTION) {
            // Clear the user session
            SessionManager.logout();

            // Navigate to Login Page
            LoginPage loginPage = new LoginPage(); // Assuming LoginPage is your login JFrame class
            loginPage.setVisible(true);

            // Close the current page
            this.dispose();
        }
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void currinfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currinfobtnActionPerformed
        // TODO add your handling code here:
        // Check if the user is logged in
        if (!SessionManager.isUserLoggedIn()) {
            JOptionPane.showMessageDialog(this, "Please log in to access your favorites!");
            return;
        }

        // Navigate to the Favorites page
        CurrencyInfo currpage = new CurrencyInfo();
        currpage.setVisible(true); // Show the Favorites Page

        // Optionally close the current page if needed
        this.dispose();
    }//GEN-LAST:event_currinfobtnActionPerformed

    private void favbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favbtnActionPerformed
            // Check if the user is logged in
            if (!SessionManager.isUserLoggedIn()) {
                JOptionPane.showMessageDialog(this, "Please log in to access your favorites!");
                return;
            }

            // Navigate to the Favorites page
            FavoritePage favoritesPage = new FavoritePage();
            favoritesPage.setVisible(true); // Show the Favorites Page

            // Optionally close the current page if needed
            this.dispose();
    }//GEN-LAST:event_favbtnActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
            if (!SessionManager.isUserLoggedIn()) {
                JOptionPane.showMessageDialog(this, "Please log in to access your favorites!");
                return;
            }

            // Navigate to the Favorites page
            HomePage homepage = new HomePage();
            homepage.setVisible(true); // Show the Favorites Page

            // Optionally close the current page if needed
            this.dispose();
    
    }//GEN-LAST:event_homebtnActionPerformed

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
            java.util.logging.Logger.getLogger(HistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoryPage().setVisible(true);
            }
        });
    }
    
public void setHistoryTable(List<ConversionHistory1> history) {
  
     if (!SessionManager.isUserLoggedIn()) {
            JOptionPane.showMessageDialog(this, "Please log in to view your favorites!");
            return;
        }

        int userId = SessionManager.getLoggedInUserId();
        UserDAO userDAO = new UserDAO();

        // Fetch the favorite records for the logged-in user
        List<ConversionHistory1> histList = userDAO.getConversionHistory(userId);

        // Prepare table model
        DefaultTableModel model = new DefaultTableModel(new String[]{"From Currency", "To Currency","Amount","Converted Amount","Date"}, 0);
        for (ConversionHistory1 hist1 : histList) {
            model.addRow(new Object[]{hist1.getFromCurrency(), hist1.getToCurrency(),hist1.getAmount(),hist1.getConvertedAmount(),hist1.getConversionDate()});
        }

        // Set model to table
        histtable.setModel(model);
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton currinfobtn;
    private javax.swing.JButton favbtn;
    private javax.swing.JButton histbtn;
    private javax.swing.JTable histtable;
    private javax.swing.JButton homebtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutbtn;
    // End of variables declaration//GEN-END:variables
}
