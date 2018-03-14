package com.cwowhappy.study.service.controller;

import com.cwowhappy.study.service.respbody.RespStatus;
import com.cwowhappy.study.service.respbody.RootRespBody;
import com.cwowhappy.study.service.respbody.RootRespBodyBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserManageController {

    @RequestMapping(path = "/greeting")
    public RootRespBody<String> greeting(@RequestParam("username") String username) {
        return RootRespBodyBuilder.build(RespStatus.SUCCESS, "success", "Hello " + username);
    }
}
