package lk.efutures.practicalTest.dto;

import lk.efutures.practicalTest.entity.Product;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductCategoryDTO {
    private int product_category_id;
    private String name;
    private String description;
    //private List<Product> products;
}
