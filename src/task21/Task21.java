package task21;

import store.Store;
import java.io.*;

public class Task21 {
    public static void main(String[] args) throws IOException {
        Store store = new Store("Магазин спортивной одежды", "Москва", "8-800-100-10-10", "Ежежневно с 9.00 - 23.00");
        store.getMenTrainers1().leaveFeedback();
        store.getMenTrainers1().orderDelivery();
        store.getMenTrainers1().deliveryInfo();
    }
}
