package task10;
import sportswear.footwear.Footwear;
import sportswear.footwear.Men;
import sportswear.footwear.Women;
import java.util.Objects;

public class Task10 {
    public static void main(String[] args) {
        Footwear wt1 = new Women("Женские кроссовки", "Nike", 5000, "Белый", "Спортивная обувь", "Жен", "Натуральная кожа", 37, "Весна-лето");
        Footwear mt1 = new Men("Мужские кроссовки", "Adidas", 7000, "Черный", "Спортивная обувь", "Муж", "Натуральная кожа", 42, "Весна-осень");

        // Задание №10 - МАССИВЫ

        // 10.1 Создаем массив обьектов (Обувь: кроссовки женские и кроссовки мужские)

        Footwear[] listOfFootwear = {wt1, mt1};

        // 1. Допустим, покупателю нужно показать всю обувь, которая есть в наличии 37 размера
        // метод foreach и if

        for (Footwear footwear : listOfFootwear) {
            if (footwear.getSize() == 37) {
                System.out.println("Вам подходит этот товар: ");
                footwear.readDescription();
            }
        }
        // 2. или покупатель спрашивает: "Какую обувь я могу купить не дороже 5000 рублей?"
        // метод foreach и if

        for (Footwear footwear : listOfFootwear) {
            if (footwear.getPrice() <= 5000) {
                System.out.println("Вам подходит этот товар: ");
                footwear.readDescription();
            }
        }
        // 3. или покупатель спрашивает: "Какая обувь есть бренда "Adidas"?
        // метод foreach и if

        for (Footwear footwear : listOfFootwear) {
            if (Objects.equals(footwear.getBrand(), "Adidas")) {
                System.out.println("Вам подходит этот товар: ");
                footwear.readDescription();
            }
        }
        // 10.2 Создаем массив примитивов (размерный ряд обуви, который есть в наличии)

        // В магазине осталось 2 пары обуви 37 и 42 размера

        int[] sizes = {wt1.getSize(), mt1.getSize()};

        // Проверяем, какие размеры с 36 по 43 есть в наличии, а каких нет
        // выполнено сначала при помощи метода for

        for (int i = 36; i < 44; i++) {
            if (i != sizes[0] && i != sizes[1])
                System.out.println(i + " - размера нет в наличии");
            else System.out.println((i + " - размер есть в наличии"));
        }
        System.out.println("-----------------------------------------");

        // затем при помощи метода while

        int j = 36;
        while (j <= 42) {
            if (j != sizes[0] && j != sizes[1])
                System.out.println(j + " - размера нет в наличии");
            else System.out.println((j + " - размер есть в наличии"));
            j++;
        }

        // допустим,у покупателя размер 42
        // он ищет обувь своего размера
        // и смотрит всю обувь начиная с 36 размера.
        // выполнено при помощи метода do while и if

        int k = 36;
        do {
            System.out.println(k + " - Вам нужен размер больше");
            k++;
        } while (k < 42 || k != sizes[1]);
        if (k == sizes[1]) {
            System.out.println(k + " - Вы нашли нужный Вам размер");
        }

        // 10.3 Создаем массив стрингов и инициацизирум их разными способами

        // способ №1

        String[] footwearBrands = new String[2];
        footwearBrands[0] = "Nike";
        footwearBrands[1] = "Adidas";
        System.out.println(footwearBrands[0]);
        System.out.println(footwearBrands[1]);

        // способ №2

        String[] shirtsForSaleBrands = {"Nike", "Adidas", "New Balance", "Reebok"};
        System.out.println(shirtsForSaleBrands[0] + " " + shirtsForSaleBrands[1] + " " + shirtsForSaleBrands[2] + " " + shirtsForSaleBrands[3]);
    }
}

