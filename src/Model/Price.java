package Model;

public class Price {

    /*报价的时间*/
    private String pdate;
    /*客户的id*/
    private String guest_id;
    /*产品的id*/
    private String product_id;
    /*报价的价格*/
    private Double price;
    /*报价的备注*/
    private String note;
    /*报价的id*/
    private String price_id;

    public void setNote(String note) {
        this.note = note;
    }

    public void setGuest_id(String guest_id) {
        this.guest_id = guest_id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate;
    }

    public void setPrice_id(String price_id) {
        this.price_id = price_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getNote() {
        return note;
    }

    public Double getPrice() {
        return price;
    }

    public String getGuest_id() {
        return guest_id;
    }

    public String getPdate() {
        return pdate;
    }

    public String getPrice_id() {
        return price_id;
    }

    public String getProduct_id() {
        return product_id;
    }
}
