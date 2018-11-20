/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessioncontexte;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Matthias
 */
public class Controller extends HttpServlet {

    int essai = 0;
    int nb;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String player = request.getParameter("playerName");
            String action = request.getParameter("action");
            String guess = request.getParameter("guess");

            HttpSession session = request.getSession();

            Random r = new Random();

            if (("Deconnexion".equals(action)) || (action) == null) {
                request.getSession(true).invalidate();
                request.getRequestDispatcher("JSP.jsp").forward(request, response);
            } else if (("Connexion".equals(action) && (player.isEmpty()) == false) || "Rejouer".equals(action)) {
                this.nb = r.nextInt(100);
                this.essai = 0;
                request.setAttribute("nom", player);
                request.setAttribute("essais", "");
                request.setAttribute("message", "");
                request.getRequestDispatcher("jeu.jsp").forward(request, response);
            } else if ("Deviner".equals(action)) {
                int val = Integer.parseInt(guess);
                //System.out.println(nb);

                if (val != this.nb) {
                    this.essai = this.essai + 1;
                    request.setAttribute("essais", "N°essai :<b>" + this.essai + "</b><br/>");
                    request.setAttribute("guess", val);
                    request.getSession(true).setAttribute("random", nb);
                    if (val < this.nb) {
                        request.setAttribute("message", val + ": <b> Trop bas</b>");
                    } else {
                        request.setAttribute("message", val + ": <b> Trop haut</b>");
                    }
                    request.getRequestDispatcher("jeu.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("fin.jsp").forward(request, response);
                }

            }

        }
    }

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
        processRequest(request, response);
    }

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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
