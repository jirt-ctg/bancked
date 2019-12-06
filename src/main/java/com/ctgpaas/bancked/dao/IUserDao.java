package com.ctgpaas.bancked.dao;

import com.ctgpaas.bancked.entity.User;
import com.ctgpaas.bancked.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public interface IUserDao extends UserMapper {
    List<User> findByName(@Param("userName") String username);

    User selectById(@Param("id") Integer id);
}