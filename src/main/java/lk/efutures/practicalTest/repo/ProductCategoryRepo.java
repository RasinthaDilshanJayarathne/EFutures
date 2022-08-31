package lk.efutures.practicalTest.repo;

import lk.efutures.practicalTest.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory,Integer>{

//    @Query(value = "SELECT * FROM ProductCategory WHERE product_category_id=:id",nativeQuery = true)
//    int getProductCategoriesByProduct_category_id(@Param("id") Integer id);

    @Query(value = "SELECT product_category_id FROM product_category WHERE name=name", nativeQuery = true)
    int getCategoryById(@Param("name") String name);

    ProductCategory findByName (String name);
    boolean existsByName(String name);
}
