package com.wudi.controller;

import com.wudi.clients.FileClients;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import wudi.entity.Emp;

import java.util.List;
import java.util.Map;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/2/25 20:22
 */
@Slf4j
@RestController
public class EmpController {

    @Autowired
    private FileClients fileClients;

    /**
     * 员工列表接口
     * @return
     */
    @GetMapping("/emp/findAll")
    public List<Emp> findAll(){
        return null;
    }

    /**
     * 保存员工信息
     * @param emp
     * @param photo
     * @return
     */
    @PostMapping("/emp/save")
    public Map<String,Object> save(Emp emp, MultipartFile photo){
        fileClients.upload(photo);
        return null;
    }
}
