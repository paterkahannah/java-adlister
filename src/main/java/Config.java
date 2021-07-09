import java.sql.SQLException;

public class Config {
// functions I threw in!
    public String getUrl() {
        return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    }
    public String getUser() {
        return "root";
    }
    public String getPassword() {
        return "codeup";
    }

    public static void main(String[] args) throws SQLException {


    }
}
