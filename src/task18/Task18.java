package task18;

import store.Store;
import task18.Filter.Filter;


public class Task18  {
    public static void main(String[] args) {

        Store store = new Store("Магазин спортивной одежды", "Москва", "8-800-100-10-10", "Ежежневно с 9.00 - 23.00");;

        // Поиск товаров по коллекции ArrayList

        Filter.searchByVendorCode(store.getFootwearArrayList(), "0008");
        System.out.println("---------------------------------------------------");

        Filter.searchBySize(store.getFootwearArrayList(),38);
        System.out.println("---------------------------------------------------");

        Filter.searchByBrand(store.getFootwearArrayList(),"Nike");
        System.out.println("---------------------------------------------------");

        Filter.searchByPrice(store.getFootwearArrayList(), 4500);
        System.out.println("---------------------------------------------------");

        Filter.searchByGender(store.getFootwearArrayList(), "Жен");
        System.out.println("---------------------------------------------------");

        Filter.searchByColor(store.getFootwearArrayList(), "Синий");
        System.out.println("---------------------------------------------------");

        Filter.searchByModel(store.getFootwearArrayList(), "323");
        System.out.println("---------------------------------------------------");

        // Поиск товаров по коллекции Set

        Filter.searchByVendorCode(store.getFootwearSet(), "0001");
        System.out.println("---------------------------------------------------");

        Filter.searchBySize(store.getFootwearSet(),38);
        System.out.println("---------------------------------------------------");

        Filter.searchByBrand(store.getFootwearSet(),"Nike");
        System.out.println("---------------------------------------------------");

        Filter.searchByPrice(store.getFootwearSet(), 4500);
        System.out.println("---------------------------------------------------");

        Filter.searchByGender(store.getFootwearSet(), "Жен");
        System.out.println("---------------------------------------------------");

        Filter.searchByColor(store.getFootwearSet(), "Синий");
        System.out.println("---------------------------------------------------");

        Filter.searchByModel(store.getFootwearSet(), "323");
        System.out.println("---------------------------------------------------");

        // Поиск товаров в Map
        // поиск товара по ключу (ключ = артикул)

        System.out.println(store.getFootwearMap().get("0001"));

    }
}


