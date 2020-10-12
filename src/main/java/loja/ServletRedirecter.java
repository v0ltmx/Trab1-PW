package loja;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletRedirecter", urlPatterns = "/Trabalho-1/ServletRedirecter")
public class ServletRedirecter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome, email, senha, funcionario;
        nome = request.getParameter("nome");
        email = request.getParameter("email");
        senha = request.getParameter("senha");
        Usuario user = new Usuario(nome, email, senha, "false");

    }

}
