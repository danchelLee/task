package com.dc.task.domain.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: D&C
 * @Descirption:
 * @Time: 2019-09-21
 */
@Data
public class ApiResult implements Serializable {

    private Object data;

    private String msg;

    private Integer code;

    public ApiResult(){
    }

    public ApiResult(ApiResultCodeEnum apiResultCodeEnum){
        this.code = apiResultCodeEnum.getCode();
        this.msg = apiResultCodeEnum.getMsg();
    }

    public ApiResult(ApiResultCodeEnum apiResultCodeEnum,Object data){
        this.code = apiResultCodeEnum.getCode();
        this.msg = apiResultCodeEnum.getMsg();
        this.data = data;
    }

    public enum ApiResultCodeEnum{
        SUCCESS(200,"请求成功"),
        BAD_REQUEST(400,"bad request"),
        NOT_FOUND(404,"未找到页面"),

        INNER_ERROR(500,"内部错误");

        private Integer code;

        private String msg;

        ApiResultCodeEnum(Integer code,String msg){
            this.code = code;
            this.msg = msg;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public Integer getCode() {
            return code;
        }

        public void setMsg(String msg){
             this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }
    }
}
