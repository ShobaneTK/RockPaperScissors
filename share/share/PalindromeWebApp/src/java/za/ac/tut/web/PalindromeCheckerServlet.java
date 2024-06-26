/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.bl.PalindromeCheckerSBLocal;

/**
 *
 * @author Student
 */
public class PalindromeCheckerServlet extends HttpServlet {
    @EJB PalindromeCheckerSBLocal pcl;
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String numStr = request.getParameter("num");
        Integer num = Integer.parseInt(numStr);
        
        Boolean outcome = pcl.check(num);
        Integer reverseForm = pcl.getReverseForm(num);
        
        updateSession(session, outcome);
        request.setAttribute("numStr", numStr);
        request.setAttribute("reverseForm", reverseForm);
        request.setAttribute("outcome", outcome);
        
        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);
    }

    private void updateSession(HttpSession session, Boolean outcome) {
        Integer totNumsChecked;
        
        if(outcome){
            Integer  numPalindromes;
            numPalindromes = (Integer)session.getAttribute("numPalindromes");
            numPalindromes++;
            session.setAttribute("numPalindromes", numPalindromes);
        } else {
            Integer  numNonPalindromes;
            numNonPalindromes = (Integer)session.getAttribute("numNonPalindromes");
            numNonPalindromes++;
            session.setAttribute("numNonPalindromes", numNonPalindromes);
        }
        
        totNumsChecked = (Integer)session.getAttribute("totNumsChecked");
        totNumsChecked++;
        session.setAttribute("totNumsChecked", totNumsChecked);
    }

}
