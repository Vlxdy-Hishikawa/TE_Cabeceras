
package com.Vlxdy;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vlxdy Hishikawa
 */
@WebServlet(name = "RespHTML", urlPatterns = {"/RespHTML"})
public class RespHTML extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/HTML");
            PrintWriter out = response.getWriter();
            try {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
                out.println("<meta name=author content= VLADIMIR HUANCA >");
                out.println("<title>RESPUESTA HTML</title>");           
            out.println("</head>");
            out.println("<body>");
                out.println("<h1 align='center'>HTML GENERADO DESDE UN SERVLET</h2>");
                out.println("<br>");         
            out.println("</body>");
            out.println("</html>");
        }
        finally{
            out.close();
        }  
    }
}