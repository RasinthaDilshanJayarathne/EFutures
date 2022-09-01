package lk.efutures.practicalTest.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Product {
    @Id
    private int product_id;
    private String name;
    private String description;
    private BigDecimal price;
    //private int product_category_id;
    private String status;
    private LocalDate launch_date;

    @ManyToOne
    @JoinColumn(name = "product_category_id",referencedColumnName = "product_category_id")
    private ProductCategory productCategory;

//    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
//    private List<ProductComment> productComments;


    public Product(int product_id, String name, String description, BigDecimal price, String status, LocalDate launch_date) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.status = status;
        this.launch_date = launch_date;
    }
}
