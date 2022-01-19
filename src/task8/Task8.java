package task8;
import sportswear.SportsWear;
import sportswear.accessories.gloves.Glove;
import sportswear.footwear.Footwear;
import sportswear.footwear.Men;
import sportswear.footwear.Women;

public class Task8 {
    public static void main(String[] args) {
        Footwear wt1 = new Women("Женские кроссовки", "Nike",5000,"Белый", "Спортивная обувь", "Жен", "Натуральная кожа", 37, "Весна-лето" );
        Footwear mt1 = new Men("Мужские кроссовки", "Adidas", 7000,"Черный", "Спортивная обувь", "Муж", "Натуральная кожа", 42, "Весна-осень");
        Glove gl1 = new Glove("Перчатки", "Reebok",3500,"Синий", "Спортивная одежда", "Унисекс", "Текстиль", "М", "Зима");

        // Задание №8 (ОПЕРАТОРЫ тернарный оператор, if, if else, while, do while, for)

        // 8.1 Тернарный оператор

        // wt1 и mt1 - ранее созданные товары:
        // wt1 - женская обувь размер 37, цена 5000 ;
        // mt1 - мужская обувь размер 42, цена 7000
        // условие: мой размер - 37, пол - жен, мои деньги - 5000
        // вопрос: какая обувь мне подойдет?

        int mySize = 37;
        String myGender = "Жен";
        int myMoney = 5000;
        SportsWear FootwearForBuying = mySize == wt1.getSize() && myGender.equals(wt1.getGender()) && myMoney >= wt1.getPrice() ? wt1 : mt1;
        System.out.println("Вам подходит этот товар: " + FootwearForBuying + " Детали товара:");
        wt1.readDescription();

        // 8.2 Оператор if
        // условие: если мои деньги больше или равны стоимости кроссовок, то могу их купить

        int myMoney1 = 5000;
        if (myMoney1 >= wt1.getPrice()) {
            System.out.println("Ваши Деньги: " + myMoney1 + " Вы можете купить женские кроссовки: ");
            wt1.readDescription();
        }

        // 8.3 Оператор if else
        // условие: если мои деньги больше или равны стоимости кроссовок - могу их купить,
        // иначе - не могу купить

        if (myMoney1 >= mt1.getPrice()) {
            System.out.println("Вы можете купить мужские кроссовки: ");
        } else {
            System.out.println("Ваши Деньги: " + myMoney1 + " Вы не можете купить мужские кроссовки: ");
        }
        mt1.readDescription();

        // 8.4 Оператор while
        // пока мои деньги меньше чем стоимость кроссовок, я не могу их купить
        // отрабатывая цикл количество моих денег увеличивается на 1,
        // и когда достигает 5000 я могу купить женские кроссовки

        int myMoney2 = 4998;
        while (myMoney2 < wt1.getPrice()) {
            System.out.println("Ваши Деньги: " + myMoney2 + " Вы не можете купить женские кроссовки");
            myMoney2++;
        }
        System.out.println("Ваши Деньги: " + myMoney2 + " Теперь Вы можете купить женские кроссовки: ");
        wt1.readDescription();

        // 8.5 Оператор do while

        // gl1 - ранее созданные товары:
        // gl1 - перчатки цена 3500
        // пока мои деньги меньше чем стоимость перчаток, я не могу их купить
        // отрабатавая цикл количество моих денег увеличивается на 1,
        // и когда достигает 3500 - я могу купить перчатки

        int myMoney3 = 3498;
        do {
            myMoney3++;
            System.out.println("Ваши Деньги: " + myMoney3);

        } while (myMoney3 < gl1.getPrice());

        System.out.println("Ваши деньги: " + myMoney3 + " Теперь Вы можете купить перчатки: ");
        gl1.readDescription();

        // 8.6 Констурукция for

        // Представим, что у нас есть стеллаж.
        // В стеллаже - 5 полок, на каждой полке 10 ячеек
        // a - номер полки
        // b - номер ячейки на полке
        // нам нужно пройтись по стеллажу и посчитать количество всех товаров на стеллаже

        int numberOfGoods = 0;
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.println("Полка и ячейка [" + a + "][" + b + "]");
                numberOfGoods++;
            }
        }
        System.out.println("Количество товаров стеллаже: " + numberOfGoods);
    }
}
