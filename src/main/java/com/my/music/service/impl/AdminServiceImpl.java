package com.my.music.service.impl;

import com.my.music.dao.AdminMapper;
import com.my.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List login(HashMap map) {
        return adminMapper.login(map);
    }
}
