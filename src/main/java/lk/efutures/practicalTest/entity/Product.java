package lk.efutures.practicalTest.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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

//    @ManyToOne
//    @JoinColumn(name = "product_category_id",referencedColumnName = "id",insertable = false,updatable = false)
//    private ProductCategory productCategory;

//    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
//    private List<ProductComment> productComments;
}
