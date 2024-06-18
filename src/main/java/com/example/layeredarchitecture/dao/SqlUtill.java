package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlUtill {
    public static <T> T execute(String sql, Object... args) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);

        //loop
        for (int i = 0; args.length>i; i++){
            pstm.setObject(i+1,args[i]);
        }

        //executeQuary or executeUpdate
        if (sql.startsWith("SELECT")){
//            return pstm.executeQuery();
            return (T) pstm.executeQuery();
        }else {
//            return (Boolean)(pstm.executeUpdate()>0);
            return (T) (Boolean)(pstm.executeUpdate()>0);
        }

        //returnType
    }
}
