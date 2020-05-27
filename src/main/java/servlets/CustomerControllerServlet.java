package servlets;

import dao.CustomerDao;
import dbutil.OracleConnection;
import models.Customer;
import sun.misc.Request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/CustomerControllerServlet")

public class CustomerControllerServlet extends HttpServlet {

    private OracleConnection connection;
    private CustomerDao dao;

    @Override
    public void init() throws ServletException {
        super.init();
        try(Connection connection = OracleConnection.getConnection()){

        }catch(Exception e){
            throw new ServletException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //list the customers
        try {
            listCustomers(req, resp);
        } catch (Exception e) {
            throw new ServletException(e);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    private void listCustomers(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //Get customers from DAO
        List<Customer> customers = dao.getAllCustomers();
        //Add students to request
        req.setAttribute("CUSTOMER_LIST", customers);
        //Send to JSP page (view)
        RequestDispatcher dispatcher = req.getRequestDispatcher("/list-customers.jsp");
        dispatcher.forward(req, resp);
    }
}
