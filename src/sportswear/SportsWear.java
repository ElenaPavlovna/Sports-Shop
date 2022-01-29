package sportswear;

import service.booking.Booking;
import service.delivery.Delivery;

public abstract class SportsWear implements Purchase, Delivery, Booking {
    private final String name;
    private final String brand;
    private int price;
    private final String color;
    private final String type;
    private final String gender;
    private final String material;

    public SportsWear(String name, String brand, int price, String color, String type, String gender, String material) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.type = type;
        this.gender = gender;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return " name= " + name +
                ", brand= " + brand +
                ", price= " + price +
                ", color= " + color +
                ", type= " + type +
                ", gender= " + gender +
                ", material= " + material;
    }
}
