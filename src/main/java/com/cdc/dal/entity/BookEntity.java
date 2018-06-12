/**
 * Copyright (C) 2006-2018 Tuniu All rights reserved
 */
package com.cdc.dal.entity;

/**
 * TODO: description
 * Date: 2018-06-05
 *
 * @author cuidc
 */
public class BookEntity {
    private int id;
    private String name;
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
