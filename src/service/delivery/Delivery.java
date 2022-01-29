package service.delivery;

public interface Delivery {
    default void orderDelivery(){
        System.out.println("Вы заказали доставку товара");
    }
    default void cancelDelivery() {
        System.out.println("Вы отменили доставку товара");
    }
    default void pickUp () {
        System.out.println("Вы оформили самовывоз товара");
    }
    default void cancelPickingUp () {
        System.out.println("Вы отменили самовывоз товара");
    }
}
