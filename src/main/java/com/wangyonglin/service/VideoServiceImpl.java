package com.wangyonglin.service;

import com.wangyonglin.domain.Video;
import com.wangyonglin.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class VideoServiceImpl implements VideoService {
    @Autowired
    VideoRepository videoRepository;
    @Override
    public List<Object> fetchAll() {
        List<Object> list = new ArrayList<>(videoRepository.findAll());
        return list;
    }

    @Override
    public Object AddVideo(String title, String src, String img, String enabled) {
        Video video = new Video();
        video.setTitle(title);
        video.setImg(img);
        video.setSrc(src);
        video.setDatetime(Calendar.getInstance().getTime());
        video.setEnabled(enabled);
        return videoRepository.save(video);
    }

    @Override
    public void DeleteVideo(String uuid) {
        videoRepository.delete(uuid);
    }
}
