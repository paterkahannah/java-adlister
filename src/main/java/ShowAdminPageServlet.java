import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ShowAdminPageServlet", urlPatterns = "/admin")
public class ShowAdminPageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        if ((Boolean)session.getAttribute("isAdmin") == false) { // this must be caste to the correct type, get attribute always return a generic object, we must make it something.
            response.sendRedirect("login");
            return;
        }

        request.getRequestDispatcher("secret-admin-page.jsp").forward(request, response);
    }
}