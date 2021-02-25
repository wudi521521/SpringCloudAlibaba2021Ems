package com.wudi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wudi.utils.VerifyCodeUtils;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/2/25 17:40
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 生成验证码
     *
     * @return
     */
    @GetMapping("/user/getImage")
    public Map<String, Object> getImage() throws Exception {
        Map<String, Object> map = new HashMap<>();
        //1.生成验证码(4位验证码)
        String code = VerifyCodeUtils.generateVerifyCode(4);
        //2.存储验证码
        String codeKey = UUID.randomUUID().toString();
        //有效期60s
        stringRedisTemplate.opsForValue().set(codeKey, code, 60, TimeUnit.SECONDS);

        //3.base64转换验证码
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //生成验证码图片
        VerifyCodeUtils.outputImage(120,60,byteArrayOutputStream,code);
        String data ="data:image/png;base64,"+Base64Utils.encodeToString(byteArrayOutputStream.toByteArray());
        //4.响应数据
        map.put("src",data);
        map.put("codeKey",codeKey);
        return map;

    }
}
