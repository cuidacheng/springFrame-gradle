/**
 * Copyright (C) 2006-2018 Tuniu All rights reserved
 */
package com.cdc.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdc.dal.entity.BookEntity;

import net.sf.json.JSONArray;

/**
 * TODO: description
 * Date: 2018-06-05
 *
 * @author cuidc
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/bookDetail")
    public void getBookDetail(@RequestBody BookEntity bookEntity, HttpServletResponse response) throws Exception {
        bookEntity.setAuthor("cuidacheng");
        bookEntity.setName("test springMvc");
        bookEntity.setId(1);
        response.setContentType("text/html;charset=utf-8");
        JSONArray jsonArray = JSONArray.fromObject(bookEntity);
        response.getWriter().println(jsonArray.toString());
    }
}
