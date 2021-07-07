import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class ShowAdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        // create a new instance of the ListAdsDao class so we can use the all() method
//        Ads adsDao = new ListAdsDao(); // my old attempt
        Ads adsDao = DaoFactory.getAdsDao();
        //set a new List of <ad objects> equal to our list of ads (.all() method)
        List<Ad> ads = adsDao.all();
        // Pass the data to the jsp
        request.setAttribute("ads", ads);
        //forward the url to send us to our index page
        request.getRequestDispatcher("/ads/index.jsp").forward(request, resp);
    }
}