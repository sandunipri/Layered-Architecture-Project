package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> LoadAllItem() throws SQLException, ClassNotFoundException ;
    public void deleteItem(String code) throws SQLException, ClassNotFoundException ;
    public void SaveItem(String code, String description, BigDecimal unitPrice, Integer qtyOnHand) throws SQLException, ClassNotFoundException ;
    public boolean  UpdateItem(String description,BigDecimal unitPrice,Integer qtyOnHand,String code) throws SQLException, ClassNotFoundException ;
    public boolean ExistItem (String code) throws SQLException, ClassNotFoundException ;
    public String genarateId() throws SQLException, ClassNotFoundException ;
    public ItemDTO FindItem(String code) throws SQLException, ClassNotFoundException ;
}
