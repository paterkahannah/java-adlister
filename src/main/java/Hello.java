import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class Hello extends HttpServlet {

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

// req - the user clicking on something, for example
// response - what the server sends back, like an html response (a valid html document)
// our java code lives server-side! (javascript resides on the client-side)
// A servlet is a Java class that extends the HttpServlet class from the servlet library. A servlet's most basic functionality is to handle HTTP requests and responses.