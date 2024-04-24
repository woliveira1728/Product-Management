package product;

import java.util.UUID;

public class ProductModel {

    private String barCode;
    private String name;
    private int priceInCents;
    private int stock;

    public String getBarCode() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.barCode = this.generateUniqueBarCode();
        this.name = name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    private String generateUniqueBarCode() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-", "").substring(0, 13);
    }

    @Override
    public String toString() {
        return "Código: " + this.barCode + " | Produto: " + this.name + " | Preço: " + this.priceInCents + " centavos | Estoque: " + this.stock + " unidades";
    }

}
