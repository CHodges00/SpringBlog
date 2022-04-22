package com.codeup.SpringBlog.repositories;

import com.codeup.SpringBlog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository <Post, Long> {

    Post findByTitle(String title);

//    @Modifying
//    @Query("update Post u set u.title = :title, u.body = :body where u.id = :id")
//    void updatePost(@Param(value = "id") long id, @Param(value = "title") String title, @Param(value = "body") String body);

}