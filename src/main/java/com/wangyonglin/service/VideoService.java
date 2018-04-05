package com.wangyonglin.service;

import java.util.List;

public interface VideoService {
    public List<Object> fetchAll();
    public Object AddVideo(String title, String src, String img,String enabled);
    public void DeleteVideo(String uuid);
}
