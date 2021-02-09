package com.my.music.service.impl;

import com.my.music.dao.SingerMapper;
import com.my.music.domain.singer;
import com.my.music.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SingerServiceImpl implements SingerService {
    @Autowired
    private SingerMapper singerMapper;
    @Override
    public int addSinger(singer singer) {
        if (singer.getPid().equals("")){
            singer.setPid(UUID.randomUUID().toString().replaceAll("-",""));
        }
        singer.setPicture("/img/singerPic/default.jpg");
        return singerMapper.addSinger(singer);
    }
}
