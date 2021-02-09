package com.my.music.dao;

import com.my.music.domain.singer;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface SingerMapper {
    int addSinger(singer singer);
}
