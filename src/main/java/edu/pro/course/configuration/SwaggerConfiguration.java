package edu.pro.course.configuration;
/*
  @author   george
  @project   course
  @class  SwaggerConfiguration
  @version  1.0.0 
  @since 24.03.2021 - 10.36
*/

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Example Swagger Api")
                                .version("1.0.0")
                                .contact(
                                        new Contact()
                                                .email("my-e-mail@gmail.com")
                                                .url("https://my-site.cv.ua")
                                                .name("Ivan Ivanchuk")
                                )
                );
    }
}
