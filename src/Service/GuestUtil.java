package Service;

import Idao.DAOFactory;
import Idao.IGuest;
import Model.Guest;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.PrintWriter;

public class GuestUtil {

    static class GuestStatus{

        private String status;
        private Guest guest;

        public void setGuest(Guest guest) {
            this.guest = guest;
        }

        public Guest getGuest() {
            return guest;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }
    }

    public static void main(String[] args) {
        IGuest guest = DAOFactory.createGuestDAO();
        boolean isUser = guest.findUserByName("root","123456");

        String json = "";
        ObjectMapper mapper = new ObjectMapper();
        GuestStatus guestJson = new GuestStatus();

        try{
            if(isUser){
                guestJson.setStatus("success");
                guestJson.setGuest(Guest.getInstance());
                json = mapper.writeValueAsString(guestJson);
                System.out.println(json);
            }else{
                guestJson.setStatus("success");
                json = mapper.writeValueAsString(guestJson);
                System.out.println(json);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Guest.freeInstance();
        }
    }

    public static void findUserByName(String name,String pwd,PrintWriter pw){
        boolean isUser = false;
        IGuest guest = DAOFactory.createGuestDAO();
        isUser = guest.findUserByName(name,pwd);

        String json = "";
        ObjectMapper mapper = new ObjectMapper();
        GuestStatus guestJson = new GuestStatus();

        try{
            if(isUser){
                guestJson.setStatus("success");
                guestJson.setGuest(Guest.getInstance());
                json = mapper.writeValueAsString(guestJson);
            }else{
                guestJson.setStatus("failure");
                json = mapper.writeValueAsString(guestJson);
            }
            pw.println(json);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Guest.freeInstance();
        }
    }
}
