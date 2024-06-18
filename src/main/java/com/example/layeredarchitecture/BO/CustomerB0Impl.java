package com.example.layeredarchitecture.BO;

import com.example.layeredarchitecture.dao.Custom.CustomerDAO;
import com.example.layeredarchitecture.dao.Custom.Impl.CustomerDAOImpl;
import com.example.layeredarchitecture.dao.SqlUtill;
import com.example.layeredarchitecture.model.CustomerDTO;
import javafx.beans.binding.NumberExpression;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerB0Impl implements CustomerBo{

    CustomerDAO customerDAO = new CustomerDAOImpl();
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        // customerDAO = new CustomerDAOImpl();
        return customerDAO.getAll();
    }


    public boolean add(CustomerDTO dto) throws SQLException, ClassNotFoundException {
       // CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.add(dto);
          }

    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
       // CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.update(dto);
       }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {
       // CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.exist(id);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
      //  CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.generateNewID();

    }


    public boolean delete(String id) throws SQLException, ClassNotFoundException {
       // CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.delete(id);
    }


    public CustomerDTO search(String id) throws SQLException, ClassNotFoundException {
      ///  CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.search(id);
}
}
