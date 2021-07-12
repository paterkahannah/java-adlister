package com.codeup.adlister.controllers;
import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form // NOTE THIS!
        request.getRequestDispatcher("/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid //
        // TODO: create a new user based off of the submitted information //
        // TODO: if a user was successfully created, send them to their profile //
        User user = new User(
                10,
                request.getParameter("username"),
                request.getParameter("email"),
                request.getParameter("password")
        );

//        String username = request.getParameter("username");
//        HttpSession session = request.getSession();
//        session.setAttribute("user", username);
//        request.getSession().setAttribute("user", username);

        DaoFactory.getUsersDao().insert(user);
        if (request.getParameter("username") != null && request.getParameter("email") != null && request.getParameter("password") != null) {
            response.sendRedirect("/profile");
        }



    }
}
