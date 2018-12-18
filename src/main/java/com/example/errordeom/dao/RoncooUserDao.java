package com.example.errordeom.dao;

import com.example.errordeom.bean.RoncooUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoncooUserDao extends JpaRepository<RoncooUser, Integer> {

    @Query("select r from RoncooUser r where r.name=?1")
    RoncooUser findByName(String string);
}
