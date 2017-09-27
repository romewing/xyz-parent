package io.github.xyz.security;


import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class XYZSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(XYZSecurityApplication.class);

    }

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}
