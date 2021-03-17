import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;

import javax.transaction.*;
import javax.xml.bind.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ujwal.example.*;
import com.ujwal.example.HibernateUtil;
import com.ujwal.example.UserValidate;
import java.util.Date;

/**
 * Servlet implementation class UserLogin
 */
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        try {
			            authenticate(request, response);
			        } catch (Exception e) {
			            // TODO Auto-generated catch block
			            e.printStackTrace();
			        }
			    }

			    private void authenticate(HttpServletRequest request, HttpServletResponse response) throws Exception {
			        String username = request.getParameter("username");
			        String password = request.getParameter("password");

			        if (UserValidate.validate(username, password)) {
			            RequestDispatcher dispatcher = request.getRequestDispatcher("logsuccess.jsp");
			            dispatcher.forward(request, response);
			        } else {
			        	 RequestDispatcher disp = request.getRequestDispatcher("logfail.jsp");
			            disp.forward(request, response);
			        }
			    }
			}