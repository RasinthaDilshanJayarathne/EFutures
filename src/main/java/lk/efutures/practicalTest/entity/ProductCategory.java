package lk.efutures.practicalTest.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ProductCategory {
    @Id
    private int product_category_id;
    private String name;
    private String description;

    public ProductCategory(int product_category_id) {
        this.product_category_id = product_category_id;
    }

    //    @OneToMany(mappedBy = "productCategory",cascade = CascadeType.ALL)
//    private List<Product> products;


}
