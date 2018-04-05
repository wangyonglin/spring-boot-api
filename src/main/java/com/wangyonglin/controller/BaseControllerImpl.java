package com.wangyonglin.controller;

import com.sun.prism.impl.BaseContext;
import com.wangyonglin.configuration.ResponseData;
import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

public class BaseControllerImpl implements BaseController {

    @Override
    public ResponseEntity<ResponseData> loadResponsefetchAll(List<Object> objects) {
        ResponseData responseData = new ResponseData();
        responseData.setError_code(0);
        responseData.setResult(objects);
        responseData.setReason("获取数据成功");
        return new ResponseEntity<ResponseData>(responseData,HttpStatus.OK);
    }

}
