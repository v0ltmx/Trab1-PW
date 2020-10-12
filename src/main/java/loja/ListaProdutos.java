package loja;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "loja.ListaProdutos", urlPatterns = "/loja.ListaProdutos")
public class ListaProdutos extends HttpServlet {

    List<Produto> listaProdutos;

    public ListaProdutos() {
        listaProdutos = new ArrayList<>();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
