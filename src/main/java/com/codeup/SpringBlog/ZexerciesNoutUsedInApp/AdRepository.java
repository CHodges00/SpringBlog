package com.codeup.SpringBlog.ZexerciesNoutUsedInApp;

import org.springframework.data.jpa.repository.JpaRepository;

//                                               < ENTITY  , ID >
public interface AdRepository extends JpaRepository <Ad, Long> {

    Ad findByTitle(String title);

}
