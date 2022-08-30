package lk.efutures.practicalTest.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Product {
    @Id
    private int product_id;
    private String name;
    private String description;
    private BigDecimal price;
    private int product_category_id;
    private String status;
    private LocalDate launch_date;
}
