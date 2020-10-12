import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/helloServlet")
public class helloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection connection = null;
        try {
            connection = ConnectDB.getConnection();
        } catch (SQLException ex) {
            resp.getWriter().append("Connection Failed! Check output console");
        }
        if(connection!= null){
            resp.getWriter().append("A conexão com o banco foi realizada!");
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }else{
            resp.getWriter().append("A conexão com o banco falhou!");
        }
    }
}
