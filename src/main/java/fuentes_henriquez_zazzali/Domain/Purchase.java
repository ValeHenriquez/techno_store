package fuentes_henriquez_zazzali.Domain;

import java.util.ArrayList;
import java.util.UUID;

public class Purchase {
    private String id;
    private Customer customer;
    private ArrayList<UniqueProduct> products;
    private double total;

    public Purchase(Customer customer, ArrayList<UniqueProduct> products) {
        this.id = UUID.randomUUID().toString();
        this.customer = customer;
        this.products = products;
        this.total = 0;
        for (UniqueProduct product : products) {
            this.total += product.getProduct().getPrice();
        }
        customer.setCantPurchases(customer.getCantPurchases() + 1);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<UniqueProduct> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<UniqueProduct> products) {
        this.products = products;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
