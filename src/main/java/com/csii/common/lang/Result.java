package com.csii.common.lang;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Result {

    private Integer code;
    private String msg;
    private Object data;

    public static Result success(Integer code , String msg , Object data){

        Result result = new Result();
        result.setCode(code).setMsg(msg).setData(data);
        return result;
    }

    public static Result success(Object data){
        return success(200,"操作成功",data);
    }


    public static Result fail(Integer code , String msg , Object data){
        Result result = new Result();
        result.setCode(code).setMsg(msg).setData(data);
        return result;
    }


    public static Result fail(String msg , Object data){

        return fail(400,msg,data);
    }

    public static Result fail(String msg){

        return fail(400,msg,null);
    }
}
