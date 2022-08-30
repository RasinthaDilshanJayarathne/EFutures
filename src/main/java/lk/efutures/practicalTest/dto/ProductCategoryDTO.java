package lk.efutures.practicalTest.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductCategoryDTO {
    private int product_category_id;
    private String name;
    private String description;
}
