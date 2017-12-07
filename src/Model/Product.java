package Model;

public class Product {

    /*产品编码*/
    private String id;

    /*产品单位*/
    private String unit;

    /*产品大类编码*/
    private String p_code;

    /*产品名称*/
    private String name;

    /*单价*/
    private Double price;

    /*产品图片*/
    private String imagfile;

    /*产品备注*/
    private String note;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImagfile(String imagfile) {
        this.imagfile = imagfile;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setP_code(String p_code) {
        this.p_code = p_code;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public String getImagfile() {
        return imagfile;
    }

    public String getNote() {
        return note;
    }

    public String getP_code() {
        return p_code;
    }

    public String getUnit() {
        return unit;
    }
}
