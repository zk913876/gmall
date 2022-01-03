package com.atguigu.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter(){

        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 允许哪个域名进行跨域 * 代表所欲域名 但没有cookie携带
        corsConfiguration.addAllowedOrigin("http://manager.gmall.com");
        // 允许跨域的请求方法 * 代表所有
        corsConfiguration.addAllowedMethod("*");
        // 允许跨域访问的头信息 * 代表所有
        corsConfiguration.addAllowedHeader("*");
        // 是否允许携带cookie信息
        corsConfiguration.setAllowCredentials(true);
        // 跨域配置对象
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        // 拦截所有域名
        configurationSource.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(configurationSource);
    }


}
