package Dao;

import Idao.IGuest;
import Model.Guest;
import Utils.SQLConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GuestDao implements IGuest{

    @Override
    public boolean findUserByName(String name, String pwd) {

        Connection manager = SQLConnectionManager.getInstance().getConnection();
        PreparedStatement statement = null;
        ResultSet rs = null;

        try{
            statement = manager.prepareStatement("select * from guest where name='" + name + "'");
            rs = statement.executeQuery();
            if(rs.first()){
                if(rs.getString("pwd").equals(pwd)){
                    Guest.getInstance().setName(name);
                    Guest.getInstance().setPwd(pwd);
                    Guest.getInstance().setAddr(rs.getString("addr"));
                    Guest.getInstance().setId(rs.getString("id"));
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            SQLConnectionManager.close(rs,statement,manager);
        }
        return false;
    }
}
