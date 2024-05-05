package com.example.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MessageRepository {


    @Insert("insert into messages (name, email, message) values (#{name}, #{email}, #{message})")
    void insert(@Param("name") String name, @Param("email") String email,@Param("message") String message);

}
