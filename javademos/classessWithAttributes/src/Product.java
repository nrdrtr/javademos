public class Product {
    public Product(int id, String name, String description, double price, int stockAmount, String color) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.color = color;
    }


    //default constructor

    public Product() {
        System.out.println("yapıcı blok çalıştı");

    }


    //attribute  or field
    private int id;
    private String name;


    private String description;
    private double price; //default public c#da default private
    private int stockAmount;
    private String color;
    private String code;

    public int getId() {//getter
        return id;
    }

    public void setId(int id) {//setter
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCode() {
        return this.name.substring(0, 1) + getId();
    }//ornegin sadece okunmasını istediğimiz bir özellik




}
