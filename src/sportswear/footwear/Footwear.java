package sportswear.footwear;

import sportswear.SportsWear;

public class Footwear extends SportsWear {
    private int size;
    private String season;

    public Footwear(String name, String brand, int price, String color, String type, String gender, String material, int size, String season) {
        super(name, brand, price, color, type, gender, material);
        this.size = size;
        this.season = season;
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
        System.out.println("Название - " + getName());
        System.out.println("Брэнд - " + getBrand());
        System.out.println("Цена - " + getPrice());
        System.out.println("Размер - " + getSize());
        System.out.println("Цвет - " + getColor());
        System.out.println("Тип - " + getType());
        System.out.println("Сезон - " + getSeason());
        System.out.println("Пол - " + getGender());
        System.out.println("Материал - " + getMaterial());

    }

}



