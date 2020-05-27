package dao;

import dbutil.OracleConnection;
import models.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

    public List<Customer> getAllCustomers(){

        List<Customer> customers = new ArrayList<>();
        //try connection
        try(Connection connection = OracleConnection.getConnection()) {
            //create sql statement
            String sql = "Select * FROM Customer";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //execute statement
            ResultSet rS = preparedStatement.executeQuery();

            //process results
            while (rS.next()) {
                Customer c = new Customer();
                c.setId(rS.getString("id"));
                c.setFirstName(rS.getString("firstName"));
                c.setLastName(rS.getString("lastName"));
                c.setEmail(rS.getString("email"));

                customers.add(c);

            }
            } catch(SQLException | ClassNotFoundException throwables){
                throwables.printStackTrace();
            }
        return customers;
        }

    }
