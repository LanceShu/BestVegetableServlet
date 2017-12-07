package Service;

import Idao.DAOFactory;
import Idao.IProduct;
import Model.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.PrintWriter;
import java.util.ArrayList;

public class ProductUtils {

    public static void getAllinfo(PrintWriter pw){

        /**
         * 寻找数据库中所有的产品的信息;
         * */
        IProduct product = DAOFactory.createProductDAO();
        ArrayList<Product> products = product.findAll();

        String json = "";
        try {
            /**
             * 将对象转为Json数据并作为字符串的形式；
             * */
            ObjectMapper mapper = new ObjectMapper();
            json = mapper.writeValueAsString(products);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        pw.println(json);

    }

}
