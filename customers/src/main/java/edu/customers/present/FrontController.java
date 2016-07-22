/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.customers.present;

import edu.customers.bussines.Facade;
import edu.customers.model.Customer;
import java.io.IOException;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FrontController", urlPatterns = {"*.do"})
public class FrontController extends HttpServlet {

    @Inject
    Facade facade;
    private static final Logger LOG = Logger.getLogger(FrontController.class.getName());

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String actionName = request.getServletPath();

        switch (actionName) {
            case "/add.do": {
                String name = request.getParameter("name");
                if (name.isEmpty()) {
                    request.setAttribute("errormessage", "Empty name");
                    RequestDispatcher d = request.getRequestDispatcher("Add.jsp");
                    d.forward(request, response);

                } else {
                    facade.add(new Customer(name));
                }
                break;
            }
            default:
                throw new ServletException(actionName);
        }
//        RequestDispatcher d = request.getRequestDispatcher("");
//        d.forward(request, response);
        response.sendRedirect("");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
