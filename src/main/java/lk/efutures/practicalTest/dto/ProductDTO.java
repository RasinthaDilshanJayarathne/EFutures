package lk.efutures.practicalTest.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import lk.efutures.practicalTest.entity.ProductCategory;
import lk.efutures.practicalTest.entity.ProductComment;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ProductDTO {
    private int product_id;
    @NotNull(message = "Name is mandatory")
    private String name;
    private String description;
    private BigDecimal price;
    //private int product_category_id;
    @NotBlank(message = "Name is mandatory")
    private String status;
    private LocalDate launch_date;
    private ProductCategory productCategory;
    //private List<ProductComment> productComments;


    public ProductDTO(int product_id, String name, String description, BigDecimal price, String status, LocalDate launch_date) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.status = status;
        this.launch_date = launch_date;
    }
}
