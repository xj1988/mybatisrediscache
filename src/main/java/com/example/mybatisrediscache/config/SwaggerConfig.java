package com.example.mybatisrediscache.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration// 启动时加载该配置类
@EnableSwagger2// 启用swagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                // 函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.mybatisrediscache"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot利用swagger构建api文档")//大标题
                .description("简单优雅的restful风格")//小标题
                .termsOfServiceUrl("http://xxxx")//网站链接
                .contact("xiongjing")//作者
                .version("1.0.0")//版本
                .build();
    }
}
