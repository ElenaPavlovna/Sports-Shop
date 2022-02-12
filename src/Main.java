import sportswear.accessories.gloves.Glove;
import sportswear.footwear.Footwear;
import sportswear.footwear.Kid;
import sportswear.footwear.Men;
import sportswear.footwear.Women;
import sportswear.sale.ShirtsForSale;
import store.Store;
import cart.Cart;
import cashbox.CashBox;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("Магазин спортивной одежды", "Москва", "8-800-100-10-10", "Ежежневно с 9.00 - 23.00");
        Footwear womanTrainers = new Women("0011","Женские кроссовки", "Nike", "Nike1",5000, "Белый", "Спортивная обувь", "Жен", "Натуральная кожа", 37, "Весна-лето");
        Footwear manTrainers = new Men("0012","Мужские кроссовки", "Adidas", "Adidas1",7000, "Черный", "Спортивная обувь", "Муж", "Натуральная кожа", 42, "Весна-осень");
        Glove glove = new Glove("1100","Перчатки", "Reebok", 3500, "Синий", "Спортивная одежда", "Унисекс", "Текстиль", "М", "Зима");
        Kid kidsTrainers = new Kid("1010", "Деткие кроссовки", "Puma", "Puma1", 4500, "Зеленые", "Спортивная обувь", "Девочки", "Текстиль", 34, "Весна-лето");
        ShirtsForSale shirtsForSale = new ShirtsForSale("1102","Футболка со скидкой", "New Balance","Синий", "Спортивная одежда", "Жен", "100% хлопок", 5000, 500, 4500, "XXS");
        Cart cart = new Cart();
        CashBox cashBox = new CashBox();
    }
}



