package sportswear.footwear;

import sportswear.SportsWear;

public class Footwear extends SportsWear {
    private final String model;
    private final int size;
    private final String season;

    public Footwear(String name, String brand, String model, int price, String color, String type, String gender, String material, int size, String season) {
        super(name, brand, price, color, type, gender, material);
        this.model = model;
        this.size = size;
        this.season = season;
    }

    public int getSize() {
        return size;
    }

    public String getSeason() {
        return season;
    }

    public String getModel() {
        return model;
    }

    public void readDescription() {
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
                ", model= " + model +
                ", size= " + size +
                ", season= " + season);
    }
}



