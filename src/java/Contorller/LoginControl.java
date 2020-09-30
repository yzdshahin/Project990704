
package Contorller;

import Contorller.Util.Hash;
import Model.DAO.PersonDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginControl", urlPatterns = {"/LoginControl"})
public class LoginControl extends HttpServlet {

     public void Pot(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, NoSuchAlgorithmException, SQLException {
        response.setContentType("text/html"); 
        PrintWriter writer = response.getWriter();

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String father = request.getParameter("father");
        String birth = request.getParameter("birth");
        String gender = request.getParameter("gender");
            PersonDAO p= new PersonDAO();
            String userRegistered = p.RegistoreNow(name, password, father, birth, gender);
            if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
         {
            request.getRequestDispatcher("/SuccessPage.jsp").forward(request, response);
         }
         else   //On Failure, display a meaningful message to the User.
         {
            request.setAttribute("errMessage", userRegistered);
            request.getRequestDispatcher("/register.jsp").forward(request, response);
         }
         
         
        
        
         
          
            
//        if (PersonDAO.validateUser(name)){
//            if(Hash.MakeHash(password).equals(PersonDAO.validatePass(password))){
//            System.out.println("you're welcome");
//            RequestDispatcher requestDispatcher= request.getRequestDispatcher("SuccessPage.jsp");
//            requestDispatcher.forward(request,response);
//        }}else {
//            System.out.println("Try again");
//            RequestDispatcher requestDispatcher=request.getRequestDispatcher("ErrorPage.jsp");
//            requestDispatcher.forward(request,response);
//        }

    }

}
