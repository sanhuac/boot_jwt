package com.huc.boot_jwt.modules.user.web;

import com.huc.boot_jwt.common.constant.SystemConstant;
import com.huc.boot_jwt.common.entity.Result;
import com.huc.boot_jwt.common.util.JwtUtils;
import com.huc.boot_jwt.modules.user.model.User;
import com.huc.boot_jwt.modules.user.repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 胡丛
 * @Date: 2018/9/25 10:39
 * @Description:
 */
@Api(tags ="用户管理")
@RestController
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @ApiOperation(value="用户登陆")
    @RequestMapping(value="login",method = RequestMethod.POST)
    public Result login(String username, String password, HttpServletResponse
            response) {
        System.out.println("用户登录接口");
        User user =  userRepository.findByUsername(username);
        if(user!=null){
            if(user.getPassword().equals(password)){
                //把token返回给客户端-->客户端保存至cookie-->客户端每次请求附带cookie参数放在请求头部 代码在拦截器SysInterceptor
                String JWT = JwtUtils.createJWT("1", username, SystemConstant.JWT_TTL);

                return Result.ok(JWT);
            }else{
                return Result.error();
            }
        }else{
            return Result.error();
        }
    }
    @ApiOperation(value="获取用户信息")
    @RequestMapping(value="description",method = RequestMethod.POST)
    public Result description(String username) {
        User user =  userRepository.findByUsername(username);
        return Result.ok(user.getDescription());
    }
}
