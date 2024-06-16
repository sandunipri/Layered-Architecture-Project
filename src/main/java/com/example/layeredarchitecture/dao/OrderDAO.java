package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDAO {
    String genarateID() throws SQLException, ClassNotFoundException ;
    boolean ExistOrderId(String orderId) throws SQLException, ClassNotFoundException ;
    boolean SaveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException ;
    void commit() throws SQLException, ClassNotFoundException;
}
