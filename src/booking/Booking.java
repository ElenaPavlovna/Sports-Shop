package booking;

public interface Booking {
    default void bookIt (){
        System.out.println("Вы забронировали товар");
    };
    default void cancelBooking () {
        System.out.println("Вы отменили бронь товара");
    }
}
