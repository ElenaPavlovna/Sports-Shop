package service.delivery;

public class AddressOfDelivery {
    private String address;

    public AddressOfDelivery(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "AddressOfDelivery{" +
                "address='" + address + '\'' +
                '}';
    }
}