package com.miaoshaproject.response;

import lombok.Data;

@Data
public class CommonReturnType {
    //success或fail
    private String status;
    //若status=fail,则data内使用通用的错误码格式
    private Object data;

    public static CommonReturnType create(Object result){
        return create(result, "success");
    }

    public static CommonReturnType create(Object result, String status){
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }
}
