import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

    private int hitCount;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String reset = req.getParameter("reset");

        hitCount++;

        if (reset != null) {
            hitCount = 0;
        }

        String title = "Total Number of Hits";

        out.println(
                "<h1 align = \"center\">" + title + "</h1>\n" +
                        "<h2 align = \"center\">" + hitCount + "</h2>\n"
        );
    }
}