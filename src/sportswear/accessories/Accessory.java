package sportswear.accessories;

import sportswear.SportsWear;

public abstract class Accessory extends SportsWear {
    public Accessory(String vendorCode,String name, String brand, int price, String color, String type, String gender, String material) {
        super(vendorCode, name, brand, price, color, type, gender, material);
    }
}
