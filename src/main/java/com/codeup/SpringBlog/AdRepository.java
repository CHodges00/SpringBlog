package com.codeup.SpringBlog;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//                                               < ENTITY  , ID >
public interface AdRepository extends JpaRepository <Ad, Long> {

    Ad findByTitle(String title);

}
