package lk.efutures.practicalTest.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ProductComment {
    @Id
    private int product_comment_id;
    private String comment;
    private Timestamp created_at;
    private int product_id;

//    @ManyToOne
//    @JoinColumn(name = "product_id",referencedColumnName = "id",insertable = false,updatable = false)
//    private Product product;
}
