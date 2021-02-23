package com.my.music.service;

import com.my.music.domain.singer;

import java.util.List;

public interface SingerService {
    int addSinger(singer singer);

    List<singer> querySingers(singer singer);

    int updateSinger(singer singer);

    int deleteSinger(List<singer> singerLists);
}
