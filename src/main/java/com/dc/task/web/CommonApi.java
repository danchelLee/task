package com.dc.task.web;

import com.dc.task.config.OSSAccountConfig;
import com.dc.task.domain.base.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: D&C
 * @Descirption:
 * @Time: 2019-09-21
 */
@Api(value = "公共接口")
@Component
@Path("/common")
public class CommonApi {

    @Autowired
    private OSSAccountConfig ossAccount;

    @ApiOperation("测试")
    @Path("/test")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ApiResult test(){
        return new ApiResult(ApiResult.ApiResultCodeEnum.SUCCESS,ossAccount);
    }
}
