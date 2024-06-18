package com.example.layeredarchitecture.dao.Custom;


import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderDetailsDAO extends CrudDAO<OrderDetailDTO> {
    /*public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;*/
}
