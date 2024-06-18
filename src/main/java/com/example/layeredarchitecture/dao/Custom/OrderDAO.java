package com.example.layeredarchitecture.dao.Custom;


import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public interface OrderDAO extends CrudDAO<OrderDTO> {
  /*  public String generateOID() throws SQLException, ClassNotFoundException;
    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException;
    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException;*/
}
