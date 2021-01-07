package com.my.music.controller;

import com.my.music.service.AdminService;
import com.my.music.untils.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class adminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/admin/login/status",method = RequestMethod.POST)
    public Map login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                     HttpSession session){
        HashMap paraMap = new HashMap();
        HashMap resultMap = new HashMap();
        resultMap.put(Const.CODE,-1000);
        resultMap.put(Const.MSG,"用户名或密码错误！");
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        paraMap.put("username",username);
        paraMap.put("password",password);
        List adminList = adminService.login(paraMap);
        if (adminList != null){
            resultMap.put(Const.CODE,1000);
            resultMap.put(Const.MSG,"登录成功！");
            session.setAttribute("username",username);
        }
        return resultMap;
    }
}
