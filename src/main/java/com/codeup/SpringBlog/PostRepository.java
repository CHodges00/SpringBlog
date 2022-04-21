package com.codeup.SpringBlog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface PostRepository extends JpaRepository <Post, Long> {

    Post findByTitle(String title);

//    @Modifying
//    @Query("update Post u set u.title = :title, u.body = :body where u.id = :id")
//    void updatePost(@Param(value = "id") long id, @Param(value = "title") String title, @Param(value = "body") String body);

}