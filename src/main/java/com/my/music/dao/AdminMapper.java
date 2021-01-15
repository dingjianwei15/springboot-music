package com.my.music.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface AdminMapper {
//    public int  login(HashMap map);
    public List  login(HashMap map);
}
