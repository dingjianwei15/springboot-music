package com.my.music.controller;

import com.alibaba.fastjson.JSONArray;
import com.my.music.domain.singer;
import com.my.music.service.SingerService;
import com.my.music.untils.Const;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.security.auth.login.Configuration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/singer")
public class singerController {
    @Autowired
    private SingerService singerService;

    @ResponseBody
    @RequestMapping(value = "/addSinger",method = RequestMethod.POST)
    public Map addSinger(singer singer){
        Map resultMap = new HashMap();
        resultMap.put(Const.CODE,-1000);
        resultMap.put(Const.MSG,"添加失败！");
        int num = singerService.addSinger(singer);
        if (num > 0){
            resultMap.put(Const.CODE,1000);
            resultMap.put(Const.MSG,"添加成功！");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping(value = "/querySingers",method = RequestMethod.POST)
    public Map querySingers(singer singer){
        Map resultMap = new HashMap();
        resultMap.put(Const.CODE,-1000);
        resultMap.put(Const.MSG,"查询失败！");
        List<singer> singerList = new ArrayList<singer>();
        try{
            singerList = singerService.querySingers(singer);
            resultMap.put(Const.CODE,1000);
            resultMap.put(Const.MSG,"success");
        }catch (Exception e){
            System.out.println(e);
        }
        resultMap.put(Const.DATA,singerList);
        return resultMap;
    }

    @ResponseBody
    @RequestMapping(value = "/updateSingerPic",method = RequestMethod.POST)
    public Map updateSingerPic(@RequestParam("file")MultipartFile multipartFile,@RequestParam("pid") String pid){
        Map resultMap = new HashMap();
        resultMap.put(Const.CODE,-1000);
        resultMap.put(Const.MSG,"error");

        String fileName = System.currentTimeMillis()+multipartFile.getOriginalFilename();
        //创建文件路径
        String str1 = System.getProperty("user.dir");
        String str2 = System.getProperty("file.separator");
        String filePath = str1+str2+"img"+str2+"singerPic";
        File fileDir = new File(filePath);
        if (!fileDir.exists()){
            fileDir.mkdir();
        }
        File file = new File(filePath+str2+fileName);
        try {
            //上传文件
            multipartFile.transferTo(file);
            resultMap.put(Const.CODE,1000);
            resultMap.put(Const.MSG,"success");
            singer singer = new singer();
            singer.setPid(pid);
            singer = singerService.querySingers(singer).get(0);
            singer.setPicture("img/singerPic/"+fileName);
            if (singerService.updateSinger(singer) > 0){
                resultMap.put(Const.CODE,1000);
                resultMap.put(Const.MSG,"success");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping(value = "/updateSinger",method = RequestMethod.POST)
    public Map updateSinger(singer singer){
        Map resultMap = new HashMap();
        resultMap.put(Const.CODE,-1000);
        resultMap.put(Const.MSG,"error");
        if (singerService.updateSinger(singer) > 0){
            resultMap.put(Const.CODE,1000);
            resultMap.put(Const.MSG,"success");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping(value = "/deleteSinger",method = RequestMethod.POST)
    public Map deleteSinger(@RequestParam("singerList") String singerList){
        List<singer> singerLists= (List<singer>) JSONArray.parseArray( singerList, singer.class);
        Map resultMap = new HashMap();
        resultMap.put(Const.CODE,-1000);
        resultMap.put(Const.MSG,"error");
        singer singer = new singer();
        //singer.setPid(pid);
        if (singerService.deleteSinger(singerLists) > 0){
            resultMap.put(Const.CODE,1000);
            resultMap.put(Const.MSG,"success");
        }
        return resultMap;
    }

}
