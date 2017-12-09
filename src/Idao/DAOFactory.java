package Idao;

import Dao.GuestDao;
import Dao.ProductDAO;

public class DAOFactory {

    public static IProduct createProductDAO(){
        return new ProductDAO();
    }

    public static IGuest createGuestDAO(){
        return new GuestDao();
    }
}
