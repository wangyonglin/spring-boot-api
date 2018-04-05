package com.wangyonglin.controller;

import com.wangyonglin.configuration.ResponseData;
import com.wangyonglin.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/video")
public class VideoController extends BaseControllerImpl{
    @Autowired
    VideoService service;

  

    @GetMapping(value = "/all")
    public ResponseEntity<ResponseData>fetchAll(){
        return loadResponsefetchAll(service.fetchAll());
    }

    @PostMapping(value = "/add")
    public Object AddCustomer(@RequestParam("title")String title, @RequestParam("src")String src, @RequestParam("img")String img,@RequestParam("enabled")String enabled) {
        return service.AddVideo(title,src,img,enabled);
    }
    @DeleteMapping(value = "/del/{uuid}")
    public void DeleteVideo(@PathVariable("uuid")String uuid){
        service.DeleteVideo(uuid);
    }

}
