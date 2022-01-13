package sportswear.footwear;

import sportswear.SportsWear;


public class Footwear extends SportsWear {
    private int size;
    private String season;

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

    public void tryOn() {

        System.out.println("Вы примеряете товар");
    }

}



