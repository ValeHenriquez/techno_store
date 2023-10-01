package fuentes_henriquez_zazzali.Domain;

public class Computer extends Product {
    private String cpu;
    private String ram;
    private String hdd;

    public Computer(String id, String brand, String type, String model, int price, String cpu, String ram, String hdd) {
        super(id, brand, type, model, price);
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    
}
