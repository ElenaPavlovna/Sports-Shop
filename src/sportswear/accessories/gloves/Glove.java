package sportswear.accessories.gloves;
import sportswear.accessories.Accessory;

public class Glove extends Accessory {

    private String size;
    private String season;

    public Glove(String name, String brand, int price, String color, String type, String gender, String material, String size, String season) {
        super(name, brand, price, color, type, gender, material);
        this.size = size;
        this.season = season;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
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



