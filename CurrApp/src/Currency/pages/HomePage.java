
package Currency.pages;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import org.json.JSONObject;
import Currency.dao.UserDAO;
import Currency.SessionManager;
import java.util.ArrayList;
import java.util.List;


public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        historybtn = new javax.swing.JButton();
        favoritebtn = new javax.swing.JButton();
        currinfobtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtfrom = new javax.swing.JComboBox<>();
        txtto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        convertbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtres = new javax.swing.JTextArea();
        txtamt = new javax.swing.JTextField();
        resetbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 255, 0));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Home");

        historybtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        historybtn.setText("History");
        historybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historybtnActionPerformed(evt);
            }
        });

        favoritebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        favoritebtn.setText("Favorites");
        favoritebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoritebtnActionPerformed(evt);
            }
        });

        currinfobtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        currinfobtn.setText("CurrencyInfo");
        currinfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currinfobtnActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(historybtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(favoritebtn)
                .addGap(18, 18, 18)
                .addComponent(currinfobtn)
                .addGap(18, 18, 18)
                .addComponent(logoutbtn)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(historybtn)
                    .addComponent(favoritebtn)
                    .addComponent(currinfobtn)
                    .addComponent(logoutbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(102, 0, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Amount:");

        txtfrom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "AED", "AFN", "ALL", "AMD  ", "ANG  ", "AOA  ", "ARS", "AUD ", "AWG  ", "AZN  ", "BAM  ", "BBD  ", "BDT  ", "BGN  ", "BHD  ", "BIF", "BMD  ", "BND  ", "BOB  ", "BRL  ", "BSD  ", "BTN  ", "BWP  ", "BYN  ", "BZD  ", "CAD  ", "CDF  ", "CHF  ", "CLP  ", "CNY  ", "COP  ", "CRC  ", "CUP  ", "CVE  ", "CZK  ", "DJF  ", "DKK  ", "DOP  ", "DZD  ", "EGP  ", "ERN  ", "ETB  ", "EUR  ", "FJD  ", "FKP  ", "FOK  ", "GBP  ", "GEL  ", "GGP  ", "GHS  ", "GIP  ", "GMD  ", "GNF  ", "GTQ  ", "GYD  ", "HKD  ", "HNL  ", "HRK  ", "HTG  ", "HUF  ", "IDR  ", "ILS  ", "IMP  ", "INR  ", "IQD  ", "IRR  ", "ISK  ", "JEP  ", "JMD  ", "JOD  ", "JPY  ", "KES  ", "KGS  ", "KHR  ", "KID  ", "KMF  ", "KRW  ", "KWD  ", "KYD  ", "KZT  ", "LAK  ", "LBP  ", "LKR  ", "LRD  ", "LSL  ", "LYD  ", "MAD  ", "MDL  ", "MGA  ", "MKD  ", "MMK  ", "MNT  ", "MOP  ", "MRU  ", "MUR  ", "MVR  ", "MWK  ", "MXN  ", "MYR  ", "MZN  ", "NAD  ", "NGN  ", "NIO  ", "NOK  ", "NPR  ", "NZD  ", "OMR  ", "PAB  ", "PEN  ", "PGK  ", "PHP  ", "PKR  ", "PLN  ", "PYG  ", "QAR  ", "RON  ", "RSD  ", "RUB  ", "RWF  ", "SAR  ", "SBD  ", "SCR  ", "SDG  ", "SEK  ", "SGD  ", "SHP  ", "SLE  ", "SLL  ", "SOS  ", "SRD  ", "SSP  ", "STN  ", "SYP  ", "SZL  ", "THB  ", "TJS  ", "TMT  ", "TND  ", "TOP  ", "TRY  ", "TTD  ", "TVD  ", "TWD  ", "TZS  ", "UAH  ", "UGX  ", "UYU  ", "UZS  ", "VES  ", "VND  ", "VUV  ", "WST  ", "XAF  ", "XCD  ", "XDR  ", "XOF  ", "XPF  ", "YER  ", "ZAR  ", "ZMW  ", "ZWL  ", " " }));

        txtto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "AED", "AFN", "ALL  ", "AMD  ", "ANG  ", "AOA  ", "ARS  ", "AUD  ", "AWG  ", "AZN  ", "BAM  ", "BBD  ", "BDT  ", "BGN  ", "BHD  ", "BIF  ", "BMD  ", "BND  ", "BOB  ", "BRL  ", "BSD  ", "BTN  ", "BWP  ", "BYN  ", "BZD  ", "CAD  ", "CDF  ", "CHF  ", "CLP  ", "CNY  ", "COP  ", "CRC  ", "CUP  ", "CVE  ", "CZK  ", "DJF  ", "DKK  ", "DOP  ", "DZD  ", "EGP  ", "ERN  ", "ETB  ", "EUR  ", "FJD  ", "FKP  ", "FOK  ", "GBP  ", "GEL  ", "GGP  ", "GHS  ", "GIP  ", "GMD  ", "GNF  ", "GTQ  ", "GYD  ", "HKD  ", "HNL  ", "HRK  ", "HTG  ", "HUF  ", "IDR  ", "ILS  ", "IMP ", "INR", "IQD  ", "IRR  ", "ISK  ", "JEP  ", "JMD  ", "JOD  ", "JPY  ", "KES  ", "KGS  ", "KHR  ", "KID  ", "KMF  ", "KRW  ", "KWD  ", "KYD  ", "KZT  ", "LAK  ", "LBP  ", "LKR  ", "LRD  ", "LSL  ", "LYD  ", "MAD  ", "MDL  ", "MGA  ", "MKD  ", "MMK  ", "MNT  ", "MOP  ", "MRU  ", "MUR  ", "MVR  ", "MWK  ", "MXN  ", "MYR  ", "MZN  ", "NAD  ", "NGN  ", "NIO  ", "NOK  ", "NPR  ", "NZD  ", "OMR  ", "PAB  ", "PEN  ", "PGK  ", "PHP  ", "PKR  ", "PLN  ", "PYG  ", "QAR  ", "RON  ", "RSD  ", "RUB  ", "RWF  ", "SAR  ", "SBD  ", "SCR  ", "SDG  ", "SEK  ", "SGD  ", "SHP  ", "SLE  ", "SLL  ", "SOS  ", "SRD  ", "SSP  ", "STN  ", "SYP  ", "SZL  ", "THB  ", "TJS  ", "TMT  ", "TND  ", "TOP  ", "TRY  ", "TTD  ", "TVD  ", "TWD  ", "TZS  ", "UAH  ", "UGX  ", "UYU  ", "UZS  ", "VES  ", "VND  ", "VUV  ", "WST  ", "XAF  ", "XCD  ", "XDR  ", "XOF  ", "XPF  ", "YER  ", "ZAR  ", "ZMW  ", "ZWL  " }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("From");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("To");

        convertbtn.setBackground(new java.awt.Color(0, 255, 0));
        convertbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        convertbtn.setText("CONVERT");
        convertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertbtnActionPerformed(evt);
            }
        });

        txtres.setColumns(20);
        txtres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtres.setRows(5);
        jScrollPane2.setViewportView(txtres);

        txtamt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        resetbtn.setBackground(new java.awt.Color(0, 255, 0));
        resetbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertbtn))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(txtamt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(184, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtamt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertbtn)
                    .addComponent(resetbtn))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertbtnActionPerformed
       try {
        // Get input values
        String fromCurrency = txtfrom.getSelectedItem().toString().trim();
        String toCurrency = txtto.getSelectedItem().toString().trim();
        double amount = Double.parseDouble(txtamt.getText());

        // Fetch exchange rate
        double rate = getExchangeRate(fromCurrency, toCurrency);

        // Perform conversion
        double total = amount * rate;
        txtres.setText("Converted Amount: " + String.format("%.2f", total));

        // Save to history for the logged-in user
        int userId = SessionManager.getLoggedInUserId(); // Fetch current user ID from SessionManager
        if (userId == -1) {
            JOptionPane.showMessageDialog(this, "User not logged in! Please log in first.");
            return;
        }

        UserDAO userDAO = new UserDAO();
        boolean isSaved = userDAO.saveConversionHistory(userId, fromCurrency, toCurrency, amount, total);

        if (isSaved) {
            JOptionPane.showMessageDialog(this, "Conversion history saved successfully!");
          
        } else {
            JOptionPane.showMessageDialog(this, "Failed to save conversion history.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid number!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
       
    }//GEN-LAST:event_convertbtnActionPerformed

    private void historybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historybtnActionPerformed
         // TODO add your handling code here:
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
    }//GEN-LAST:event_historybtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        // Confirm logout (optional)
    int choice = JOptionPane.showConfirmDialog(
        this, 
        "Are you sure you want to log out?", 
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

    private void favoritebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoritebtnActionPerformed
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
    }//GEN-LAST:event_favoritebtnActionPerformed

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

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
            txtres.setText("");
            txtfrom.setSelectedIndex(0);
            txtto.setSelectedIndex(0);
            txtamt.setText("");
    }//GEN-LAST:event_resetbtnActionPerformed

     private double getExchangeRate(String from, String to) throws Exception {
            String apiKey = "4e93e624a4e6b3a99a8f8034"; 
            String urlStr = "https://api.exchangerate-api.com/v4/latest/" + from;
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Parse JSON response
            JSONObject json = new JSONObject(response.toString());
            return json.getJSONObject("rates").getDouble(to);
        }

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertbtn;
    private javax.swing.JButton currinfobtn;
    private javax.swing.JButton favoritebtn;
    private javax.swing.JButton historybtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField txtamt;
    private javax.swing.JComboBox<String> txtfrom;
    private javax.swing.JTextArea txtres;
    private javax.swing.JComboBox<String> txtto;
    // End of variables declaration//GEN-END:variables
}
