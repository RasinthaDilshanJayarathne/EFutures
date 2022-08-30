package lk.efutures.practicalTest.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

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
}
