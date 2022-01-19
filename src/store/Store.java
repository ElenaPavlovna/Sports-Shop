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

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void getInformationAboutTheStore() {
        System.out.println("Название магазина - " + name);
        System.out.println("Адрес магазина - " + address);
        System.out.println("Номер телефона - " + phoneNumber);
        System.out.println("Время работы магазина: " + workingHours);
    }
    public void storeOpen() {
        System.out.println("Мазазин работает ежедневно с 9.00 - 23.00");
    }
    public void storeClose() {
        System.out.println("Магазин не работет с 23.00 - 9.00");
    }

}
