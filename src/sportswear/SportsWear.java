package sportswear;

public class SportsWear {
    private String name;
    private String brand;
    private  int price;
    private String color;
    private String type;
    private String gender;
    private String material;


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



    public void chooseIt() {
        System.out.println("Товар выбран");
    }

    public String buyIt() {
        return "Товар куплен";
    }

    public String returnIt() {
        return "Возврат товара";
    }



}
