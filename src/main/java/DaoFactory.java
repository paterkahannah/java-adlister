import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    private static Config testConfig = new Config();

    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(testConfig);
        }
        return adsDao;
    }
}
