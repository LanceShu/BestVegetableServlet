package Dao;

import Idao.IPrice;
import Model.Price;
import Utils.SQLConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PriceDao implements IPrice {

    @Override
    public List<Price> getPriceByUser(String userId) {
        List<Price> prices = new ArrayList<>();

        Connection connection = SQLConnectionManager.getInstance().getConnection();
        PreparedStatement statement = null;
        ResultSet rs = null;

        try{
            statement = connection.prepareStatement("SELECT * FROM pricelist WHERE guest_id='"+userId+"'");
            rs = statement.executeQuery();
            while(rs.next()){
                Price price = new Price();
                price.setPdate(rs.getString("pdate"));
                price.setGuest_id(rs.getString("guest_id"));
                price.setProduct_id(rs.getString("product_id"));
                price.setPrice(rs.getDouble("price"));
                price.setNote(rs.getString("note"));
                price.setPrice_id(rs.getString("price_id"));
                prices.add(price);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            SQLConnectionManager.close(rs,statement,connection);
        }
        return prices;
    }
}
