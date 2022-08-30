package lk.efutures.practicalTest.dto;

import lombok.*;

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
    private int product_id;
}
