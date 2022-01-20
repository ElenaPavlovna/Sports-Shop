package cashbox;
import sportswear.SportsWear;

public class CashBox {
    private String name;
    private String typeOfTheCheck;
    SportsWear sportsWear;

    public void giveACheck(SportsWear sportsWear) {
        System.out.println("Выдан чек о покупке товара");
    }
    public void giveACheckOfReturn(SportsWear sportsWear) {
        System.out.println("Выдан чек о возврате товара");
    }
}



