package spring.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhouc on 2019/6/18.
 */
@RestController
@RequestMapping("/hello")
public class One {

    @RequestMapping("/aa")
    public String add(String name,String pass){
        Map map = new HashMap();
        map.put("UserName", "hallo a");
        map.put("password", "hallo b");

        String a = JSON.toJSONString(map);
        User user = JSON.parseObject(a, User.class);
        return JSON.toJSONString(user);
    }

    @RequestMapping("/bb")
    public Map addbb(){
        Map map = new HashMap();
        map.put("a", "hallo a");
        map.put("b", "hallo b");
        map.put("c", "hallo c");
        return map;
    }

    public static void main(String[] args) {
         byte[] b = new byte[4 * 1024 * 1024];
        System.out.println("分配了4M空间给数组");
        System.out.print("最大内存");
        System.out.println(Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");
        System.out.print("可用内存");
        System.out.println(Runtime.getRuntime().freeMemory() / 1024.0 / 1024 + "M");
        System.out.print("已经使用内存");
        System.out.println(Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");

    }

}
