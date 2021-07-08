import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("isAdmin") != null) {
            response.sendRedirect("WEB-INF/secret-admin-page.jsp"); /////
            return;
        }

        request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response); /////
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean isAdmin = username.equals("admin") && password.equals("password");
        boolean user = username.equals("user") && password.equals("userpass");

        HttpSession session = request.getSession();
        session.setAttribute("username", username);

        if (isAdmin) {
            session.setAttribute("isAdmin", true);
            response.sendRedirect("/secret-admin-page");
        } else if (user) {
            session.setAttribute("user", true);
            response.sendRedirect("/profile");
        }else {
            response.sendRedirect("/login");
        }

//        // saving the session to a variable
//        HttpSession session = request.getSession();
//
//        // setting dark mode attribute on session so it gets used every time (remembered)
//        String darkMode = request.getParameter("color");
//        session.setAttribute("darkMode", darkMode);
//
//        // remove attribute, not used too often
//        session.removeAttribute("darkMode");
    }
}
