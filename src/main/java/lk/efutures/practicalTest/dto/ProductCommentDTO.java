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

    //2005-02-25 14:48:24.0 format
    private Timestamp created_at;
    private int product_id;
}
