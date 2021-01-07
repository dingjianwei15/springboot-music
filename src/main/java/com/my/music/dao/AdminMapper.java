package com.my.music.dao;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface AdminMapper {
    List login(HashMap map);
}
