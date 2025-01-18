/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Currency.pages;
import Currency.dao.CurrencyInfoDAO;
import javax.swing.JOptionPane;

import Currency.dao.UserDAO;
import Currency.SessionManager;
import java.util.ArrayList;
import java.util.List;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CurrencyInfo extends javax.swing.JFrame {

    public CurrencyInfo() {
        initComponents();
        loadCurrencyInfo();  // Load currency info when the page is opened
    }
    public void insertFamousCurrencyData() {
            CurrencyInfoDAO currencyInfoDAO = new CurrencyInfoDAO();

            // Adding famous currencies related to India
            currencyInfoDAO.addCurrencyInfo("USD", "US Dollar", "United States", "$");
            currencyInfoDAO.addCurrencyInfo("EUR", "Euro", "Eurozone", "€");
            currencyInfoDAO.addCurrencyInfo("JPY", "Japanese Yen", "Japan", "¥");
            currencyInfoDAO.addCurrencyInfo("AED", "UAE Dirham", "United Arab Emirates", "د.إ");
            currencyInfoDAO.addCurrencyInfo("GBP", "British Pound", "United Kingdom", "£");
            currencyInfoDAO.addCurrencyInfo("CNY", "Chinese Yuan", "China", "¥");

            JOptionPane.showMessageDialog(this, "Famous currency data related to India added!");
        }

         private void loadCurrencyInfo() {
                if (!SessionManager.isUserLoggedIn()) {
                    JOptionPane.showMessageDialog(this, "Please log in to view your favorites!");
                    return;
                }

                int userId = SessionManager.getLoggedInUserId();
                CurrencyInfoDAO currencyInfoDAO = new CurrencyInfoDAO();

                // Fetch all currency information
                List<CurrInfo> currencyInfoList = currencyInfoDAO.getAllCurrencyInfo();

                
                  // Prepare table model
        DefaultTableModel model = new DefaultTableModel(new String[]{"Code", "Name","Country","Symbol"}, 0);
        for (CurrInfo curr : currencyInfoList) {
            model.addRow(new Object[]{curr.getCode(), curr.getName(),curr.getCountry(),curr.getSymbol()});
        }

        // Set model to table
        currinfotable.setModel(model);
                // Set the information in the JTextArea
//                if (currencyInfoList.isEmpty()) {
//                    currinfoarea.setText("No currency information found.");
//                } else {
//                    StringBuilder infoText = new StringBuilder();
//                    for (CurrInfo info : currencyInfoList) {
//                        infoText.append(info).append("\n");
//                    }
//                    currinfoarea.setText(infoText.toString());
//                }
    }
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        homebtn = new javax.swing.JButton();
        favbtn = new javax.swing.JButton();
        currinfobtn = new javax.swing.JButton();
        histbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        currinfoarea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        currinfotable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));

        homebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        homebtn.setText("Home");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        favbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        favbtn.setText("favorites");
        favbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favbtnActionPerformed(evt);
            }
        });

        currinfobtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        currinfobtn.setText("currInfo");
        currinfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currinfobtnActionPerformed(evt);
            }
        });

        histbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        histbtn.setText("History");
        histbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histbtnActionPerformed(evt);
            }
        });

        logoutbtn.setBackground(new java.awt.Color(255, 51, 51));
        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homebtn)
                .addGap(18, 18, 18)
                .addComponent(histbtn)
                .addGap(18, 18, 18)
                .addComponent(favbtn)
                .addGap(18, 18, 18)
                .addComponent(currinfobtn)
                .addGap(18, 18, 18)
                .addComponent(logoutbtn)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homebtn)
                    .addComponent(favbtn)
                    .addComponent(histbtn)
                    .addComponent(logoutbtn)
                    .addComponent(currinfobtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        currinfoarea.setBackground(new java.awt.Color(0, 204, 204));
        currinfoarea.setColumns(20);
        currinfoarea.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        currinfoarea.setRows(5);
        jScrollPane1.setViewportView(currinfoarea);

        currinfotable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Country", "Symbol"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(currinfotable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void currinfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currinfobtnActionPerformed
        // TODO add your handling code here:
        insertFamousCurrencyData();
    }//GEN-LAST:event_currinfobtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
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

    private void histbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histbtnActionPerformed
        if (!SessionManager.isUserLoggedIn()) {
        JOptionPane.showMessageDialog(this, "Please log in to view your history!");
        return;
    }

    int userId = SessionManager.getLoggedInUserId();
    UserDAO userDAO = new UserDAO();

    // Fetch conversion history for the logged-in user
    List<ConversionHistory1> history = userDAO.getConversionHistory(userId);

    // Navigate to the History Page
    HistoryPage historyPage = new HistoryPage();
    historyPage.setHistoryTable(history); // Pass the history data to the History page
    historyPage.setVisible(true); // Show the History page

    // Optionally, close the current page if needed
    this.dispose();
    }//GEN-LAST:event_histbtnActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CurrencyInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 
                new CurrencyInfo().setVisible(true);
            }
        });
    }
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea currinfoarea;
    private javax.swing.JButton currinfobtn;
    private javax.swing.JTable currinfotable;
    private javax.swing.JButton favbtn;
    private javax.swing.JButton histbtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutbtn;
    // End of variables declaration//GEN-END:variables
}
