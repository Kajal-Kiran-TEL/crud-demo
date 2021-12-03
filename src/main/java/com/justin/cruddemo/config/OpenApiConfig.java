<<<<<<< HEAD
package com.justin.cruddemo.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI(){
      return new OpenAPI().components(new Components()).info(new Info().title("CRUD-DEMO").description("CRUD Services").version("0.0.1"));
    }
}
=======
package com.justin.cruddemo.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI(){
      return new OpenAPI().components(new Components()).info(new Info().title("CRUD-DEMO").description("CRUD Services").version("0.0.1"));
    }
}
>>>>>>> ab307ba78077f79ffc8c780056cbdcdcb1457184
