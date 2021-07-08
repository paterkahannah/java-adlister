import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("user"); // remove attribute, as an extra precaution
        request.getSession().invalidate(); // destroy session
        response.sendRedirect("/login");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //        // saving the session to a variable
//        HttpSession session = request.getSession();
//
//        // setting dark mode attribute on session so it gets used every time (remembered)
//        String darkMode = request.getParameter("color");
//        session.setAttribute("darkMode", darkMode);
//
//        // remove attribute, not used too often
//        HttpSession session = req.getSession();
//        session.setAttribute("user", false);
//        resp.sendRedirect("/login");
    }
}
