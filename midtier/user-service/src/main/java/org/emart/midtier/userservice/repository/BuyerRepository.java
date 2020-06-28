package org.emart.midtier.userservice.repository;

import org.emart.midtier.userservice.entity.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Buyer login and profile details(Buyer)表数据库访问层
 *
 * @author makejava
 */
@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long> {
    Optional<Buyer> findBuyerByUsername (String userName);
}
