package com.cloudgateway9527.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LuoSheep
 * @date 2021/11/10 12:33
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder builder= routeLocatorBuilder.routes();
        builder.route("path_route",r -> r.path("guonei").uri("http://news.baidu.com/guonei"));
        return builder.build();
    }
}
