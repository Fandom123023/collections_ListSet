import java.util.Objects;
public class Basket{
    private int idBasket;
    private String basketName;

    public Basket(int idBasket, String basketName) {
        this.idBasket = idBasket;
        this.basketName = basketName;
    }
    public int getIdBasket(){return idBasket;}
    public String getBasketName(){return basketName;}
    @Override
    public boolean equales (Objects o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return idBasket == basket.idBasket && Object.equals(basketName, basket.basketName);
    }
    @Override
    public int hashCode(){
        return Object.hash(idBasket, basketName);

    }

    @Override
    public String toString (){
        return "Basket{"+ "idBasket=" + idBasket + ",BasketName='" + basketName +'\'' + "}";
    }

}
