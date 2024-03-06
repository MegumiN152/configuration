package com.hh.springboot.Controller;

import com.hh.springboot.utils.Webutils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author 黄昊
 * @version 1.0
 **/
@Controller
@Slf4j
public class UploadController {
    @GetMapping("/upload.html")
    public String upload1(){
        return "upload";
    }
    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("name") String name,
                         @RequestParam("email") String email,
                         @RequestParam("age") Integer age,
                            @RequestParam("job") String job,
                            @RequestParam("header") MultipartFile header,
                         @RequestParam("pet") MultipartFile[] pet) throws IOException {
        String path = ResourceUtils.getURL("classpath:").getPath();
        File file = new File(path + "static/images/upload/"+ Webutils.getYearMonthDay());
        if (!file.exists()){
            file.mkdirs();
        }
        if (!header.isEmpty()){
            String originalFilename = UUID.randomUUID().toString()+header.getOriginalFilename();

            header.transferTo(new File(file.getAbsolutePath()+"/"+originalFilename));
        }
        if (pet.length>0){
            for (MultipartFile multipartFile : pet) {
                if (!multipartFile.isEmpty()){
                    String originalFilename =UUID.randomUUID().toString()+ multipartFile.getOriginalFilename();
                    multipartFile.transferTo(new File(file.getAbsolutePath()+"/" +originalFilename));
                }
            }
        }

        return "注册用户成功/文件上传成功";
    }
}

