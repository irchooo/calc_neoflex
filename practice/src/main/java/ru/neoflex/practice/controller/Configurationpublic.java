package ru.neoflex.practice.controller;

import org.springframework.context.annotation.Bean;

public @interface Configurationpublic {
}

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configurationpublic class SwaggerConfig {
    public SwaggerConfig() {    }
    @Bean
    public OpenAPI customOpenAPI() {        return (new OpenAPI()).info((new ProcessHandle.Info()).title("Calculator API").version("1.0").description("API для выполнения арифметических операций"));
    }}