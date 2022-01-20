package sportswear.sale;

import sportswear.SportsWear;

public abstract class Sale extends SportsWear {
    int discount;
    int finalPrice;

    public Sale(String name, String brand, String color, String type, String gender, String material, int price, int discount, int finalPrice) {
        super(name, brand, price, color, type, gender, material);
        this.discount = discount;
        this.finalPrice = finalPrice;
    }

    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public int getFinalPrice() {
        return finalPrice;
    }
    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }
}
