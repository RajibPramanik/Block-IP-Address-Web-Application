import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;  // Import ServletException
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set the response content type to HTML
        response.setContentType("text/html");
        
        // Get the PrintWriter object to send HTML output
        PrintWriter out = response.getWriter();
        
        // Write the HTML response
        out.print("<h2>Hello Client, welcome to my Website...</h2>");
    }
}
