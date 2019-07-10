package com.zfm.friend.friend;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zfm.api.user.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zfm
 * @Description TODO
 * @date 2019/7/10
 */
@RestController
public class FriendController {
    @Reference
    private LoginService loginService;

    @GetMapping(value = "/api/hello")
    @ResponseBody
    public String index(@RequestParam("name") String name){
        return loginService.hello(name);
    }
}
