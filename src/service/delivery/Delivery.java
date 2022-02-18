package service.delivery;
import java.io.*;
import java.util.Scanner;

public interface Delivery {

    String FILE_NAME = "delivery/delivery.txt";

    default void orderDelivery() {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите адрес");
            fw.write (scanner.nextLine() + "\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    default void deliveryInfo() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME))) {
            AddressOfDelivery addressOfDelivery = new AddressOfDelivery(bufferedReader.readLine());
            System.out.println(addressOfDelivery);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Введите адрес доставки еще раз");
            orderDelivery();
        }
    }
}
