package org.emart.midtier.buyerservice.client;


import org.emart.midtier.buyerservice.entity.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "seller-service")
public interface ItemsFeignClient {
    @GetMapping("/seller/searchAllItems")
    List<Item> searchAllItems();
    @GetMapping("/seller/search/{itemName}")
    List<Item> searchItemsByItemName(@PathVariable String itemName);
}
