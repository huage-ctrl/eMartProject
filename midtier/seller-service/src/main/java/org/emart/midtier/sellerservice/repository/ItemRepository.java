package org.emart.midtier.sellerservice.repository;

import org.emart.midtier.sellerservice.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Selling item Details(Item)表数据库访问层
 *
 * @author makejava
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

   List<Item>findItemsByItemName(String itemName);
    List<Item> findItemsBySellerId(String sellerId);
}
