package com.springcloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LuoSheep
 * @date 2021/5/9
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{
    private Integer code;
    private String message;
    private Object data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
