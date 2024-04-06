package fpoly.thuyltph35992.lab8.Models;

public class Product {
    private String productId, productTypeId, productName, description;
    private double rate, price;
    private int image;

    public Product() {
    }

    public Product(String productId, String productTypeId, String productName, String description, double rate, double price, int image) {
        this.productId = productId;
        this.productTypeId = productTypeId;
        this.productName = productName;
        this.description = description;
        this.rate = rate;
        this.price = price;
        this.image = image;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
