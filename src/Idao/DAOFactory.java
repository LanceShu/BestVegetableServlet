package Idao;

import Dao.GuestDao;
import Dao.PriceDao;
import Dao.ProductDAO;

public class DAOFactory {

    public static IProduct createProductDAO(){
        return new ProductDAO();
    }

    public static IGuest createGuestDAO(){
        return new GuestDao();
    }

    public static IPrice createPriceDAO(){
        return new PriceDao();
    }
}
