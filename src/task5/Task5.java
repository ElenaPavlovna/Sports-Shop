package task5;
import sportswear.sale.ShirtsForSale;

public class Task5 {
    public static void main(String[] args) {

        // // Задание №5 ОПЕРАЦИИ с примитивными типами данных +,-,*,/

        // 5.1 первая футболка со скидкой 500 руб (операция вычитание)

        ShirtsForSale shirt1 = new ShirtsForSale("Футболка со скодкой 500 рублей", "Nike", 3000,"Зеленый","Спортивная одежда","Жен","100% хлопок","XXS");

        shirt1.setDiscount(500);
        shirt1.setFinalPrice(shirt1.getPrice() - shirt1.getDiscount());

        // 5.2 вторая футболка скидка 50% (операция деление)

        ShirtsForSale shirt2 = new ShirtsForSale("Цены пополам! Футболка со скидкой", "Adidas",3000,"Белый","Спортивная одежда","Жен","100% хлопок","XXS");
        shirt2.setFinalPrice(shirt1.getPrice() / 2);

        // 5.3 третья футболка скидка 50% (операция умножение)

        ShirtsForSale shirt3 = new ShirtsForSale("Цены пополам! Футболка со скидкой", "New Balance",5000,"Белый","Спортивная одежда", "Жен","100% хлопок","XXL");

        shirt3.setDiscount2(0.5f);
        shirt3.setFinalPrice((int) (shirt3.getPrice() * shirt3.getDiscount2()));

        // 5.4 четвертая футболка скидка 50% (операция сложение)

        ShirtsForSale shirt4 = new ShirtsForSale("Цены пополам! Футболка со скидкой", "Reebok", 6000, "Белый","Спортивная одежда", "Жен", "100% хлопок","S");

        shirt4.setDiscount(-3000);
        shirt4.setFinalPrice(shirt4.getPrice() + shirt4.getDiscount());

    }
}
