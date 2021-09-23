package com.example.amazingbulbs;

import com.example.superhomes.Operable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BulbConfiguration {

    @Bean
    @ConditionalOnMissingBean(Operable.class)
    public Operable bulb9000() {
        return new Bulb9000();
    }
}
