package com.example.layeredarchitecture.dao.Custom.Impl;


import com.example.layeredarchitecture.dao.Custom.CustomerDAO;
import com.example.layeredarchitecture.dao.SqlUtill;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {

    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM Customer");*/

        ResultSet rst = SqlUtill.execute("SELECT * FROM Customer");

        while (rst.next()) {
            CustomerDTO customerDTO = new CustomerDTO(rst.getString("id"), rst.getString("name"), rst.getString("address"));
            allCustomers.add(customerDTO);
        }
        return allCustomers;
    }


    public boolean add(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO Customer (id,name, address) VALUES (?,?,?)");
        pstm.setString(1, dto.getId());
        pstm.setString(2, dto.getName());
        pstm.setString(3, dto.getAddress());
        return pstm.executeUpdate() > 0;*/
        return SqlUtill.execute("INSERT INTO Customer (id,name, address) VALUES (?,?,?)",dto.getId(),dto.getName(),dto.getAddress());
    }

    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("UPDATE Customer SET name=?, address=? WHERE id=?");
        pstm.setString(1, dto.getName());
        pstm.setString(2, dto.getAddress());
        pstm.setString(3, dto.getId());
        return pstm.executeUpdate() > 0;*/
        return SqlUtill.execute("UPDATE Customer SET name=?, address=? WHERE id=?",dto.getId(), dto.getAddress(), dto.getName());
    }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("SELECT id FROM Customer WHERE id=?");
        pstm.setString(1, id);
        return pstm.executeQuery().next();*/
        ResultSet resultSet = SqlUtill.execute("SELECT id FROM Customer WHERE id=?",id);
        return resultSet.next();
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        //Connection connection = DBConnection.getDbConnection().getConnection();
        //ResultSet rst = connection.createStatement().executeQuery("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
        ResultSet rst =SqlUtill.execute("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
        if (rst.next()) {
            String id = rst.getString("id");
            int newCustomerId = Integer.parseInt(id.replace("C00-", "")) + 1;
            return String.format("C00-%03d", newCustomerId);
        } else {
            return "C00-001";
        }
    }


    public boolean delete(String id) throws SQLException, ClassNotFoundException {
       /* Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("DELETE FROM Customer WHERE id=?");
        pstm.setString(1, id);
        return pstm.executeUpdate() > 0;*/
        return SqlUtill.execute("DELETE FROM Customer WHERE id=?",id);
    }


    public CustomerDTO search(String id) throws SQLException, ClassNotFoundException {
       // Connection connection = DBConnection.getDbConnection().getConnection();
       // PreparedStatement pstm = connection.prepareStatement("SELECT * FROM Customer WHERE id=?");
       // PreparedStatement pstm = SqlUtill.execute("SELECT * FROM Customer WHERE id=?",id);
      //  pstm.setString(1, id + "");
       // ResultSet rst = pstm.executeQuery();
        ResultSet rst = SqlUtill.execute("SELECT * FROM Customer WHERE id=?",id);
        rst.next();
        return new CustomerDTO(id + "", rst.getString("name"), rst.getString("address"));
    }

}
