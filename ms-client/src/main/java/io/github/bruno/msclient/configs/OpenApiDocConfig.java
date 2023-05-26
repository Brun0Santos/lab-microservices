package io.github.bruno.msclient.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiDocConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("REST api JAVA - 2023")
                        .version("v1")
                        .description("Project test")
                        .termsOfService("https:localhost:8080")
                        .license(new License()
                                .name("MIT")
                                .url("local@local.com")
                        )
                );
    }
}
