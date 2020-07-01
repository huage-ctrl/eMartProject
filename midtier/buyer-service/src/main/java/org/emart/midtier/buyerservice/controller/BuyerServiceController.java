package org.emart.midtier.buyerservice.controller;

import org.emart.midtier.buyerservice.entity.Cart;
import org.emart.midtier.buyerservice.entity.Item;
import org.emart.midtier.buyerservice.entity.PurchaseHistory;
import org.emart.midtier.buyerservice.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@EnableEurekaClient
@RestController
@RequestMapping(value = "/buyer")
public class BuyerServiceController {
    final BuyerService buyerService;
    @Autowired
    public BuyerServiceController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @GetMapping("/searchAllItems")
    public List<Item> searchAllItems() {
        return buyerService.searchAllItems();
    }
    @GetMapping("/searchItemsByItemName/{item_name}")
    public List<Item> searchItemsByItemName(@PathVariable("item_name") String item_name) {
        return buyerService.searchItemsByItemName(item_name);
    }

    @PostMapping(value = "/addCart")
    public Boolean addCartItems(@RequestBody Cart cart) {
        return buyerService.addCartItems(cart);
    }

    @GetMapping(value = "/listCarts/{buyer_id}")
    public List<Cart> listCarts(@PathVariable("buyer_id") Long buyerId) {
        return  this.buyerService.listCarts(buyerId);
    }

    @GetMapping(value = "/deleteCart")
    public void deleteCartItem(@RequestBody Cart cart) {
        buyerService.deleteCartItem(cart);
    }


    @PostMapping(value = "/checkout")
    public PurchaseHistory checkout(@RequestBody PurchaseHistory purchaseHistory) {
        return this.buyerService.checkout(purchaseHistory);
    }

}
