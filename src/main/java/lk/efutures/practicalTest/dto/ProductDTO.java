package lk.efutures.practicalTest.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ProductDTO {
    private int product_id;
    private String name;
    private String description;
    private BigDecimal price;
    private int product_category_id;
    private String status;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate launch_date;
}
