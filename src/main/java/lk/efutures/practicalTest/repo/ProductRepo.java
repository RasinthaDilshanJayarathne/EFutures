package lk.efutures.practicalTest.repo;

import lk.efutures.practicalTest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {
//    boolean existsByName(String name);
//    Product findByName(String userName);
//    boolean existsByProduct_category_id(int id);
//    Product findByProduct_category_id (int id);

    @Query(value = "SELECT * FROM product WHERE product_category_id=product_category_id", nativeQuery = true)
    List<Product> getProduct(@Param("id") int product_category_id);


    @Query(value = "SELECT * FROM product WHERE price >=price AND ", nativeQuery = true)
    List<Product> getProductByPrice(@Param("id") BigDecimal price);


//    boolean existsByProduct_id(int id);
//    Product findByProduct_id(int id);
//    Product deleteByProduct_id(int id);
}
