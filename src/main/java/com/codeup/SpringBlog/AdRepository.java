package com.codeup.SpringBlog;

import org.springframework.data.jpa.repository.JpaRepository;

//                                               < ENTITY  , ID >
public interface AdRepository extends JpaRepository <Ad, Long> {



}
