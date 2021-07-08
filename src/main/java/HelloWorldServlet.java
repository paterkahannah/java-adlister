import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        if (name == null) {
            out.println("<h1>Hello, World!</h1>");
        } else {
            out.println("<h1>Hello, " + name + "!</h1>");
        }
    }
}

// DoGet method generally is used to query or to get some information from the server
// DoPost is generally used to update or post some information to the server