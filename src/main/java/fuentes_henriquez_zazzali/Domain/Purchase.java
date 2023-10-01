package fuentes_henriquez_zazzali.Domain;

import java.util.ArrayList;
import java.util.UUID;

public class Purchase {
    private String id;
    private Cliente cliente;
    private ArrayList<UniqueProduct> products;
    private double total;

    public Purchase(Cliente cliente, ArrayList<UniqueProduct> products) {
        this.id = UUID.randomUUID().toString();
        this.cliente = cliente;
        this.products = products;
        this.total = 0;
        for (UniqueProduct product : products) {
            this.total += product.getProduct().getPrice();
        }
        cliente.setCantPurchases(cliente.getCantPurchases() + 1);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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