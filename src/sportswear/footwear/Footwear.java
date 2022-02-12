package sportswear.footwear;

import sportswear.SportsWear;

import java.util.ArrayList;
import java.util.List;

public abstract class Footwear extends SportsWear {
    private String model;
    private int size;
    private String season;

    public Footwear(String vendorCode, String name, String brand, String model, int price, String color, String type, String gender, String material, int size, String season) {
        super(vendorCode, name, brand, price, color, type, gender, material);
        this.model = model;
        this.size = size;
        this.season = season;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void readDescription() {
        System.out.println("Aртикул - " + getVendorCode());
        System.out.println("Название - " + getName());
        System.out.println("Брэнд - " + getBrand());
        System.out.println("Модель - " + getModel());
        System.out.println("Цена - " + getPrice());
        System.out.println("Размер - " + getSize());
        System.out.println("Цвет - " + getColor());
        System.out.println("Тип - " + getType());
        System.out.println("Сезон - " + getSeason());
        System.out.println("Пол - " + getGender());
        System.out.println("Материал - " + getMaterial());
    }

    @Override
    public String toString() {
        return (super.toString() +
                ", Модель - " + model +
                ", Размер - " + size +
                ", Сезон - " + season);

    }
}



