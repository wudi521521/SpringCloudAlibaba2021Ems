package com.wudi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/2/25 20:29
 */
@Slf4j
@RestController
public class FileController {

    /**
     * 文件上传
     * @param photo
     * @return
     */
    @PostMapping("/file/upload")
    public Map<String,Object> upload(@RequestPart("photo")MultipartFile photo){
        Map<String,Object> map = new HashMap<>();
        log.info("*****接收文件名称:*******"+photo.getOriginalFilename());
        return map;
    }
}
