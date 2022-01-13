package cart;

import sportswear.SportsWear;

public class Cart {
    private String name;
    private int numberOfProduct;
    SportsWear sportsWear;


    public void addToCart(SportsWear sportsWear) {

        System.out.println("Товар добавлен в корзину");
    }

    public void removeFromCart(SportsWear sportsWear) {

        System.out.println("Товар удален из корзины");
    }


}






