package org.emart.midtier.buyerservice.client;

import org.emart.midtier.sellerservice.entity.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "seller-service")
public interface ItemsFeignClient {
    @GetMapping("/searchAllItems")
    List<Item> searchAllItems();
    @GetMapping("/search/{itemName}")
    List<Item> searchItemsByItemName(@PathVariable String itemName);
}
