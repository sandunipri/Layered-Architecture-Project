package com.example.layeredarchitecture.BO;

import com.example.layeredarchitecture.dao.Custom.Impl.ItemDAOImpl;
import com.example.layeredarchitecture.dao.Custom.ItemDAO;
import com.example.layeredarchitecture.dao.SqlUtill;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO{
    ItemDAO itemDAO= new ItemDAOImpl();
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        /*ItemDAO itemDAO= new ItemDAOImpl();*/
        return itemDAO.getAll();
    }

    public boolean delete(String code) throws SQLException, ClassNotFoundException {
       /* ItemDAO itemDAO= new ItemDAOImpl();*/
        return itemDAO.delete(code);
    }

    public boolean add(ItemDTO dto) throws SQLException, ClassNotFoundException {
        /*ItemDAO itemDAO= new ItemDAOImpl();*/
        return itemDAO.add(dto);
         }

    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {
        /*ItemDAO itemDAO= new ItemDAOImpl();*/
        return itemDAO.update(dto);
        }

    public boolean exist(String code) throws SQLException, ClassNotFoundException {
       /* ItemDAO itemDAO= new ItemDAOImpl();*/
        return itemDAO.exist(code);
      }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        /*ItemDAO itemDAO= new ItemDAOImpl();*/
        return itemDAO.generateNewID();
    }

    public ItemDTO search(String code) throws SQLException, ClassNotFoundException {
        /*ItemDAO itemDAO= new ItemDAOImpl();*/
        return itemDAO.search(code);
        }


}
