package com.miss.hello.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * @author miss
 * <p>
 * Created by miss on 2019/3/26
 */
@Component
public class HelloHandler {

    public Mono<ServerResponse> hello(ServerRequest serverRequest) {
        return ok().contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(new HashMap(){
                    {
                        put("code",200);
                        put("msg","请求成功");
                        put("data",new HashMap(){
                            {
                                put("hello","hello-world");
                            }
                        });
                    }
                }),Map.class);
    }
}
