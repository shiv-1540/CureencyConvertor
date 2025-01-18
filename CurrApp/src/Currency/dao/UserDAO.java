
package Currency.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Currency.util.DatabaseConnection;
import Currency.SessionManager;
import java.util.ArrayList;
import java.util.List;
import Currency.pages.ConversionHistory1;



public class UserDAO {
    public boolean registerUser(String username, String email, String password) {
        String query = "INSERT INTO Users (username, email, password) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, email);
            stmt.setString(3, password);
            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public int loginUser(String username, String password) {
      String query = "SELECT id FROM Users WHERE username = ? AND password = ?";

      try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
         stmt.setString(1, username);
         stmt.setString(2, password);

        try (ResultSet rs = stmt.executeQuery()) {
             // If the result set has at least one row, login is successful
            if (rs.next()) {
                int userId = rs.getInt("id");
                // Store the userId in the session manager
                SessionManager.setLoggedInUserId(userId);
                return userId;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return -1; // Return -1 to indicate login failure
}

   public List<ConversionHistory1> getConversionHistory(int userId) {
    String query = "SELECT from_currency, to_currency, amount, converted_amount, conversion_date FROM ConversionHistory WHERE user_id = ?";
    List<ConversionHistory1> historyList = new ArrayList<>();

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        
        stmt.setInt(1, userId);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            ConversionHistory1 entry = new ConversionHistory1();
            entry.setFromCurrency(rs.getString("from_currency"));
            entry.setToCurrency(rs.getString("to_currency"));
            entry.setAmount(rs.getDouble("amount"));
            entry.setConvertedAmount(rs.getDouble("converted_amount"));
            entry.setConversionDate(rs.getString("conversion_date"));

            historyList.add(entry);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return historyList;
}

public boolean saveConversionHistory(int userId, String fromCurrency, String toCurrency, double amount, double convertedAmount) {
    String query = "INSERT INTO ConversionHistory (user_id, from_currency, to_currency, amount, converted_amount) VALUES (?, ?, ?, ?, ?)";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        
        stmt.setInt(1, userId);
        stmt.setString(2, fromCurrency);
        stmt.setString(3, toCurrency);
        stmt.setDouble(4, amount);
        stmt.setDouble(5, convertedAmount);

        int rowsInserted = stmt.executeUpdate();
        return rowsInserted > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

   
}


