import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        this.connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ads");
            while (resultSet.next()) {
                ads.add(new Ad(
                        resultSet.getInt("id"),
                        resultSet.getInt("user_id"),
                        resultSet.getString("title"),
                        resultSet.getString("description")
                ));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        String insertQuery = "INSERT INTO albums (artist, name, release_date, genre, sales) VALUES('Nelly Furtado', 'Loose', 2006, 'Dance-pop, hip hop, R&B', 12.5)";
        return null;
    }


}
