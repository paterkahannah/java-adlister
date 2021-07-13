package com.codeup.adlister.controllers;
import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form // NOTE THIS!
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB_INF/register.jsp").forward(request, response); // showing the registration form
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid //
        // TODO: create a new user based off of the submitted information //
        // TODO: if a user was successfully created, send them to their profile //

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmpassword = request.getParameter("confirmpassword");

        boolean noneEmpty = !(username.isEmpty() && email.isEmpty() && password.isEmpty() && confirmpassword.isEmpty());
        boolean passesMatch = password.equals(confirmpassword);
        boolean goodEmail = email.contains("@");
        boolean userNotExists;
        try {
            DaoFactory.getUsersDao().findByUsername(username);
            userNotExists = false;
        } catch (Exception e) {
            userNotExists = true;
        }

        if (noneEmpty && passesMatch && goodEmail && userNotExists) {
            User newUser = new User(username, email, password); // spinning up new user, o id needed because it will automatically be generated when added to table
            DaoFactory.getUsersDao().insert(newUser); // inserting data into table
            newUser = DaoFactory.getUsersDao().findByUsername(newUser.getUsername());
            HttpSession session = request.getSession();
            session.setAttribute("user", newUser);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/register");
        }
    }

}
