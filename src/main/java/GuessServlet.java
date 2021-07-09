import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int number = Integer.parseInt(req.getParameter("number"));

        if (number == 1) {
            req.getRequestDispatcher("/incorrect").forward(req, resp);
        }
        if (number == 2) {
            req.getRequestDispatcher("/correct").forward(req, resp);
        }
        if (number == 3) {
            req.getRequestDispatcher("/incorrect").forward(req, resp);
        }
    }
}
