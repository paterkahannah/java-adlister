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
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("WEB-INF/profile");
            return;
        }

        request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean isAdmin = username.equals("admin") && password.equals("password");
        boolean user = username.equals("user") && password.equals("userpass"); // created new key

        HttpSession session = request.getSession(); // capturing session and storing in value
//        session.setAttribute("username", username);

        if (isAdmin) {
            session.setAttribute("isAdmin", true);
            response.sendRedirect("/secret-admin-page");
        } else if (user) {
            session.setAttribute("user", username); // creating key/value pair // here we are defining "user" to contain the user value that will be captured on line 21
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
