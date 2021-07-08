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

        HttpSession session = request.getSession();

        if ((Boolean)session.getAttribute("user") == null) { // if this equals null it means no user has logged in yet
            response.sendRedirect("/login"); // so they will be redirected to login page
            return;
        }
        request.getRequestDispatcher("WEB-INF/profile.jsp").forward(request, response); // else directedd to profile page
    }
}
