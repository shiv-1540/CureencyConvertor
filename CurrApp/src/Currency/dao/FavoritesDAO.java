package Currency.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Currency.util.DatabaseConnection;
import Currency.SessionManager;
import Currency.pages.Favorite;
        

public class FavoritesDAO {

    // Add a favorite pair for a user
   public boolean addFavorite(int userId, String fromCurrency, String toCurrency, double exchangeRate) {
    String query = "INSERT INTO Favorites (user_id, from_currency, to_currency, exchange_rate) VALUES (?, ?, ?, ?)";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        
        stmt.setInt(1, userId);
        stmt.setString(2, fromCurrency);
        stmt.setString(3, toCurrency);
        stmt.setDouble(4, exchangeRate);  // Insert the exchange rate
        
        int rowsInserted = stmt.executeUpdate();
        return rowsInserted > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}


    public List<Favorite> getFavoritesByUserId(int userId) {
        String query = "SELECT from_currency, to_currency,exchange_rate FROM Favorites WHERE user_id = ?";
        List<Favorite> favorites = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, userId);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String fromCurrency = rs.getString("from_currency");
                    String toCurrency = rs.getString("to_currency");
                    Double exchangerate=rs.getDouble("exchange_rate");
                    favorites.add(new Favorite(fromCurrency, toCurrency,exchangerate));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return favorites;
    }

    // Delete a specific favorite pair for a user
    public boolean deleteFavorite(int userId, String fromCurrency, String toCurrency) {
        String query = "DELETE FROM Favorites WHERE user_id = ? AND from_currency = ? AND to_currency = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, userId);
            stmt.setString(2, fromCurrency);
            stmt.setString(3, toCurrency);
            
            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Check if a favorite pair already exists for a user
    public boolean isFavoriteExists(int userId, String fromCurrency, String toCurrency) {
        String query = "SELECT id FROM Favorites WHERE user_id = ? AND from_currency = ? AND to_currency = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, userId);
            stmt.setString(2, fromCurrency);
            stmt.setString(3, toCurrency);
            
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next(); // If a row exists, the favorite already exists
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
