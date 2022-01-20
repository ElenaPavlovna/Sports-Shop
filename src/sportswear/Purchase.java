package sportswear;

public interface Purchase {

    default void chooseIt() {
        System.out.println("Товар выбран");
    }
    default void tryOn() {
        System.out.println("Вы примеряете товар");
    }
    default void buyIt() {
        System.out.println("Товар куплен");
    }
    default void returnIt() {
        System.out.println("Возврат товара");
    }
    void readDescription();
}
