package com.nefu.track.controller;

import com.nefu.track.service.FileService;
import com.nefu.track.service.impl.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;

@Controller
@RequestMapping("file/")
public class FileController {

    FileService fileService = new FileServiceImpl();

    @RequestMapping("upload")
    public String upload(@RequestParam("file") MultipartFile file){
       int index = fileService.upload(file);
       if(index == 0){
           return "uploadFailure";
       }else{
            return "uploadSuccess";
       }
    }

    @RequestMapping("uploading")
    public String uploading(){
        return "fileUpload";
    }
}
