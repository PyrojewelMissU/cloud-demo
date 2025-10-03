package com.yan.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {
    private Integer code;
    private String msg;
    private Object data;

    public static R ok(Object data){
        return new R(200,"操作成功",data);
    }

    public static R ok(String msg,Object data){
        return new R(200,msg,data);
    }

    public static R error(String msg){
        return new R(500,msg,null);
    }

    public static R error(Integer code, String msg){
        return new R(code,msg,null);
    }

}
