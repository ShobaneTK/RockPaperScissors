/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.bl.GameSummaryFacadeLocal;
import za.ac.tut.model.entities.GameSummary;

/**
 *
 * @author Student
 */
public class StoreGameSummaryServlet extends HttpServlet {
    @EJB GameSummaryFacadeLocal gsl;
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        Integer totNumsChecked = (Integer)session.getAttribute("totNumsChecked");
        Integer numPalindromes = (Integer)session.getAttribute("numPalindromes");
        Integer numNonPalindromes = (Integer)session.getAttribute("numNonPalindromes");
        
        GameSummary gs = createGameSummary(totNumsChecked, numPalindromes, numNonPalindromes);
        gsl.create(gs);
        
        RequestDispatcher disp = request.getRequestDispatcher("store_game_summary_outcome.jsp");
        disp.forward(request, response);
    }

    private GameSummary createGameSummary(Integer totNumsChecked, Integer numPalindromes, Integer numNonPalindromes) {
        GameSummary gs = new GameSummary();
        gs.setTotNumbersChecked(totNumsChecked);
        gs.setTotNumOfPalindromes(numPalindromes);
        gs.setTotNumOfNonPalindromes(numNonPalindromes);
        gs.setCreationDate(new Date());
        return gs;
    }

}
