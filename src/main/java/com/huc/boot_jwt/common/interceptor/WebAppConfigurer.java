package com.huc.boot_jwt.common.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Auther: 胡丛
 * @Date: 2018/9/25 10:28
 * @Description:
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] patterns = new String[] { "/login","/*.html","/swagger-resources/**"};
        registry.addInterceptor(new SysInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns(patterns);
        super.addInterceptors(registry);
    }
}
