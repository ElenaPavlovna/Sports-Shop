import java.util.Objects;
import sportswear.SportsWear;
import sportswear.accessories.gloves.Glove;
import sportswear.footwear.Footwear;
import sportswear.footwear.Kid;
import sportswear.footwear.Men;
import sportswear.footwear.Women;
import sportswear.sale.ShirtsForSale;
import store.Store;
import cart.Cart;
import cashbox.CashBox;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

            // Задание №3 (наследование, абстракция, полиморфизм, инкапсуляция и ассоциация)

            // создаем магазин

            Store store = new Store("Магазин спортивной одежды", "Москва", "8-800-100-10-10", "Ежежневно с 9.00 - 23.00");
            store.storeOpen();
            store.storeClose();
            store.getInformationAboutTheStore();
            System.out.println("-------------------------------------");
            System.out.println(store.toString());


            // 1. создаем товары:

            // 1. создаем экземпляр женских кроссовок

            Footwear wt1 = new Women("Женские кроссовки", "Nike",5000,"Белый", "Спортивная обувь", "Жен", "Натуральная кожа", 37, "Весна-лето" );
            wt1.setName("Женские кроссовки");
            wt1.setBrand("Nike");
            wt1.setPrice(5000);
            wt1.setSize(37);
            wt1.setColor("Белый");
            wt1.setType("Спортивная обувь");
            wt1.setSeason("Весна-Осень");
            wt1.setGender("Жен");
            wt1.setMaterial("Натуральная кожа");

            wt1.readDescription();
            wt1.chooseIt();
            wt1.tryOn();

            // 2. создаем экземпляр мужских кроссовок

            Footwear mt1 = new Men("Мужские кроссовки", "Adidas", 7000,"Черный", "Спортивная обувь", "Муж", "Натуральная кожа", 42, "Весна-осень");
            mt1.setName("Мужские кроссовки");
            mt1.setBrand("Adidas");
            mt1.setPrice(7000);
            mt1.setSize(42);
            mt1.setColor("Черный");
            mt1.setType("Спортивная обувь");
            mt1.setSeason("Весна-Осень");
            mt1.setGender("Муж");
            mt1.setMaterial("Натуральная кожа");

            mt1.readDescription();
            mt1.chooseIt();
            mt1.tryOn();

            // 3. создаем экземпляр перчаток

            Glove gl1 = new Glove("Перчатки", "Reebok",3500,"Синий", "Спортивная одежда", "Унисекс", "Текстиль", "М", "Зима");
            gl1.setName("Перчатки");
            gl1.setBrand("Reebok");
            gl1.setPrice(3500);
            gl1.setSize("M");
            gl1.setColor("Синий");
            gl1.setType("Спортивная одежда");
            gl1.setSeason("Зима");
            gl1.setGender("Унисекс");
            gl1.setMaterial("Текстиль");

            gl1.readDescription();
            gl1.chooseIt();
            gl1.tryOn();

            // 4. создаем экземпляр детских кроссовок
            Kid kidsTrainers = new Kid("Деткие кроссовки", "Puma", 4500, "Зеленые", "Спортивная обувь", "Девочки", "Текстиль", 34, "Весна-лето");
           kidsTrainers.readDescription();
           kidsTrainers.chooseIt();
           kidsTrainers.tryOn();



            // 5. создаем корзину



            Cart cart = new Cart();

            // довавляем и удаляем товары из корзины

            cart.addToCart(wt1);
            cart.removeFromCart(wt1);
            cart.addToCart(mt1);
            cart.removeFromCart(mt1);
            cart.addToCart(gl1);
            cart.removeFromCart(gl1);

            // 6. создаем кассу

            CashBox cashBox = new CashBox();

            // выдаем чек о покупке и возврате товара
            // + методы товар куплен или товар вернули

            cashBox.giveACheck(wt1);
            cashBox.giveACheckOfReturn(wt1);
            cashBox.giveACheck(mt1);
            cashBox.giveACheckOfReturn(mt1);
            cashBox.giveACheck(gl1);
            cashBox.giveACheckOfReturn(gl1);

            // Задание №5
            // операции с примитивными типами данных +,-,*,/
            // выполнено на основе скидок (package sale, class ShirtsFotSale)

            // 5.1 первая футболка со скидкой 500 руб (операция вычитание)

            ShirtsForSale shirt1 = new ShirtsForSale("Футболка со скодкой 500 рублей", "Nike", 3000,"Зеленый","Спортивная одежда","Жен","100% хлопок","XXS");
            shirt1.setName("Футболка со скодкой 500 рублей");
            shirt1.setBrand("Nike");
            shirt1.setPrice(3000);
            shirt1.setDiscount(500);
            shirt1.setFinalPrice(shirt1.getPrice() - shirt1.getDiscount());
            shirt1.setSize("XS");
            shirt1.setColor("Зеленый");
            shirt1.setType("Спортивная одежда");
            shirt1.setGender("Жен");
            shirt1.setMaterial("100% хлопок");

            shirt1.readDescription();
            shirt1.chooseIt();
            cart.addToCart(shirt1);
            cart.removeFromCart(shirt1);
            cashBox.giveACheck(shirt1);
            cashBox.giveACheckOfReturn(shirt1);

            // 5.2 вторая футболка скидка 50% (операция деление)

            ShirtsForSale shirt2 = new ShirtsForSale("Цены пополам! Футболка со скидкой", "Adidas",3000,"Белый","Спортивная одежда","Жен","100% хлопок","XXS");
            shirt2.setName("Цены пополам! Футболка со скидкой");
            shirt2.setBrand("Adidas");
            shirt2.setPrice(3000);
            shirt2.setFinalPrice(shirt1.getPrice() / 2);
            shirt2.setSize("XXS");
            shirt2.setColor("Белый");
            shirt2.setType("Спортивная одежда");
            shirt2.setGender("Жен");
            shirt2.setMaterial("100% хлопок");

            shirt2.readDescription();
            shirt2.chooseIt();
            cart.addToCart(shirt2);
            cart.removeFromCart(shirt2);
            cashBox.giveACheck(shirt2);
            cashBox.giveACheckOfReturn(shirt2);

            // 5.3 третья футболка скидка 50% (операция умножение)

            ShirtsForSale shirt3 = new ShirtsForSale("Цены пополам! Футболка со скидкой", "New Balance",5000,"Белый","Спортивная одежда", "Жен","100% хлопок","XXL");
            shirt3.setName("Цены пополам! Футболка со скидкой");
            shirt3.setBrand("New Balance");
            shirt3.setPrice(5000);
            shirt3.setDiscount2(0.5f);
            shirt3.setFinalPrice((int) (shirt3.getPrice() * shirt3.getDiscount2()));
            shirt3.setSize("XXL");
            shirt3.setColor("Белый");
            shirt3.setType("Спортивная одежда");
            shirt3.setGender("Жен");
            shirt3.setMaterial("100% хлопок");

            shirt3.readDescription();
            shirt3.chooseIt();
            cart.addToCart(shirt3);
            cart.removeFromCart(shirt3);
            cashBox.giveACheckOfReturn(shirt3);
            cashBox.giveACheck(shirt3);

            // 5.4 четвертая футболка скидка 50% (операция сложение)

            ShirtsForSale shirt4 = new ShirtsForSale("Цены пополам! Футболка со скидкой", "Reebok", 6000, "Белый","Спортивная одежда", "Жен", "100% хлопок","S");
            shirt4.setName("Цены пополам! Футболка со скидкой");
            shirt4.setBrand("Reebok");
            shirt4.setPrice(6000);
            shirt4.setDiscount(-3000);
            shirt4.setFinalPrice(shirt4.getPrice() + shirt4.getDiscount());
            shirt4.setSize("S");
            shirt4.setColor("Белый");
            shirt4.setType("Спортивная одежда");
            shirt4.setGender("Жен");
            shirt4.setMaterial("100% хлопок");

            shirt4.readDescription();
            shirt4.chooseIt();
            cart.addToCart(shirt4);
            cart.removeFromCart(shirt4);
            cashBox.giveACheck(shirt4);
            cashBox.giveACheckOfReturn(shirt4);

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
            System.out.println("----------------------------");

            // допустим,у покупателя размер 42
            // он ищет обувь своего размера
            // и смотрит всю обувь начиная с 36 размера.
            // выполнено при помощи метода do while и if

            int k= 36;
            do {System.out.println(k + " - Вам нужен размер больше");
                k++;
            } while (k<42 || k!=sizes[1]);
            if (k==sizes[1]) {
                System.out.println( k + " - Вы нашли нужный Вам размер" );
            }

            System.out.println("------------------------------------");


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


