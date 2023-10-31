package br.com.ibm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ExemploServlet", urlPatterns = {"/exemplo"})
public class ExemploServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        petGato newGato = new petGato();
        Gato meuGato = new Gato();

        List<String> items = new ArrayList<>();
        items.add(newGato.nome());
        items.add(newGato.especie());
        items.add(newGato.raca());
        items.add("Normalmente, ele dorme, faz " + meuGato.onomatopeia());

        request.setAttribute("items", items);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/exemplo.jsp");
        dispatcher.forward(request, response);
    }
}