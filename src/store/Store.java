package store;

public class Store {
    private final String name;
    private final String address;
    private final String phoneNumber;
    private final String workingHours;

    public Store(String name, String address, String phoneNumber, String workingHours) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.workingHours = workingHours;
    }

    public void getInformationAboutTheStore() {
        System.out.println("Название магазина - " + this.name);
        System.out.println("Адрес магазина - " + this.address);
        System.out.println("Номер телефона - " + this.phoneNumber);
        System.out.println("Время работы магазина: " + this.workingHours);
    }

    public void storeOpen() {
        System.out.println("Мазазин работает ежедневно с 9.00 - 23.00");
    }

    public void storeClose() {
        System.out.println("Магазин не работет с 23.00 - 9.00");
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", workingHours='" + workingHours + '\'' +
                '}';
    }
}
