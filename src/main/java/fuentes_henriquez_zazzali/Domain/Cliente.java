package fuentes_henriquez_zazzali.Domain;

public class Cliente {
    private String rut;
    private String name;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private int cantPurchases;

    public Cliente(String rut, String name, String lastName, String address, String phone, String email) {
        this.rut = rut;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.cantPurchases = 0;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCantPurchases() {
        return cantPurchases;
    }

    public void setCantPurchases(int cantPurchases) {
        this.cantPurchases = cantPurchases;
    }

    

}
