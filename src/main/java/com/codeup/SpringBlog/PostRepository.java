package com.codeup.SpringBlog;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository <Post, Long> {

public List<Post> findByTitle(String title);
}
