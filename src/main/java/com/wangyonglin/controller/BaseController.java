package com.wangyonglin.controller;

import com.wangyonglin.configuration.ResponseData;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BaseController {
    public ResponseEntity<ResponseData> loadResponsefetchAll(List<Object> objects);
}
