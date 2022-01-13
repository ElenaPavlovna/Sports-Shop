package sportswear.sale;

import sportswear.SportsWear;

public class ShirtsForSale extends SportsWear {

    private int discount;
    private float discount2;
    private int finalPrice;
    private String size;

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public float getDiscount2() {
        return discount2;
    }

    public void setDiscount2(float discount2) {
        this.discount2 = discount2;
    }

    public int getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void readDescription(){
        System.out.println("Название - " + getName());
        System.out.println("Брэнд - " + getBrand());
        System.out.println("Обычная цена - " + getPrice());
        System.out.println("Цена со скидкой - " + getFinalPrice());
        System.out.println("Размер - " + getSize());
        System.out.println("Цвет - " + getColor());
        System.out.println("Тип - " + getType());
        System.out.println("Пол - " + getGender());
        System.out.println("Материал - " + getMaterial());

    };


}
