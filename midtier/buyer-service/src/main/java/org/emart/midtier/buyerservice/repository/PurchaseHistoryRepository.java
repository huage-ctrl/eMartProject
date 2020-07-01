package org.emart.midtier.buyerservice.repository;

import org.emart.midtier.buyerservice.entity.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * purchase history(PurchaseHistory)表数据库访问层
 *
 * @author makejava
 */
@Repository
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory,Long> {

}
