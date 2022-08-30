package lk.efutures.practicalTest.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductDTO {
    private int product_id;
    private String name;
    private String description;
    private BigDecimal price;
    private int product_category_id;
    private String status;
    private LocalDate launch_date;
}
