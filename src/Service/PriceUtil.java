package Service;

import Idao.DAOFactory;
import Idao.IPrice;
import Model.Price;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.PrintWriter;
import java.util.List;

public class PriceUtil {

    public static void main(String[] args) {
        IPrice price = DAOFactory.createPriceDAO();
        List<Price> prices = price.getPriceByUser("00000001");

        String json = "";
        try{
            ObjectMapper mapper = new ObjectMapper();
            json = mapper.writeValueAsString(prices);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(json);
    }

    public static void getInfoByUserId(String userID, PrintWriter pw){
        IPrice price = DAOFactory.createPriceDAO();
        List<Price> prices = price.getPriceByUser(userID);

        String json = "";
        try{
            ObjectMapper mapper = new ObjectMapper();
            json = mapper.writeValueAsString(prices);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        pw.println(json);
    }
}
