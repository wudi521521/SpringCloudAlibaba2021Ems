package com.wudi.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/2/25 20:33
 */
@FeignClient(value = "flies")
public interface FileClients {

    /**
     * 文件上传(feign之间文件上传比较繁琐)
     * @param photo 注意:使用openfeign传递参数含有文件类型时必须制定
     * @return
     */
    @PostMapping(value = "/file/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    Map<String,Object> upload(@RequestPart("photo") MultipartFile photo);
}
