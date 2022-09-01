package lk.efutures.practicalTest.repo;

import lk.efutures.practicalTest.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory,Integer>{

//    @Query(value = "SELECT * FROM ProductCategory WHERE product_category_id=:id",nativeQuery = true)
//    int getProductCategoriesByProduct_category_id(@Param("id") Integer id);

//    @Query(value = "SELECT product_category_id FROM product_category WHERE name=:name", nativeQuery = true)
//    int getCategoryName(@Param("name") String name);

    @Query(value = "select product_category_id from product_category where name = :name",nativeQuery = true)
    int getCategoryName(@Param("name") String name);

    //int getProductCategoryByDescription(@Param("name") String description);

    ProductCategory findByName (String name);
    boolean existsByName(String name);
}
