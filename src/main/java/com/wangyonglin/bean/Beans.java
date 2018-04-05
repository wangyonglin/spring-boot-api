package com.wangyonglin.bean;

import com.wangyonglin.service.VideoService;
import com.wangyonglin.service.VideoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public VideoService videoService(){
        return new VideoServiceImpl();
    }
}
