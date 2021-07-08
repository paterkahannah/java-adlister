import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/profile.jsp").forward(request, response); /////

        HttpSession session = request.getSession();

        if ((Boolean)session.getAttribute("user") == null || (Boolean)session.getAttribute("user") == false) { // this must be caste to the correct type, get attribute always return a generic object, we must make it something.
            response.sendRedirect("/login");
            return;
        }
    }
}
