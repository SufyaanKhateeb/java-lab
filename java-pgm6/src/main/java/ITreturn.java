

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ITreturn
 */
public class ITreturn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ITreturn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        double salary = Double.parseDouble(request.getParameter("salary"));
        double deduction = Double.parseDouble(request.getParameter("deduction"));
        double incomeTax = (salary - deduction) * 0.2;

        response.getWriter().append("\nName: " + name).append("\nGender: " + gender).append("\nSalary: " + salary)
                .append("\nDeduction: " + deduction).append("\nIncomeTax: " + incomeTax);

        String newFile = new File("data.txt").getAbsolutePath();
        System.out.println("File:" + newFile);

        PrintWriter pw = new PrintWriter("data.txt");
        pw.println("Name: " + name);
        pw.println("Gender: " + gender);
        pw.println("Salary: " + salary);
        pw.println("Deduction: " + deduction);
        pw.println("IncomeTax: " + incomeTax);

        pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
