package cn.bintools.daios.mcconsumer.controller;

import cn.bintools.daios.mcapi.api.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peng
 * @date 2019-09-24-3:24 PM
 * @description
 */
@RestController
public class UserControlelr {

    @Reference(version = "${user.service.version}")
    private UserService userService;


    @GetMapping(value = "/hi")
    public String asyHi(){
        String hi = userService.sayHi();

        return hi;
    }


}
