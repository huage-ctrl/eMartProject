package org.emart.midtier.sellerservice.controller;

import org.emart.midtier.sellerservice.entity.Category;
import org.emart.midtier.sellerservice.entity.Item;
import org.emart.midtier.sellerservice.entity.Subcategory;
import org.emart.midtier.sellerservice.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/seller")
public class SellerServiceController {
    final SellerService sellerService;
    @Autowired
    public SellerServiceController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @GetMapping("/getCategoryList")
    public List<Category> getCategoryList() {
        return this.sellerService.getCategoryList();
    }
    @GetMapping(value = "/subCategoryList")
    public List<Subcategory> getSubCategoryList() {
        return this.sellerService.getSubCategoryList();
    }
    /**
     * 服务对象
     */

    @PostMapping("/addItem")
    public Item addItem(@RequestBody Item item) {
        return sellerService.addItem(item);
    }

    @GetMapping("/deleteItem/{id}")
    public void  deleteItems(@PathVariable("id") Long id) {
        sellerService.deleteItems(id);
    }

    @GetMapping("/itemListBySeller/{seller_id}")
    public List<Item> getItemListBySeller(@PathVariable("seller_id") Long sellerId) {
        return  sellerService.findItemsBySellerId(sellerId);
    }

    @GetMapping(value = "/searchAllItems")
    public List<Item> searchAllItems() {
        return this.sellerService.findAllItems();
    }

    @PostMapping(value = "/updateItemStock/{id}")
    public void updateItem(@PathVariable("id") String id, @RequestBody Item item) {
        this.sellerService.updateItemStock(item);
    }

    @GetMapping("/search/{item_name}")
    public List<Item> searchItemsByItemName(@PathVariable("item_name") String itemName) {
        return sellerService.findItemsByItemName(itemName);
    }
}
