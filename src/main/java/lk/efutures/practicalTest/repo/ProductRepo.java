package lk.efutures.practicalTest.repo;

import lk.efutures.practicalTest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,String> {
    boolean existsByName(String name);
    Product findByName(String userName);

//    boolean existsByProduct_id(int id);
//    Product findByProduct_id(int id);
//    Product deleteByProduct_id(int id);
}
