package task15;
import sportswear.footwear.Footwear;
import sportswear.footwear.Men;
import sportswear.footwear.Women;
import java.util.*;

public class Task15 {

    public static void main(String[] args) {

        // в магазин поступила новая коллекция Женских кроссовок New Balance модель 327
        // (5 пар разных размеров, цена 5000 рублей)

        Women womenTrainers1 = new Women ("0001","Женские кроссовки", "New Balance", "327", 5000, "Белый", "Спортивная обувь", "Жен", "Натуральная кожа", 36, "Весна-лето");
        Women womenTrainers2 = new Women("0002","Женские кроссовки", "New Balance", "327", 5000, "Белый", "Спортивная обувь", "Жен", "Натуральная кожа", 37, "Весна-лето");
        Women womenTrainers3 = new Women("0003","Женские кроссовки", "New Balance", "327", 5000, "Белый", "Спортивная обувь", "Жен", "Натуральная кожа", 38, "Весна-лето");
        Women womenTrainers4 = new Women("0004","Женские кроссовки", "New Balance", "327", 5000, "Белый", "Спортивная обувь", "Жен", "Натуральная кожа", 39, "Весна-лето");
        Women womenTrainers5 = new Women("0005","Женские кроссовки", "New Balance", "327", 5000, "Белый", "Спортивная обувь", "Жен", "Натуральная кожа", 40, "Весна-лето");

        // создаем коллекцию этих товаров

        List<Women> newBalanceWomen = new ArrayList<Women>();

        newBalanceWomen.add(womenTrainers1);
        newBalanceWomen.add(womenTrainers2);
        newBalanceWomen.add(womenTrainers3);
        newBalanceWomen.add(womenTrainers4);
        newBalanceWomen.add(womenTrainers5);

        // проверим размер данной коллекции и ее содержимое
        // сначала при помощи итерратора

        Iterator<Women> iterator = newBalanceWomen.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------------------------------------------------------");

        // затем при помощи метода for each

        for (Women womenTrainer : newBalanceWomen) {
            System.out.println(womenTrainer);
        }
        System.out.println("----------------------------------------------------------------");

        // Из данной коллекции нам надо выбрать только кроссовки 37 размера

        for (Women womenTrainer : newBalanceWomen) {
            if (37 == womenTrainer.getSize())
                System.out.println("Вам подходит товар: " + womenTrainer);
        }
        System.out.println("----------------------------------------------------------------");

        // На все товары данной коллекции сделаем скидку 1000 руб

        int discount = 1000;
        for (Women womenTrainer : newBalanceWomen) {
            womenTrainer.setPrice(womenTrainer.getPrice() - discount);
            System.out.println("Скидка: " + discount + "; Цена товаров данной коллекции " + womenTrainer.getPrice());
        }
        System.out.println("----------------------------------------------------------------");

        // в магазин поступила новая коллекция мужских кроссовок New Balance разных моделей и размеров

        Men menTrainers1 = new Men("0006","Мужские кроссовки", "New Balance", "323", 4500, "Белый", "Спортивная обувь", "Муж", "Натуральная кожа", 39, "Весна-лето");
        Men menTrainers2 = new Men("0007","Мужские кроссовки", "New Balance", "324", 5000, "Белый", "Спортивная обувь", "Муж", "Натуральная кожа", 40, "Весна-лето");
        Men menTrainers3 = new Men("0008","Мужские кроссовки", "New Balance", "325", 5500, "Белый", "Спортивная обувь", "Муж", "Натуральная кожа", 41, "Весна-лето");
        Men menTrainers4 = new Men("0009","Мужские кроссовки", "New Balance", "326", 6500, "Белый", "Спортивная обувь", "Муж", "Натуральная кожа", 42, "Весна-лето");
        Men menTrainers5 = new Men("0010","Мужские кроссовки", "New Balance", "327", 7000, "Белый", "Спортивная обувь", "Муж", "Натуральная кожа", 43, "Весна-лето");

        // создадим коллекию мужских кроссовок

        List<Men> newBalanceMen = new ArrayList<Men>();

        newBalanceMen.add(menTrainers1);
        newBalanceMen.add(menTrainers2);
        newBalanceMen.add(menTrainers3);
        newBalanceMen.add(menTrainers4);
        newBalanceMen.add(menTrainers5);

        // из данной коллекции нам надо выбрать кроссовки модели 325, размер 41

        for (Men menTrainer : newBalanceMen) {
            if (41 == menTrainer.getSize() && "325".equals(menTrainer.getModel()))
                System.out.println("Вам подходит товар: " + menTrainer);
        }
        System.out.println("----------------------------------------------------------------");

        // объединим эти коллекции (мужская + женская)
        // создадим новую коллекцию и добавим в нее две уже существующие коллекции

        List<Footwear> newBalance = new ArrayList<Footwear>();
        newBalance.addAll(newBalanceWomen);
        newBalance.addAll(newBalanceMen);

        // проверим, имеет ли данная коллекция в себе эти две коллекции

        System.out.println(newBalance.containsAll(newBalanceWomen));
        System.out.println(newBalance.containsAll(newBalanceMen));
        System.out.println("----------------------------------------------------------------");

        // проверим размер данной коллекции

        System.out.println(newBalance.size());
        System.out.println("----------------------------------------------------------------");

        // и ее содержимое

        for (Footwear footwear0 : newBalance) {
            System.out.println(footwear0);
        }
        System.out.println("----------------------------------------------------------------");

        // допустим покупатель спрашивает кроссовки New Balance 41 размера я могу купить

        for (Footwear footwear : newBalance) {
            if (footwear.getSize() == 41  && "New Balance".equals(footwear.getBrand())) {
                System.out.println("Вам подойдет обувь: " + footwear);
            }
        }
        System.out.println("----------------------------------------------------------------");

        // разделим общую коллекию на две (мужская и женская обувь)
        // сначала очистим имеющееся коллекции мужской и женской обуви, чтобы не было дубликатов

        newBalanceWomen.clear();
        newBalanceMen.clear();

        for (Footwear footwear: newBalance)
            if ("Муж".equals(footwear.getGender())) {
                newBalanceMen.add((Men) footwear);
            }
        else newBalanceWomen.add((Women) footwear);

        // проверим размер данных коллекций

        System.out.println(newBalanceWomen.size());
        System.out.println(newBalanceMen.size());

        System.out.println("----------------------------------------------------------------");

        // и их содержимое

        for (Women womenTrainer : newBalanceWomen) {
            System.out.println(womenTrainer);
        }
        System.out.println("----------------------------------------------------------------");
        
        for (Men menTrainer : newBalanceMen) {
            System.out.println(menTrainer);
        }
    }
}