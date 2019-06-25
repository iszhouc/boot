package spring.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.jboss.logging.Field;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhouc on 2019/6/24.
 */
@Data
@Controller
public class User {

    @JSONField(name="UserName")
    private String username;
    private String password;

    public static void main(String[] args) {

        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123");
        System.out.println(JSON.toJSONString(user));
    }

    }



