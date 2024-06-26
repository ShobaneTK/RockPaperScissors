/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.RockPaperScissorManager;

/**
 *
 * @author Student
 */
public class RockPaperScissorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        char userChoice = request.getParameter("choice").charAt(0);
        
        RockPaperScissorManager rpsm = new RockPaperScissorManager();
        char computerChoice = rpsm.generateSign();
        
        String outcome = rpsm.determineOutcome(userChoice, computerChoice);
        request.setAttribute("outcome", outcome);
        
        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);
    }


}
