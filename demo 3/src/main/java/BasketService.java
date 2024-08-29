import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BasketService {
@Override
    @SessionScope
    public class BasketService {
    private final Map<Integer, String> baskets = Map.of(
            1,"лимонад",
            2,"печенька",
            3,"колбаса",
            4,"хлеб",
            5,"яйца",
            6,"молоко",
            7,"чай",
            8,"сыр",
            9,"рыба",
            10,"пакет"
    );

    private final List<String> basketProduct = new ArrayList<>();
    public void addBasket(List<Integer> idBasket) {
        for (int idBaskets : idBasket){
            if(!baskets.containsKey(idBaskets)){
                throw new BasketNotAddedException();
            }


            String product = baskets.get(idBaskets);
            basketProduct.add(product);
        }
    }
    public List<String> getBasket(){
        return new ArrayList<>(basketProduct);

    }


}

}

