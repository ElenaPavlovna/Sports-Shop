package sportswear;

import service.booking.Booking;
import service.delivery.AddressOfDelivery;
import service.delivery.Delivery;
import service.feedback.Feedback;


public abstract class SportsWear implements Feedback, Purchase, Booking, Delivery {
    private String vendorCode;
    private String name;
    private String brand;
    private int price;
    private String color;
    private String type;
    private String gender;
    private String material;
    AddressOfDelivery address;

    public SportsWear(String vendorCode, String name, String brand, int price, String color, String type, String gender, String material) {
        this.vendorCode = vendorCode;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.type = type;
        this.gender = gender;
        this.material = material;
    }

    public AddressOfDelivery getAddress() { return address; }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return " Артикул - " + vendorCode +
                " ,Название - " + name +
                ", Брэнд - " + brand +
                ", Цена - " + price +
                ", Цвет - " + color +
                ", Тип - " + type +
                ", Пол - " + gender +
                ", Метериал - " + material;
    }

}
