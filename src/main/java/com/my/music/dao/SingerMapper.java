package com.my.music.dao;

import com.my.music.domain.singer;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
public interface SingerMapper {
    int addSinger(singer singer);

    List<singer> querySingers(singer singer);

    int updateSinger(singer singer);

    int deleteSinger(singer singer);
}
