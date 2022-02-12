package sportswear.sale;

public class ShirtsForSale extends Sale {

    private String size;

    public ShirtsForSale (String vendorCode,String name, String brand, String color, String type, String gender, String material, int price, int discount, int finalPrice, String size) {
        super(vendorCode, name, brand, color, type, gender, material, price, discount, finalPrice);
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void readDescription() {
        System.out.println("Название - " + getName());
        System.out.println("Брэнд - " + getBrand());
        System.out.println("Обычная цена - " + getPrice());
        System.out.println("Скидка - " + getDiscount());
        System.out.println("Цена со скидкой - " + getFinalPrice());
        System.out.println("Размер - " + getSize());
        System.out.println("Цвет - " + getColor());
        System.out.println("Тип - " + getType());
        System.out.println("Пол - " + getGender());
        System.out.println("Материал - " + getMaterial());
    };
}
