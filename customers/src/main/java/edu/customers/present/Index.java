/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.customers.present;

import edu.customers.bussines.Facade;
import edu.customers.model.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author danecek
 */
@WebServlet(name = "Index", urlPatterns = {""})
public class Index extends HttpServlet {

    @Inject
    Facade facade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Index</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Index</h1>");
            out.println("<table>");

            for (Customer c : facade.all()) {

                out.println("<tr>");
                out.println("<td>");
                out.print(c.getId());
                out.println("</td>");
                out.println("<td>");
                out.print(c.getName());
                out.println("</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<a href = \"Add.jsp\" >Add</a>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
