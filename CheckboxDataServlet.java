import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckboxDataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Checkbox Data</title></head><body>");

        String[] checkboxes = request.getParameterValues("checkbox");
        if (checkboxes != null && checkboxes.length > 0) {
            out.println("<h3>Selected checkboxes:</h3>");
            out.println("<ul>");
            for (String checkbox : checkboxes) {
                out.println("<li>" + checkbox + "</li>");
            }
            out.println("</ul>");
        } else {
            out.println("<h3>No checkboxes selected.</h3>");
        }

        out.println("</body></html>");
        out.close();
    }
}
