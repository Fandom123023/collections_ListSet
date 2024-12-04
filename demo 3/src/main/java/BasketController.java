import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


    @RestController
    public class BasketController {
        private final BasketService basketService;

        @Autowired
        public BasketController(BasketService basketService) {
            this.basketService = besketService;
        }

        @Scope("session")
        @GetMapping("/order/add")
        public ResponseEntity<String> addBask(@RequestParam List<Integer> idBasket) {
            basketService.addBasket(idBasket);
            {
                return ResponseEntity.ok("товары успешно добавлены в корзину");
            }
            @GetMapping("/order/get")
                    public List<String> getBasketProduct(){
                return basketService.getBasket();

            }
        }


            }

