/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.prueba.controller;

import co.com.poli.prueba.Bussiness.Implementacion.UsuarioBussinessImplementacion;
import co.com.poli.prueba.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CATALINA
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/UsuarioServlet"})
public class UsuarioServlet extends HttpServlet {

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
        HttpSession session = request.getSession(true);
        RequestDispatcher rd = null;

        UsuarioBussinessImplementacion cBusinessImpl = new UsuarioBussinessImplementacion();
        String accion = request.getParameter("accion");

        switch (accion) {
            case "crear":
                Boolean Estado = false;

                String documento = request.getParameter("txtdocumento");
                String nombres = request.getParameter("txtnombre");
                String apellidos = request.getParameter("txtapellido");
                String email = request.getParameter("txtemail");
                String clave = request.getParameter("txtclave");
                String rol = request.getParameter("txtrol");
                String estado = request.getParameter("txtestado");
                
                if(estado=="activo")
                {
                    Estado=true;
                }

                Usuario usuario= new Usuario(documento, nombres, apellidos, email, clave, rol, Estado);
                String mensaje = cBusinessImpl.crearUsuario(usuario);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                
                break;

            case "listar":
                List<Usuario> listausuarios = cBusinessImpl.obtenerListaUsuarios();
                session.setAttribute("LISTADO", listausuarios);
                rd = request.getRequestDispatcher("/Usuariolista.jsp");
                break;

            

            default:
                break;
        }
        rd.forward(request, response);
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
