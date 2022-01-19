package cart;
import sportswear.SportsWear;

public class Cart {
    private int amountOfProductsInCart = 0;
    SportsWear sportsWear;

    public void addToCart (SportsWear sportsWear) { System.out.println("Товар добавлен в корзину");
    amountOfProductsInCart++;
        System.out.println("Количество товаров в корзине: " + amountOfProductsInCart);
    }
    public void removeFromCart (SportsWear sportsWear) { System.out.println("Товар удален из корзины");
    amountOfProductsInCart--;
        System.out.println("Количество товаров в корзине: " + amountOfProductsInCart);
    }
}






