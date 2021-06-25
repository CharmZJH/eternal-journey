package com.personal.eternaljourney.config;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ApiResult", description = "rest接口统一返回格式")
public class ApiResult<T> implements Serializable {

    private static final long serialVersionUID = 313975329998789878L;

    private int code;

    private String msg;

    private T data ;

    private int count;

    public static <T> ApiResult<T> create(int code, String msg, T data, int count) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(code);
        apiResult.setMsg(msg);
        apiResult.setData(data);
        apiResult.setCount(count);
        return apiResult;
    }

    public static <T> ApiResult<T> success(String msg, T data, int count) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(0);
        apiResult.setMsg(msg);
        apiResult.setData(data);
        apiResult.setCount(count);
        return apiResult;
    }

    public static <T> ApiResult<T> fail(String msg, T data, int count) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(1);
        apiResult.setMsg(msg);
        apiResult.setData(data);
        apiResult.setCount(count);
        return apiResult;
    }
}