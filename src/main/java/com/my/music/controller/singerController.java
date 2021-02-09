package com.my.music.controller;

import com.my.music.domain.singer;
import com.my.music.service.SingerService;
import com.my.music.untils.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/singer")
public class singerController {
    @Autowired
    private SingerService singerService;

    @ResponseBody
    @RequestMapping(value = "/addSinger",method = RequestMethod.POST)
    public Map addSinger(singer singer){
        System.out.println(singer);
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


}
