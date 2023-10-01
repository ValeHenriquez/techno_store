package fuentes_henriquez_zazzali.Domain;

public class Monitor extends Product {
    private String resolution;

    public Monitor(String id, String brand, String type, String model, int price, String resolution) {
        super(id, brand, type, model, price);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

}
