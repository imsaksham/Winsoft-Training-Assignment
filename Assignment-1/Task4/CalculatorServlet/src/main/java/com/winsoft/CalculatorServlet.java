package com.winsoft;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private Integer performOperations(String operations) {
    	
		String[] arr = operations.split("(?<=[-+*/])|(?=[-+*/])");
        int result = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i += 2) {
            String operator = arr[i];
            double operand = Double.parseDouble(arr[i + 1]);

            if ("+".equals(operator)) {
                result += operand;
            } else if ("-".equals(operator)) {
                result -= operand;
            } else if ("*".equals(operator)) {
                result *= operand;
            } else if ("/".equals(operator)) {
                result /= operand;
            }
        }

        return result;
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    	String operations = request.getParameter("operations");
    	String button = request.getParameter("button");

        if ("=".equals(button)) {
        	operations = Integer.toString(performOperations(operations));
        }
        else if ("C".equals(button)) {
        	operations = "";
        }
        else {
        	operations += button;
        }
        
        request.setAttribute("operations", operations);
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("calculator.jsp");
        requestDispatcher.forward(request, response);
        
    }

}
