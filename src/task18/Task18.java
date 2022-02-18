package task18;

import store.Store;
import task18.filter.Filter;


public class Task18  {
    public static void main(String[] args) {

        Store store = new Store("Магазин спортивной одежды", "Москва", "8-800-100-10-10", "Ежежневно с 9.00 - 23.00");

        // Поиск товаров по коллекции ArrayList

        store.searchByVendorCode(store.getFootwearArrayList(), "0008");
        store.searchBySize(store.getFootwearArrayList(),38);
        store.searchByBrand(store.getFootwearArrayList(),"Nike");
        store.searchByPrice(store.getFootwearArrayList(), 4500);
        store.searchByGender(store.getFootwearArrayList(), "Жен");
        store.searchByColor(store.getFootwearArrayList(), "Синий");
        store.searchByModel(store.getFootwearArrayList(), "323");

        // Поиск товаров по коллекции Set

        store.searchByVendorCode(store.getFootwearSet(), "0001");
        store.searchBySize(store.getFootwearSet(),38);
        store.searchByBrand(store.getFootwearSet(),"Nike");
        store.searchByPrice(store.getFootwearSet(), 4500);
        store.searchByGender(store.getFootwearSet(), "Жен");
        store.searchByColor(store.getFootwearSet(), "Синий");
        store.searchByModel(store.getFootwearSet(), "323");

        // Поиск товаров в Map (ключ = артикул)

        System.out.println(store.getFootwearMap().get("0001"));

    }
}


