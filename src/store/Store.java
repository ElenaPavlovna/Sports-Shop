package store;

import service.delivery.AddressOfDelivery;
import sportswear.footwear.Footwear;
import sportswear.footwear.Men;
import sportswear.footwear.Women;
import task18.filter.Filter;

import java.util.*;

public class Store implements Filter {
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

    Women womenTrainers1 = new Women("0001", "Женские кроссовки", "Adidas", "327", 5000, "Черный", "Спортивная обувь", "Жен", "Натуральная кожа", 36, "Весна-лето");
    Women womenTrainers2 = new Women("0002", "Женские кроссовки", "New Balance", "327", 5000, "Белый", "Спортивная обувь", "Жен", "Натуральная кожа", 37, "Весна-лето");
    Women womenTrainers3 = new Women("0003", "Женские кроссовки", "Reebok", "327", 5000, "Синий", "Спортивная обувь", "Жен", "Натуральная кожа", 38, "Весна-лето");
    Women womenTrainers4 = new Women("0004", "Женские кроссовки", "Nike", "327", 5000, "Зеленый", "Спортивная обувь", "Жен", "Натуральная кожа", 39, "Весна-лето");
    Women womenTrainers5 = new Women("0005", "Женские кроссовки", "Puma", "327", 5000, "Красный", "Спортивная обувь", "Жен", "Натуральная кожа", 40, "Весна-лето");
    Men menTrainers1 = new Men("0006", "Мужские кроссовки", "Adidas", "323", 4500, "Черный", "Спортивная обувь", "Муж", "Натуральная кожа", 39, "Весна-лето");
    Men menTrainers2 = new Men("0007", "Мужские кроссовки", "Reebok", "324", 5000, "Белый", "Спортивная обувь", "Муж", "Натуральная кожа", 40, "Весна-лето");
    Men menTrainers3 = new Men("0008", "Мужские кроссовки", "Puma", "325", 5500, "Синий", "Спортивная обувь", "Муж", "Натуральная кожа", 41, "Весна-лето");
    Men menTrainers4 = new Men("0009", "Мужские кроссовки", "Nike", "326", 6500, "Зеленый", "Спортивная обувь", "Муж", "Натуральная кожа", 42, "Весна-лето");
    Men menTrainers5 = new Men("0010", "Мужские кроссовки", "New Balance", "327", 7000, "Красный", "Спортивная обувь", "Муж", "Натуральная кожа", 43, "Весна-лето");

    public Women getWomenTrainers1() {
        return womenTrainers1;
    }

    public Women getWomenTrainers2() {
        return womenTrainers2;
    }

    public Women getWomenTrainers3() {
        return womenTrainers3;
    }

    public Women getWomenTrainers4() {
        return womenTrainers4;
    }

    public Women getWomenTrainers5() {
        return womenTrainers5;
    }

    public Men getMenTrainers1() {
        return menTrainers1;
    }

    public Men getMenTrainers2() {
        return menTrainers2;
    }

    public Men getMenTrainers3() {
        return menTrainers3;
    }

    public Men getMenTrainers4() {
        return menTrainers4;
    }

    public Men getMenTrainers5() {
        return menTrainers5;
    }


    public Collection<Footwear> getFootwearArrayList() {
        Collection<Footwear> footwearArrayList = new ArrayList<Footwear>();
        footwearArrayList.add(womenTrainers2);
        footwearArrayList.add(womenTrainers3);
        footwearArrayList.add(womenTrainers4);
        footwearArrayList.add(womenTrainers5);
        footwearArrayList.add(menTrainers1);
        footwearArrayList.add(menTrainers2);
        footwearArrayList.add(menTrainers3);
        footwearArrayList.add(menTrainers4);
        footwearArrayList.add(menTrainers5);
        return footwearArrayList;
    }

    public Collection<Footwear> getFootwearSet() {
        Collection<Footwear> footwearHashSet = new HashSet<Footwear>();
        footwearHashSet.add(womenTrainers2);
        footwearHashSet.add(womenTrainers3);
        footwearHashSet.add(womenTrainers4);
        footwearHashSet.add(womenTrainers5);
        footwearHashSet.add(menTrainers1);
        footwearHashSet.add(menTrainers2);
        footwearHashSet.add(menTrainers3);
        footwearHashSet.add(menTrainers4);
        footwearHashSet.add(menTrainers5);
        return footwearHashSet;
    }

    public Map<String, Footwear> getFootwearMap() {
        Map<String, Footwear> footwearHashMap = new HashMap<String, Footwear>();
        footwearHashMap.put("0001", womenTrainers1);
        footwearHashMap.put("0002", womenTrainers2);
        footwearHashMap.put("0003", womenTrainers3);
        footwearHashMap.put("0004", womenTrainers4);
        footwearHashMap.put("0005", womenTrainers5);
        footwearHashMap.put("0006", menTrainers1);
        footwearHashMap.put("0007", menTrainers2);
        footwearHashMap.put("0008", menTrainers3);
        footwearHashMap.put("0009", menTrainers4);
        footwearHashMap.put("0010", menTrainers5);
        return footwearHashMap;
    }

}

