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

//    @OneToMany(mappedBy = "productCategory",cascade = CascadeType.ALL)
//    private List<Product> products;


}
