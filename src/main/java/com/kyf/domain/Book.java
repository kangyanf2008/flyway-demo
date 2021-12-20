package com.kyf.domain;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long   bookId;   //书ID
    private String bookName; //书名称
    private String bookType; //书类型
    private String author;   //作者
    private long createTime; //创建时间
    private long updateTime; //更新时间
}
