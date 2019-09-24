package cn.bintools.daios.mcservice.impl;

import cn.bintools.daios.mcapi.api.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author peng
 * @date 2019-09-24-3:03 PM
 * @description
 */
//@Component
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService{

    @Override
    public String sayHi() {
        return "hello mc";
    }
}
