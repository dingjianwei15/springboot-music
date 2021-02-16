package com.my.music.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 定位歌手头像地址**/
@Configuration
public class singerPicConfig implements WebMvcConfigurer {
    String str1 = System.getProperty("user.dir");
    String str2 = System.getProperty("file.separator");
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/img/singerPic/**").addResourceLocations(
                "file:"+str1+str2+"img"+str2+"singerPic"+str2
        );
    }
}
