package lk.efutures.practicalTest.dto;

import lk.efutures.practicalTest.entity.Product;
import lombok.*;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductCommentDTO {
    private int product_comment_id;
    private String comment;
    private Timestamp created_at;
    //private int product_id;
    private Product product;
}
