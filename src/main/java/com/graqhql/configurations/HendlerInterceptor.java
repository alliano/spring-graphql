package com.graqhql.configurations;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.server.WebGraphQlInterceptor;
import org.springframework.graphql.server.WebGraphQlRequest;
import org.springframework.graphql.server.WebGraphQlResponse;
import org.springframework.http.HttpHeaders;

import reactor.core.publisher.Mono;

@Configuration
public class HendlerInterceptor implements WebGraphQlInterceptor {

    @Override
    public Mono<WebGraphQlResponse> intercept(WebGraphQlRequest request, Chain chain) {
        HttpHeaders headers = request.getHeaders();
        Map<String, List<String>> datas = new HashMap<>(headers);
        request.configureExecutionInput( (executionInput, builder) ->
        builder.graphQLContext(
            Collections.singletonMap("headers", datas)).build()
        );
        return chain.next(request);
    }

}
