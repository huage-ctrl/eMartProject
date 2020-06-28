package org.emart.midtier.sellerservice.repository;

import org.emart.midtier.sellerservice.entity.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * subcategory of each categories(Subcategory)表数据库访问层
 *
 * @author makejava
 */
@Repository
public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {

}
