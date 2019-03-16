package com.ehcache.pojo;


import java.io.Serializable;

/**
 * @author jie
 * @date 2019/3/16 0016 -13:57
 */
public class Book implements Serializable {
    private Integer id;
    private String name;
    private  String author;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
