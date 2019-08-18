package com.java.controller;

import java.util.Map;

/**
 * @program: springmvc_demo1
 * @description:
 * @author: LiuYang
 * @create: 09:52
 */
public class LoginController {
    @RequestMapping(value="/qqRegister.do")
    public @ResponseBody boolean qqRegister(@RequestBody Map<String,Object> qqInfo){
        System.out.println("qq"+qqInfo);
        return  true;
    }
}
