package Currency.pages;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import org.json.JSONObject;
import Currency.SessionManager;
import java.util.ArrayList;
import java.util.List;
import Currency.dao.UserDAO;
import Currency.dao.FavoritesDAO;
import Currency.pages.Favorite;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class FavoritePage extends javax.swing.JFrame {


    public FavoritePage() {
        initComponents();
        fetchAndSetFavorites(); // Fetch and set data when the page loads
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        homebtn = new javax.swing.JButton();
        hist1btn = new javax.swing.JButton();
        favbtn = new javax.swing.JButton();
        currinfobtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtfrom = new javax.swing.JComboBox<>();
        txtto = new javax.swing.JComboBox<>();
        addnewfavbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        favtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));

        homebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        homebtn.setText("Home");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        hist1btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hist1btn.setText("History");
        hist1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hist1btnActionPerformed(evt);
            }
        });

        favbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        favbtn.setText("Favorites");

        currinfobtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        currinfobtn.setText("CurrInfo");
        currinfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currinfobtnActionPerformed(evt);
            }
        });

        logoutbtn.setBackground(new java.awt.Color(255, 51, 51));
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
                .addGap(157, 157, 157)
                .addComponent(homebtn)
                .addGap(18, 18, 18)
                .addComponent(hist1btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(favbtn)
                .addGap(18, 18, 18)
                .addComponent(currinfobtn)
                .addGap(18, 18, 18)
                .addComponent(logoutbtn)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homebtn)
                    .addComponent(hist1btn)
                    .addComponent(favbtn)
                    .addComponent(currinfobtn)
                    .addComponent(logoutbtn))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        txtfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "AED", "AFN", "ALL", "AMD  ", "ANG  ", "AOA  ", "ARS", "AUD ", "AWG  ", "AZN  ", "BAM  ", "BBD  ", "BDT  ", "BGN  ", "BHD  ", "BIF", "BMD  ", "BND  ", "BOB  ", "BRL  ", "BSD  ", "BTN  ", "BWP  ", "BYN  ", "BZD  ", "CAD  ", "CDF  ", "CHF  ", "CLP  ", "CNY  ", "COP  ", "CRC  ", "CUP  ", "CVE  ", "CZK  ", "DJF  ", "DKK  ", "DOP  ", "DZD  ", "EGP  ", "ERN  ", "ETB  ", "EUR  ", "FJD  ", "FKP  ", "FOK  ", "GBP  ", "GEL  ", "GGP  ", "GHS  ", "GIP  ", "GMD  ", "GNF  ", "GTQ  ", "GYD  ", "HKD  ", "HNL  ", "HRK  ", "HTG  ", "HUF  ", "IDR  ", "ILS  ", "IMP  ", "INR  ", "IQD  ", "IRR  ", "ISK  ", "JEP  ", "JMD  ", "JOD  ", "JPY  ", "KES  ", "KGS  ", "KHR  ", "KID  ", "KMF  ", "KRW  ", "KWD  ", "KYD  ", "KZT  ", "LAK  ", "LBP  ", "LKR  ", "LRD  ", "LSL  ", "LYD  ", "MAD  ", "MDL  ", "MGA  ", "MKD  ", "MMK  ", "MNT  ", "MOP  ", "MRU  ", "MUR  ", "MVR  ", "MWK  ", "MXN  ", "MYR  ", "MZN  ", "NAD  ", "NGN  ", "NIO  ", "NOK  ", "NPR  ", "NZD  ", "OMR  ", "PAB  ", "PEN  ", "PGK  ", "PHP  ", "PKR  ", "PLN  ", "PYG  ", "QAR  ", "RON  ", "RSD  ", "RUB  ", "RWF  ", "SAR  ", "SBD  ", "SCR  ", "SDG  ", "SEK  ", "SGD  ", "SHP  ", "SLE  ", "SLL  ", "SOS  ", "SRD  ", "SSP  ", "STN  ", "SYP  ", "SZL  ", "THB  ", "TJS  ", "TMT  ", "TND  ", "TOP  ", "TRY  ", "TTD  ", "TVD  ", "TWD  ", "TZS  ", "UAH  ", "UGX  ", "UYU  ", "UZS  ", "VES  ", "VND  ", "VUV  ", "WST  ", "XAF  ", "XCD  ", "XDR  ", "XOF  ", "XPF  ", "YER  ", "ZAR  ", "ZMW  ", "ZWL" }));

        txtto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "AED", "AFN", "ALL", "AMD", "ANG ", "AOA  ", "ARS", "AUD ", "AWG  ", "AZN  ", "BAM  ", "BBD  ", "BDT ", "BGN  ", "BHD  ", "BIF", "BMD  ", "BND  ", "BOB  ", "BRL ", "BSD  ", "BTN  ", "BWP  ", "BYN  ", "BZD  ", "CAD  ", "CDF  ", "CHF  ", "CLP  ", "CNY  ", "COP  ", "CRC  ", "CUP  ", "CVE  ", "CZK  ", "DJF ", "DKK  ", "DOP  ", "DZD  ", "EGP  ", "ERN  ", "ETB  ", "EUR  ", "FJD  ", "FKP  ", "FOK  ", "GBP  ", "GEL  ", "GGP  ", "GHS  ", "GIP  ", "GMD  ", "GNF  ", "GTQ  ", "GYD  ", "HKD  ", "HNL  ", "HRK  ", "HTG  ", "HUF  ", "IDR  ", "ILS ", "IMP  ", "INR  ", "IQD  ", "IRR  ", "ISK  ", "JEP  ", "JMD  ", "JOD  ", "JPY  ", "KES  ", "KGS  ", "KHR  ", "KID  ", "KMF  ", "KRW  ", "KWD  ", "KYD  ", "KZT  ", "LAK  ", "LBP  ", "LKR  ", "LRD  ", "LSL  ", "LYD  ", "MAD  ", "MDL  ", "MGA  ", "MKD  ", "MMK  ", "MNT  ", "MOP  ", "MRU  ", "MUR  ", "MVR  ", "MWK  ", "MXN  ", "MYR  ", "MZN  ", "NAD  ", "NGN  ", "NIO  ", "NOK  ", "NPR  ", "NZD  ", "OMR  ", "PAB  ", "PEN  ", "PGK  ", "PHP  ", "PKR  ", "PLN  ", "PYG  ", "QAR  ", "RON  ", "RSD  ", "RUB  ", "RWF  ", "SAR  ", "SBD  ", "SCR  ", "SDG  ", "SEK  ", "SGD  ", "SHP  ", "SLE  ", "SLL  ", "SOS  ", "SRD  ", "SSP  ", "STN  ", "SYP  ", "SZL  ", "THB  ", "TJS  ", "TMT  ", "TND  ", "TOP  ", "TRY  ", "TTD  ", "TVD  ", "TWD  ", "TZS  ", "UAH  ", "UGX  ", "UYU  ", "UZS  ", "VES  ", "VND  ", "VUV  ", "WST  ", "XAF  ", "XCD  ", "XDR  ", "XOF  ", "XPF  ", "YER  ", "ZAR  ", "ZMW  ", "ZWL  " }));

        addnewfavbtn.setBackground(new java.awt.Color(0, 255, 0));
        addnewfavbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addnewfavbtn.setText("Add new favorite");
        addnewfavbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewfavbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addnewfavbtn)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addnewfavbtn)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        favtable.setBackground(new java.awt.Color(0, 153, 153));
        favtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "From Currency", "To Currency", "Exchange rate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(favtable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fetchAndSetFavorites() {
        if (!SessionManager.isUserLoggedIn()) {
            JOptionPane.showMessageDialog(this, "Please log in to view your favorites!");
            return;
        }

        int userId = SessionManager.getLoggedInUserId();
        FavoritesDAO favoritesDAO = new FavoritesDAO();

        // Fetch the favorite records for the logged-in user
        List<Favorite> favoriteList = favoritesDAO.getFavoritesByUserId(userId);

        // Prepare table model
        DefaultTableModel model = new DefaultTableModel(new String[]{"From Currency", "To Currency","Exchange rate"}, 0);
        for (Favorite favorite : favoriteList) {
            model.addRow(new Object[]{favorite.getFromCurrency(), favorite.getToCurrency(),favorite.getExchangeRate()});
        }

        // Set model to table
        favtable.setModel(model);
    }
    
    public double getExchangeRate(String fromCurrency, String toCurrency) {
    try {
        String urlString = "https://api.exchangerate-api.com/v4/latest/" + fromCurrency;
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Read the response
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        // Parse the JSON response
        JSONObject jsonResponse = new JSONObject(response.toString());
        JSONObject rates = jsonResponse.getJSONObject("rates");

        // Get the exchange rate
        double exchangeRate = rates.getDouble(toCurrency);
        return exchangeRate;

    } catch (Exception e) {
        e.printStackTrace();
    }
    return 0.0;  // Return 0 if something goes wrong
}

     
    private void addnewfavbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewfavbtnActionPerformed
      // Check if the user is logged in
    if (!SessionManager.isUserLoggedIn()) {
        JOptionPane.showMessageDialog(this, "Please log in to add a favorite!");
        return;
    }

    // Get the selected currencies from the combo boxes
    String fromCurrency = txtfrom.getSelectedItem().toString().trim();
    String toCurrency = txtto.getSelectedItem().toString().trim();

    // Validate that both combo boxes have selections
    if (fromCurrency == null || fromCurrency.isEmpty() || toCurrency == null || toCurrency.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select both currencies!");
        return;
    }

    // Prevent adding the same currency pair
    if (fromCurrency.equals(toCurrency)) {
        JOptionPane.showMessageDialog(this, "From and To currencies cannot be the same!");
        return;
    }

    // Get the logged-in user's ID
    int userId = SessionManager.getLoggedInUserId();

    // Create an instance of FavoritesDAO
    FavoritesDAO favoritesDAO = new FavoritesDAO();

    // Fetch the exchange rate (you can implement your API or method to fetch it)
    double exchangeRate = getExchangeRate(fromCurrency,toCurrency);

    // Check if the favorite already exists
    if (favoritesDAO.isFavoriteExists(userId, fromCurrency, toCurrency)) {
        JOptionPane.showMessageDialog(this, "This favorite already exists!");
        return;
    }

    // Add the favorite to the database
    boolean isAdded = favoritesDAO.addFavorite(userId, fromCurrency, toCurrency, exchangeRate);
    if (isAdded) {
        JOptionPane.showMessageDialog(this, "Favorite added successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to add favorite. Please try again.");
    }
    }//GEN-LAST:event_addnewfavbtnActionPerformed

    
    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
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

    private void hist1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hist1btnActionPerformed
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

    }//GEN-LAST:event_hist1btnActionPerformed

    private void currinfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currinfobtnActionPerformed
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
            java.util.logging.Logger.getLogger(FavoritePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FavoritePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FavoritePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FavoritePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FavoritePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnewfavbtn;
    private javax.swing.JButton currinfobtn;
    private javax.swing.JButton favbtn;
    private javax.swing.JTable favtable;
    private javax.swing.JButton hist1btn;
    private javax.swing.JButton homebtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JComboBox<String> txtfrom;
    private javax.swing.JComboBox<String> txtto;
    // End of variables declaration//GEN-END:variables
}
