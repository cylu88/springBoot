package com.lcy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @Description: 文件上传接口
 * @Author: lucy
 * @date: 2019/08/27
 */
@Controller
@RequestMapping("/file")
public class FileController {

    /**
     * 文件上传
     * @param file
     * @return
     */
    @RequestMapping("upload")
    @ResponseBody
    public String  upload(@RequestParam("file") MultipartFile file){
        try {
            long  startTime=System.currentTimeMillis();
            System.out.println("fileName："+file.getOriginalFilename());
            String path="D:/tmp/tt/"+new Date().getTime()+file.getOriginalFilename();

            File newFile = new File(path);

            // 检测是否存在目录
            if (!newFile.getParentFile().exists()) {
                newFile.getParentFile().mkdirs();
            }

            //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
            file.transferTo(newFile);
            long  endTime=System.currentTimeMillis();
            System.out.println("运行时间："+String.valueOf(endTime-startTime)+"ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
