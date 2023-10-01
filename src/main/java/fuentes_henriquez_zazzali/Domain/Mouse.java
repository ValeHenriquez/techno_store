package fuentes_henriquez_zazzali.Domain;

public class Mouse extends Product {
    private boolean wireless;

    public Mouse(String id, String brand, String type, String model, int price, boolean wireless) {
        super(id, brand, type, model, price);
        this.wireless = wireless;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

}
