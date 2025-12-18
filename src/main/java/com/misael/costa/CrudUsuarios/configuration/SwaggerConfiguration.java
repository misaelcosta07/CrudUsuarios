package com.misael.costa.CrudUsuarios.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customApi(){

        return new OpenAPI().info(new Info()
                .title("Cadastros")
                .version("1.0.0")
                .description("Cadastro de usuarios.Apenas com nome e email, feito para ser basico e treino de API.")
        );
    }
}