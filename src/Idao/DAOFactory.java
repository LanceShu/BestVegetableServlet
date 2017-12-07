package Idao;

import Dao.ProductDAO;

public class DAOFactory {

    public static IProduct createProductDAO(){
        return new ProductDAO();
    }
}
