
package Currency.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Currency.util.DatabaseConnection;
import Currency.SessionManager;
import Currency.pages.CurrInfo;
import java.util.ArrayList;
import java.util.List;

public class CurrencyInfoDAO {
     // Method to insert currency information into the CurrencyInfo table
    public boolean addCurrencyInfo(String currencyCode, String currencyName, String country, String symbol) {
        String query = "INSERT INTO CurrencyInfo (currency_code, currency_name, country, symbol) VALUES (?, ?, ?, ?)";
        

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, currencyCode);
            stmt.setString(2, currencyName);
            stmt.setString(3, country);
            stmt.setString(4, symbol);
            
            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Method to fetch all currency information
    public List<CurrInfo> getAllCurrencyInfo() {
        String query = "SELECT * FROM CurrencyInfo";
        List<CurrInfo> currinfo = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String currencycode= rs.getString("currency_code") ;
                String currencyName= rs.getString("currency_name");
                String country= rs.getString("country") ;
                String symbol=rs.getString("symbol");
             
                currinfo.add(new CurrInfo(currencycode,currencyName,country,symbol));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return currinfo;
    }
}
