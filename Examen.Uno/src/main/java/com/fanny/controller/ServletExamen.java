/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fanny.controller;

import com.fandita.web.Evaluacion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T107
 */
public class ServletExamen extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        //Objeto
        Evaluacion e=new Evaluacion();
        
        e.setNombre("Ana");
        Evaluacion x=new Evaluacion();
        x.setEvaluacion(e);
        
        e.setCalificacion(7);
        Evaluacion y=new Evaluacion();
        y.setEvaluacion(e);
        
        
        //Muestra 
        System.out.println(x.getEvaluacion());

     
        request.setAttribute("registro", x);
        RequestDispatcher despachador=request.getRequestDispatcher("/presentacion.jsp");
        despachador.forward(request, response);

}
}