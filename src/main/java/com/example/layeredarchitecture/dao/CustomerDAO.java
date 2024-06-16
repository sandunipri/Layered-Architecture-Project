package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> LoadAllCustomer() throws SQLException, ClassNotFoundException;

    public void SaveCustomer(String id, String name, String address) throws SQLException, ClassNotFoundException ;

    public void UpdateCustomer(String name, String address, String id) throws SQLException, ClassNotFoundException;

    public void DeleteCustomer(String id) throws SQLException, ClassNotFoundException ;

    public boolean ExistCustomer(String id) throws SQLException, ClassNotFoundException ;

    public String genarateId() throws SQLException, ClassNotFoundException;

    public CustomerDTO SearchCustomer(String newValue) throws SQLException, ClassNotFoundException ;

}
