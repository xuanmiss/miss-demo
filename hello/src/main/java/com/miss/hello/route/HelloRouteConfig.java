package com.miss.hello.route;

import com.miss.hello.handler.HelloHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * @author miss
 * <p>
 * Created by miss on 2019/3/26
 */
@Configuration
public class HelloRouteConfig {

    @Autowired
    private HelloHandler helloHandler;

    @Bean
    public RouterFunction<ServerResponse> helloRoute() {
        return route(GET("/hello"),helloHandler::hello);
    }


}
