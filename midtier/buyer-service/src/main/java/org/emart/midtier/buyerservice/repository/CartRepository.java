package org.emart.midtier.buyerservice.repository;

import org.emart.midtier.buyerservice.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * buyer cart(Cart)表数据库访问层
 *
 * @author makejava
 */
@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
    List<Cart> findCartsByBuyerId(String BuyerId);
}
