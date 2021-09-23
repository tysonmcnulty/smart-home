package com.example.fantasticswitches;

import com.example.superhomes.Switchable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwitchConfiguration {

    @Bean
    @ConditionalOnMissingBean(Switchable.class)
    public Switchable switch9000() {
        return new Switch9000();
    }
}
