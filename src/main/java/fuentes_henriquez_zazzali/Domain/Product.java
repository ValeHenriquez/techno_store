package fuentes_henriquez_zazzali.Domain;

public abstract class Product {
    private String id;
    private String brand;
    private String type;
    private String model;
    private int price;

    public Product(String id, String brand, String type, String model, int price) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "ID: " + id + "\nMarca: " + brand + "\nTipo: " + type + "\nModelo: " + model + "\nPrecio: " + price;
    }
}