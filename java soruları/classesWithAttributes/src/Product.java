public class Product {
    public Product(){
        System.out.println("yapıcı blok calıstı");
    }
    //attribute or field
    private String _name;
    private int _id;
    private String _description;
    private double _price;
    private int _stockAmount;
//getter
    public int getId(){

    return get_id();

}
//setter
public void setId(int id){
    set_id(id);

}

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }
}
