package io.github.bruno.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator router(RouteLocatorBuilder routerLocator) {
        return routerLocator.routes()
                .route(r -> r.path("/v1/person/**").uri("lb://ms-client"))
                .route(r -> r.path("/v1/books/**").uri("lb://ms-book"))
                .build();
    }
}
