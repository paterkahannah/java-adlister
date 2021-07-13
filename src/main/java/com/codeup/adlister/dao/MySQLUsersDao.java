package com.codeup.adlister.dao;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users {

    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    private User extractuser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }

    @Override
    public User findByUsername(String username) {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users WHERE username = ?;";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                users.add(new User(rs.getLong("id"), rs.getString("username"), rs.getString("email"), rs.getString("password")));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
        return users.get(0);
    }

//    EXAMINE THIS ANC COMPARE
//    @Override
//    public User findByUsername(String username) {
//        String sql = "SELECT * FROM users WHERE username LIKE ?";
//        try {
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            stmt.setString(1, username);
//            ResultSet rs = stmt.executeQuery();
//            rs.next();
//            return extractUser(rs);
//        } catch (SQLException e) {
//            throw new RuntimeException("Error retrieving user.", e);
//        }
//    }

    @Override
    public Long insert(User user) {
        String sql = "INSERT INTO users(username, email, password) VALUES (?, ?, ?);";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername()); // 1 corresponds to the first question mark
            stmt.setString(2, user.getEmail()); // 2 to the second question mark
            stmt.setString(3, user.getPassword()); // and so on.....
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error creating a new user2.", e);
        }
    }

}
