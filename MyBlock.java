import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyBlock implements Filter {

    // Initialization method (not used in this case)
    @Override
    public void init(FilterConfig config) throws ServletException {}

    // Main method that handles the filtering process
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {

        // Get the user's IP address from the request
        String ip = req.getRemoteAddr();
        
        // Get the response writer to send output to the client
        PrintWriter out = resp.getWriter();

        // Block IP address 10.79.2.70 (your IP address)
        if (ip.equals("127.0.0.1")) {
            // If the IP is blocked, show a message to the user
            out.print("<h2>Your IP address is blocked by this website</h2>");
        } else {
            // If the IP is not blocked, continue to the next filter or servlet
            chain.doFilter(req, resp); // Pass the request and response to the next filter or servlet
        }
    }

    // Cleanup method (not used in this case)
    @Override
    public void destroy() {}
}
