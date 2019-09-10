package cn.kgc.providerticker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class ProviderTickerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTickerApplication.class, args);
    }

}
