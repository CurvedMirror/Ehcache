package com.ehcache.dao;

import com.ehcache.pojo.Book;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * @author jie
 * @date 2019/3/16 0016 -13:53
 */
@Repository
@CacheConfig(cacheNames = "book_cache")
public class BookDao {

    @Cacheable
    public Book getBookById(Integer id){
        System.out.println("getBookById");
        Book book = new Book();
        book.setId(id);
        book.setName("三国演义");
        book.setAuthor("罗贯中");
        return book;
    }

    @CachePut(key = "#book.id")
    public Book updateBookById(Book book){
        System.out.println("updatebookById");
        book.setName("三国2");
        return book;
    }

    @CacheEvict(key = "#id")
    public void deleteBookById(Integer id){
        System.out.println("deleteBookbyId");

    }
}
