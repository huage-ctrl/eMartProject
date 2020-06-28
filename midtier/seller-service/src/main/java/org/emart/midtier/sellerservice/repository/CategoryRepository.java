package org.emart.midtier.sellerservice.repository;

import org.emart.midtier.sellerservice.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * list of categories(Category)表数据库访问层
 *
 * @author makejava
 */
@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {

}
