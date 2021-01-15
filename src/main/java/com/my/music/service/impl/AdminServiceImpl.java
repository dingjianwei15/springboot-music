package com.my.music.service.impl;

import com.my.music.dao.AdminMapper;
import com.my.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List login(HashMap map) {
        /*String username = (String) map.get("username");
        String password = (String) map.get("password");*/

        List resultList = new ArrayList();
        resultList = adminMapper.login(map);
        return resultList;
    }
}
