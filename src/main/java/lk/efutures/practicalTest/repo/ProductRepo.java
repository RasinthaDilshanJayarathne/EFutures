package lk.efutures.practicalTest.repo;

import lk.efutures.practicalTest.entity.Product;
import lk.efutures.practicalTest.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {

//    @Query(value = "SELECT * FROM product WHERE productCategory = productCategory_id", nativeQuery = true)
//    List<Product> getProduct(@Param("id") ProductCategory productCategory_id);

    List<Product> getProductsByProductCategoryEquals(ProductCategory productCategory_id);

//    @Query(value = "select p.product_id,p.name,p.description,p.price,p.status,p.launch_date from product p where p.product_id = product_id",nativeQuery = true)
//    List<Product> getProduct(@Param("id") int product_id);


//    @Query(value = "SELECT s.id, s.name, o.orderId, o.orderDate, o.time, o.cost FROM supplier s JOIN orders o ON o.sid=s.id", nativeQuery = true)
//    List<Product> getProductByPrice(@Param("id") BigDecimal price);

}
