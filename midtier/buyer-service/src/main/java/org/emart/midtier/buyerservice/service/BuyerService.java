package org.emart.midtier.buyerservice.service;

import org.emart.midtier.buyerservice.client.ItemsFeignClient;
import org.emart.midtier.buyerservice.entity.Cart;
import org.emart.midtier.buyerservice.entity.PurchaseHistory;
import org.emart.midtier.buyerservice.repository.CartRepository;
import org.emart.midtier.buyerservice.repository.PurchaseHistoryRepository;
import org.emart.midtier.sellerservice.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BuyerService {
    final CartRepository cartRepository;
    final PurchaseHistoryRepository purchaseHistoryRepository;
    final ItemsFeignClient itemsFeignClient;

    @Autowired
    BuyerService(ItemsFeignClient itemsFeignClient, CartRepository cartRepository, PurchaseHistoryRepository purchaseHistoryRepository) {
        this.itemsFeignClient = itemsFeignClient;
        this.cartRepository = cartRepository;
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }

    public boolean addCartItems(Cart cart) {

        if (cartRepository.save(cart) != null) {
            return true;
        } else {
            return false;
        }
    }

    public void deleteCartItem(Cart cart) {
        cartRepository.delete(cart);
    }

    public List<Cart> listCarts(String buyerId) {
        return this.cartRepository.findCartsByBuyerId(buyerId);
    }

    public PurchaseHistory checkout(PurchaseHistory purchaseHistory) {
        return this.purchaseHistoryRepository.save(purchaseHistory);
    }

    public List<Item> searchAllItems() {
        return itemsFeignClient.searchAllItems();
    }

    public List<Item> searchItemsByItemName(String itemName) {
        return itemsFeignClient.searchItemsByItemName(itemName);
    }
}
