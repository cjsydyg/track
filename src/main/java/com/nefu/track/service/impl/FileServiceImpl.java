package com.nefu.track.service.impl;

import com.nefu.track.service.FileService;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;

public class FileServiceImpl implements FileService {

    //index 0为失败 1为成功
    @Override
    public int upload(MultipartFile file) {
        int index = 1;
        String fileName = file.getOriginalFilename();
        String fileroot = "files\\";
        File targetFile = new File(fileroot);
        if(targetFile.exists()){
            targetFile.mkdirs();
        }
        try(FileOutputStream os = new FileOutputStream(fileroot+fileName)){
            os.write(file.getBytes());
        }catch (Exception e){
            e.printStackTrace();
            index = 0;
        }
        return index;
    }
}
