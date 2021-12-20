package com.kyf.dao;

import com.kyf.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BookDao {
    /**
     * 创建书箱
     * @param book
     */
    public int create(Book book);

    /**
     *查询书箱
     * @param bookId
     * @return
     */
    public Book findBookById(long bookId);

    /**
     * 更新书箱信息
     * @param book
     * @return
     */
    public int update(Book book);

    /**
     * 删除书箱
     * @param bookId
     * @return
     */
    public int delete(long bookId);
}
