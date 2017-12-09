package Model;

public class Guest {

    private static Guest instance;
    public static Guest getInstance(){
        if(instance == null){
            instance = new Guest();
        }
        return instance;
    }

    public static void freeInstance(){
        if(instance != null){
            instance = null;
        }
    }

    /*用户编码*/
    private String id;

    /*用户密码*/
    private String pwd;

    /*用户账号*/
    private String name;

    /*用户地址*/
    private String addr;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public String getPwd() {
        return pwd;
    }
}
