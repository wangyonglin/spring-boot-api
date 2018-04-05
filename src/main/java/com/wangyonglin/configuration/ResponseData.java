package com.wangyonglin.configuration;

import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;

import java.util.List;

public class ResponseData {
    private String Reason;
    private Integer Error_code;
    private List<Object> Result;

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public Integer getError_code() {
        return Error_code;
    }

    public void setError_code(Integer error_code) {
        Error_code = error_code;
    }

    public List<Object> getResult() {
        return Result;
    }

    public void setResult(List<Object> result) {
        Result = result;
    }

}
