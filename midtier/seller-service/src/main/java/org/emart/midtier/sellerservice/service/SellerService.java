package org.emart.midtier.sellerservice.service;

import org.emart.midtier.sellerservice.entity.Category;
import org.emart.midtier.sellerservice.entity.Item;
import org.emart.midtier.sellerservice.entity.Subcategory;
import org.emart.midtier.sellerservice.repository.CategoryRepository;
import org.emart.midtier.sellerservice.repository.ItemRepository;
import org.emart.midtier.sellerservice.repository.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {

    final CategoryRepository categoryRepository;
    final ItemRepository itemRepository;
    final SubcategoryRepository subcategoryRepository   ;
    @Autowired
    public SellerService(CategoryRepository categoryRepository, ItemRepository itemRepository, SubcategoryRepository subcategoryRepository) {
        this.categoryRepository = categoryRepository;
        this.itemRepository = itemRepository;
        this.subcategoryRepository = subcategoryRepository;
    }
    public List<Category> getCategoryList() {
        return this.categoryRepository.findAll();
    }

    public List<Subcategory> getSubCategoryList() {
        return this.subcategoryRepository.findAll();
    }

    public List<Item> findItemsByItemName(String itemName) {
        return this.itemRepository.findItemsByItemName(itemName);
    }

    public List<Item> findItemsBySellerId(String sellerId) {
        return this.itemRepository.findItemsBySellerId(sellerId);
    }

    public List<Item> findAllItems() {
        return this.itemRepository.findAll();
    }

    public Item addItem(Item item) {
        return this.itemRepository.save(item);
    }

    public void  deleteItems(Long id) {
        this.itemRepository.deleteById(id);
    }

    public void updateItemStock(Item item) {
        this.itemRepository.save(item);
    }

}
